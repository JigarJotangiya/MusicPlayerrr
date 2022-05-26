package retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.client.Header;
import rx.Observable;

final class RestMethodInfo {
    private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);
    private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    String contentTypeHeader;
    List<Header> headers;
    final boolean isObservable;
    boolean isStreaming;
    final boolean isSynchronous;
    boolean loaded = false;
    final Method method;
    boolean requestHasBody;
    String requestMethod;
    Annotation[] requestParamAnnotations;
    String requestQuery;
    RequestType requestType = RequestType.SIMPLE;
    String requestUrl;
    Set<String> requestUrlParamNames;
    Type responseObjectType;
    final ResponseType responseType;

    enum RequestType {
        SIMPLE,
        MULTIPART,
        FORM_URL_ENCODED
    }

    private enum ResponseType {
        VOID,
        OBSERVABLE,
        OBJECT
    }

    private static final class RxSupport {
        private RxSupport() {
        }

        public static Type getObservableType(Type type, Class cls) {
            return Types.getSupertype(type, cls, Observable.class);
        }

        public static boolean isObservable(Class cls) {
            return cls == Observable.class;
        }
    }

    RestMethodInfo(Method method2) {
        boolean z = false;
        this.method = method2;
        ResponseType parseResponseType = parseResponseType();
        this.responseType = parseResponseType;
        this.isSynchronous = parseResponseType == ResponseType.OBJECT;
        this.isObservable = parseResponseType == ResponseType.OBSERVABLE ? true : z;
    }

    private static Type getParameterUpperBound(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                actualTypeArguments[i] = ((WildcardType) type).getUpperBounds()[0];
            }
        }
        return actualTypeArguments[0];
    }

    private RuntimeException methodError(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return new IllegalArgumentException(this.method.getDeclaringClass().getSimpleName() + "." + this.method.getName() + ": " + str);
    }

    private RuntimeException parameterError(int i, String str, Object... objArr) {
        return methodError(str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.annotation.Annotation[]} */
    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.annotation.Annotation] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseMethodAnnotations() {
        /*
            r14 = this;
            java.lang.Class<retrofit.client.Response> r0 = retrofit.client.Response.class
            java.lang.reflect.Method r1 = r14.method
            java.lang.annotation.Annotation[] r1 = r1.getAnnotations()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x00e7
            r5 = r1[r4]
            java.lang.Class r6 = r5.annotationType()
            r7 = 0
            java.lang.annotation.Annotation[] r8 = r6.getAnnotations()
            int r9 = r8.length
            r10 = 0
        L_0x001a:
            if (r10 >= r9) goto L_0x002d
            r11 = r8[r10]
            java.lang.Class<retrofit.http.RestMethod> r12 = retrofit.http.RestMethod.class
            java.lang.Class r13 = r11.annotationType()
            if (r12 != r13) goto L_0x002a
            r7 = r11
            retrofit.http.RestMethod r7 = (retrofit.http.RestMethod) r7
            goto L_0x002d
        L_0x002a:
            int r10 = r10 + 1
            goto L_0x001a
        L_0x002d:
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L_0x0076
            java.lang.String r10 = r14.requestMethod
            if (r10 != 0) goto L_0x0065
            java.lang.String r8 = "value"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0056 }
            java.lang.reflect.Method r8 = r6.getMethod(r8, r10)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r5 = r8.invoke(r5, r10)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0056 }
            r14.parsePath(r5)
            java.lang.String r5 = r7.value()
            r14.requestMethod = r5
            boolean r5 = r7.hasBody()
            r14.requestHasBody = r5
            goto L_0x00e3
        L_0x0056:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r1 = r6.getSimpleName()
            r0[r3] = r1
            java.lang.String r1 = "Failed to extract String 'value' from @%s annotation."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        L_0x0065:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r3] = r10
            java.lang.String r1 = r7.value()
            r0[r9] = r1
            java.lang.String r1 = "Only one HTTP method is allowed. Found: %s and %s."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        L_0x0076:
            java.lang.Class<retrofit.http.Headers> r7 = retrofit.http.Headers.class
            if (r6 != r7) goto L_0x0093
            retrofit.http.Headers r5 = (retrofit.http.Headers) r5
            java.lang.String[] r5 = r5.value()
            int r6 = r5.length
            if (r6 == 0) goto L_0x008a
            java.util.List r5 = r14.parseHeaders(r5)
            r14.headers = r5
            goto L_0x00e3
        L_0x008a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "@Headers annotation is empty."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        L_0x0093:
            java.lang.Class<retrofit.http.Multipart> r5 = retrofit.http.Multipart.class
            java.lang.String r7 = "Only one encoding annotation is allowed."
            if (r6 != r5) goto L_0x00ab
            retrofit.RestMethodInfo$RequestType r5 = r14.requestType
            retrofit.RestMethodInfo$RequestType r6 = retrofit.RestMethodInfo.RequestType.SIMPLE
            if (r5 != r6) goto L_0x00a4
            retrofit.RestMethodInfo$RequestType r5 = retrofit.RestMethodInfo.RequestType.MULTIPART
            r14.requestType = r5
            goto L_0x00e3
        L_0x00a4:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r0 = r14.methodError(r7, r0)
            throw r0
        L_0x00ab:
            java.lang.Class<retrofit.http.FormUrlEncoded> r5 = retrofit.http.FormUrlEncoded.class
            if (r6 != r5) goto L_0x00c1
            retrofit.RestMethodInfo$RequestType r5 = r14.requestType
            retrofit.RestMethodInfo$RequestType r6 = retrofit.RestMethodInfo.RequestType.SIMPLE
            if (r5 != r6) goto L_0x00ba
            retrofit.RestMethodInfo$RequestType r5 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED
            r14.requestType = r5
            goto L_0x00e3
        L_0x00ba:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r0 = r14.methodError(r7, r0)
            throw r0
        L_0x00c1:
            java.lang.Class<retrofit.http.Streaming> r5 = retrofit.http.Streaming.class
            if (r6 != r5) goto L_0x00e3
            java.lang.reflect.Type r5 = r14.responseObjectType
            if (r5 != r0) goto L_0x00cc
            r14.isStreaming = r9
            goto L_0x00e3
        L_0x00cc:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getSimpleName()
            r1[r3] = r0
            java.lang.Class<retrofit.http.Streaming> r0 = retrofit.http.Streaming.class
            java.lang.String r0 = r0.getSimpleName()
            r1[r9] = r0
            java.lang.String r0 = "Only methods having %s as data type are allowed to have @%s annotation."
            java.lang.RuntimeException r0 = r14.methodError(r0, r1)
            throw r0
        L_0x00e3:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x00e7:
            java.lang.String r0 = r14.requestMethod
            if (r0 == 0) goto L_0x010d
            boolean r0 = r14.requestHasBody
            if (r0 != 0) goto L_0x010c
            retrofit.RestMethodInfo$RequestType r0 = r14.requestType
            retrofit.RestMethodInfo$RequestType r1 = retrofit.RestMethodInfo.RequestType.MULTIPART
            if (r0 == r1) goto L_0x0103
            retrofit.RestMethodInfo$RequestType r1 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED
            if (r0 == r1) goto L_0x00fa
            goto L_0x010c
        L_0x00fa:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        L_0x0103:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        L_0x010c:
            return
        L_0x010d:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.RuntimeException r0 = r14.methodError(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.RestMethodInfo.parseMethodAnnotations():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0126 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseParameters() {
        /*
            r18 = this;
            r0 = r18
            java.lang.reflect.Method r1 = r0.method
            java.lang.Class[] r1 = r1.getParameterTypes()
            java.lang.reflect.Method r2 = r0.method
            java.lang.annotation.Annotation[][] r2 = r2.getParameterAnnotations()
            int r3 = r2.length
            boolean r4 = r0.isSynchronous
            if (r4 != 0) goto L_0x0019
            boolean r4 = r0.isObservable
            if (r4 != 0) goto L_0x0019
            int r3 = r3 + -1
        L_0x0019:
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r3]
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x001f:
            if (r6 >= r3) goto L_0x0175
            r10 = r1[r6]
            r11 = r2[r6]
            if (r11 == 0) goto L_0x015f
            int r12 = r11.length
            r13 = 0
        L_0x0029:
            if (r13 >= r12) goto L_0x015f
            r14 = r11[r13]
            java.lang.Class r15 = r14.annotationType()
            java.lang.Class<retrofit.http.Path> r5 = retrofit.http.Path.class
            r16 = 1
            if (r15 != r5) goto L_0x0042
            r5 = r14
            retrofit.http.Path r5 = (retrofit.http.Path) r5
            java.lang.String r5 = r5.value()
            r0.validatePathName(r6, r5)
            goto L_0x008d
        L_0x0042:
            java.lang.Class<retrofit.http.EncodedPath> r5 = retrofit.http.EncodedPath.class
            if (r15 != r5) goto L_0x0051
            r5 = r14
            retrofit.http.EncodedPath r5 = (retrofit.http.EncodedPath) r5
            java.lang.String r5 = r5.value()
            r0.validatePathName(r6, r5)
            goto L_0x008d
        L_0x0051:
            java.lang.Class<retrofit.http.Query> r5 = retrofit.http.Query.class
            if (r15 != r5) goto L_0x0056
            goto L_0x008d
        L_0x0056:
            java.lang.Class<retrofit.http.EncodedQuery> r5 = retrofit.http.EncodedQuery.class
            if (r15 != r5) goto L_0x005b
            goto L_0x008d
        L_0x005b:
            java.lang.Class<retrofit.http.QueryMap> r5 = retrofit.http.QueryMap.class
            if (r15 != r5) goto L_0x0072
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r10)
            if (r5 == 0) goto L_0x0068
            goto L_0x008d
        L_0x0068:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0072:
            java.lang.Class<retrofit.http.EncodedQueryMap> r5 = retrofit.http.EncodedQueryMap.class
            if (r15 != r5) goto L_0x0089
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r10)
            if (r5 == 0) goto L_0x007f
            goto L_0x008d
        L_0x007f:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@EncodedQueryMap parameter type must be Map."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0089:
            java.lang.Class<retrofit.http.Header> r5 = retrofit.http.Header.class
            if (r15 != r5) goto L_0x0091
        L_0x008d:
            r17 = r1
            goto L_0x011f
        L_0x0091:
            java.lang.Class<retrofit.http.Field> r5 = retrofit.http.Field.class
            if (r15 != r5) goto L_0x00aa
            retrofit.RestMethodInfo$RequestType r5 = r0.requestType
            retrofit.RestMethodInfo$RequestType r8 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED
            if (r5 != r8) goto L_0x00a0
        L_0x009b:
            r17 = r1
            r8 = 1
            goto L_0x011f
        L_0x00a0:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x00aa:
            java.lang.Class<retrofit.http.FieldMap> r5 = retrofit.http.FieldMap.class
            if (r15 != r5) goto L_0x00d1
            retrofit.RestMethodInfo$RequestType r5 = r0.requestType
            retrofit.RestMethodInfo$RequestType r8 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED
            if (r5 != r8) goto L_0x00c7
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r10)
            if (r5 == 0) goto L_0x00bd
            goto L_0x009b
        L_0x00bd:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x00c7:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x00d1:
            java.lang.Class<retrofit.http.Part> r5 = retrofit.http.Part.class
            if (r15 != r5) goto L_0x00e9
            retrofit.RestMethodInfo$RequestType r5 = r0.requestType
            retrofit.RestMethodInfo$RequestType r9 = retrofit.RestMethodInfo.RequestType.MULTIPART
            if (r5 != r9) goto L_0x00df
        L_0x00db:
            r17 = r1
            r9 = 1
            goto L_0x011f
        L_0x00df:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x00e9:
            java.lang.Class<retrofit.http.PartMap> r5 = retrofit.http.PartMap.class
            if (r15 != r5) goto L_0x0110
            retrofit.RestMethodInfo$RequestType r5 = r0.requestType
            retrofit.RestMethodInfo$RequestType r9 = retrofit.RestMethodInfo.RequestType.MULTIPART
            if (r5 != r9) goto L_0x0106
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r10)
            if (r5 == 0) goto L_0x00fc
            goto L_0x00db
        L_0x00fc:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0106:
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0110:
            java.lang.Class<retrofit.http.Body> r5 = retrofit.http.Body.class
            if (r15 != r5) goto L_0x0157
            retrofit.RestMethodInfo$RequestType r5 = r0.requestType
            r17 = r1
            retrofit.RestMethodInfo$RequestType r1 = retrofit.RestMethodInfo.RequestType.SIMPLE
            if (r5 != r1) goto L_0x014d
            if (r7 != 0) goto L_0x0143
            r7 = 1
        L_0x011f:
            r1 = r4[r6]
            if (r1 != 0) goto L_0x0126
            r4[r6] = r14
            goto L_0x0159
        L_0x0126:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r4[r6]
            java.lang.Class r2 = r2.annotationType()
            java.lang.String r2 = r2.getSimpleName()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = r15.getSimpleName()
            r1[r16] = r2
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed: @%s, @%s."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0143:
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.RuntimeException r1 = r0.methodError(r2, r1)
            throw r1
        L_0x014d:
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0157:
            r17 = r1
        L_0x0159:
            int r13 = r13 + 1
            r1 = r17
            goto L_0x0029
        L_0x015f:
            r17 = r1
            r1 = r4[r6]
            if (r1 == 0) goto L_0x016b
            int r6 = r6 + 1
            r1 = r17
            goto L_0x001f
        L_0x016b:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.RuntimeException r1 = r0.parameterError(r6, r2, r1)
            throw r1
        L_0x0175:
            r1 = 0
            retrofit.RestMethodInfo$RequestType r2 = r0.requestType
            retrofit.RestMethodInfo$RequestType r3 = retrofit.RestMethodInfo.RequestType.SIMPLE
            if (r2 != r3) goto L_0x018c
            boolean r3 = r0.requestHasBody
            if (r3 != 0) goto L_0x018c
            if (r7 != 0) goto L_0x0183
            goto L_0x018c
        L_0x0183:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body or @TypedOutput."
            java.lang.RuntimeException r1 = r0.methodError(r2, r1)
            throw r1
        L_0x018c:
            retrofit.RestMethodInfo$RequestType r3 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED
            if (r2 != r3) goto L_0x019c
            if (r8 == 0) goto L_0x0193
            goto L_0x019c
        L_0x0193:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            java.lang.RuntimeException r1 = r0.methodError(r2, r1)
            throw r1
        L_0x019c:
            retrofit.RestMethodInfo$RequestType r3 = retrofit.RestMethodInfo.RequestType.MULTIPART
            if (r2 != r3) goto L_0x01ac
            if (r9 == 0) goto L_0x01a3
            goto L_0x01ac
        L_0x01a3:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multipart method must contain at least one @Part."
            java.lang.RuntimeException r1 = r0.methodError(r2, r1)
            throw r1
        L_0x01ac:
            r0.requestParamAnnotations = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.RestMethodInfo.parseParameters():void");
    }

    private void parsePath(String str) {
        String str2;
        String str3;
        if (str == null || str.length() == 0 || str.charAt(0) != '/') {
            throw methodError("URL path \"%s\" must start with '/'.", str);
        }
        int indexOf = str.indexOf(63);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            str2 = null;
            str3 = str;
        } else {
            str3 = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            if (PARAM_URL_REGEX.matcher(str2).find()) {
                throw methodError("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2);
            }
        }
        Set<String> parsePathParameters = parsePathParameters(str);
        this.requestUrl = str3;
        this.requestUrlParamNames = parsePathParameters;
        this.requestQuery = str2;
    }

    static Set<String> parsePathParameters(String str) {
        Matcher matcher = PARAM_URL_REGEX.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    private ResponseType parseResponseType() {
        Type type;
        Class<Callback> cls = Callback.class;
        Type genericReturnType = this.method.getGenericReturnType();
        Type[] genericParameterTypes = this.method.getGenericParameterTypes();
        Class cls2 = null;
        boolean z = true;
        if (genericParameterTypes.length > 0) {
            type = genericParameterTypes[genericParameterTypes.length - 1];
            Type rawType = type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
            if (rawType instanceof Class) {
                cls2 = (Class) rawType;
            }
        } else {
            type = null;
        }
        boolean z2 = genericReturnType != Void.TYPE;
        if (cls2 == null || !cls.isAssignableFrom(cls2)) {
            z = false;
        }
        if (z2 && z) {
            throw methodError("Must have return type or Callback as last argument, not both.", new Object[0]);
        } else if (!z2 && !z) {
            throw methodError("Must have either a return type or Callback as last argument.", new Object[0]);
        } else if (z2) {
            if (Platform.HAS_RX_JAVA) {
                Class<?> rawType2 = Types.getRawType(genericReturnType);
                if (RxSupport.isObservable(rawType2)) {
                    this.responseObjectType = getParameterUpperBound((ParameterizedType) RxSupport.getObservableType(genericReturnType, rawType2));
                    return ResponseType.OBSERVABLE;
                }
            }
            this.responseObjectType = genericReturnType;
            return ResponseType.OBJECT;
        } else {
            Type supertype = Types.getSupertype(type, Types.getRawType(type), cls);
            if (supertype instanceof ParameterizedType) {
                this.responseObjectType = getParameterUpperBound((ParameterizedType) supertype);
                return ResponseType.VOID;
            }
            throw methodError("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
        }
    }

    private void validatePathName(int i, String str) {
        if (!PARAM_NAME_REGEX.matcher(str).matches()) {
            throw parameterError(i, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
        } else if (!this.requestUrlParamNames.contains(str)) {
            throw parameterError(i, "URL \"%s\" does not contain \"{%s}\".", this.requestUrl, str);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void init() {
        if (!this.loaded) {
            parseMethodAnnotations();
            parseParameters();
            this.loaded = true;
        }
    }

    /* access modifiers changed from: package-private */
    public List<Header> parseHeaders(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                throw methodError("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(substring)) {
                this.contentTypeHeader = trim;
            } else {
                arrayList.add(new Header(substring, trim));
            }
        }
        return arrayList;
    }
}
