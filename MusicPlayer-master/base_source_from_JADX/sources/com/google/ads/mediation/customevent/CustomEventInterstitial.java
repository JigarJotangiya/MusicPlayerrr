package com.google.ads.mediation.customevent;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C2833a;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventInterstitial {
    /* synthetic */ void destroy();

    void requestInterstitialAd(@RecentlyNonNull C2837b bVar, @RecentlyNonNull Activity activity, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull C2833a aVar, @RecentlyNonNull Object obj);

    void showInterstitial();
}
