package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C2835c;
import com.google.ads.mediation.C2841d;
import com.google.ads.mediation.C2842e;
import com.google.ads.mediation.C2845f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import p159f.p243f.p244a.C4856a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jc0<NETWORK_EXTRAS extends C2845f, SERVER_PARAMETERS extends C2842e> implements C2835c, C2841d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ib0 f18449a;

    public jc0(ib0 ib0) {
        this.f18449a = ib0;
    }

    /* renamed from: a */
    public final void mo10614a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C4856a aVar) {
        String valueOf = String.valueOf(aVar);
        String.valueOf(valueOf).length();
        ul0.m31857b("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(valueOf)));
        C4980cv.m22123b();
        if (!nl0.m27924p()) {
            ul0.m31864i("#008 Must be called on the main UI thread.", (Throwable) null);
            nl0.f20646b.post(new hc0(this, aVar));
            return;
        }
        try {
            this.f18449a.mo17171w(kc0.m26189a(aVar));
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo10622b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C4856a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        ul0.m31857b(sb.toString());
        C4980cv.m22123b();
        if (!nl0.m27924p()) {
            ul0.m31864i("#008 Must be called on the main UI thread.", (Throwable) null);
            nl0.f20646b.post(new ic0(this, aVar));
            return;
        }
        try {
            this.f18449a.mo17171w(kc0.m26189a(aVar));
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
