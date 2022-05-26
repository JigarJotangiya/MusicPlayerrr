package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2956o;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.util.C3018m1;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mw1 implements C2958q, ct0 {

    /* renamed from: g */
    private final Context f20311g;

    /* renamed from: h */
    private final zzcjf f20312h;

    /* renamed from: i */
    private ew1 f20313i;

    /* renamed from: j */
    private pr0 f20314j;

    /* renamed from: k */
    private boolean f20315k;

    /* renamed from: l */
    private boolean f20316l;

    /* renamed from: m */
    private long f20317m;

    /* renamed from: n */
    private C4982cx f20318n;

    /* renamed from: o */
    private boolean f20319o;

    mw1(Context context, zzcjf zzcjf) {
        this.f20311g = context;
        this.f20312h = zzcjf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m27518e() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20315k     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.f20316l     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.e93 r0 = com.google.android.gms.internal.ads.hm0.f17712e     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.kw1 r1 = new com.google.android.gms.internal.ads.kw1     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.m27518e():void");
    }

    /* renamed from: f */
    private final synchronized boolean m27519f(C4982cx cxVar) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
            ul0.m31862g("Ad inspector had an internal error.");
            try {
                cxVar.mo11145O1(nq2.m28048d(16, (String) null, (zzbew) null));
            } catch (RemoteException unused) {
            }
        } else if (this.f20313i == null) {
            ul0.m31862g("Ad inspector had an internal error.");
            try {
                cxVar.mo11145O1(nq2.m28048d(16, (String) null, (zzbew) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.f20315k && !this.f20316l) {
                if (C2971s.m13198a().mo11988a() >= this.f20317m + ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22443V5)).intValue())) {
                    return true;
                }
            }
            ul0.m31862g("Ad inspector cannot be opened because it is already open.");
            try {
                cxVar.mo11145O1(nq2.m28048d(19, (String) null, (zzbew) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10863B(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0010
            java.lang.String r4 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r4)     // Catch:{ all -> 0x002c }
            r3.f20315k = r0     // Catch:{ all -> 0x002c }
            r3.m27518e()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x0010:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.ul0.m31862g(r4)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.cx r4 = r3.f20318n     // Catch:{ RemoteException -> 0x0023 }
            if (r4 == 0) goto L_0x0023
            r1 = 17
            r2 = 0
            com.google.android.gms.internal.ads.zzbew r1 = com.google.android.gms.internal.ads.nq2.m28048d(r1, r2, r2)     // Catch:{ RemoteException -> 0x0023 }
            r4.mo11145O1(r1)     // Catch:{ RemoteException -> 0x0023 }
        L_0x0023:
            r3.f20319o = r0     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.pr0 r4 = r3.f20314j     // Catch:{ all -> 0x002c }
            r4.destroy()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.mo10863B(boolean):void");
    }

    /* renamed from: F5 */
    public final void mo10899F5() {
    }

    /* renamed from: a */
    public final synchronized void mo10900a() {
        this.f20316l = true;
        m27518e();
    }

    /* renamed from: b */
    public final void mo19563b(ew1 ew1) {
        this.f20313i = ew1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo19564c() {
        this.f20314j.mo17508a("window.inspectorInfo", this.f20313i.mo17365d().toString());
    }

    /* renamed from: d */
    public final synchronized void mo19565d(C4982cx cxVar, z50 z50) {
        C4982cx cxVar2 = cxVar;
        synchronized (this) {
            if (m27519f(cxVar)) {
                try {
                    C2971s.m13197A();
                    pr0 a = cs0.m22106a(this.f20311g, gt0.m24492a(), BuildConfig.FLAVOR, false, false, (C5737xa) null, (q00) null, this.f20312h, (f00) null, (C2935k) null, (C2925a) null, C5790yp.m34259a(), (bp2) null, (ep2) null);
                    this.f20314j = a;
                    et0 Q0 = a.mo17673Q0();
                    if (Q0 == null) {
                        ul0.m31862g("Failed to obtain a web view for the ad inspector");
                        try {
                            cxVar2.mo11145O1(nq2.m28048d(17, "Failed to obtain a web view for the ad inspector", (zzbew) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f20318n = cxVar2;
                        Q0.mo17293O((C5497qt) null, (x40) null, (C2958q) null, (z40) null, (C2966y) null, false, (b60) null, (C2926b) null, (de0) null, (zi0) null, (y12) null, (lv2) null, (gt1) null, (gu2) null, z50, (yf1) null);
                        Q0.mo17300d1(this);
                        this.f20314j.loadUrl((String) C5054ev.m23225c().mo20153b(C5503qz.f22429T5));
                        C2971s.m13208k();
                        C2956o.m13114a(this.f20311g, new AdOverlayInfoParcel(this, this.f20314j, 1, this.f20312h), true);
                        this.f20317m = C2971s.m13198a().mo11988a();
                    }
                } catch (bs0 e) {
                    ul0.m31863h("Failed to obtain a web view for the ad inspector", e);
                    try {
                        cxVar2.mo11145O1(nq2.m28048d(17, "Failed to obtain a web view for the ad inspector", (zzbew) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
    }

    /* renamed from: y3 */
    public final void mo10902y3() {
    }

    /* renamed from: z */
    public final synchronized void mo10903z(int i) {
        this.f20314j.destroy();
        if (!this.f20319o) {
            C3018m1.m13388k("Inspector closed.");
            C4982cx cxVar = this.f20318n;
            if (cxVar != null) {
                try {
                    cxVar.mo11145O1((zzbew) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f20316l = false;
        this.f20315k = false;
        this.f20317m = 0;
        this.f20319o = false;
        this.f20318n = null;
    }

    public final void zze() {
    }
}
