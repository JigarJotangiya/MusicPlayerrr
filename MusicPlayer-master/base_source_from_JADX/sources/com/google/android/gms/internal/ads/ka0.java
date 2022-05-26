package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ka0 {

    /* renamed from: a */
    private final m90 f18844a;

    /* renamed from: b */
    private d93<n90> f18845b;

    ka0(m90 m90) {
        this.f18844a = m90;
    }

    /* renamed from: d */
    private final void m26171d() {
        if (this.f18845b == null) {
            mm0 mm0 = new mm0();
            this.f18845b = mm0;
            this.f18844a.mo19354b((C5737xa) null).mo21119e(new ha0(mm0), new ga0(mm0));
        }
    }

    /* renamed from: a */
    public final <I, O> na0<I, O> mo18873a(String str, u90<I> u90, s90<O> s90) {
        m26171d();
        return new na0<>(this.f18845b, "google.afma.activeView.handleUpdate", u90, s90);
    }

    /* renamed from: b */
    public final void mo18874b(String str, y50<? super n90> y50) {
        m26171d();
        this.f18845b = s83.m30612n(this.f18845b, new ja0(str, y50), hm0.f17713f);
    }

    /* renamed from: c */
    public final void mo18875c(String str, y50<? super n90> y50) {
        this.f18845b = s83.m30611m(this.f18845b, new ia0(str, y50), hm0.f17713f);
    }
}
