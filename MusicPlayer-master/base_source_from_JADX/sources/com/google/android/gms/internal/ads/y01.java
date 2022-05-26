package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3359d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y01 implements C5565sn {

    /* renamed from: a */
    private final ScheduledExecutorService f26184a;

    /* renamed from: b */
    private final C3359d f26185b;

    /* renamed from: c */
    private ScheduledFuture<?> f26186c;

    /* renamed from: d */
    private long f26187d = -1;

    /* renamed from: e */
    private long f26188e = -1;

    /* renamed from: f */
    private Runnable f26189f = null;

    /* renamed from: g */
    private boolean f26190g = false;

    public y01(ScheduledExecutorService scheduledExecutorService, C3359d dVar) {
        this.f26184a = scheduledExecutorService;
        this.f26185b = dVar;
        C2971s.m13200c().mo21123c(this);
    }

    /* renamed from: B */
    public final void mo17587B(boolean z) {
        if (z) {
            mo22125b();
        } else {
            mo22124a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo22124a() {
        if (!this.f26190g) {
            ScheduledFuture<?> scheduledFuture = this.f26186c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f26188e = -1;
            } else {
                this.f26186c.cancel(true);
                this.f26188e = this.f26187d - this.f26185b.mo11989b();
            }
            this.f26190g = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo22125b() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f26190g) {
            if (this.f26188e > 0 && (scheduledFuture = this.f26186c) != null && scheduledFuture.isCancelled()) {
                this.f26186c = this.f26184a.schedule(this.f26189f, this.f26188e, TimeUnit.MILLISECONDS);
            }
            this.f26190g = false;
        }
    }

    /* renamed from: c */
    public final synchronized void mo22126c(int i, Runnable runnable) {
        this.f26189f = runnable;
        long j = (long) i;
        this.f26187d = this.f26185b.mo11989b() + j;
        this.f26186c = this.f26184a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
