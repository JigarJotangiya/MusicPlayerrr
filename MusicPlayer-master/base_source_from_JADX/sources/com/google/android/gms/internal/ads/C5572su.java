package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.su */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5572su extends C4943bv<C5833zv> {

    /* renamed from: b */
    final /* synthetic */ Context f23625b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f23626c;

    /* renamed from: d */
    final /* synthetic */ String f23627d;

    /* renamed from: e */
    final /* synthetic */ cb0 f23628e;

    /* renamed from: f */
    final /* synthetic */ C4906av f23629f;

    C5572su(C4906av avVar, Context context, zzbfi zzbfi, String str, cb0 cb0) {
        this.f23629f = avVar;
        this.f23625b = context;
        this.f23626c = zzbfi;
        this.f23627d = str;
        this.f23628e = cb0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f23625b, "interstitial");
        return new C5391ny();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10822a5(C4865b.m20503f2(this.f23625b), this.f23626c, this.f23627d, this.f23628e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        return this.f23629f.f14086a.mo22429c(this.f23625b, this.f23626c, this.f23627d, this.f23628e, 2);
    }
}
