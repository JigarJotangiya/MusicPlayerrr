package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wo2 implements la2<rp1> {

    /* renamed from: a */
    final /* synthetic */ yo2 f25476a;

    wo2(yo2 yo2) {
        this.f25476a = yo2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16152a(Object obj) {
        rp1 rp1 = (rp1) obj;
        synchronized (this.f25476a) {
            this.f25476a.f26460j = rp1;
            this.f25476a.f26460j.mo17838b();
        }
    }

    public final void zza() {
        synchronized (this.f25476a) {
            this.f25476a.f26460j = null;
        }
    }
}
