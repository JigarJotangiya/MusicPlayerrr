package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ts1 implements cb1, u91, h81, gb1 {

    /* renamed from: g */
    private final ct1 f23979g;

    /* renamed from: h */
    private final mt1 f23980h;

    public ts1(ct1 ct1, mt1 mt1) {
        this.f23979g = ct1;
        this.f23980h = mt1;
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
        this.f23979g.mo16746b(np2);
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        this.f23979g.mo16745a().put("action", "ftl");
        this.f23979g.mo16745a().put("ftl", String.valueOf(zzbew.f27186g));
        this.f23979g.mo16745a().put("ed", zzbew.f27188i);
        this.f23980h.mo20114b(this.f23979g.mo16745a());
    }

    /* renamed from: g */
    public final void mo17152g(boolean z) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            this.f23979g.mo16745a().put("scar", "true");
        }
    }

    /* renamed from: k */
    public final void mo15615k() {
        this.f23979g.mo16745a().put("action", "loaded");
        this.f23980h.mo20114b(this.f23979g.mo16745a());
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
        this.f23979g.mo16747c(zzcdq.f27348g);
    }
}
