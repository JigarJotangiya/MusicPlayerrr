package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oi2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final List<String> f21012a;

    public oi2(List<String> list) {
        this.f21012a = list;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f21012a));
        } catch (JSONException unused) {
            C3018m1.m13388k("Failed putting experiment ids.");
        }
    }
}
