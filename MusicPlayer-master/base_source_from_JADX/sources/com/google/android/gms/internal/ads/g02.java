package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g02 implements cb1, u91, h81, gb1 {

    /* renamed from: g */
    private final fu2 f16847g;

    /* renamed from: h */
    private final gu2 f16848h;

    /* renamed from: i */
    private final jl0 f16849i;

    public g02(fu2 fu2, gu2 gu2, jl0 jl0) {
        this.f16847g = fu2;
        this.f16848h = gu2;
        this.f16849i = jl0;
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
        this.f16847g.mo17743h(np2, this.f16849i);
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        fu2 fu2 = this.f16847g;
        fu2.mo17738a("action", "ftl");
        fu2.mo17738a("ftl", String.valueOf(zzbew.f27186g));
        fu2.mo17738a("ed", zzbew.f27188i);
        this.f16848h.mo18029a(this.f16847g);
    }

    /* renamed from: g */
    public final void mo17152g(boolean z) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            this.f16847g.mo17738a("scar", "true");
        }
    }

    /* renamed from: k */
    public final void mo15615k() {
        gu2 gu2 = this.f16848h;
        fu2 fu2 = this.f16847g;
        fu2.mo17738a("action", "loaded");
        gu2.mo18029a(fu2);
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
        this.f16847g.mo17744i(zzcdq.f27348g);
    }
}
