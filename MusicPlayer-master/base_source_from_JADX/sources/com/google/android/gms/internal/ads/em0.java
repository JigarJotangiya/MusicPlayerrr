package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3021n1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class em0 implements Executor {

    /* renamed from: g */
    private final Handler f16004g = new C3021n1(Looper.getMainLooper());

    em0() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C2971s.m13214q();
                C2979b2.m13268p(C2971s.m13213p().mo17558c(), th);
                throw th;
            }
        } else {
            this.f16004g.post(runnable);
        }
    }
}
