package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wa1 extends ud1<xa1> {

    /* renamed from: h */
    private final ScheduledExecutorService f25301h;

    /* renamed from: i */
    private final C3359d f25302i;

    /* renamed from: j */
    private long f25303j = -1;

    /* renamed from: k */
    private long f25304k = -1;

    /* renamed from: l */
    private boolean f25305l = false;

    /* renamed from: m */
    private ScheduledFuture<?> f25306m;

    public wa1(ScheduledExecutorService scheduledExecutorService, C3359d dVar) {
        super(Collections.emptySet());
        this.f25301h = scheduledExecutorService;
        this.f25302i = dVar;
    }

    /* renamed from: P0 */
    private final synchronized void m33025P0(long j) {
        ScheduledFuture<?> scheduledFuture = this.f25306m;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f25306m.cancel(true);
        }
        this.f25303j = this.f25302i.mo11989b() + j;
        this.f25306m = this.f25301h.schedule(new va1(this, (ua1) null), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: N0 */
    public final synchronized void mo21773N0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f25305l) {
                long j = this.f25304k;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f25304k = millis;
                return;
            }
            long b = this.f25302i.mo11989b();
            long j2 = this.f25303j;
            if (b > j2 || j2 - this.f25302i.mo11989b() > millis) {
                m33025P0(millis);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo21774a() {
        if (!this.f25305l) {
            ScheduledFuture<?> scheduledFuture = this.f25306m;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f25304k = -1;
            } else {
                this.f25306m.cancel(true);
                this.f25304k = this.f25303j - this.f25302i.mo11989b();
            }
            this.f25305l = true;
        }
    }

    /* renamed from: b */
    public final synchronized void mo21775b() {
        if (this.f25305l) {
            if (this.f25304k > 0 && this.f25306m.isCancelled()) {
                m33025P0(this.f25304k);
            }
            this.f25305l = false;
        }
    }

    public final synchronized void zza() {
        this.f25305l = false;
        m33025P0(0);
    }
}
