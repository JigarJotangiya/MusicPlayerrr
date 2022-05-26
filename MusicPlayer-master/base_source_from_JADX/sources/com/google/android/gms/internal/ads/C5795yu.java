package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.yu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5795yu extends C4943bv<u20> {

    /* renamed from: b */
    final /* synthetic */ FrameLayout f26521b;

    /* renamed from: c */
    final /* synthetic */ FrameLayout f26522c;

    /* renamed from: d */
    final /* synthetic */ Context f26523d;

    /* renamed from: e */
    final /* synthetic */ C4906av f26524e;

    C5795yu(C4906av avVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f26524e = avVar;
        this.f26521b = frameLayout;
        this.f26522c = frameLayout2;
        this.f26523d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16389a() {
        C4906av.m20976p(this.f26523d, "native_ad_view_delegate");
        return new C5502qy();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16390b(C5241jw jwVar) throws RemoteException {
        return jwVar.mo10826x0(C4865b.m20503f2(this.f26521b), C4865b.m20503f2(this.f26522c));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16391c() throws RemoteException {
        C5503qz.m29790c(this.f26523d);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22663x6)).booleanValue()) {
            return this.f26524e.f14089d.mo19896c(this.f26523d, this.f26521b, this.f26522c);
        }
        try {
            return t20.m31028e7(((x20) zl0.m34659b(this.f26523d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", C5757xu.f25966a)).mo21412P5(C4865b.m20503f2(this.f26523d), C4865b.m20503f2(this.f26521b), C4865b.m20503f2(this.f26522c), 214106000));
        } catch (RemoteException | yl0 | NullPointerException e) {
            this.f26524e.f14091f = uf0.m31800c(this.f26523d);
            this.f26524e.f14091f.mo21260b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
