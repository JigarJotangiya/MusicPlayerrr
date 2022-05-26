package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xp2 {

    /* renamed from: a */
    private final JSONObject f25925a;

    public xp2(JSONObject jSONObject) {
        this.f25925a = jSONObject;
    }

    /* renamed from: a */
    public final String mo22062a() {
        if (mo22063b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int mo22063b() {
        int optInt = this.f25925a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
