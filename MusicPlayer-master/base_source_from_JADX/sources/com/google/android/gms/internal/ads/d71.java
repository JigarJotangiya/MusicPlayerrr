package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d71 implements e81, if1, ed1, v81 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final x81 f15526g;

    /* renamed from: h */
    private final bp2 f15527h;

    /* renamed from: i */
    private final ScheduledExecutorService f15528i;

    /* renamed from: j */
    private final Executor f15529j;

    /* renamed from: k */
    private final l93<Boolean> f15530k = l93.m26601E();

    /* renamed from: l */
    private ScheduledFuture<?> f15531l;

    public d71(x81 x81, bp2 bp2, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f15526g = x81;
        this.f15527h = bp2;
        this.f15528i = scheduledExecutorService;
        this.f15529j = executor;
    }

    /* renamed from: b */
    public final void mo16874b() {
    }

    /* renamed from: c */
    public final void mo16875c() {
    }

    /* renamed from: d */
    public final void mo15612d(fh0 fh0, String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo16876e() {
        synchronized (this) {
            if (!this.f15530k.isDone()) {
                this.f15530k.mo18105w(Boolean.TRUE);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo16877f() {
        if (!this.f15530k.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f15531l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f15530k.mo18105w(Boolean.TRUE);
        }
    }

    /* renamed from: h */
    public final void mo15613h() {
    }

    /* renamed from: l */
    public final void mo15616l() {
        int i = this.f15527h.f14630V;
        if (i == 0 || i == 1) {
            this.f15526g.zza();
        }
    }

    /* renamed from: m */
    public final void mo15617m() {
    }

    /* renamed from: n */
    public final void mo15618n() {
    }

    /* renamed from: n0 */
    public final synchronized void mo15619n0(zzbew zzbew) {
        if (!this.f15530k.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f15531l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f15530k.mo18106x(new Exception());
        }
    }

    public final void zze() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22459Y0)).booleanValue()) {
            bp2 bp2 = this.f15527h;
            if (bp2.f14630V != 2) {
                return;
            }
            if (bp2.f14663r == 0) {
                this.f15526g.zza();
                return;
            }
            s83.m30616r(this.f15530k, new c71(this), this.f15529j);
            this.f15531l = this.f15528i.schedule(new b71(this), (long) this.f15527h.f14663r, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzr() {
    }
}
