package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C3357b;
import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.common.util.C3362g;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class tl0 {

    /* renamed from: b */
    private static final Object f23921b = new Object();

    /* renamed from: c */
    private static boolean f23922c = false;

    /* renamed from: d */
    private static boolean f23923d = false;

    /* renamed from: e */
    private static final C3359d f23924e = C3362g.m14447d();

    /* renamed from: f */
    private static final Set<String> f23925f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: g */
    public static final /* synthetic */ int f23926g = 0;

    /* renamed from: a */
    private final List<String> f23927a;

    public tl0(String str) {
        List<String> list;
        if (!m31314l()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f23927a = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m31309a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m31321s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C3357b.m14434a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    static /* synthetic */ void m31310b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m31321s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m31311i() {
        synchronized (f23921b) {
            f23922c = false;
            f23923d = false;
            ul0.m31862g("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m31312j(boolean z) {
        synchronized (f23921b) {
            f23922c = true;
            f23923d = z;
        }
    }

    /* renamed from: k */
    public static boolean m31313k(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !c10.f14773a.mo20989e().booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            ul0.m31863h("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m31314l() {
        boolean z;
        synchronized (f23921b) {
            z = false;
            if (f23922c && f23923d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m31315m() {
        boolean z;
        synchronized (f23921b) {
            z = f23922c;
        }
        return z;
    }

    /* renamed from: n */
    private static synchronized void m31316n(String str) {
        synchronized (tl0.class) {
            ul0.m31861f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                ul0.m31861f(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            ul0.m31861f("GMA Debug FINISH");
        }
    }

    /* renamed from: o */
    private final void m31317o(String str, sl0 sl0) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f23924e.mo11988a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f23927a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            sl0.mo20019a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            ul0.m31860e("unable to log", e);
        }
        m31316n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m31318p(String str) {
        m31317o("onNetworkRequestError", new pl0(str));
    }

    /* renamed from: q */
    private final void m31319q(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m31317o("onNetworkRequest", new ql0(str, str2, map, bArr));
    }

    /* renamed from: r */
    private final void m31320r(Map<String, ?> map, int i) {
        m31317o("onNetworkResponse", new ol0(i, map));
    }

    /* renamed from: s */
    private static void m31321s(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f23925f.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            ul0.m31859d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: c */
    public final void mo21105c(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m31314l()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m31319q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: d */
    public final void mo21106d(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m31314l()) {
            m31319q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void mo21107e(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (m31314l()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            m31320r(hashMap, i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    ul0.m31862g(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m31318p(str);
            }
        }
    }

    /* renamed from: f */
    public final void mo21108f(Map<String, ?> map, int i) {
        if (m31314l()) {
            m31320r(map, i);
            if (i < 200 || i >= 300) {
                m31318p((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo21109g(String str) {
        if (m31314l() && str != null) {
            mo21110h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void mo21110h(byte[] bArr) {
        m31317o("onNetworkResponseBody", new rl0(bArr));
    }
}
