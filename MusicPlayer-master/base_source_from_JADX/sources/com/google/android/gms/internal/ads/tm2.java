package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tm2 implements yr3<om2<wp1, rp1>> {

    /* renamed from: a */
    private final ms3<Context> f23943a;

    /* renamed from: b */
    private final ms3<zq2> f23944b;

    /* renamed from: c */
    private final ms3<rr2> f23945c;

    public tm2(ms3<Context> ms3, ms3<zq2> ms32, ms3<rr2> ms33) {
        this.f23943a = ms3;
        this.f23944b = ms32;
        this.f23945c = ms33;
    }

    /* renamed from: b */
    public final om2<wp1, rp1> mo10679a() {
        al0 al0;
        Context a = this.f23943a.mo10679a();
        zq2 a2 = this.f23944b.mo10679a();
        rr2 a3 = this.f23945c.mo10679a();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22533h4)).booleanValue()) {
            al0 = C2971s.m13213p().mo17562h().mo11088d();
        } else {
            al0 = C2971s.m13213p().mo17562h().mo11090e();
        }
        boolean z = false;
        if (al0 != null && al0.mo15854h()) {
            z = true;
        }
        if (((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22549j4)).intValue() > 0) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22525g4)).booleanValue() || z) {
                qr2 a4 = a3.mo20737a(hr2.Rewarded, a, a2, new rl2(new ol2()));
                dm2 dm2 = new dm2(new cm2());
                dr2 dr2 = a4.f22011a;
                e93 e93 = hm0.f17708a;
                return new tl2(dm2, new zl2(dr2, e93), a4.f22012b, a4.f22011a.zza().f27389n, e93);
            }
        }
        return new cm2();
    }
}
