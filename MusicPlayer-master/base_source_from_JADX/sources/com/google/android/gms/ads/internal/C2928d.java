package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.y73;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.d */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C2928d implements y73 {

    /* renamed from: a */
    public static final /* synthetic */ C2928d f9819a = new C2928d();

    private /* synthetic */ C2928d() {
    }

    /* renamed from: b */
    public final d93 mo10692b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C2971s.m13213p().mo17562h().mo11073R(jSONObject.getString("appSettingsJson"));
        }
        return s83.m30607i(null);
    }
}
