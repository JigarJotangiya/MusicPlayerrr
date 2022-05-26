package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class py2 implements C3261d.C3262a, C3261d.C3263b {

    /* renamed from: a */
    private final kz2 f21757a;

    /* renamed from: b */
    private final fz2 f21758b;

    /* renamed from: c */
    private final Object f21759c = new Object();

    /* renamed from: d */
    private boolean f21760d = false;

    /* renamed from: e */
    private boolean f21761e = false;

    py2(Context context, Looper looper, fz2 fz2) {
        this.f21758b = fz2;
        this.f21757a = new kz2(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m29280b() {
        synchronized (this.f21759c) {
            if (this.f21757a.mo11797i() || this.f21757a.mo11793e()) {
                this.f21757a.mo11791c();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11813K0(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f21759c
            monitor-enter(r4)
            boolean r0 = r3.f21761e     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f21761e = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.kz2 r0 = r3.f21757a     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.nz2 r0 = r0.mo19042i0()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.zzfnm r1 = new com.google.android.gms.internal.ads.zzfnm     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.fz2 r2 = r3.f21758b     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.mo21561e()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.mo19871o5(r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.m29280b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.m29280b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.py2.mo11813K0(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20344a() {
        synchronized (this.f21759c) {
            if (!this.f21760d) {
                this.f21760d = true;
                this.f21757a.mo11803q();
            }
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
    }
}
