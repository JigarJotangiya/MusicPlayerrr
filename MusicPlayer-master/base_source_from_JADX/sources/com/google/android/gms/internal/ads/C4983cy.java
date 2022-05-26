package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C3110r;
import com.google.android.gms.ads.p075y.C3127a;
import com.google.android.gms.ads.p075y.C3128b;
import com.google.android.gms.ads.p075y.C3129c;
import com.google.android.gms.common.internal.C3292l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.cy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4983cy {

    /* renamed from: h */
    private static C4983cy f15362h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<C3129c> f15363a = new ArrayList<>();

    /* renamed from: b */
    private final Object f15364b = new Object();

    /* renamed from: c */
    private C5537rw f15365c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f15366d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15367e = false;

    /* renamed from: f */
    private C3110r f15368f = new C3110r.C3111a().mo11344a();

    /* renamed from: g */
    private C3128b f15369g;

    private C4983cy() {
    }

    /* renamed from: d */
    public static C4983cy m22198d() {
        C4983cy cyVar;
        synchronized (C4983cy.class) {
            if (f15362h == null) {
                f15362h = new C4983cy();
            }
            cyVar = f15362h;
        }
        return cyVar;
    }

    /* renamed from: m */
    private final void m22202m(Context context) {
        if (this.f15365c == null) {
            this.f15365c = (C5537rw) new C5720wu(C4980cv.m22122a(), context).mo16392d(context, false);
        }
    }

    /* renamed from: n */
    private final void m22203n(C3110r rVar) {
        try {
            this.f15365c.mo20134T0(new zzbkk(rVar));
        } catch (RemoteException e) {
            ul0.m31860e("Unable to set request configuration parcel.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final C3128b m22204o(List<zzbtn> list) {
        HashMap hashMap = new HashMap();
        for (zzbtn next : list) {
            hashMap.put(next.f27267g, new p70(next.f27268h ? C3127a.READY : C3127a.NOT_READY, next.f27270j, next.f27269i));
        }
        return new q70(hashMap);
    }

    /* renamed from: a */
    public final C3110r mo16763a() {
        return this.f15368f;
    }

    /* renamed from: c */
    public final C3128b mo16764c() {
        synchronized (this.f15364b) {
            C3292l.m14243k(this.f15365c != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                C3128b bVar = this.f15369g;
                if (bVar != null) {
                    return bVar;
                }
                C3128b o = m22204o(this.f15365c.mo20136d());
                return o;
            } catch (RemoteException unused) {
                ul0.m31859d("Unable to get Initialization status.");
                return new C5798yx(this);
            }
        }
    }

    /* renamed from: e */
    public final String mo16765e() {
        String c;
        synchronized (this.f15364b) {
            C3292l.m14243k(this.f15365c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c = d23.m22315c(this.f15365c.mo20135c());
            } catch (RemoteException e) {
                ul0.m31860e("Unable to get version string.", e);
                return BuildConfig.FLAVOR;
            }
        }
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16766i(android.content.Context r4, java.lang.String r5, com.google.android.gms.ads.p075y.C3129c r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.f15364b
            monitor-enter(r5)
            boolean r0 = r3.f15366d     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.cy r4 = m22198d()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<com.google.android.gms.ads.y.c> r4 = r4.f15363a     // Catch:{ all -> 0x00c2 }
            r4.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0012:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0014:
            boolean r0 = r3.f15367e     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0021
            com.google.android.gms.ads.y.b r4 = r3.mo16764c()     // Catch:{ all -> 0x00c2 }
            r6.mo11387a(r4)     // Catch:{ all -> 0x00c2 }
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x0023:
            r0 = 1
            r3.f15366d = r0     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.cy r0 = m22198d()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList<com.google.android.gms.ads.y.c> r0 = r0.f15363a     // Catch:{ all -> 0x00c2 }
            r0.add(r6)     // Catch:{ all -> 0x00c2 }
        L_0x0031:
            if (r4 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.va0 r0 = com.google.android.gms.internal.ads.va0.m32249a()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = 0
            r0.mo21451b(r4, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r3.m22202m(r4)     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.rw r0 = r3.f15365c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.by r2 = new com.google.android.gms.internal.ads.by     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>(r3, r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo20137g2(r2)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x004a:
            com.google.android.gms.internal.ads.rw r0 = r3.f15365c     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.za0 r2 = new com.google.android.gms.internal.ads.za0     // Catch:{ RemoteException -> 0x00b2 }
            r2.<init>()     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo20132D5(r2)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.rw r0 = r3.f15365c     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo20138h()     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.rw r0 = r3.f15365c     // Catch:{ RemoteException -> 0x00b2 }
            f.f.b.a.b.a r2 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r1)     // Catch:{ RemoteException -> 0x00b2 }
            r0.mo20139t4(r1, r2)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.ads.r r0 = r3.f15368f     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.mo11341b()     // Catch:{ RemoteException -> 0x00b2 }
            r1 = -1
            if (r0 != r1) goto L_0x0073
            com.google.android.gms.ads.r r0 = r3.f15368f     // Catch:{ RemoteException -> 0x00b2 }
            int r0 = r0.mo11342c()     // Catch:{ RemoteException -> 0x00b2 }
            if (r0 == r1) goto L_0x0078
        L_0x0073:
            com.google.android.gms.ads.r r0 = r3.f15368f     // Catch:{ RemoteException -> 0x00b2 }
            r3.m22203n(r0)     // Catch:{ RemoteException -> 0x00b2 }
        L_0x0078:
            com.google.android.gms.internal.ads.C5503qz.m29790c(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C5503qz.f22580n3     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Object r4 = r0.mo20153b(r4)     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ RemoteException -> 0x00b2 }
            boolean r4 = r4.booleanValue()     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = r3.mo16765e()     // Catch:{ RemoteException -> 0x00b2 }
            java.lang.String r0 = "0"
            boolean r4 = r4.endsWith(r0)     // Catch:{ RemoteException -> 0x00b2 }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."
            com.google.android.gms.internal.ads.ul0.m31859d(r4)     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.yx r4 = new com.google.android.gms.internal.ads.yx     // Catch:{ RemoteException -> 0x00b2 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x00b2 }
            r3.f15369g = r4     // Catch:{ RemoteException -> 0x00b2 }
            if (r6 == 0) goto L_0x00b8
            android.os.Handler r4 = com.google.android.gms.internal.ads.nl0.f20646b     // Catch:{ RemoteException -> 0x00b2 }
            com.google.android.gms.internal.ads.zx r0 = new com.google.android.gms.internal.ads.zx     // Catch:{ RemoteException -> 0x00b2 }
            r0.<init>(r3, r6)     // Catch:{ RemoteException -> 0x00b2 }
            r4.post(r0)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00b8
        L_0x00b2:
            r4 = move-exception
            java.lang.String r6 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.ul0.m31863h(r6, r4)     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return
        L_0x00ba:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "Context cannot be null."
            r4.<init>(r6)     // Catch:{ all -> 0x00c2 }
            throw r4     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4983cy.mo16766i(android.content.Context, java.lang.String, com.google.android.gms.ads.y.c):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo16767j(C3129c cVar) {
        cVar.mo11387a(this.f15369g);
    }

    /* renamed from: k */
    public final void mo16768k(boolean z) {
        synchronized (this.f15364b) {
            C3292l.m14243k(this.f15365c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f15365c.mo20133I0(z);
            } catch (RemoteException e) {
                ul0.m31860e("Unable to set app mute state.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16769l(com.google.android.gms.ads.C3110r r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.C3292l.m14234b(r0, r1)
            java.lang.Object r0 = r4.f15364b
            monitor-enter(r0)
            com.google.android.gms.ads.r r1 = r4.f15368f     // Catch:{ all -> 0x0030 }
            r4.f15368f = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.rw r2 = r4.f15365c     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.mo11341b()     // Catch:{ all -> 0x0030 }
            int r3 = r5.mo11341b()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.mo11342c()     // Catch:{ all -> 0x0030 }
            int r2 = r5.mo11342c()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.m22203n(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4983cy.mo16769l(com.google.android.gms.ads.r):void");
    }
}
