package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lz0 implements xy0 {

    /* renamed from: a */
    private final ej0 f19667a;

    lz0(ej0 ej0) {
        this.f19667a = ej0;
    }

    /* renamed from: b */
    public final void mo19302b(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.f19667a.mo17196b(i, optLong);
    }
}
