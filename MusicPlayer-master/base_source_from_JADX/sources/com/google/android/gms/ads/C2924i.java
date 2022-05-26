package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbfm;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.i */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C2924i {

    /* renamed from: a */
    private final zzbfm f9811a;

    /* renamed from: b */
    private final C2851a f9812b;

    private C2924i(zzbfm zzbfm) {
        this.f9811a = zzbfm;
        zzbew zzbew = zzbfm.f27236i;
        this.f9812b = zzbew == null ? null : zzbew.mo22533Y();
    }

    /* renamed from: a */
    public static C2924i m13032a(zzbfm zzbfm) {
        if (zzbfm != null) {
            return new C2924i(zzbfm);
        }
        return null;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final JSONObject mo10811b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f9811a.f27234g);
        jSONObject.put("Latency", this.f9811a.f27235h);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f9811a.f27237j.keySet()) {
            jSONObject2.put(str, this.f9811a.f27237j.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C2851a aVar = this.f9812b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.mo10669e());
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo10811b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
