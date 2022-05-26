package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g42 implements k22<e21> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final c31 f16942a;

    /* renamed from: b */
    private final m32 f16943b;

    /* renamed from: c */
    private final e93 f16944c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final g81 f16945d;

    /* renamed from: e */
    private final ScheduledExecutorService f16946e;

    public g42(c31 c31, m32 m32, g81 g81, ScheduledExecutorService scheduledExecutorService, e93 e93) {
        this.f16942a = c31;
        this.f16943b = m32;
        this.f16945d = g81;
        this.f16946e = scheduledExecutorService;
        this.f16944c = e93;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        return np2.f20682a.f18953a.mo21347a() != null && this.f16943b.mo15700a(np2, bp2);
    }

    /* renamed from: b */
    public final d93<e21> mo15701b(np2 np2, bp2 bp2) {
        return this.f16944c.mo17138A0(new e42(this, np2, bp2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ e21 mo17844c(np2 np2, bp2 bp2) throws Exception {
        return this.f16942a.mo16464b(new w41(np2, bp2, (String) null), new r31(np2.f20682a.f18953a.mo21347a(), new d42(this, np2, bp2))).zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo17845f(np2 np2, bp2 bp2) {
        s83.m30616r(s83.m30613o(this.f16943b.mo15701b(np2, bp2), (long) bp2.f14623O, TimeUnit.SECONDS, this.f16946e), new f42(this), this.f16944c);
    }
}
