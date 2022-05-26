package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class bq2 implements y50 {

    /* renamed from: a */
    public final /* synthetic */ lv2 f14680a;

    /* renamed from: b */
    public final /* synthetic */ y12 f14681b;

    public /* synthetic */ bq2(lv2 lv2, y12 y12) {
        this.f14680a = lv2;
        this.f14681b = y12;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        lv2 lv2 = this.f14680a;
        y12 y12 = this.f14681b;
        gr0 gr0 = (gr0) obj;
        String str = (String) map.get("u");
        if (str == null) {
            ul0.m31862g("URL missing from httpTrack GMSG.");
        } else if (!gr0.mo17714w().f14648g0) {
            lv2.mo19285b(str);
        } else {
            y12.mo22137x(new a22(C2971s.m13198a().mo11988a(), ((ns0) gr0).mo17651B().f16050b, str, 2));
        }
    }
}
