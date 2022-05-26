package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class g93 extends k73 {

    /* renamed from: g */
    private final ExecutorService f17001g;

    g93(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f17001g = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f17001g.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f17001g.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f17001g.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f17001g.isTerminated();
    }

    public final void shutdown() {
        this.f17001g.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f17001g.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f17001g);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
