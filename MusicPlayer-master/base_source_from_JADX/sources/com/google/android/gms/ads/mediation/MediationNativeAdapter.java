package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationNativeAdapter extends C3075f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3085p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3090s sVar, Bundle bundle2);
}
