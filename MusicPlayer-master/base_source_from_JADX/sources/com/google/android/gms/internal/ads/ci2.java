package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ci2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final JSONObject f14985a;

    public ci2(JSONObject jSONObject) {
        this.f14985a = jSONObject;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f14985a);
        } catch (JSONException unused) {
            C3018m1.m13388k("Unable to get cache_state");
        }
    }
}
