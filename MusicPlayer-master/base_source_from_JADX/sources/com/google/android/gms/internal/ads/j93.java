package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class j93 extends g93 implements ScheduledExecutorService, e93 {

    /* renamed from: h */
    final ScheduledExecutorService f18401h;

    j93(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f18401h = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        s93 F = s93.m30624F(runnable, null);
        return new h93(F, this.f18401h.schedule(F, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        i93 i93 = new i93(runnable);
        return new h93(i93, this.f18401h.scheduleAtFixedRate(i93, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        i93 i93 = new i93(runnable);
        return new h93(i93, this.f18401h.scheduleWithFixedDelay(i93, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        s93 s93 = new s93(callable);
        return new h93(s93, this.f18401h.schedule(s93, j, timeUnit));
    }
}
