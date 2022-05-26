package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.gp2;
import com.google.android.gms.internal.ads.ul0;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.v0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3044v0 {
    /* renamed from: a */
    public static Bundle m13474a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        int i2 = 0;
                        while (obj == null && i2 < length) {
                            obj = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                            i2++;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            ul0.m31862g(valueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(valueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? m13474a(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            ul0.m31862g(String.format("JSONArray with unsupported type %s for key:%s", new Object[]{obj.getClass().getCanonicalName(), next}));
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, m13474a((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    ul0.m31862g(valueOf2.length() != 0 ? "Unsupported type for key:".concat(valueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m13475b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject m = m13486m(jSONObject, strArr);
        if (m == null) {
            return BuildConfig.FLAVOR;
        }
        return m.optString(strArr[0], BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public static List<String> m13476c(JSONArray jSONArray, List<String> list) throws JSONException {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    /* renamed from: d */
    public static List<String> m13477d(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: e */
    public static JSONArray m13478e(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(m13478e(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(m13481h(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONArray.put(jsonReader.nextString());
            } else {
                String valueOf = String.valueOf(peek);
                String.valueOf(valueOf).length();
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(valueOf)));
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    /* renamed from: f */
    public static JSONObject m13479f(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    /* renamed from: g */
    public static JSONObject m13480g(JSONObject jSONObject, String... strArr) {
        JSONObject m = m13486m(jSONObject, strArr);
        if (m == null) {
            return null;
        }
        return m.optJSONObject(strArr[1]);
    }

    /* renamed from: h */
    public static JSONObject m13481h(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, m13478e(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, m13481h(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextString());
            } else {
                String valueOf = String.valueOf(peek);
                String.valueOf(valueOf).length();
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(valueOf)));
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    /* renamed from: i */
    public static void m13482i(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m13483j(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    m13482i(jsonWriter, (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: j */
    public static void m13483j(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m13483j(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    m13482i(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: k */
    public static boolean m13484k(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject m = m13486m(jSONObject, strArr);
        if (m == null) {
            return false;
        }
        return m.optBoolean(strArr[strArr.length - 1], false);
    }

    /* renamed from: l */
    public static String m13485l(gp2 gp2) {
        if (gp2 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            m13487n(jsonWriter, gp2);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            ul0.m31860e("Error when writing JSON.", e);
            return null;
        }
    }

    /* renamed from: m */
    private static JSONObject m13486m(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private static void m13487n(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof gp2) {
            m13483j(jsonWriter, ((gp2) obj).f17226d);
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    m13487n(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object n : (List) obj) {
                m13487n(jsonWriter, n);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.nullValue();
        }
    }
}
