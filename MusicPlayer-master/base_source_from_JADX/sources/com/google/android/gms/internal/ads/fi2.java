package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3018m1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fi2 implements sg2<rg2<JSONObject>> {

    /* renamed from: a */
    private final JSONObject f16641a;

    fi2(Context context) {
        this.f16641a = zg0.m34584c(context);
    }

    /* renamed from: a */
    public final d93<rg2<JSONObject>> mo15767a() {
        return s83.m30607i(new ei2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo17538b(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f16641a);
        } catch (JSONException unused) {
            C3018m1.m13388k("Failed putting version constants.");
        }
    }
}
