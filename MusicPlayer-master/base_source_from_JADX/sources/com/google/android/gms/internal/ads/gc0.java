package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C2834b;
import com.google.ads.mediation.C2842e;
import com.google.ads.mediation.C2845f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.C2899d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p159f.p243f.p244a.C4858c;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gc0<NETWORK_EXTRAS extends C2845f, SERVER_PARAMETERS extends C2842e> extends eb0 {

    /* renamed from: g */
    private final C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> f17011g;

    /* renamed from: h */
    private final NETWORK_EXTRAS f17012h;

    public gc0(C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f17011g = bVar;
        this.f17012h = network_extras;
    }

    /* renamed from: e7 */
    private final SERVER_PARAMETERS m24253e7(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f17011g.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C2842e) serverParametersType.newInstance();
        server_parameters.mo10623a(hashMap);
        return server_parameters;
    }

    /* renamed from: f7 */
    private static final boolean m24254f7(zzbfd zzbfd) {
        if (zzbfd.f27200l) {
            return true;
        }
        C4980cv.m22123b();
        return nl0.m27921m();
    }

    /* renamed from: B4 */
    public final void mo16166B4(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        mo16194m3(aVar, zzbfd, str, (String) null, ib0);
    }

    /* renamed from: C */
    public final void mo16167C() throws RemoteException {
        String str;
        C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f17011g;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str = "Not a MediationInterstitialAdapter: ".concat(valueOf);
            } else {
                str = new String("Not a MediationInterstitialAdapter: ");
            }
            ul0.m31862g(str);
            throw new RemoteException();
        }
        ul0.m31857b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f17011g).showInterstitial();
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: E */
    public final boolean mo16168E() {
        return true;
    }

    /* renamed from: F */
    public final void mo16169F() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: J */
    public final boolean mo16170J() {
        return false;
    }

    /* renamed from: J6 */
    public final void mo16171J6(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        C4858c cVar;
        String str3;
        C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f17011g;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3 = "Not a MediationBannerAdapter: ".concat(valueOf);
            } else {
                str3 = new String("Not a MediationBannerAdapter: ");
            }
            ul0.m31862g(str3);
            throw new RemoteException();
        }
        ul0.m31857b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f17011g;
            jc0 jc0 = new jc0(ib0);
            Activity activity = (Activity) C4865b.m20502K0(aVar);
            C2842e e7 = m24253e7(str);
            int i = 0;
            C4858c[] cVarArr = {C4858c.f13679b, C4858c.f13680c, C4858c.f13681d, C4858c.f13682e, C4858c.f13683f, C4858c.f13684g};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].mo15601b() == zzbfi.f27219k && cVarArr[i].mo15600a() == zzbfi.f27216h) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new C4858c(C2899d0.m12942c(zzbfi.f27219k, zzbfi.f27216h, zzbfi.f27215g));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(jc0, activity, e7, cVar, kc0.m26190b(zzbfd, m24254f7(zzbfd)), this.f17012h);
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: M */
    public final ob0 mo16172M() {
        return null;
    }

    /* renamed from: M3 */
    public final void mo16173M3(C4863a aVar) {
    }

    /* renamed from: M4 */
    public final void mo16174M4(C4863a aVar, l70 l70, List<zzbtx> list) throws RemoteException {
    }

    /* renamed from: N3 */
    public final void mo16175N3(C4863a aVar, ph0 ph0, List<String> list) {
    }

    /* renamed from: Q4 */
    public final void mo16176Q4(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0, zzbnw zzbnw, List<String> list) {
    }

    /* renamed from: T */
    public final void mo16177T() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: U */
    public final nb0 mo16178U() {
        return null;
    }

    /* renamed from: U3 */
    public final void mo16179U3(boolean z) {
    }

    /* renamed from: X4 */
    public final void mo16180X4(zzbfd zzbfd, String str, String str2) {
    }

    /* renamed from: c */
    public final Bundle mo16181c() {
        return new Bundle();
    }

    /* renamed from: d */
    public final Bundle mo16182d() {
        return new Bundle();
    }

    /* renamed from: e */
    public final C5427ox mo16183e() {
        return null;
    }

    /* renamed from: e2 */
    public final void mo16184e2(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        mo16171J6(aVar, zzbfi, zzbfd, str, (String) null, ib0);
    }

    /* renamed from: e4 */
    public final void mo16185e4(C4863a aVar) throws RemoteException {
    }

    /* renamed from: g */
    public final j30 mo16186g() {
        return null;
    }

    /* renamed from: h */
    public final lb0 mo16187h() {
        return null;
    }

    /* renamed from: h4 */
    public final void mo16188h4(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) {
    }

    /* renamed from: i */
    public final rb0 mo16189i() {
        return null;
    }

    /* renamed from: j */
    public final zzcab mo16190j() {
        return null;
    }

    /* renamed from: k */
    public final C4863a mo16191k() throws RemoteException {
        String str;
        C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f17011g;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str = "Not a MediationBannerAdapter: ".concat(valueOf);
            } else {
                str = new String("Not a MediationBannerAdapter: ");
            }
            ul0.m31862g(str);
            throw new RemoteException();
        }
        try {
            return C4865b.m20503f2(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final void mo16192l() throws RemoteException {
        try {
            this.f17011g.destroy();
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: m */
    public final zzcab mo16193m() {
        return null;
    }

    /* renamed from: m3 */
    public final void mo16194m3(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        String str3;
        C2834b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f17011g;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            if (valueOf.length() != 0) {
                str3 = "Not a MediationInterstitialAdapter: ".concat(valueOf);
            } else {
                str3 = new String("Not a MediationInterstitialAdapter: ");
            }
            ul0.m31862g(str3);
            throw new RemoteException();
        }
        ul0.m31857b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f17011g).requestInterstitialAd(new jc0(ib0), (Activity) C4865b.m20502K0(aVar), m24253e7(str), kc0.m26190b(zzbfd, m24254f7(zzbfd)), this.f17012h);
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: q2 */
    public final void mo16195q2(C4863a aVar, zzbfd zzbfd, String str, ph0 ph0, String str2) throws RemoteException {
    }

    /* renamed from: r3 */
    public final void mo16196r3(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
    }

    /* renamed from: s */
    public final void mo16197s() {
    }

    /* renamed from: s1 */
    public final void mo16198s1(C4863a aVar) throws RemoteException {
    }

    /* renamed from: t5 */
    public final void mo16199t5(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
    }

    /* renamed from: x4 */
    public final void mo16200x4(zzbfd zzbfd, String str) {
    }

    public final Bundle zze() {
        return new Bundle();
    }
}
