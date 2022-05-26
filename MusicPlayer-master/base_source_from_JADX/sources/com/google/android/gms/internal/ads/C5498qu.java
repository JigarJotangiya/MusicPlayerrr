package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.qu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5498qu extends C4943bv<C5833zv> {

    /* renamed from: b */
    final /* synthetic */ Context f22029b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f22030c;

    /* renamed from: d */
    final /* synthetic */ String f22031d;

    /* renamed from: e */
    final /* synthetic */ cb0 f22032e;

    /* renamed from: f */
    final /* synthetic */ C4906av f22033f;

    C5498qu(C4906av avVar, Context context, zzbfi zzbfi, String str, cb0 cb0) {
        this.f22033f = avVar;
        this.f22029b = context;
        this.f22030c = zzbfi;
        this.f22031d = str;
        this.f22032e = cb0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f22029b, "app_open");
        return new C5391ny();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10814C6(C4865b.m20503f2(this.f22029b), this.f22030c, this.f22031d, this.f22032e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        return this.f22033f.f14086a.mo22429c(this.f22029b, this.f22030c, this.f22031d, this.f22032e, 4);
    }
}
