package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s83 extends u83 {
    /* renamed from: a */
    public static <V> r83<V> m30599a(Iterable<? extends d93<? extends V>> iterable) {
        return new r83<>(false, g43.zzl(iterable), (q83) null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <V> r83<V> m30600b(d93<? extends V>... d93Arr) {
        return new r83<>(false, g43.zzn(d93Arr), (q83) null);
    }

    /* renamed from: c */
    public static <V> r83<V> m30601c(Iterable<? extends d93<? extends V>> iterable) {
        return new r83<>(true, g43.zzl(iterable), (q83) null);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <V> r83<V> m30602d(d93<? extends V>... d93Arr) {
        return new r83<>(true, g43.zzn(d93Arr), (q83) null);
    }

    /* renamed from: e */
    public static <V> d93<List<V>> m30603e(Iterable<? extends d93<? extends V>> iterable) {
        return new z73(g43.zzl(iterable), true);
    }

    /* renamed from: f */
    public static <V, X extends Throwable> d93<V> m30604f(d93<? extends V> d93, Class<X> cls, i13<? super X, ? extends V> i13, Executor executor) {
        t63 t63 = new t63(d93, cls, i13);
        d93.mo15945h(t63, k93.m26168c(executor, t63));
        return t63;
    }

    /* renamed from: g */
    public static <V, X extends Throwable> d93<V> m30605g(d93<? extends V> d93, Class<X> cls, y73<? super X, ? extends V> y73, Executor executor) {
        s63 s63 = new s63(d93, cls, y73);
        d93.mo15945h(s63, k93.m26168c(executor, s63));
        return s63;
    }

    /* renamed from: h */
    public static <V> d93<V> m30606h(Throwable th) {
        Objects.requireNonNull(th);
        return new v83(th);
    }

    /* renamed from: i */
    public static <V> d93<V> m30607i(V v) {
        if (v == null) {
            return w83.f25278h;
        }
        return new w83(v);
    }

    /* renamed from: j */
    public static d93<Void> m30608j() {
        return w83.f25278h;
    }

    /* renamed from: k */
    public static <O> d93<O> m30609k(Callable<O> callable, Executor executor) {
        s93 s93 = new s93(callable);
        executor.execute(s93);
        return s93;
    }

    /* renamed from: l */
    public static <O> d93<O> m30610l(x73<O> x73, Executor executor) {
        s93 s93 = new s93(x73);
        executor.execute(s93);
        return s93;
    }

    /* renamed from: m */
    public static <I, O> d93<O> m30611m(d93<I> d93, i13<? super I, ? extends O> i13, Executor executor) {
        int i = n73.f20535p;
        Objects.requireNonNull(i13);
        m73 m73 = new m73(d93, i13);
        d93.mo15945h(m73, k93.m26168c(executor, m73));
        return m73;
    }

    /* renamed from: n */
    public static <I, O> d93<O> m30612n(d93<I> d93, y73<? super I, ? extends O> y73, Executor executor) {
        int i = n73.f20535p;
        Objects.requireNonNull(executor);
        l73 l73 = new l73(d93, y73);
        d93.mo15945h(l73, k93.m26168c(executor, l73));
        return l73;
    }

    /* renamed from: o */
    public static <V> d93<V> m30613o(d93<V> d93, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (d93.isDone()) {
            return d93;
        }
        return p93.m28946G(d93, j, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static <V> V m30614p(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return u93.m31709a(future);
        }
        throw new IllegalStateException(d23.m22314b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static <V> V m30615q(Future<V> future) {
        try {
            return u93.m31709a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new h83((Error) cause);
            }
            throw new t93(cause);
        }
    }

    /* renamed from: r */
    public static <V> void m30616r(d93<V> d93, o83<? super V> o83, Executor executor) {
        Objects.requireNonNull(o83);
        d93.mo15945h(new p83(d93, o83), executor);
    }
}
