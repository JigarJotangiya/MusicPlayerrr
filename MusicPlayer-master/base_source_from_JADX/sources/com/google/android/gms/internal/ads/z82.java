package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z82 extends C5647uv {

    /* renamed from: g */
    private final Context f26706g;

    /* renamed from: h */
    private final mt0 f26707h;

    /* renamed from: i */
    final sp2 f26708i;

    /* renamed from: j */
    final kk1 f26709j = new kk1();

    /* renamed from: k */
    private C5314lv f26710k;

    public z82(mt0 mt0, Context context, String str) {
        sp2 sp2 = new sp2();
        this.f26708i = sp2;
        this.f26707h = mt0;
        sp2.mo20915H(str);
        this.f26706g = context;
    }

    /* renamed from: D2 */
    public final void mo19022D2(zzbnw zzbnw) {
        this.f26708i.mo20922O(zzbnw);
    }

    /* renamed from: G6 */
    public final void mo19023G6(PublisherAdViewOptions publisherAdViewOptions) {
        this.f26708i.mo20925c(publisherAdViewOptions);
    }

    /* renamed from: J3 */
    public final void mo19024J3(a40 a40, zzbfi zzbfi) {
        this.f26709j.mo18899e(a40);
        this.f26708i.mo20914G(zzbfi);
    }

    /* renamed from: L6 */
    public final void mo19025L6(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f26708i.mo20913F(adManagerAdViewOptions);
    }

    /* renamed from: T2 */
    public final void mo19026T2(d40 d40) {
        this.f26709j.mo18900f(d40);
    }

    /* renamed from: U2 */
    public final void mo19027U2(q30 q30) {
        this.f26709j.mo18896b(q30);
    }

    /* renamed from: U6 */
    public final void mo19028U6(n30 n30) {
        this.f26709j.mo18895a(n30);
    }

    /* renamed from: a2 */
    public final void mo19029a2(b80 b80) {
        this.f26709j.mo18898d(b80);
    }

    /* renamed from: r1 */
    public final void mo19031r1(zzbtz zzbtz) {
        this.f26708i.mo20918K(zzbtz);
    }

    /* renamed from: v6 */
    public final void mo19032v6(C5314lv lvVar) {
        this.f26710k = lvVar;
    }

    /* renamed from: w2 */
    public final void mo19033w2(String str, w30 w30, t30 t30) {
        this.f26709j.mo18897c(str, w30, t30);
    }

    /* renamed from: w6 */
    public final void mo19034w6(C5278kw kwVar) {
        this.f26708i.mo20931o(kwVar);
    }

    public final C5573sv zze() {
        mk1 g = this.f26709j.mo18901g();
        this.f26708i.mo20923a(g.mo19409i());
        this.f26708i.mo20924b(g.mo19408h());
        sp2 sp2 = this.f26708i;
        if (sp2.mo20933v() == null) {
            sp2.mo20914G(zzbfi.m34950n0());
        }
        return new a92(this.f26706g, this.f26707h, this.f26708i, g, this.f26710k);
    }
}
