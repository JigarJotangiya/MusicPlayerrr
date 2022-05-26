package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.C2833a;
import com.google.ads.mediation.C2835c;
import com.google.ads.mediation.C2841d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C3067c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.ul0;
import p159f.p243f.p244a.C4856a;
import p159f.p243f.p244a.C4858c;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class CustomEventAdapter implements MediationBannerAdapter<C3067c, C2838c>, MediationInterstitialAdapter<C3067c, C2838c> {

    /* renamed from: a */
    private View f9654a;

    /* renamed from: b */
    CustomEventBanner f9655b;

    /* renamed from: c */
    CustomEventInterstitial f9656c;

    /* renamed from: a */
    private static <T> T m12811a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            ul0.m31862g(sb.toString());
            return null;
        }
    }

    public void destroy() {
        CustomEventBanner customEventBanner = this.f9655b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f9656c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @RecentlyNonNull
    public Class<C3067c> getAdditionalParametersType() {
        return C3067c.class;
    }

    @RecentlyNonNull
    public View getBannerView() {
        return this.f9654a;
    }

    @RecentlyNonNull
    public Class<C2838c> getServerParametersType() {
        return C2838c.class;
    }

    public void showInterstitial() {
        this.f9656c.showInterstitial();
    }

    public void requestBannerAd(@RecentlyNonNull C2835c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C2838c cVar2, @RecentlyNonNull C4858c cVar3, @RecentlyNonNull C2833a aVar, @RecentlyNonNull C3067c cVar4) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) m12811a(cVar2.f9658b);
        this.f9655b = customEventBanner;
        if (customEventBanner == null) {
            cVar.mo10614a(this, C4856a.INTERNAL_ERROR);
            return;
        }
        if (cVar4 == null) {
            obj = null;
        } else {
            obj = cVar4.mo11192a(cVar2.f9657a);
        }
        Activity activity2 = activity;
        this.f9655b.requestBannerAd(new C2839d(this, cVar), activity2, cVar2.f9657a, cVar2.f9659c, cVar3, aVar, obj);
    }

    public void requestInterstitialAd(@RecentlyNonNull C2841d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull C2838c cVar, @RecentlyNonNull C2833a aVar, @RecentlyNonNull C3067c cVar2) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m12811a(cVar.f9658b);
        this.f9656c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.mo10622b(this, C4856a.INTERNAL_ERROR);
            return;
        }
        if (cVar2 == null) {
            obj = null;
        } else {
            obj = cVar2.mo11192a(cVar.f9657a);
        }
        Activity activity2 = activity;
        this.f9656c.requestInterstitialAd(new C2840e(this, this, dVar), activity2, cVar.f9657a, cVar.f9659c, aVar, obj);
    }
}
