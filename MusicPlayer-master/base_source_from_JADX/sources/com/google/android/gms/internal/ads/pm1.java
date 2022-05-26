package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pm1 {

    /* renamed from: a */
    private final e93 f21425a;

    /* renamed from: b */
    private final dn1 f21426b;

    /* renamed from: c */
    private final in1 f21427c;

    public pm1(e93 e93, dn1 dn1, in1 in1) {
        this.f21425a = e93;
        this.f21426b = dn1;
        this.f21427c = in1;
    }

    /* renamed from: a */
    public final d93<bk1> mo20283a(np2 np2, bp2 bp2, JSONObject jSONObject) {
        d93 n;
        np2 np22 = np2;
        bp2 bp22 = bp2;
        JSONObject jSONObject2 = jSONObject;
        d93 A0 = this.f21425a.mo17138A0(new nm1(this, np22, bp22, jSONObject2));
        d93<List<d20>> f = this.f21426b.mo16967f(jSONObject2, "images");
        d93<pr0> g = this.f21426b.mo16968g(jSONObject2, "images", bp22, np22.f20683b.f20121b);
        d93<d20> e = this.f21426b.mo16966e(jSONObject2, "secondary_image");
        d93<d20> e2 = this.f21426b.mo16966e(jSONObject2, "app_icon");
        d93<a20> d = this.f21426b.mo16965d(jSONObject2, "attribution");
        d93<pr0> h = this.f21426b.mo16969h(jSONObject2, bp22, np22.f20683b.f20121b);
        dn1 dn1 = this.f21426b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            n = s83.m30607i(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                n = s83.m30607i(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    n = s83.m30607i(null);
                } else {
                    n = s83.m30612n(s83.m30607i(null), new ym1(dn1, optString), hm0.f17712e);
                }
            }
        }
        d93 d93 = n;
        d93<List<hn1>> a = this.f21427c.mo18446a(jSONObject2, "custom_assets");
        return s83.m30600b(A0, f, g, e, e2, d, h, d93, a).mo20613a(new om1(this, A0, f, e2, e, d, jSONObject, h, g, d93, a), this.f21425a);
    }
}
