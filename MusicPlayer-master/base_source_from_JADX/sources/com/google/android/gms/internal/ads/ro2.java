package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ro2 implements la2<rp1> {

    /* renamed from: a */
    final /* synthetic */ so2 f22942a;

    ro2(so2 so2) {
        this.f22942a = so2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16152a(Object obj) {
        rp1 rp1 = (rp1) obj;
        synchronized (this.f22942a) {
            this.f22942a.f23568l = rp1;
            this.f22942a.f23568l.mo17838b();
        }
    }

    public final void zza() {
        synchronized (this.f22942a) {
            this.f22942a.f23568l = null;
        }
    }
}
