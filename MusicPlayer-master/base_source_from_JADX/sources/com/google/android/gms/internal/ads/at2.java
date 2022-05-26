package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class at2<E, V> implements d93<V> {

    /* renamed from: g */
    private final E f14063g;

    /* renamed from: h */
    private final String f14064h;

    /* renamed from: i */
    private final d93<V> f14065i;

    public at2(E e, String str, d93<V> d93) {
        this.f14063g = e;
        this.f14064h = str;
        this.f14065i = d93;
    }

    /* renamed from: a */
    public final E mo15940a() {
        return this.f14063g;
    }

    /* renamed from: b */
    public final String mo15941b() {
        return this.f14064h;
    }

    public final boolean cancel(boolean z) {
        return this.f14065i.cancel(z);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f14065i.get();
    }

    /* renamed from: h */
    public final void mo15945h(Runnable runnable, Executor executor) {
        this.f14065i.mo15945h(runnable, executor);
    }

    public final boolean isCancelled() {
        return this.f14065i.isCancelled();
    }

    public final boolean isDone() {
        return this.f14065i.isDone();
    }

    public final String toString() {
        String str = this.f14064h;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f14065i.get(j, timeUnit);
    }
}
