package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3044v0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ki2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final String f18886a;

    /* renamed from: b */
    private final String f18887b;

    public ki2(String str, String str2) {
        this.f18886a = str;
        this.f18887b = str2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            JSONObject f = C3044v0.m13479f((JSONObject) obj, "pii");
            f.put("doritos", this.f18886a);
            f.put("doritos_v2", this.f18887b);
        } catch (JSONException unused) {
            C3018m1.m13388k("Failed putting doritos string.");
        }
    }
}
