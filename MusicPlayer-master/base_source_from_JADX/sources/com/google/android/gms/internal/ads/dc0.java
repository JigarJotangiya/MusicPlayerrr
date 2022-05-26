package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.formats.C2910d;
import com.google.android.gms.ads.mediation.C3078i;
import com.google.android.gms.ads.mediation.C3083n;
import com.google.android.gms.ads.mediation.C3085p;
import com.google.android.gms.ads.mediation.C3093v;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class dc0 implements C3078i, C3083n, C3085p {

    /* renamed from: a */
    private final ib0 f15584a;

    /* renamed from: b */
    private C3093v f15585b;

    /* renamed from: c */
    private C2910d f15586c;

    public dc0(ib0 ib0) {
        this.f15584a = ib0;
    }

    /* renamed from: a */
    public final void mo11202a(MediationBannerAdapter mediationBannerAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdClosed.");
        try {
            this.f15584a.mo17160c();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo11215b(MediationNativeAdapter mediationNativeAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdOpened.");
        try {
            this.f15584a.zzp();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo11216c(MediationNativeAdapter mediationNativeAdapter, C2851a aVar) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        int a = aVar.mo10665a();
        String c = aVar.mo10667c();
        String b = aVar.mo10666b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        ul0.m31857b(sb.toString());
        try {
            this.f15584a.mo17173x5(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo11210d(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        ul0.m31857b(sb.toString());
        try {
            this.f15584a.mo17171w(i);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo11203e(MediationBannerAdapter mediationBannerAdapter, C2851a aVar) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        int a = aVar.mo10665a();
        String c = aVar.mo10667c();
        String b = aVar.mo10666b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        ul0.m31857b(sb.toString());
        try {
            this.f15584a.mo17173x5(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo11217f(MediationNativeAdapter mediationNativeAdapter, C2910d dVar) {
        String str;
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(dVar.mo10772a());
        if (valueOf.length() != 0) {
            str = "Adapter called onAdLoaded with template id ".concat(valueOf);
        } else {
            str = new String("Adapter called onAdLoaded with template id ");
        }
        ul0.m31857b(str);
        this.f15586c = dVar;
        try {
            this.f15584a.mo17165l();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo11204g(MediationBannerAdapter mediationBannerAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdClicked.");
        try {
            this.f15584a.zze();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo11218h(MediationNativeAdapter mediationNativeAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdClosed.");
        try {
            this.f15584a.mo17160c();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo11205i(MediationBannerAdapter mediationBannerAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdLoaded.");
        try {
            this.f15584a.mo17165l();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final void mo11219j(MediationNativeAdapter mediationNativeAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        C3093v vVar = this.f15585b;
        if (this.f15586c == null) {
            if (vVar == null) {
                ul0.m31864i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo11258l()) {
                ul0.m31857b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        ul0.m31857b("Adapter called onAdClicked.");
        try {
            this.f15584a.zze();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final void mo11220k(MediationNativeAdapter mediationNativeAdapter, C2910d dVar, String str) {
        if (dVar instanceof k30) {
            try {
                this.f15584a.mo17155F1(((k30) dVar).mo18795b(), str);
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        } else {
            ul0.m31862g("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: l */
    public final void mo11211l(MediationInterstitialAdapter mediationInterstitialAdapter, C2851a aVar) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        int a = aVar.mo10665a();
        String c = aVar.mo10667c();
        String b = aVar.mo10666b();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 97 + String.valueOf(b).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a);
        sb.append(". ErrorMessage: ");
        sb.append(c);
        sb.append(". ErrorDomain: ");
        sb.append(b);
        ul0.m31857b(sb.toString());
        try {
            this.f15584a.mo17173x5(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final void mo11212m(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdLoaded.");
        try {
            this.f15584a.mo17165l();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: n */
    public final void mo11206n(MediationBannerAdapter mediationBannerAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdOpened.");
        try {
            this.f15584a.zzp();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo11213o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdClosed.");
        try {
            this.f15584a.mo17160c();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: p */
    public final void mo11221p(MediationNativeAdapter mediationNativeAdapter, C3093v vVar) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdLoaded.");
        this.f15585b = vVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C3114t tVar = new C3114t();
            tVar.mo11362d(new sb0());
            if (vVar != null && vVar.mo11264r()) {
                vVar.mo11246K(tVar);
            }
        }
        try {
            this.f15584a.mo17165l();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo11207q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAppEvent.");
        try {
            this.f15584a.mo17162e5(str, str2);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo11222r(MediationNativeAdapter mediationNativeAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        C3093v vVar = this.f15585b;
        if (this.f15586c == null) {
            if (vVar == null) {
                ul0.m31864i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo11259m()) {
                ul0.m31857b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        ul0.m31857b("Adapter called onAdImpression.");
        try {
            this.f15584a.mo17166m();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo11214s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3292l.m14236d("#008 Must be called on the main UI thread.");
        ul0.m31857b("Adapter called onAdOpened.");
        try {
            this.f15584a.zzp();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final C2910d mo16905t() {
        return this.f15586c;
    }

    /* renamed from: u */
    public final C3093v mo16906u() {
        return this.f15585b;
    }
}
