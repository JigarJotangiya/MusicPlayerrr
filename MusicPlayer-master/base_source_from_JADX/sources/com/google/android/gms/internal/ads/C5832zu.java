package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.zu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5832zu extends C4943bv<wh0> {

    /* renamed from: b */
    final /* synthetic */ Context f26907b;

    /* renamed from: c */
    final /* synthetic */ String f26908c;

    /* renamed from: d */
    final /* synthetic */ cb0 f26909d;

    C5832zu(C4906av avVar, Context context, String str, cb0 cb0) {
        this.f26907b = context;
        this.f26908c = str;
        this.f26909d = cb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f26907b, "rewarded");
        return new C5576sy();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10819V6(C4865b.m20503f2(this.f26907b), this.f26908c, this.f26909d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        return ji0.m25709a(this.f26907b, this.f26908c, this.f26909d);
    }
}
