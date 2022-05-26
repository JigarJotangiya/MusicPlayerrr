package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class nm1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ np2 f20662a;

    /* renamed from: b */
    public final /* synthetic */ bp2 f20663b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f20664c;

    public /* synthetic */ nm1(pm1 pm1, np2 np2, bp2 bp2, JSONObject jSONObject) {
        this.f20662a = np2;
        this.f20663b = bp2;
        this.f20664c = jSONObject;
    }

    public final Object call() {
        np2 np2 = this.f20662a;
        bp2 bp2 = this.f20663b;
        JSONObject jSONObject = this.f20664c;
        bk1 bk1 = new bk1();
        bk1.mo16303v(jSONObject.optInt("template_id", -1));
        bk1.mo16290i(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        bk1.mo16300s(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        up2 up2 = np2.f20682a.f18953a;
        if (up2.f24398g.contains(Integer.toString(bk1.mo16259K()))) {
            if (bk1.mo16259K() == 3) {
                if (bk1.mo16287g0() == null) {
                    throw new e62(1, "No custom template id for custom template ad response.");
                } else if (!up2.f24399h.contains(bk1.mo16287g0())) {
                    throw new e62(1, "Unexpected custom template id in the response.");
                }
            }
            bk1.mo16301t(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (bp2.f14618J) {
                C2971s.m13214q();
                String d = C2979b2.m13251d();
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 3 + String.valueOf(optString).length());
                sb.append(d);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            bk1.mo16302u("headline", optString);
            bk1.mo16302u("body", jSONObject.optString("body", (String) null));
            bk1.mo16302u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            bk1.mo16302u("store", jSONObject.optString("store", (String) null));
            bk1.mo16302u("price", jSONObject.optString("price", (String) null));
            bk1.mo16302u("advertiser", jSONObject.optString("advertiser", (String) null));
            return bk1;
        }
        int K = bk1.mo16259K();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(K);
        throw new e62(1, sb2.toString());
    }
}
