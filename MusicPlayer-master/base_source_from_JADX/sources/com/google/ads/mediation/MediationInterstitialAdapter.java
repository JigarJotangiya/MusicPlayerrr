package com.google.ads.mediation;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C2842e;
import com.google.ads.mediation.C2845f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C2845f, SERVER_PARAMETERS extends C2842e> extends C2834b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    /* synthetic */ void destroy();

    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(@RecentlyNonNull C2841d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C2833a aVar, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
