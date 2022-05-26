package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.wu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5720wu extends C4943bv<C5537rw> {

    /* renamed from: b */
    final /* synthetic */ Context f25552b;

    /* renamed from: c */
    final /* synthetic */ C4906av f25553c;

    C5720wu(C4906av avVar, Context context) {
        this.f25553c = avVar;
        this.f25552b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f25552b, "mobile_ads_settings");
        return new C5465py();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10824q0(C4865b.m20503f2(this.f25552b), 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        C5503qz.m29790c(this.f25552b);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22663x6)).booleanValue()) {
            return this.f25553c.f14088c.mo18045c(this.f25552b);
        }
        try {
            IBinder l3 = ((C5574sw) zl0.m34659b(this.f25552b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", C5683vu.f24927a)).mo20973l3(C4865b.m20503f2(this.f25552b), 214106000);
            if (l3 == null) {
                return null;
            }
            IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C5537rw ? (C5537rw) queryLocalInterface : new C5426ow(l3);
        } catch (RemoteException | yl0 | NullPointerException e) {
            this.f25553c.f14091f = uf0.m31800c(this.f25552b);
            this.f25553c.f14091f.mo21260b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
