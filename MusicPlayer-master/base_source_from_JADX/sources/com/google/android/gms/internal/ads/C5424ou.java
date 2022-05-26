package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.ou */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5424ou extends C4943bv<C5833zv> {

    /* renamed from: b */
    final /* synthetic */ Context f21184b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f21185c;

    /* renamed from: d */
    final /* synthetic */ String f21186d;

    /* renamed from: e */
    final /* synthetic */ cb0 f21187e;

    /* renamed from: f */
    final /* synthetic */ C4906av f21188f;

    C5424ou(C4906av avVar, Context context, zzbfi zzbfi, String str, cb0 cb0) {
        this.f21188f = avVar;
        this.f21184b = context;
        this.f21185c = zzbfi;
        this.f21186d = str;
        this.f21187e = cb0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f21184b, "banner");
        return new C5391ny();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10816E5(C4865b.m20503f2(this.f21184b), this.f21185c, this.f21186d, this.f21187e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        return this.f21188f.f14086a.mo22429c(this.f21184b, this.f21185c, this.f21186d, this.f21187e, 1);
    }
}
