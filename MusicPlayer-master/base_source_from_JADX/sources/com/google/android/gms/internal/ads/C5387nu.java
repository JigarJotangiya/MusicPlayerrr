package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.nu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5387nu extends C4943bv<le0> {

    /* renamed from: b */
    final /* synthetic */ Context f20727b;

    /* renamed from: c */
    final /* synthetic */ cb0 f20728c;

    C5387nu(C4906av avVar, Context context, cb0 cb0) {
        this.f20727b = context;
        this.f20728c = cb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10818U1(C4865b.m20503f2(this.f20727b), this.f20728c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        try {
            return ((oe0) zl0.m34659b(this.f20727b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", C5350mu.f20172a)).mo19378F0(C4865b.m20503f2(this.f20727b), this.f20728c, 214106000);
        } catch (RemoteException | yl0 | NullPointerException unused) {
            return null;
        }
    }
}
