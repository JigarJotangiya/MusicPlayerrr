package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3062a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3076g;
import com.google.android.gms.ads.mediation.C3077h;
import com.google.android.gms.ads.mediation.C3080k;
import com.google.android.gms.ads.mediation.C3081l;
import com.google.android.gms.ads.mediation.C3082m;
import com.google.android.gms.ads.mediation.C3084o;
import com.google.android.gms.ads.mediation.C3086q;
import com.google.android.gms.ads.mediation.C3087r;
import com.google.android.gms.ads.mediation.C3093v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class RtbAdapter extends C3062a {
    public abstract void collectSignals(@RecentlyNonNull C3088a aVar, @RecentlyNonNull C3089b bVar);

    public void loadRtbBannerAd(@RecentlyNonNull C3077h hVar, @RecentlyNonNull C3073d<C3076g, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull C3077h hVar, @RecentlyNonNull C3073d<C3080k, Object> dVar) {
        dVar.mo11193a(new C2851a(7, String.valueOf(getClass().getSimpleName()).concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull C3082m mVar, @RecentlyNonNull C3073d<C3081l, Object> dVar) {
        loadInterstitialAd(mVar, dVar);
    }

    public void loadRtbNativeAd(@RecentlyNonNull C3084o oVar, @RecentlyNonNull C3073d<C3093v, Object> dVar) {
        loadNativeAd(oVar, dVar);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull C3087r rVar, @RecentlyNonNull C3073d<C3086q, Object> dVar) {
        loadRewardedAd(rVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull C3087r rVar, @RecentlyNonNull C3073d<C3086q, Object> dVar) {
        loadRewardedInterstitialAd(rVar, dVar);
    }
}
