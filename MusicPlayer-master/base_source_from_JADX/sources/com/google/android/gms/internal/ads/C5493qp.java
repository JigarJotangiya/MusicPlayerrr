package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.qp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C5493qp implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ mm0 f21987g;

    /* renamed from: h */
    public final /* synthetic */ Future f21988h;

    public /* synthetic */ C5493qp(mm0 mm0, Future future) {
        this.f21987g = mm0;
        this.f21988h = future;
    }

    public final void run() {
        mm0 mm0 = this.f21987g;
        Future future = this.f21988h;
        if (mm0.isCancelled()) {
            future.cancel(true);
        }
    }
}
