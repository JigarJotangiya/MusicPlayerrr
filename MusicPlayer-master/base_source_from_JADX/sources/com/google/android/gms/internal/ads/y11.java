package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y11 extends C5566so {

    /* renamed from: g */
    private final x11 f26197g;

    /* renamed from: h */
    private final C5833zv f26198h;

    /* renamed from: i */
    private final sk2 f26199i;

    /* renamed from: j */
    private boolean f26200j = false;

    public y11(x11 x11, C5833zv zvVar, sk2 sk2) {
        this.f26197g = x11;
        this.f26198h = zvVar;
        this.f26199i = sk2;
    }

    /* renamed from: C5 */
    public final void mo15655C5(C5751xo xoVar) {
    }

    /* renamed from: c */
    public final C5316lx mo15656c() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue()) {
            return null;
        }
        return this.f26197g.mo17839c();
    }

    /* renamed from: c4 */
    public final void mo15657c4(C4863a aVar, C4974cp cpVar) {
        try {
            this.f26199i.mo20869v(cpVar);
            this.f26197g.mo21953j((Activity) C4865b.m20502K0(aVar), cpVar, this.f26200j);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c5 */
    public final void mo15658c5(C5205ix ixVar) {
        C3292l.m14236d("setOnPaidEventListener must be called on the main UI thread.");
        sk2 sk2 = this.f26199i;
        if (sk2 != null) {
            sk2.mo20867r(ixVar);
        }
    }

    /* renamed from: x6 */
    public final void mo15659x6(boolean z) {
        this.f26200j = z;
    }

    public final C5833zv zze() {
        return this.f26198h;
    }
}
