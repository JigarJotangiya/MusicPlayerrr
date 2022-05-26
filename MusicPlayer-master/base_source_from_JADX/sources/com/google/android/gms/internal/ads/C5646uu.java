package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.uu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5646uu extends C4943bv<C5684vv> {

    /* renamed from: b */
    final /* synthetic */ Context f24438b;

    /* renamed from: c */
    final /* synthetic */ String f24439c;

    /* renamed from: d */
    final /* synthetic */ cb0 f24440d;

    /* renamed from: e */
    final /* synthetic */ C4906av f24441e;

    C5646uu(C4906av avVar, Context context, String str, cb0 cb0) {
        this.f24441e = avVar;
        this.f24438b = context;
        this.f24439c = str;
        this.f24440d = cb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f24438b, "native_ad");
        return new C5280ky();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10823i2(C4865b.m20503f2(this.f24438b), this.f24439c, this.f24440d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        C5503qz.m29790c(this.f24438b);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22663x6)).booleanValue()) {
            return this.f24441e.f14087b.mo22071c(this.f24438b, this.f24439c, this.f24440d);
        }
        try {
            IBinder l3 = ((C5721wv) zl0.m34659b(this.f24438b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", C5609tu.f24001a)).mo21923l3(C4865b.m20503f2(this.f24438b), this.f24439c, this.f24440d, 214106000);
            if (l3 == null) {
                return null;
            }
            IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C5684vv ? (C5684vv) queryLocalInterface : new C5610tv(l3);
        } catch (RemoteException | yl0 | NullPointerException e) {
            this.f24441e.f14091f = uf0.m31800c(this.f24438b);
            this.f24441e.f14091f.mo21260b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
