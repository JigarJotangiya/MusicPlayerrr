package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3044v0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ej2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final String f15984a;

    public ej2(String str) {
        this.f15984a = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f15984a)) {
                C3044v0.m13479f(jSONObject, "pii").put("adsid", this.f15984a);
            }
        } catch (JSONException e) {
            ul0.m31863h("Failed putting trustless token.", e);
        }
    }
}
