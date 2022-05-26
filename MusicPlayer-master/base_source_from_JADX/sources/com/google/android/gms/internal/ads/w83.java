package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w83<V> implements d93<V> {

    /* renamed from: h */
    static final d93<?> f25278h = new w83((Object) null);

    /* renamed from: i */
    private static final Logger f25279i = Logger.getLogger(w83.class.getName());

    /* renamed from: g */
    private final V f25280g;

    w83(V v) {
        this.f25280g = v;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final V get() {
        return this.f25280g;
    }

    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.f25280g;
    }

    /* renamed from: h */
    public final void mo15945h(Runnable runnable, Executor executor) {
        s13.m30500c(runnable, "Runnable was null.");
        s13.m30500c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f25279i;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), e);
        }
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f25280g);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
