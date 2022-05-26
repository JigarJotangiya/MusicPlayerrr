package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class e80 {
    /* renamed from: a */
    public static void m22857a(f80 f80, String str, Map map) {
        try {
            f80.mo16881r(str, C2971s.m13214q().mo10979N(map));
        } catch (JSONException unused) {
            ul0.m31862g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m22858b(f80 f80, String str, JSONObject jSONObject) {
        String str2;
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        if (sb2.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb2);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        ul0.m31857b(str2);
        f80.mo17509p(sb.toString());
    }

    /* renamed from: c */
    public static void m22859c(f80 f80, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        f80.mo17509p(sb.toString());
    }

    /* renamed from: d */
    public static void m22860d(f80 f80, String str, JSONObject jSONObject) {
        f80.mo17508a(str, jSONObject.toString());
    }
}
