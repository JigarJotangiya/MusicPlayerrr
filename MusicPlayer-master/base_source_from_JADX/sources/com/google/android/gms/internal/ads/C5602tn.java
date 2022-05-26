package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5602tn {

    /* renamed from: a */
    private final Object f23946a = new Object();

    /* renamed from: b */
    private C5528rn f23947b = null;

    /* renamed from: c */
    private boolean f23948c = false;

    /* renamed from: a */
    public final Activity mo21121a() {
        synchronized (this.f23946a) {
            C5528rn rnVar = this.f23947b;
            if (rnVar == null) {
                return null;
            }
            Activity a = rnVar.mo20687a();
            return a;
        }
    }

    /* renamed from: b */
    public final Context mo21122b() {
        synchronized (this.f23946a) {
            C5528rn rnVar = this.f23947b;
            if (rnVar == null) {
                return null;
            }
            Context b = rnVar.mo20688b();
            return b;
        }
    }

    /* renamed from: c */
    public final void mo21123c(C5565sn snVar) {
        synchronized (this.f23946a) {
            if (this.f23947b == null) {
                this.f23947b = new C5528rn();
            }
            this.f23947b.mo20689f(snVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21124d(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f23946a
            monitor-enter(r0)
            boolean r1 = r3.f23948c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.ul0.m31862g(r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.rn r2 = r3.f23947b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.rn r2 = new com.google.android.gms.internal.ads.rn     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r3.f23947b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.rn r2 = r3.f23947b     // Catch:{ all -> 0x0034 }
            r2.mo20690g(r1, r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f23948c = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5602tn.mo21124d(android.content.Context):void");
    }

    /* renamed from: e */
    public final void mo21125e(C5565sn snVar) {
        synchronized (this.f23946a) {
            C5528rn rnVar = this.f23947b;
            if (rnVar != null) {
                rnVar.mo20691h(snVar);
            }
        }
    }
}
