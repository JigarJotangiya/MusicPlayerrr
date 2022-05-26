package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class op1 implements o60 {

    /* renamed from: g */
    private final m91 f21108g;

    /* renamed from: h */
    private final zzces f21109h;

    /* renamed from: i */
    private final String f21110i;

    /* renamed from: j */
    private final String f21111j;

    public op1(m91 m91, bp2 bp2) {
        this.f21108g = m91;
        this.f21109h = bp2.f14658m;
        this.f21110i = bp2.f14655k;
        this.f21111j = bp2.f14657l;
    }

    /* renamed from: a */
    public final void mo18138a() {
        this.f21108g.zze();
    }

    /* renamed from: b */
    public final void mo18139b() {
        this.f21108g.mo19360P0();
    }

    /* renamed from: x */
    public final void mo18140x(zzces zzces) {
        int i;
        String str;
        zzces zzces2 = this.f21109h;
        if (zzces2 != null) {
            zzces = zzces2;
        }
        if (zzces != null) {
            str = zzces.f27360g;
            i = zzces.f27361h;
        } else {
            i = 1;
            str = BuildConfig.FLAVOR;
        }
        this.f21108g.mo19359N0(new ch0(str, i), this.f21110i, this.f21111j);
    }
}
