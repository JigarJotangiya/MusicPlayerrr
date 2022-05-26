package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class k73 extends AbstractExecutorService implements e93 {
    /* renamed from: A0 */
    public final <T> d93<T> mo17138A0(Callable<T> callable) {
        return (d93) super.submit(callable);
    }

    /* renamed from: F0 */
    public final d93<?> mo17139F0(Runnable runnable) {
        return (d93) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return s93.m30624F(runnable, t);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (d93) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new s93(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (d93) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (d93) super.submit(callable);
    }
}
