package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.mediation.C3074e;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventBanner extends C3065a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3066b bVar, String str, @RecentlyNonNull C2921g gVar, @RecentlyNonNull C3074e eVar, Bundle bundle);
}
