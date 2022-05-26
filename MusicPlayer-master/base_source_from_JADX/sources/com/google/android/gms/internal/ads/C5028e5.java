package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.e5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5028e5 extends Thread {

    /* renamed from: m */
    private static final boolean f15859m = C5066f6.f16447b;

    /* renamed from: g */
    private final BlockingQueue<C5547s5<?>> f15860g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final BlockingQueue<C5547s5<?>> f15861h;

    /* renamed from: i */
    private final C4954c5 f15862i;

    /* renamed from: j */
    private volatile boolean f15863j = false;

    /* renamed from: k */
    private final C5104g6 f15864k;

    /* renamed from: l */
    private final C5214j5 f15865l;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.s5<?>>, com.google.android.gms.internal.ads.c5] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.c5, com.google.android.gms.internal.ads.j5] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5028e5(java.util.concurrent.BlockingQueue r1, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C5547s5<?>> r2, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C5547s5<?>> r3, com.google.android.gms.internal.ads.C4954c5 r4, com.google.android.gms.internal.ads.C5214j5 r5) {
        /*
            r0 = this;
            r0.<init>()
            r5 = 0
            r0.f15863j = r5
            r0.f15860g = r1
            r0.f15861h = r2
            r0.f15862i = r3
            r0.f15865l = r4
            com.google.android.gms.internal.ads.g6 r1 = new com.google.android.gms.internal.ads.g6
            r3 = 0
            r1.<init>(r0, r2, r4, r3)
            r0.f15864k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5028e5.<init>(java.util.concurrent.BlockingQueue, java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.c5, com.google.android.gms.internal.ads.j5, byte[]):void");
    }

    /* renamed from: c */
    private void m22842c() throws InterruptedException {
        C5547s5 take = this.f15860g.take();
        take.mo20786t("cache-queue-take");
        take.mo20772A(1);
        try {
            take.mo20775D();
            C4917b5 p = this.f15862i.mo16495p(take.mo20784q());
            if (p == null) {
                take.mo20786t("cache-miss");
                if (!this.f15864k.mo17866c(take)) {
                    this.f15861h.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (p.mo16064a(currentTimeMillis)) {
                take.mo20786t("cache-hit-expired");
                take.mo20781j(p);
                if (!this.f15864k.mo17866c(take)) {
                    this.f15861h.put(take);
                }
                take.mo20772A(2);
                return;
            }
            take.mo20786t("cache-hit");
            C5769y5 o = take.mo11106o(new C5399o5(p.f14318a, p.f14324g));
            take.mo20786t("cache-hit-parsed");
            if (!o.mo22170c()) {
                take.mo20786t("cache-parsing-failed");
                this.f15862i.mo16497r(take.mo20784q(), true);
                take.mo20781j((C4917b5) null);
                if (!this.f15864k.mo17866c(take)) {
                    this.f15861h.put(take);
                }
                take.mo20772A(2);
                return;
            }
            if (p.f14323f < currentTimeMillis) {
                take.mo20786t("cache-hit-refresh-needed");
                take.mo20781j(p);
                o.f26267d = true;
                if (!this.f15864k.mo17866c(take)) {
                    this.f15865l.mo18546b(take, o, new C4991d5(this, take));
                } else {
                    this.f15865l.mo18546b(take, o, (Runnable) null);
                }
            } else {
                this.f15865l.mo18546b(take, o, (Runnable) null);
            }
            take.mo20772A(2);
        } finally {
            take.mo20772A(2);
        }
    }

    /* renamed from: b */
    public final void mo17118b() {
        this.f15863j = true;
        interrupt();
    }

    public final void run() {
        if (f15859m) {
            C5066f6.m23483d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f15862i.mo16494a();
        while (true) {
            try {
                m22842c();
            } catch (InterruptedException unused) {
                if (this.f15863j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C5066f6.m23481b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
