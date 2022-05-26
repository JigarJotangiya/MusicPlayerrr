package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b92 implements la2<e21> {

    /* renamed from: a */
    final /* synthetic */ c92 f14377a;

    b92(c92 c92) {
        this.f14377a = c92;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16152a(Object obj) {
        e21 e21 = (e21) obj;
        synchronized (this.f14377a) {
            if (this.f14377a.f14912m != null) {
                this.f14377a.f14912m.mo17837a();
            }
            this.f14377a.f14912m = e21;
            this.f14377a.f14912m.mo17838b();
        }
    }

    public final void zza() {
        synchronized (this.f14377a) {
            this.f14377a.f14912m = null;
        }
    }
}
