package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class en0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ int f16009g;

    /* renamed from: h */
    final /* synthetic */ int f16010h;

    /* renamed from: i */
    final /* synthetic */ in0 f16011i;

    en0(in0 in0, int i, int i2) {
        this.f16011i = in0;
        this.f16009g = i;
        this.f16010h = i2;
    }

    public final void run() {
        if (this.f16011i.f18116x != null) {
            this.f16011i.f18116x.mo18675b(this.f16009g, this.f16010h);
        }
    }
}
