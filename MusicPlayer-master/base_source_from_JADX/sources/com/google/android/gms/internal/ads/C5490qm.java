package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.qm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5490qm implements Runnable {

    /* renamed from: g */
    final /* synthetic */ Surface f21968g;

    /* renamed from: h */
    final /* synthetic */ C5564sm f21969h;

    C5490qm(C5564sm smVar, Surface surface) {
        this.f21969h = smVar;
        this.f21968g = surface;
    }

    public final void run() {
        this.f21969h.f23547b.mo19249y(this.f21968g);
    }
}
