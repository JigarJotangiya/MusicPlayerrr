package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.h5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5140h5 implements Executor {

    /* renamed from: g */
    final /* synthetic */ Handler f17532g;

    C5140h5(C5214j5 j5Var, Handler handler) {
        this.f17532g = handler;
    }

    public final void execute(Runnable runnable) {
        this.f17532g.post(runnable);
    }
}
