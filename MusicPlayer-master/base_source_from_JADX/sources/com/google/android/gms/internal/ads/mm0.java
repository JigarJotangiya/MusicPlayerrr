package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class mm0<T> implements d93<T> {

    /* renamed from: g */
    private final l93<T> f20088g = l93.m26601E();

    /* renamed from: a */
    private static final boolean m27347a(boolean z) {
        if (!z) {
            C2971s.m13213p().mo17570r(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo19449c(T t) {
        boolean w = this.f20088g.mo18105w(t);
        m27347a(w);
        return w;
    }

    public boolean cancel(boolean z) {
        return this.f20088g.cancel(z);
    }

    /* renamed from: e */
    public final boolean mo19451e(Throwable th) {
        boolean x = this.f20088g.mo18106x(th);
        m27347a(x);
        return x;
    }

    public final T get() throws ExecutionException, InterruptedException {
        return this.f20088g.get();
    }

    /* renamed from: h */
    public final void mo15945h(Runnable runnable, Executor executor) {
        this.f20088g.mo15945h(runnable, executor);
    }

    public final boolean isCancelled() {
        return this.f20088g.isCancelled();
    }

    public final boolean isDone() {
        return this.f20088g.isDone();
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f20088g.get(j, timeUnit);
    }
}
