package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n11 extends g41 {

    /* renamed from: i */
    private final View f20450i;

    /* renamed from: j */
    private final pr0 f20451j;

    /* renamed from: k */
    private final cp2 f20452k;

    /* renamed from: l */
    private final int f20453l;

    /* renamed from: m */
    private final boolean f20454m;

    /* renamed from: n */
    private final boolean f20455n;

    /* renamed from: o */
    private final e11 f20456o;

    /* renamed from: p */
    private C5751xo f20457p;

    n11(f41 f41, View view, pr0 pr0, cp2 cp2, int i, boolean z, boolean z2, e11 e11) {
        super(f41);
        this.f20450i = view;
        this.f20451j = pr0;
        this.f20452k = cp2;
        this.f20453l = i;
        this.f20454m = z;
        this.f20455n = z2;
        this.f20456o = e11;
    }

    /* renamed from: h */
    public final int mo19584h() {
        return this.f20453l;
    }

    /* renamed from: i */
    public final View mo19585i() {
        return this.f20450i;
    }

    /* renamed from: j */
    public final cp2 mo19586j() {
        return yp2.m34267b(this.f16935b.f14664s, this.f20452k);
    }

    /* renamed from: k */
    public final void mo19587k(C5381no noVar) {
        this.f20451j.mo17659G(noVar);
    }

    /* renamed from: l */
    public final boolean mo19588l() {
        return this.f20454m;
    }

    /* renamed from: m */
    public final boolean mo19589m() {
        return this.f20455n;
    }

    /* renamed from: n */
    public final boolean mo19590n() {
        return this.f20451j.mo17683c0();
    }

    /* renamed from: o */
    public final boolean mo19591o() {
        return this.f20451j.mo17673Q0() != null && this.f20451j.mo17673Q0().mo17305s();
    }

    /* renamed from: p */
    public final void mo19592p(long j, int i) {
        this.f20456o.mo17078a(j, i);
    }

    /* renamed from: q */
    public final C5751xo mo19593q() {
        return this.f20457p;
    }

    /* renamed from: r */
    public final void mo19594r(C5751xo xoVar) {
        this.f20457p = xoVar;
    }
}
