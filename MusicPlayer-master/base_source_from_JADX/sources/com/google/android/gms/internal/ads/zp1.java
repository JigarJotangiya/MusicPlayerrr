package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zp1 implements yr3<C5124gq> {

    /* renamed from: a */
    private final ms3<up2> f26862a;

    public zp1(ms3<up2> ms3) {
        this.f26862a = ms3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        C5124gq gqVar;
        if (((v71) this.f26862a).mo21435b().f24406o.f18564a == 3) {
            gqVar = C5124gq.REWARDED_INTERSTITIAL;
        } else {
            gqVar = C5124gq.REWARD_BASED_VIDEO_AD;
        }
        gs3.m24490b(gqVar);
        return gqVar;
    }
}
