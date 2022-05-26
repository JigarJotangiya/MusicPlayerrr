package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f93 implements Executor {

    /* renamed from: g */
    final /* synthetic */ Executor f16484g;

    /* renamed from: h */
    final /* synthetic */ h73 f16485h;

    f93(Executor executor, h73 h73) {
        this.f16484g = executor;
        this.f16485h = h73;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f16484g.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f16485h.mo18106x(e);
        }
    }
}
