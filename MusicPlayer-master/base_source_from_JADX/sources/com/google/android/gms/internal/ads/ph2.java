package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ph2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final String f21410a;

    public ph2(String str) {
        this.f21410a = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f21410a);
        } catch (JSONException e) {
            C3018m1.m13389l("Failed putting Ad ID.", e);
        }
    }
}
