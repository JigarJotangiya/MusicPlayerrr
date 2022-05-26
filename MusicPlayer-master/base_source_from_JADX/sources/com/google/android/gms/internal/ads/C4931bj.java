package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4931bj implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C5042ej f14478g;

    /* renamed from: h */
    final /* synthetic */ C5117gj f14479h;

    C4931bj(C5117gj gjVar, C5042ej ejVar) {
        this.f14479h = gjVar;
        this.f14478g = ejVar;
    }

    public final void run() {
        this.f14478g.mo17194a();
        int size = this.f14479h.f17142t.size();
        for (int i = 0; i < size; i++) {
            ((C5672vj) this.f14479h.f17142t.valueAt(i)).mo21520i();
        }
    }
}
