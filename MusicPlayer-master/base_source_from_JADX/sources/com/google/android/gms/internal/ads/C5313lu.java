package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.lu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5313lu extends C4943bv<ok0> {

    /* renamed from: b */
    final /* synthetic */ Context f19527b;

    /* renamed from: c */
    final /* synthetic */ cb0 f19528c;

    C5313lu(C4906av avVar, Context context, cb0 cb0) {
        this.f19527b = context;
        this.f19528c = cb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10817L4(C4865b.m20503f2(this.f19527b), this.f19528c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        try {
            return ((rk0) zl0.m34659b(this.f19527b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", C5276ku.f18991a)).mo20278F0(C4865b.m20503f2(this.f19527b), this.f19528c, 214106000);
        } catch (RemoteException | yl0 | NullPointerException unused) {
            return null;
        }
    }
}
