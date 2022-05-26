package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ad2 implements rg2<Bundle> {

    /* renamed from: a */
    private final JSONObject f13851a;

    /* renamed from: b */
    private final JSONObject f13852b;

    public ad2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13851a = jSONObject;
        this.f13852b = jSONObject2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f13851a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f13852b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
