package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C3212t implements Executor {

    /* renamed from: g */
    private final Handler f10448g;

    private C3212t(Handler handler) {
        this.f10448g = handler;
    }

    /* renamed from: a */
    static Executor m13944a(Handler handler) {
        return new C3212t(handler);
    }

    public final void execute(Runnable runnable) {
        this.f10448g.post(runnable);
    }
}
