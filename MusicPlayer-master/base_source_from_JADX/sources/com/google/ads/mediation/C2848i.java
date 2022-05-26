package com.google.ads.mediation;

import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.mediation.C3083n;
import com.google.android.gms.ads.p076z.C3130a;
import com.google.android.gms.ads.p076z.C3131b;

/* renamed from: com.google.ads.mediation.i */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C2848i extends C3131b {

    /* renamed from: a */
    final AbstractAdViewAdapter f9662a;

    /* renamed from: b */
    final C3083n f9663b;

    public C2848i(AbstractAdViewAdapter abstractAdViewAdapter, C3083n nVar) {
        this.f9662a = abstractAdViewAdapter;
        this.f9663b = nVar;
    }

    /* renamed from: a */
    public final void mo10633a(C3060l lVar) {
        this.f9663b.mo11211l(this.f9662a, lVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo10634b(Object obj) {
        C3130a aVar = (C3130a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f9662a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.mo11388b(new C2849j(abstractAdViewAdapter, this.f9663b));
        this.f9663b.mo11212m(this.f9662a);
    }
}
