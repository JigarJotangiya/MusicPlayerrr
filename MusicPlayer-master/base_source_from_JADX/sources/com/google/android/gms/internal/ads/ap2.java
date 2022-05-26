package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ap2 {

    /* renamed from: a */
    private final C3359d f14033a;

    /* renamed from: b */
    private final Object f14034b = new Object();

    /* renamed from: c */
    private volatile long f14035c = 0;

    /* renamed from: d */
    private volatile int f14036d = 1;

    public ap2(C3359d dVar) {
        this.f14033a = dVar;
    }

    /* renamed from: e */
    private final void m20903e() {
        long a = this.f14033a.mo11988a();
        synchronized (this.f14034b) {
            if (this.f14036d == 3) {
                if (this.f14035c + ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22385N3)).longValue() <= a) {
                    this.f14036d = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20904f(int r5, int r6) {
        /*
            r4 = this;
            r4.m20903e()
            com.google.android.gms.common.util.d r0 = r4.f14033a
            long r0 = r0.mo11988a()
            java.lang.Object r2 = r4.f14034b
            monitor-enter(r2)
            int r3 = r4.f14036d     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f14036d = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f14036d     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f14035c = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ap2.m20904f(int, int):void");
    }

    /* renamed from: a */
    public final void mo15919a() {
        m20904f(2, 3);
    }

    /* renamed from: b */
    public final void mo15920b(boolean z) {
        if (z) {
            m20904f(1, 2);
        } else {
            m20904f(2, 1);
        }
    }

    /* renamed from: c */
    public final boolean mo15921c() {
        boolean z;
        synchronized (this.f14034b) {
            m20903e();
            z = this.f14036d == 3;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo15922d() {
        boolean z;
        synchronized (this.f14034b) {
            m20903e();
            z = this.f14036d == 2;
        }
        return z;
    }
}
