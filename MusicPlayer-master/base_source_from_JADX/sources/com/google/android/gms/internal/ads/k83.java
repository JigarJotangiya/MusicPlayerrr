package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k83<V> extends j83<V> {

    /* renamed from: n */
    private final d93<V> f18841n;

    k83(d93<V> d93) {
        Objects.requireNonNull(d93);
        this.f18841n = d93;
    }

    public final boolean cancel(boolean z) {
        return this.f18841n.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f18841n.get();
    }

    /* renamed from: h */
    public final void mo15945h(Runnable runnable, Executor executor) {
        this.f18841n.mo15945h(runnable, executor);
    }

    public final boolean isCancelled() {
        return this.f18841n.isCancelled();
    }

    public final boolean isDone() {
        return this.f18841n.isDone();
    }

    public final String toString() {
        return this.f18841n.toString();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f18841n.get(j, timeUnit);
    }
}
