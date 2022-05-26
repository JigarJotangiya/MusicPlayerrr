package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p93<V> extends i83<V> {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public d93<V> f21374n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ScheduledFuture<?> f21375o;

    private p93(d93<V> d93) {
        Objects.requireNonNull(d93);
        this.f21374n = d93;
    }

    /* renamed from: G */
    static <V> d93<V> m28946G(d93<V> d93, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        p93 p93 = new p93(d93);
        m93 m93 = new m93(p93);
        p93.f21375o = scheduledExecutorService.schedule(m93, j, timeUnit);
        d93.mo15945h(m93, g83.INSTANCE);
        return p93;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        d93<V> d93 = this.f21374n;
        ScheduledFuture<?> scheduledFuture = this.f21375o;
        if (d93 == null) {
            return null;
        }
        String obj = d93.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo18102j() {
        mo18104u(this.f21374n);
        ScheduledFuture<?> scheduledFuture = this.f21375o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f21374n = null;
        this.f21375o = null;
    }
}
