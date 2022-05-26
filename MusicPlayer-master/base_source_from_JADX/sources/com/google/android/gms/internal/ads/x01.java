package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x01 implements yr3<JSONObject> {

    /* renamed from: a */
    private final ms3<bp2> f25611a;

    public x01(ms3<bp2> ms3) {
        this.f25611a = ms3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        try {
            return new JSONObject(((x41) this.f25611a).mo21974b().f14609A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
