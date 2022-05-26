package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class u03 implements s03 {
    /* synthetic */ u03(t03 t03) {
    }

    /* renamed from: a */
    public final ExecutorService mo20757a(ThreadFactory threadFactory, int i) {
        return mo20758b(1, threadFactory, 1);
    }

    /* renamed from: b */
    public final ExecutorService mo20758b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: c */
    public final ExecutorService mo20759c(int i) {
        return mo20758b(1, Executors.defaultThreadFactory(), 2);
    }
}
