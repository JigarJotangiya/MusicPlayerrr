package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i72 implements m22<bd0, i42> {

    /* renamed from: a */
    private final n82 f17912a;

    public i72(n82 n82) {
        this.f17912a = n82;
    }

    /* renamed from: a */
    public final n22<bd0, i42> mo15687a(String str, JSONObject jSONObject) throws zp2 {
        bd0 a = this.f17912a.mo19653a(str);
        if (a == null) {
            return null;
        }
        return new n22<>(a, new i42(), str);
    }
}
