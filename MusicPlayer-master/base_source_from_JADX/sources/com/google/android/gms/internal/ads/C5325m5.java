package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.m5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5325m5 extends Thread {

    /* renamed from: g */
    private final BlockingQueue<C5547s5<?>> f19768g;

    /* renamed from: h */
    private final C5288l5 f19769h;

    /* renamed from: i */
    private final C4954c5 f19770i;

    /* renamed from: j */
    private volatile boolean f19771j = false;

    /* renamed from: k */
    private final C5214j5 f19772k;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.s5<?>>, com.google.android.gms.internal.ads.l5] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.c5, com.google.android.gms.internal.ads.l5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.c5, com.google.android.gms.internal.ads.j5] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5325m5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C5547s5<?>> r2, com.google.android.gms.internal.ads.C5288l5 r3, com.google.android.gms.internal.ads.C4954c5 r4, com.google.android.gms.internal.ads.C5214j5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f19771j = r5
            r0.f19768g = r1
            r0.f19769h = r2
            r0.f19770i = r3
            r0.f19772k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5325m5.<init>(java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.l5, com.google.android.gms.internal.ads.c5, com.google.android.gms.internal.ads.j5, byte[]):void");
    }

    /* renamed from: b */
    private void m27146b() throws InterruptedException {
        C5547s5 take = this.f19768g.take();
        SystemClock.elapsedRealtime();
        take.mo20772A(3);
        try {
            take.mo20786t("network-queue-take");
            take.mo20775D();
            TrafficStats.setThreadStatsTag(take.mo20779d());
            C5399o5 a = this.f19769h.mo11008a(take);
            take.mo20786t("network-http-complete");
            if (!a.f20925e || !take.mo20774C()) {
                C5769y5 o = take.mo11106o(a);
                take.mo20786t("network-parse-complete");
                if (o.f26265b != null) {
                    this.f19770i.mo16496q(take.mo20784q(), o.f26265b);
                    take.mo20786t("network-cache-written");
                }
                take.mo20790x();
                this.f19772k.mo18546b(take, o, (Runnable) null);
                take.mo20792z(o);
                take.mo20772A(4);
                return;
            }
            take.mo20789w("not-modified");
            take.mo20791y();
        } catch (C4955c6 e) {
            SystemClock.elapsedRealtime();
            this.f19772k.mo18545a(take, e);
            take.mo20791y();
        } catch (Exception e2) {
            C5066f6.m23482c(e2, "Unhandled exception %s", e2.toString());
            C4955c6 c6Var = new C4955c6((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.f19772k.mo18545a(take, c6Var);
            take.mo20791y();
        } finally {
            take.mo20772A(4);
        }
    }

    /* renamed from: a */
    public final void mo19339a() {
        this.f19771j = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m27146b();
            } catch (InterruptedException unused) {
                if (this.f19771j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C5066f6.m23481b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
