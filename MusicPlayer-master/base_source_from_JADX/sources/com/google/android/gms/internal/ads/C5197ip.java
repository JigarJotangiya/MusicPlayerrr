package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.internal.C3261d;

/* renamed from: com.google.android.gms.internal.ads.ip */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5197ip {

    /* renamed from: a */
    private final Runnable f18139a = new C5048ep(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f18140b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5271kp f18141c;

    /* renamed from: d */
    private Context f18142d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5345mp f18143e;

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m25351h(C5197ip ipVar) {
        synchronized (ipVar.f18140b) {
            C5271kp kpVar = ipVar.f18141c;
            if (kpVar != null) {
                if (kpVar.mo11797i() || ipVar.f18141c.mo11793e()) {
                    ipVar.f18141c.mo11791c();
                }
                ipVar.f18141c = null;
                ipVar.f18143e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m25353l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18140b
            monitor-enter(r0)
            android.content.Context r1 = r3.f18142d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.kp r1 = r3.f18141c     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.gp r1 = new com.google.android.gms.internal.ads.gp     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.hp r2 = new com.google.android.gms.internal.ads.hp     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.kp r1 = r3.mo18470d(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f18141c = r1     // Catch:{ all -> 0x0023 }
            r1.mo11803q()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5197ip.m25353l():void");
    }

    /* renamed from: a */
    public final long mo18468a(zzbak zzbak) {
        synchronized (this.f18140b) {
            if (this.f18143e == null) {
                return -2;
            }
            if (this.f18141c.mo18954i0()) {
                try {
                    long l3 = this.f18143e.mo19483l3(zzbak);
                    return l3;
                } catch (RemoteException e) {
                    ul0.m31860e("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    /* renamed from: b */
    public final zzbah mo18469b(zzbak zzbak) {
        synchronized (this.f18140b) {
            if (this.f18143e == null) {
                zzbah zzbah = new zzbah();
                return zzbah;
            }
            try {
                if (this.f18141c.mo18954i0()) {
                    zzbah o5 = this.f18143e.mo19484o5(zzbak);
                    return o5;
                }
                zzbah y3 = this.f18143e.mo19485y3(zzbak);
                return y3;
            } catch (RemoteException e) {
                ul0.m31860e("Unable to call into cache service.", e);
                return new zzbah();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized C5271kp mo18470d(C3261d.C3262a aVar, C3261d.C3263b bVar) {
        return new C5271kp(this.f18142d, C2971s.m13218u().mo11123b(), aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18471i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f18140b
            monitor-enter(r0)
            android.content.Context r1 = r2.f18142d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f18142d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22627t2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo20153b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m25353l()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22619s2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo20153b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.fp r3 = new com.google.android.gms.internal.ads.fp     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.tn r1 = com.google.android.gms.ads.internal.C2971s.m13200c()     // Catch:{ all -> 0x0048 }
            r1.mo21123c(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5197ip.mo18471i(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo18472j() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22635u2)).booleanValue()) {
            synchronized (this.f18140b) {
                m25353l();
                w03 w03 = C2979b2.f9980i;
                w03.removeCallbacks(this.f18139a);
                w03.postDelayed(this.f18139a, ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22643v2)).longValue());
            }
        }
    }
}
