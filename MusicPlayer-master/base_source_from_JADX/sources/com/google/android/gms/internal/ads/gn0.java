package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gn0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ in0 f17204g;

    gn0(in0 in0) {
        this.f17204g = in0;
    }

    public final void run() {
        if (this.f17204g.f18116x != null) {
            if (!this.f17204g.f18117y) {
                this.f17204g.f18116x.mo18677d();
                this.f17204g.f18117y = true;
            }
            this.f17204g.f18116x.zze();
        }
    }
}
