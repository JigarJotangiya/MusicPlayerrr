package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h93<V> extends m83<V> implements ScheduledFuture<V>, d93 {

    /* renamed from: h */
    private final ScheduledFuture<?> f17585h;

    public h93(d93<V> d93, ScheduledFuture<?> scheduledFuture) {
        super(d93);
        this.f17585h = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = mo19108j().cancel(z);
        if (cancel) {
            this.f17585h.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f17585h.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f17585h.getDelay(timeUnit);
    }
}
