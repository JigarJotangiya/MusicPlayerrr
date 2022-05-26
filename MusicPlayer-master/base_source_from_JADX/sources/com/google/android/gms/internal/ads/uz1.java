package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class uz1 implements u90<vz1> {
    uz1() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo18249a(Object obj) throws JSONException {
        vz1 vz1 = (vz1) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", vz1.f25113c.mo20650b());
        jSONObject2.put("signals", vz1.f25112b);
        jSONObject3.put("body", vz1.f25111a.f27088c);
        jSONObject3.put("headers", C2971s.m13214q().mo10979N(vz1.f25111a.f27087b));
        jSONObject3.put("response_code", vz1.f25111a.f27086a);
        jSONObject3.put("latency", vz1.f25111a.f27089d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", vz1.f25113c.mo20655g());
        return jSONObject;
    }
}
