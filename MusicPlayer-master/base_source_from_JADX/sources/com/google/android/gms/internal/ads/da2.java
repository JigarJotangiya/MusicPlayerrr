package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class da2 implements la2<rg1> {

    /* renamed from: a */
    final /* synthetic */ ea2 f15554a;

    da2(ea2 ea2) {
        this.f15554a = ea2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16152a(Object obj) {
        rg1 rg1 = (rg1) obj;
        synchronized (this.f15554a) {
            this.f15554a.f15905m = rg1;
            this.f15554a.f15905m.mo17838b();
        }
    }

    public final void zza() {
        synchronized (this.f15554a) {
            this.f15554a.f15905m = null;
        }
    }
}
