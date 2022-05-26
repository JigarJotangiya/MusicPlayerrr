package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class l83<V> extends x33 implements Future<V> {
    protected l83() {
    }

    public final V get() throws InterruptedException, ExecutionException {
        return mo19108j().get();
    }

    public final boolean isCancelled() {
        return mo19108j().isCancelled();
    }

    public final boolean isDone() {
        return mo19108j().isDone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Future<? extends V> mo19108j();

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo19108j().get(j, timeUnit);
    }
}
