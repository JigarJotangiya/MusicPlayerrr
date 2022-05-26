package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.ju */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5239ju extends C4943bv<xe0> {

    /* renamed from: b */
    final /* synthetic */ Activity f18638b;

    /* renamed from: c */
    final /* synthetic */ C4906av f18639c;

    C5239ju(C4906av avVar, Activity activity) {
        this.f18639c = avVar;
        this.f18638b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f18638b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10821a0(C4865b.m20503f2(this.f18638b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        C5503qz.m29790c(this.f18638b);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22663x6)).booleanValue()) {
            return this.f18639c.f14090e.mo21255c(this.f18638b);
        }
        try {
            return we0.m33106e7(((af0) zl0.m34659b(this.f18638b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", C5202iu.f18156a)).zze(C4865b.m20503f2(this.f18638b)));
        } catch (RemoteException | yl0 | NullPointerException e) {
            this.f18639c.f14091f = uf0.m31800c(this.f18638b.getApplicationContext());
            this.f18639c.f14091f.mo21260b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
