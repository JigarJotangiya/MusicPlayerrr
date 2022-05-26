package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3044v0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yh2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final String f26366a;

    public yh2(String str) {
        this.f26366a = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            JSONObject f = C3044v0.m13479f((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f26366a)) {
                f.put("attok", this.f26366a);
            }
        } catch (JSONException e) {
            C3018m1.m13389l("Failed putting attestation token.", e);
        }
    }
}
