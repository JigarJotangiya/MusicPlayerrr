package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* renamed from: com.google.android.gms.ads.internal.util.u1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3042u1 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ Context f10108g;

    /* renamed from: h */
    final /* synthetic */ C2979b2 f10109h;

    C3042u1(C2979b2 b2Var, Context context) {
        this.f10109h = b2Var;
        this.f10108g = context;
    }

    public final void run() {
        synchronized (this.f10109h.f9985d) {
            this.f10109h.f9986e = C2979b2.m13274v(this.f10108g);
            this.f10109h.f9985d.notifyAll();
        }
    }
}
