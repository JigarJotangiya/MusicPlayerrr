package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c90 implements om0 {

    /* renamed from: a */
    final /* synthetic */ l90 f14903a;

    /* renamed from: b */
    final /* synthetic */ m90 f14904b;

    c90(m90 m90, l90 l90) {
        this.f14904b = m90;
        this.f14903a = l90;
    }

    public final void zza() {
        synchronized (this.f14904b.f19804a) {
            this.f14904b.f19810g = 1;
            C3018m1.m13388k("Failed loading new engine. Marking new engine destroyable.");
            this.f14903a.mo19110g();
        }
    }
}
