package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3044v0;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fk1 extends gk1 {

    /* renamed from: b */
    private final JSONObject f16655b;

    /* renamed from: c */
    private final boolean f16656c;

    /* renamed from: d */
    private final boolean f16657d;

    /* renamed from: e */
    private final boolean f16658e;

    /* renamed from: f */
    private final boolean f16659f;

    /* renamed from: g */
    private final String f16660g;

    public fk1(bp2 bp2, JSONObject jSONObject) {
        super(bp2);
        this.f16655b = C3044v0.m13480g(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f16656c = C3044v0.m13484k(false, jSONObject, "allow_pub_owned_ad_view");
        this.f16657d = C3044v0.m13484k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f16658e = C3044v0.m13484k(false, jSONObject, "enable_omid");
        this.f16660g = C3044v0.m13475b(BuildConfig.FLAVOR, jSONObject, "watermark_overlay_png_base64");
        this.f16659f = jSONObject.optJSONObject("overlay") != null ? true : z;
    }

    /* renamed from: a */
    public final String mo17547a() {
        return this.f16660g;
    }

    /* renamed from: b */
    public final JSONObject mo17548b() {
        JSONObject jSONObject = this.f16655b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f17163a.f14609A);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo17549c() {
        return this.f16658e;
    }

    /* renamed from: d */
    public final boolean mo17550d() {
        return this.f16656c;
    }

    /* renamed from: e */
    public final boolean mo17551e() {
        return this.f16657d;
    }

    /* renamed from: f */
    public final boolean mo17552f() {
        return this.f16659f;
    }
}
