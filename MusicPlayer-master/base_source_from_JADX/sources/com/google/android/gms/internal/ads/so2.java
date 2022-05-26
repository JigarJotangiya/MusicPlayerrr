package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class so2 extends vh0 {

    /* renamed from: g */
    private final oo2 f23563g;

    /* renamed from: h */
    private final do2 f23564h;

    /* renamed from: i */
    private final String f23565i;

    /* renamed from: j */
    private final pp2 f23566j;

    /* renamed from: k */
    private final Context f23567k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public rp1 f23568l;

    /* renamed from: m */
    private boolean f23569m = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22601q0)).booleanValue();

    public so2(String str, oo2 oo2, Context context, do2 do2, pp2 pp2) {
        this.f23565i = str;
        this.f23563g = oo2;
        this.f23564h = do2;
        this.f23566j = pp2;
        this.f23567k = context;
    }

    /* renamed from: h7 */
    private final synchronized void m30828h7(zzbfd zzbfd, ei0 ei0, int i) throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        this.f23564h.mo16972L(ei0);
        C2971s.m13214q();
        if (C2979b2.m13264l(this.f23567k)) {
            if (zzbfd.f27213y == null) {
                ul0.m31859d("Failed to load the ad because app ID is missing.");
                this.f23564h.mo16370c(nq2.m28048d(4, (String) null, (zzbew) null));
                return;
            }
        }
        if (this.f23568l == null) {
            fo2 fo2 = new fo2((String) null);
            this.f23563g.mo20066i(i);
            this.f23563g.mo16308a(zzbfd, this.f23565i, fo2, new ro2(this));
        }
    }

    /* renamed from: A2 */
    public final void mo20889A2(fi0 fi0) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        this.f23564h.mo16975W(fi0);
    }

    /* renamed from: G5 */
    public final synchronized void mo20890G5(C4863a aVar) throws RemoteException {
        mo20893S2(aVar, this.f23569m);
    }

    /* renamed from: K2 */
    public final synchronized void mo20891K2(zzbfd zzbfd, ei0 ei0) throws RemoteException {
        m30828h7(zzbfd, ei0, 3);
    }

    /* renamed from: Q1 */
    public final synchronized void mo20892Q1(zzbfd zzbfd, ei0 ei0) throws RemoteException {
        m30828h7(zzbfd, ei0, 2);
    }

    /* renamed from: S2 */
    public final synchronized void mo20893S2(C4863a aVar, boolean z) throws RemoteException {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        if (this.f23568l == null) {
            ul0.m31862g("Rewarded can not be shown before loaded");
            this.f23564h.mo15619n0(nq2.m28048d(9, (String) null, (zzbew) null));
            return;
        }
        this.f23568l.mo20731m(z, (Activity) C4865b.m20502K0(aVar));
    }

    /* renamed from: a */
    public final Bundle mo20894a() {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        rp1 rp1 = this.f23568l;
        return rp1 != null ? rp1.mo20726h() : new Bundle();
    }

    /* renamed from: b */
    public final C5316lx mo20895b() {
        rp1 rp1;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue() && (rp1 = this.f23568l) != null) {
            return rp1.mo17839c();
        }
        return null;
    }

    /* renamed from: d3 */
    public final void mo20896d3(ai0 ai0) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        this.f23564h.mo16981x(ai0);
    }

    /* renamed from: f */
    public final th0 mo20897f() {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        rp1 rp1 = this.f23568l;
        if (rp1 != null) {
            return rp1.mo20727i();
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo20898l() {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        rp1 rp1 = this.f23568l;
        return rp1 != null && !rp1.mo20729k();
    }

    /* renamed from: p1 */
    public final synchronized void mo20899p1(zzcfn zzcfn) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        pp2 pp2 = this.f23566j;
        pp2.f21453a = zzcfn.f27362g;
        pp2.f21454b = zzcfn.f27363h;
    }

    /* renamed from: p3 */
    public final void mo20900p3(C5205ix ixVar) {
        C3292l.m14236d("setOnPaidEventListener must be called on the main UI thread.");
        this.f23564h.mo16980v(ixVar);
    }

    /* renamed from: t0 */
    public final synchronized void mo20901t0(boolean z) {
        C3292l.m14236d("setImmersiveMode must be called on the main UI thread.");
        this.f23569m = z;
    }

    /* renamed from: z5 */
    public final void mo20902z5(C5094fx fxVar) {
        if (fxVar == null) {
            this.f23564h.mo16979u((xx2) null);
        } else {
            this.f23564h.mo16979u(new qo2(this, fxVar));
        }
    }

    public final synchronized String zze() throws RemoteException {
        rp1 rp1 = this.f23568l;
        if (rp1 == null || rp1.mo17839c() == null) {
            return null;
        }
        return this.f23568l.mo17839c().zze();
    }
}
