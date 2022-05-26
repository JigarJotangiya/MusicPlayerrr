package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ps1 implements xt2 {

    /* renamed from: g */
    private final Map<pt2, os1> f21499g;

    /* renamed from: h */
    private final C5790yp f21500h;

    ps1(C5790yp ypVar, Map<pt2, os1> map) {
        this.f21499g = map;
        this.f21500h = ypVar;
    }

    /* renamed from: a */
    public final void mo17079a(pt2 pt2, String str) {
        if (this.f21499g.containsKey(pt2)) {
            this.f21500h.mo22273c(this.f21499g.get(pt2).f21135a);
        }
    }

    /* renamed from: e */
    public final void mo17080e(pt2 pt2, String str, Throwable th) {
        if (this.f21499g.containsKey(pt2)) {
            this.f21500h.mo22273c(this.f21499g.get(pt2).f21137c);
        }
    }

    /* renamed from: g */
    public final void mo17081g(pt2 pt2, String str) {
        if (this.f21499g.containsKey(pt2)) {
            this.f21500h.mo22273c(this.f21499g.get(pt2).f21136b);
        }
    }

    /* renamed from: r */
    public final void mo17082r(pt2 pt2, String str) {
    }
}
