package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.C3090s;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface CustomEventNative extends C3065a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3069e eVar, String str, @RecentlyNonNull C3090s sVar, Bundle bundle);
}
