package com.google.ads.mediation;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2900e;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.mediation.C3074e;
import com.google.android.gms.ads.mediation.C3078i;
import com.google.android.gms.ads.mediation.C3083n;
import com.google.android.gms.ads.mediation.C3085p;
import com.google.android.gms.ads.mediation.C3090s;
import com.google.android.gms.ads.mediation.C3092u;
import com.google.android.gms.ads.mediation.C3095x;
import com.google.android.gms.ads.mediation.C3096y;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p076z.C3130a;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5427ox;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.zzcql;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C3092u, zzcql, C3096y {
    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C2900e adLoader;
    @RecentlyNonNull
    protected AdView mAdView;
    @RecentlyNonNull
    protected C3130a mInterstitialAd;

    /* access modifiers changed from: package-private */
    public C2903f buildAdRequest(Context context, C3074e eVar, Bundle bundle, Bundle bundle2) {
        C2903f.C2904a aVar = new C2903f.C2904a();
        Date f = eVar.mo11196f();
        if (f != null) {
            aVar.mo10739f(f);
        }
        int k = eVar.mo11200k();
        if (k != 0) {
            aVar.mo10740g(k);
        }
        Set<String> h = eVar.mo11198h();
        if (h != null) {
            for (String a : h) {
                aVar.mo10734a(a);
            }
        }
        Location j = eVar.mo11199j();
        if (j != null) {
            aVar.mo10737d(j);
        }
        if (eVar.mo11197g()) {
            C4980cv.m22123b();
            aVar.mo10738e(nl0.m27928t(context));
        }
        if (eVar.mo11194c() != -1) {
            boolean z = true;
            if (eVar.mo11194c() != 1) {
                z = false;
            }
            aVar.mo10742i(z);
        }
        aVar.mo10741h(eVar.mo11195e());
        aVar.mo10735b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.mo10736c();
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public abstract Bundle buildExtrasBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @RecentlyNonNull
    public View getBannerView() {
        return this.mAdView;
    }

    /* access modifiers changed from: package-private */
    public C3130a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        C3095x xVar = new C3095x();
        xVar.mo11275b(1);
        return xVar.mo11274a();
    }

    public C5427ox getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.mo10657e().mo11361c();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C2900e.C2901a newAdLoader(Context context, String str) {
        return new C2900e.C2901a(context, str);
    }

    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo11151a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        C3130a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo11389c(z);
        }
    }

    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo11153c();
        }
    }

    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo11154d();
        }
    }

    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3078i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2921g gVar, @RecentlyNonNull C3074e eVar, @RecentlyNonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new C2921g(gVar.mo10796d(), gVar.mo10794b()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new C2847h(this, iVar));
        this.mAdView.mo11152b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3083n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3074e eVar, @RecentlyNonNull Bundle bundle2) {
        C3130a.m13710a(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new C2848i(this, nVar));
    }

    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3085p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3090s sVar, @RecentlyNonNull Bundle bundle2) {
        C2850k kVar = new C2850k(this, pVar);
        C2900e.C2901a newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.mo10730e(kVar);
        newAdLoader.mo10731f(sVar.mo11234i());
        newAdLoader.mo10732g(sVar.mo11232b());
        if (sVar.mo11233d()) {
            newAdLoader.mo10729d(kVar);
        }
        if (sVar.mo11231a()) {
            for (String next : sVar.zza().keySet()) {
                newAdLoader.mo10727b(next, kVar, true != sVar.zza().get(next).booleanValue() ? null : kVar);
            }
        }
        C2900e a = newAdLoader.mo10726a();
        this.adLoader = a;
        a.mo10724b(buildAdRequest(context, sVar, bundle2, bundle));
    }

    public void showInterstitial() {
        C3130a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo11390d((Activity) null);
        }
    }
}
