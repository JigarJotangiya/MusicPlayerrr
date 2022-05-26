package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3044v0;
import com.google.android.gms.ads.p073w.C3120a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jh2 implements rg2<JSONObject> {

    /* renamed from: a */
    private final C3120a.C3121a f18489a;

    /* renamed from: b */
    private final String f18490b;

    public jh2(C3120a.C3121a aVar, String str) {
        this.f18489a = aVar;
        this.f18490b = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        try {
            JSONObject f = C3044v0.m13479f((JSONObject) obj, "pii");
            C3120a.C3121a aVar = this.f18489a;
            if (aVar == null || TextUtils.isEmpty(aVar.mo11379a())) {
                f.put("pdid", this.f18490b);
                f.put("pdidtype", "ssaid");
                return;
            }
            f.put("rdid", this.f18489a.mo11379a());
            f.put("is_lat", this.f18489a.mo11380b());
            f.put("idtype", "adid");
        } catch (JSONException e) {
            C3018m1.m13389l("Failed putting Ad ID.", e);
        }
    }
}
