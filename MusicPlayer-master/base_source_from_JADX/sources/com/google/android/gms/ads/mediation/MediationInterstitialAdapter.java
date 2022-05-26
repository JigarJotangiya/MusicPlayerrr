package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationInterstitialAdapter extends C3075f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3083n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3074e eVar, Bundle bundle2);

    void showInterstitial();
}
