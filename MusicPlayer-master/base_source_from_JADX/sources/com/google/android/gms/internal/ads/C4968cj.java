package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.cj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4968cj implements Runnable {

    /* renamed from: g */
    final /* synthetic */ IOException f14986g;

    /* renamed from: h */
    final /* synthetic */ C5117gj f14987h;

    C4968cj(C5117gj gjVar, IOException iOException) {
        this.f14987h = gjVar;
        this.f14986g = iOException;
    }

    public final void run() {
        this.f14987h.f17133k.mo18149d(this.f14986g);
    }
}
