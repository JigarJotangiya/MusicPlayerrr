package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qm2 {
    /* renamed from: a */
    static om2<s11, x11> m29602a(Context context, zq2 zq2, rr2 rr2) {
        return m29604c(context, zq2, rr2);
    }

    /* renamed from: b */
    static om2<g11, n11> m29603b(Context context, zq2 zq2, rr2 rr2) {
        return m29604c(context, zq2, rr2);
    }

    /* renamed from: c */
    private static <AppOpenAdRequestComponent extends n71<AppOpenAd>, AppOpenAd extends g41> om2<AppOpenAdRequestComponent, AppOpenAd> m29604c(Context context, zq2 zq2, rr2 rr2) {
        al0 al0;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22533h4)).booleanValue()) {
            al0 = C2971s.m13213p().mo17562h().mo11088d();
        } else {
            al0 = C2971s.m13213p().mo17562h().mo11090e();
        }
        boolean z = false;
        if (al0 != null && al0.mo15854h()) {
            z = true;
        }
        if (((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22661x4)).intValue() > 0) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22525g4)).booleanValue() || z) {
                qr2 a = rr2.mo20737a(hr2.AppOpen, context, zq2, new rl2(new ol2()));
                dm2 dm2 = new dm2(new cm2());
                dr2 dr2 = a.f22011a;
                e93 e93 = hm0.f17708a;
                return new tl2(dm2, new zl2(dr2, e93), a.f22012b, a.f22011a.zza().f27389n, e93);
            }
        }
        return new cm2();
    }
}
