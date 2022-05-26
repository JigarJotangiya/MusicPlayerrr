package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.mediation.C3074e;
import com.google.android.gms.ads.mediation.C3078i;
import com.google.android.gms.ads.mediation.C3083n;
import com.google.android.gms.ads.mediation.C3085p;
import com.google.android.gms.ads.mediation.C3090s;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.ul0;
import java.util.Objects;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e */
    static final C2851a f10148e = new C2851a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a */
    private View f10149a;

    /* renamed from: b */
    CustomEventBanner f10150b;

    /* renamed from: c */
    CustomEventInterstitial f10151c;

    /* renamed from: d */
    CustomEventNative f10152d;

    /* renamed from: a */
    private static <T> T m13538a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
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

    @RecentlyNonNull
    public View getBannerView() {
        return this.f10149a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f10150b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f10151c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f10152d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.f10150b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f10151c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f10152d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.f10150b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f10151c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f10152d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull C3078i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2921g gVar, @RecentlyNonNull C3074e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) m13538a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f10150b = customEventBanner;
        if (customEventBanner == null) {
            iVar.mo11203e(this, f10148e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventBanner customEventBanner2 = this.f10150b;
        Objects.requireNonNull(customEventBanner2);
        Context context2 = context;
        customEventBanner2.requestBannerAd(context2, new C3070f(this, iVar), bundle.getString("parameter"), gVar, eVar, bundle3);
    }

    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull C3083n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3074e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m13538a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f10151c = customEventInterstitial;
        if (customEventInterstitial == null) {
            nVar.mo11211l(this, f10148e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventInterstitial customEventInterstitial2 = this.f10151c;
        Objects.requireNonNull(customEventInterstitial2);
        Context context2 = context;
        customEventInterstitial2.requestInterstitialAd(context2, new C3071g(this, this, nVar), bundle.getString("parameter"), eVar, bundle3);
    }

    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull C3085p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3090s sVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) m13538a(CustomEventNative.class, bundle.getString("class_name"));
        this.f10152d = customEventNative;
        if (customEventNative == null) {
            pVar.mo11216c(this, f10148e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventNative customEventNative2 = this.f10152d;
        Objects.requireNonNull(customEventNative2);
        Context context2 = context;
        customEventNative2.requestNativeAd(context2, new C3072h(this, pVar), bundle.getString("parameter"), sVar, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f10151c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
