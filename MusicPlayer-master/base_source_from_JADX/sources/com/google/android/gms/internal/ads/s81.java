package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s81 extends ud1<i81> implements i81 {

    /* renamed from: h */
    private final ScheduledExecutorService f23373h;

    /* renamed from: i */
    private ScheduledFuture<?> f23374i;

    /* renamed from: j */
    private boolean f23375j = false;

    /* renamed from: k */
    private final boolean f23376k;

    public s81(r81 r81, Set<qf1<i81>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f23373h = scheduledExecutorService;
        this.f23376k = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22671y6)).booleanValue();
        mo21251D0(r81, executor);
    }

    /* renamed from: A0 */
    public final void mo17073A0(xh1 xh1) {
        if (this.f23376k) {
            if (!this.f23375j) {
                ScheduledFuture<?> scheduledFuture = this.f23374i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            } else {
                return;
            }
        }
        mo21253K0(new k81(xh1));
    }

    /* renamed from: N0 */
    public final void mo20807N0() {
        if (this.f23376k) {
            this.f23374i = this.f23373h.schedule(new m81(this), (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22679z6)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo17074a() {
        mo21253K0(l81.f19247a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo20808b() {
        synchronized (this) {
            ul0.m31859d("Timeout waiting for show call succeed to be called.");
            mo17073A0(new xh1("Timeout for show call succeed."));
            this.f23375j = true;
        }
    }

    /* renamed from: c */
    public final void mo17075c(zzbew zzbew) {
        mo21253K0(new j81(zzbew));
    }

    /* renamed from: f */
    public final synchronized void mo20809f() {
        if (this.f23376k) {
            ScheduledFuture<?> scheduledFuture = this.f23374i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }
}
