package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.ru */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5535ru extends C4943bv<C5833zv> {

    /* renamed from: b */
    final /* synthetic */ Context f22995b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f22996c;

    /* renamed from: d */
    final /* synthetic */ String f22997d;

    /* renamed from: e */
    final /* synthetic */ C4906av f22998e;

    C5535ru(C4906av avVar, Context context, zzbfi zzbfi, String str) {
        this.f22998e = avVar;
        this.f22995b = context;
        this.f22996c = zzbfi;
        this.f22997d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f22995b, "search");
        return new C5391ny();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10820Y1(C4865b.m20503f2(this.f22995b), this.f22996c, this.f22997d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        return this.f22998e.f14086a.mo22429c(this.f22995b, this.f22996c, this.f22997d, (cb0) null, 3);
    }
}
