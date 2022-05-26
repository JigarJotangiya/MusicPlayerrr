package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k93 {
    /* renamed from: a */
    public static e93 m26166a(ExecutorService executorService) {
        e93 e93;
        if (executorService instanceof e93) {
            return (e93) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            e93 = new j93((ScheduledExecutorService) executorService);
        } else {
            e93 = new g93(executorService);
        }
        return e93;
    }

    /* renamed from: b */
    public static Executor m26167b() {
        return g83.INSTANCE;
    }

    /* renamed from: c */
    static Executor m26168c(Executor executor, h73<?> h73) {
        Objects.requireNonNull(executor);
        if (executor == g83.INSTANCE) {
            return executor;
        }
        return new f93(executor, h73);
    }
}
