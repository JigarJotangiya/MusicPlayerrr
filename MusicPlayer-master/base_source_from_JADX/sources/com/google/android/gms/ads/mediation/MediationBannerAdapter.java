package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2921g;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationBannerAdapter extends C3075f {
    @RecentlyNonNull
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3078i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2921g gVar, @RecentlyNonNull C3074e eVar, Bundle bundle2);
}
