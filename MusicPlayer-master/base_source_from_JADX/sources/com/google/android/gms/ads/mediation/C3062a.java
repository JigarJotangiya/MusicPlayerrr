package com.google.android.gms.ads.mediation;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2851a;
import java.util.List;

/* renamed from: com.google.android.gms.ads.mediation.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3062a {
    @RecentlyNonNull
    public abstract C3094w getSDKVersionInfo();

    @RecentlyNonNull
    public abstract C3094w getVersionInfo();

    public abstract void initialize(@RecentlyNonNull Context context, @RecentlyNonNull C3063b bVar, @RecentlyNonNull List<C3079j> list);

    public void loadBannerAd(@RecentlyNonNull C3077h hVar, @RecentlyNonNull C3073d<C3076g, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(@RecentlyNonNull C3077h hVar, @RecentlyNonNull C3073d<C3080k, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(@RecentlyNonNull C3082m mVar, @RecentlyNonNull C3073d<C3081l, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(@RecentlyNonNull C3084o oVar, @RecentlyNonNull C3073d<C3093v, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(@RecentlyNonNull C3087r rVar, @RecentlyNonNull C3073d<C3086q, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(@RecentlyNonNull C3087r rVar, @RecentlyNonNull C3073d<C3086q, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
