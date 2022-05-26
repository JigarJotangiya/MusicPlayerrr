package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b90 implements qm0<g80> {

    /* renamed from: a */
    final /* synthetic */ l90 f14374a;

    /* renamed from: b */
    final /* synthetic */ m90 f14375b;

    b90(m90 m90, l90 l90) {
        this.f14375b = m90;
        this.f14374a = l90;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo16151b(Object obj) {
        g80 g80 = (g80) obj;
        synchronized (this.f14375b.f19804a) {
            this.f14375b.f19810g = 0;
            if (!(this.f14375b.f19809f == null || this.f14374a == this.f14375b.f19809f)) {
                C3018m1.m13388k("New JS engine is loaded, marking previous one as destroyable.");
                this.f14375b.f19809f.mo19110g();
            }
            this.f14375b.f19809f = this.f14374a;
        }
    }
}
