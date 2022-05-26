package p159f.p334h.p335a.p336v;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p159f.p334h.p335a.C7760j;
import p159f.p334h.p335a.C7799u;

/* renamed from: f.h.a.v.b */
/* compiled from: Util */
public final class C7801b {

    /* renamed from: a */
    public static final Set<Annotation> f33199a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f33200b = new Type[0];

    /* renamed from: c */
    private static final Class<? extends Annotation> f33201c;

    /* renamed from: f.h.a.v.b$a */
    /* compiled from: Util */
    public static final class C7802a implements GenericArrayType {

        /* renamed from: g */
        private final Type f33202g;

        public C7802a(Type type) {
            this.f33202g = C7801b.m42775a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C7799u.m42766d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f33202g;
        }

        public int hashCode() {
            return this.f33202g.hashCode();
        }

        public String toString() {
            return C7801b.m42792r(this.f33202g) + "[]";
        }
    }

    /* renamed from: f.h.a.v.b$b */
    /* compiled from: Util */
    public static final class C7803b implements ParameterizedType {

        /* renamed from: g */
        private final Type f33203g;

        /* renamed from: h */
        private final Type f33204h;

        /* renamed from: i */
        public final Type[] f33205i;

        public C7803b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C7799u.m42769g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C7801b.m42775a(type);
            }
            this.f33203g = type3;
            this.f33204h = C7801b.m42775a(type2);
            this.f33205i = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f33205i;
                if (i < typeArr2.length) {
                    Objects.requireNonNull(typeArr2[i]);
                    C7801b.m42776b(typeArr2[i]);
                    Type[] typeArr3 = this.f33205i;
                    typeArr3[i] = C7801b.m42775a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C7799u.m42766d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f33205i.clone();
        }

        public Type getOwnerType() {
            return this.f33203g;
        }

        public Type getRawType() {
            return this.f33204h;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f33205i) ^ this.f33204h.hashCode()) ^ C7801b.m42780f(this.f33203g);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f33205i.length + 1) * 30);
            sb.append(C7801b.m42792r(this.f33204h));
            if (this.f33205i.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C7801b.m42792r(this.f33205i[0]));
            for (int i = 1; i < this.f33205i.length; i++) {
                sb.append(", ");
                sb.append(C7801b.m42792r(this.f33205i[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: f.h.a.v.b$c */
    /* compiled from: Util */
    public static final class C7804c implements WildcardType {

        /* renamed from: g */
        private final Type f33206g;

        /* renamed from: h */
        private final Type f33207h;

        public C7804c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C7801b.m42776b(typeArr2[0]);
                if (typeArr[0] == cls) {
                    this.f33207h = C7801b.m42775a(typeArr2[0]);
                    this.f33206g = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C7801b.m42776b(typeArr[0]);
                this.f33207h = null;
                this.f33206g = C7801b.m42775a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C7799u.m42766d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f33207h;
            if (type == null) {
                return C7801b.f33200b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f33206g};
        }

        public int hashCode() {
            Type type = this.f33207h;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f33206g.hashCode() + 31);
        }

        public String toString() {
            if (this.f33207h != null) {
                return "? super " + C7801b.m42792r(this.f33207h);
            } else if (this.f33206g == Object.class) {
                return "?";
            } else {
                return "? extends " + C7801b.m42792r(this.f33206g);
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f33201c = cls;
        try {
            Class.forName("i.z.d.g");
        } catch (ClassNotFoundException unused2) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m42775a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C7802a(m42775a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C7803b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C7803b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C7802a) {
                return type;
            }
            return new C7802a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C7804c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C7804c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    static void m42776b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: c */
    static Class<?> m42777c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        m42790p(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        if ((r8 instanceof java.lang.reflect.ParameterizedType) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r8 + "'. Suspiciously, the type was not parameterized but the target class '" + r2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r8, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[ExcHandler: InvocationTargetException (r7v6 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080 A[ExcHandler: InstantiationException (r7v5 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098 A[ExcHandler: IllegalAccessException (r7v4 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb A[ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0062=Splitter:B:18:0x0062, B:14:0x0046=Splitter:B:14:0x0046} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p159f.p334h.p335a.C7755f<?> m42778d(p159f.p334h.p335a.C7781s r7, java.lang.reflect.Type r8, java.lang.Class<?> r9) {
        /*
            java.lang.Class<f.h.a.s> r0 = p159f.p334h.p335a.C7781s.class
            java.lang.Class<f.h.a.g> r1 = p159f.p334h.p335a.C7757g.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            f.h.a.g r1 = (p159f.p334h.p335a.C7757g) r1
            r2 = 0
            if (r1 == 0) goto L_0x0113
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x0113
        L_0x0015:
            java.lang.String r1 = r9.getName()
            java.lang.String r1 = p159f.p334h.p335a.C7799u.m42767e(r1)
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x00b0, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r3 = 1
            java.lang.Class r9 = java.lang.Class.forName(r1, r3, r9)     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x00b0, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r4 = 0
            if (r1 == 0) goto L_0x0055
            r1 = r8
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r6[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r3] = r0     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r5[r3] = r1     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            goto L_0x006a
        L_0x0046:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r7[r4] = r0     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r5[r4] = r1     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            goto L_0x006a
        L_0x0055:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r1[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0062, ClassNotFoundException -> 0x00fb, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            goto L_0x006a
        L_0x0062:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
        L_0x006a:
            r0.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            java.lang.Object r7 = r0.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            f.h.a.f r7 = (p159f.p334h.p335a.C7755f) r7     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            f.h.a.f r7 = r7.mo28954c()     // Catch:{ ClassNotFoundException -> 0x00fb, NoSuchMethodException -> 0x0078, IllegalAccessException -> 0x0098, InstantiationException -> 0x0080, InvocationTargetException -> 0x007b }
            return r7
        L_0x0078:
            r7 = move-exception
            r2 = r9
            goto L_0x00b1
        L_0x007b:
            r7 = move-exception
            m42790p(r7)
            throw r2
        L_0x0080:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x0098:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00b0:
            r7 = move-exception
        L_0x00b1:
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r9 != 0) goto L_0x00e4
            java.lang.reflect.TypeVariable[] r9 = r2.getTypeParameters()
            int r9 = r9.length
            if (r9 == 0) goto L_0x00e4
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for '"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "'. Suspiciously, the type was not parameterized but the target class '"
            r0.append(r8)
            java.lang.String r8 = r2.getCanonicalName()
            r0.append(r8)
            java.lang.String r8 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00e4:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00fb:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x0113:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.p336v.C7801b.m42778d(f.h.a.s, java.lang.reflect.Type, java.lang.Class):f.h.a.f");
    }

    /* renamed from: e */
    public static Type m42779e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m42779e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m42779e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    static int m42780f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: g */
    static int m42781g(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static boolean m42782h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f33201c;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: i */
    public static boolean m42783i(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: j */
    public static Set<? extends Annotation> m42784j(AnnotatedElement annotatedElement) {
        return m42785k(annotatedElement.getAnnotations());
    }

    /* renamed from: k */
    public static Set<? extends Annotation> m42785k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C7760j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f33199a;
    }

    /* renamed from: l */
    public static Type m42786l(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: m */
    public static Type m42787m(Type type, Class<?> cls, Type type2) {
        return m42788n(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m42788n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m42789o(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m42788n(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = p159f.p334h.p335a.C7799u.m42764b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m42788n(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = p159f.p334h.p335a.C7799u.m42764b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m42788n(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m42788n(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            f.h.a.v.b$b r8 = new f.h.a.v.b$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m42788n(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = p159f.p334h.p335a.C7799u.m42773k(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m42788n(r8, r9, r0, r11)     // Catch:{ all -> 0x00c0 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = p159f.p334h.p335a.C7799u.m42772j(r8)
            return r8
        L_0x00bf:
            return r10
        L_0x00c0:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.p336v.C7801b.m42788n(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: o */
    static Type m42789o(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c = m42777c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        Type e = m42779e(type, cls, c);
        if (!(e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e).getActualTypeArguments()[m42781g(c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: p */
    public static RuntimeException m42790p(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: q */
    public static String m42791q(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: r */
    static String m42792r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
