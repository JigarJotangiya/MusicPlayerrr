package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class sy3 implements Executor {

    /* renamed from: g */
    public final /* synthetic */ Handler f23654g;

    public /* synthetic */ sy3(Handler handler) {
        this.f23654g = handler;
    }

    public final void execute(Runnable runnable) {
        this.f23654g.post(runnable);
    }
}
