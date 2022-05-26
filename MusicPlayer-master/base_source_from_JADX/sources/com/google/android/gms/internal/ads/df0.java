package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class df0 {

    /* renamed from: a */
    public final boolean f15597a;

    /* renamed from: b */
    public final String f15598b;

    public df0(boolean z, String str) {
        this.f15597a = z;
        this.f15598b = str;
    }

    /* renamed from: a */
    public static df0 m22485a(JSONObject jSONObject) {
        return new df0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", BuildConfig.FLAVOR));
    }
}
