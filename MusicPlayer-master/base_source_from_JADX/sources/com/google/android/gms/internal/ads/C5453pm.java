package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5453pm implements Runnable {

    /* renamed from: g */
    final /* synthetic */ int f21420g;

    /* renamed from: h */
    final /* synthetic */ int f21421h;

    /* renamed from: i */
    final /* synthetic */ int f21422i;

    /* renamed from: j */
    final /* synthetic */ float f21423j;

    /* renamed from: k */
    final /* synthetic */ C5564sm f21424k;

    C5453pm(C5564sm smVar, int i, int i2, int i3, float f) {
        this.f21424k = smVar;
        this.f21420g = i;
        this.f21421h = i2;
        this.f21422i = i3;
        this.f21423j = f;
    }

    public final void run() {
        this.f21424k.f23547b.mo19241g(this.f21420g, this.f21421h, this.f21422i, this.f21423j);
    }
}
