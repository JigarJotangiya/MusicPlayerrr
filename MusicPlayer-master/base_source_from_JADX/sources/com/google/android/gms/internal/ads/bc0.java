package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2899d0;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.formats.C2910d;
import com.google.android.gms.ads.mediation.C3062a;
import com.google.android.gms.ads.mediation.C3075f;
import com.google.android.gms.ads.mediation.C3077h;
import com.google.android.gms.ads.mediation.C3080k;
import com.google.android.gms.ads.mediation.C3081l;
import com.google.android.gms.ads.mediation.C3082m;
import com.google.android.gms.ads.mediation.C3084o;
import com.google.android.gms.ads.mediation.C3086q;
import com.google.android.gms.ads.mediation.C3087r;
import com.google.android.gms.ads.mediation.C3091t;
import com.google.android.gms.ads.mediation.C3092u;
import com.google.android.gms.ads.mediation.C3093v;
import com.google.android.gms.ads.mediation.C3096y;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class bc0 extends eb0 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f14394g;

    /* renamed from: h */
    private dc0 f14395h;

    /* renamed from: i */
    private ph0 f14396i;

    /* renamed from: j */
    private C4863a f14397j;

    /* renamed from: k */
    private View f14398k;

    /* renamed from: l */
    private C3081l f14399l;

    /* renamed from: m */
    private C3093v f14400m;

    /* renamed from: n */
    private C3086q f14401n;

    /* renamed from: o */
    private C3080k f14402o;

    /* renamed from: p */
    private final String f14403p = BuildConfig.FLAVOR;

    public bc0(C3062a aVar) {
        this.f14394g = aVar;
    }

    /* renamed from: e7 */
    private final Bundle m21209e7(zzbfd zzbfd) {
        Bundle bundle;
        Bundle bundle2 = zzbfd.f27207s;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f14394g.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: f7 */
    private final Bundle m21210f7(String str, zzbfd zzbfd, String str2) throws RemoteException {
        String str3;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str3 = "Server parameters: ".concat(valueOf);
        } else {
            str3 = new String("Server parameters: ");
        }
        ul0.m31857b(str3);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f14394g instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzbfd != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzbfd.f27201m);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    /* renamed from: g7 */
    private static final boolean m21211g7(zzbfd zzbfd) {
        if (zzbfd.f27200l) {
            return true;
        }
        C4980cv.m22123b();
        return nl0.m27921m();
    }

    /* renamed from: h7 */
    private static final String m21212h7(String str, zzbfd zzbfd) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzbfd.f27191A;
        }
    }

    /* renamed from: B4 */
    public final void mo16166B4(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        mo16194m3(aVar, zzbfd, str, (String) null, ib0);
    }

    /* renamed from: C */
    public final void mo16167C() throws RemoteException {
        if (this.f14394g instanceof MediationInterstitialAdapter) {
            ul0.m31857b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f14394g).showInterstitial();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: E */
    public final boolean mo16168E() throws RemoteException {
        if (this.f14394g instanceof C3062a) {
            return this.f14396i != null;
        }
        String canonicalName = C3062a.class.getCanonicalName();
        String canonicalName2 = this.f14394g.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        ul0.m31862g(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: F */
    public final void mo16169F() throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3075f) {
            try {
                ((C3075f) obj).onResume();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: J */
    public final boolean mo16170J() {
        return false;
    }

    /* renamed from: J6 */
    public final void mo16171J6(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        C2921g gVar;
        Date date;
        zzbfi zzbfi2 = zzbfi;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        ib0 ib02 = ib0;
        Object obj = this.f14394g;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof C3062a)) {
            ul0.m31857b("Requesting banner ad from adapter.");
            if (zzbfi2.f27228t) {
                gVar = C2899d0.m12943d(zzbfi2.f27219k, zzbfi2.f27216h);
            } else {
                gVar = C2899d0.m12942c(zzbfi2.f27219k, zzbfi2.f27216h, zzbfi2.f27215g);
            }
            C2921g gVar2 = gVar;
            Object obj2 = this.f14394g;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List<String> list = zzbfd2.f27199k;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzbfd2.f27196h;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    tb0 tb0 = new tb0(date, zzbfd2.f27198j, hashSet, zzbfd2.f27205q, m21211g7(zzbfd), zzbfd2.f27201m, zzbfd2.f27212x, zzbfd2.f27214z, m21212h7(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f27207s;
                    mediationBannerAdapter.requestBannerAd((Context) C4865b.m20502K0(aVar), new dc0(ib02), m21210f7(str3, zzbfd2, str4), gVar2, tb0, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    ul0.m31860e(BuildConfig.FLAVOR, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3062a) {
                try {
                    xb0 xb0 = new xb0(this, ib02);
                    Bundle f7 = m21210f7(str3, zzbfd2, str4);
                    Bundle e7 = m21209e7(zzbfd2);
                    boolean g7 = m21211g7(zzbfd);
                    Location location = zzbfd2.f27205q;
                    int i = zzbfd2.f27201m;
                    int i2 = zzbfd2.f27214z;
                    String h7 = m21212h7(str3, zzbfd2);
                    String str5 = this.f14403p;
                    C3077h hVar = r2;
                    C3077h hVar2 = new C3077h((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, f7, e7, g7, location, i, i2, h7, gVar2, str5);
                    ((C3062a) obj2).loadBannerAd(hVar, xb0);
                } catch (Throwable th2) {
                    ul0.m31860e(BuildConfig.FLAVOR, th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = C3062a.class.getCanonicalName();
            String canonicalName3 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: M */
    public final ob0 mo16172M() {
        return null;
    }

    /* renamed from: M3 */
    public final void mo16173M3(C4863a aVar) throws RemoteException {
        Object obj = this.f14394g;
        if (!(obj instanceof C3062a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C3062a.class.getCanonicalName();
            String canonicalName3 = this.f14394g.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            mo16167C();
        } else {
            ul0.m31857b("Show interstitial ad from adapter.");
            C3081l lVar = this.f14399l;
            if (lVar != null) {
                lVar.mo11209a((Context) C4865b.m20502K0(aVar));
            } else {
                ul0.m31859d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: M4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16174M4(p159f.p243f.p245b.p246a.p248b.C4863a r9, com.google.android.gms.internal.ads.l70 r10, java.util.List<com.google.android.gms.internal.ads.zzbtx> r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f14394g
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.C3062a
            if (r0 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.wb0 r0 = new com.google.android.gms.internal.ads.wb0
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.zzbtx r1 = (com.google.android.gms.internal.ads.zzbtx) r1
            java.lang.String r2 = r1.f27271g
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x0056;
                case -1052618729: goto L_0x004c;
                case -239580146: goto L_0x0042;
                case 604727084: goto L_0x0038;
                case 1911491517: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0060
        L_0x002e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 3
            goto L_0x0061
        L_0x0038:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0042:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 4
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x0079
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0070
            if (r2 == r4) goto L_0x006d
            r2 = 0
            goto L_0x007b
        L_0x006d:
            com.google.android.gms.ads.b r2 = com.google.android.gms.ads.C2890b.NATIVE
            goto L_0x007b
        L_0x0070:
            com.google.android.gms.ads.b r2 = com.google.android.gms.ads.C2890b.REWARDED_INTERSTITIAL
            goto L_0x007b
        L_0x0073:
            com.google.android.gms.ads.b r2 = com.google.android.gms.ads.C2890b.REWARDED
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.ads.b r2 = com.google.android.gms.ads.C2890b.INTERSTITIAL
            goto L_0x007b
        L_0x0079:
            com.google.android.gms.ads.b r2 = com.google.android.gms.ads.C2890b.BANNER
        L_0x007b:
            if (r2 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.j r3 = new com.google.android.gms.ads.mediation.j
            android.os.Bundle r1 = r1.f27272h
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L_0x0014
        L_0x0088:
            java.lang.Object r11 = r8.f14394g
            com.google.android.gms.ads.mediation.a r11 = (com.google.android.gms.ads.mediation.C3062a) r11
            java.lang.Object r9 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L_0x0096:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bc0.mo16174M4(f.f.b.a.b.a, com.google.android.gms.internal.ads.l70, java.util.List):void");
    }

    /* renamed from: N3 */
    public final void mo16175N3(C4863a aVar, ph0 ph0, List<String> list) throws RemoteException {
        ul0.m31862g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    /* renamed from: Q4 */
    public final void mo16176Q4(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0, zzbnw zzbnw, List<String> list) throws RemoteException {
        Date date;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        ib0 ib02 = ib0;
        Object obj = this.f14394g;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof C3062a)) {
            ul0.m31857b("Requesting native ad from adapter.");
            Object obj2 = this.f14394g;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List<String> list2 = zzbfd2.f27199k;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzbfd2.f27196h;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    fc0 fc0 = new fc0(date, zzbfd2.f27198j, hashSet, zzbfd2.f27205q, m21211g7(zzbfd), zzbfd2.f27201m, zzbnw, list, zzbfd2.f27212x, zzbfd2.f27214z, m21212h7(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f27207s;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.f14395h = new dc0(ib02);
                    mediationNativeAdapter.requestNativeAd((Context) C4865b.m20502K0(aVar), this.f14395h, m21210f7(str3, zzbfd2, str4), fc0, bundle2);
                } catch (Throwable th) {
                    ul0.m31860e(BuildConfig.FLAVOR, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3062a) {
                try {
                    ((C3062a) obj2).loadNativeAd(new C3084o((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, m21210f7(str3, zzbfd2, str4), m21209e7(zzbfd2), m21211g7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m21212h7(str3, zzbfd2), this.f14403p, zzbnw), new zb0(this, ib02));
                } catch (Throwable th2) {
                    ul0.m31860e(BuildConfig.FLAVOR, th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = C3062a.class.getCanonicalName();
            String canonicalName3 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: T */
    public final void mo16177T() throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3075f) {
            try {
                ((C3075f) obj).onPause();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: U */
    public final nb0 mo16178U() {
        return null;
    }

    /* renamed from: U3 */
    public final void mo16179U3(boolean z) throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3092u) {
            try {
                ((C3092u) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
            }
        } else {
            String canonicalName = C3092u.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31857b(sb.toString());
        }
    }

    /* renamed from: X4 */
    public final void mo16180X4(zzbfd zzbfd, String str, String str2) throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3062a) {
            mo16199t5(this.f14397j, zzbfd, str, new ec0((C3062a) obj, this.f14396i));
            return;
        }
        String canonicalName = C3062a.class.getCanonicalName();
        String canonicalName2 = this.f14394g.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        ul0.m31862g(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: c */
    public final Bundle mo16181c() {
        Object obj = this.f14394g;
        if (obj instanceof zzcql) {
            return ((zzcql) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcql.class.getCanonicalName();
        String canonicalName2 = this.f14394g.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        ul0.m31862g(sb.toString());
        return new Bundle();
    }

    /* renamed from: d */
    public final Bundle mo16182d() {
        return new Bundle();
    }

    /* renamed from: e */
    public final C5427ox mo16183e() {
        Object obj = this.f14394g;
        if (obj instanceof C3096y) {
            try {
                return ((C3096y) obj).getVideoController();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
            }
        }
        return null;
    }

    /* renamed from: e2 */
    public final void mo16184e2(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        mo16171J6(aVar, zzbfi, zzbfd, str, (String) null, ib0);
    }

    /* renamed from: e4 */
    public final void mo16185e4(C4863a aVar) throws RemoteException {
        if (this.f14394g instanceof C3062a) {
            ul0.m31857b("Show rewarded ad from adapter.");
            C3086q qVar = this.f14401n;
            if (qVar != null) {
                qVar.mo11223a((Context) C4865b.m20502K0(aVar));
            } else {
                ul0.m31859d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3062a.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final j30 mo16186g() {
        dc0 dc0 = this.f14395h;
        if (dc0 == null) {
            return null;
        }
        C2910d t = dc0.mo16905t();
        if (t instanceof k30) {
            return ((k30) t).mo18795b();
        }
        return null;
    }

    /* renamed from: h */
    public final lb0 mo16187h() {
        C3080k kVar = this.f14402o;
        if (kVar != null) {
            return new cc0(kVar);
        }
        return null;
    }

    /* renamed from: h4 */
    public final void mo16188h4(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        zzbfi zzbfi2 = zzbfi;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        if (this.f14394g instanceof C3062a) {
            ul0.m31857b("Requesting interscroller ad from adapter.");
            try {
                C3062a aVar2 = (C3062a) this.f14394g;
                vb0 vb0 = new vb0(this, ib0, aVar2);
                Bundle f7 = m21210f7(str3, zzbfd2, str2);
                Bundle e7 = m21209e7(zzbfd2);
                boolean g7 = m21211g7(zzbfd);
                Location location = zzbfd2.f27205q;
                int i = zzbfd2.f27201m;
                int i2 = zzbfd2.f27214z;
                String h7 = m21212h7(str3, zzbfd2);
                C2921g e = C2899d0.m12944e(zzbfi2.f27219k, zzbfi2.f27216h);
                C3077h hVar = r6;
                C3077h hVar2 = new C3077h((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, f7, e7, g7, location, i, i2, h7, e, BuildConfig.FLAVOR);
                aVar2.loadInterscrollerAd(hVar, vb0);
            } catch (Exception e2) {
                ul0.m31860e(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3062a.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: i */
    public final rb0 mo16189i() {
        C3093v vVar;
        C3093v u;
        Object obj = this.f14394g;
        if (obj instanceof MediationNativeAdapter) {
            dc0 dc0 = this.f14395h;
            if (dc0 == null || (u = dc0.mo16906u()) == null) {
                return null;
            }
            return new lc0(u);
        } else if (!(obj instanceof C3062a) || (vVar = this.f14400m) == null) {
            return null;
        } else {
            return new lc0(vVar);
        }
    }

    /* renamed from: j */
    public final zzcab mo16190j() {
        Object obj = this.f14394g;
        if (!(obj instanceof C3062a)) {
            return null;
        }
        zzcab.m34959Y(((C3062a) obj).getVersionInfo());
        throw null;
    }

    /* renamed from: k */
    public final C4863a mo16191k() throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return C4865b.m20503f2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof C3062a) {
            return C4865b.m20503f2(this.f14398k);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = C3062a.class.getCanonicalName();
            String canonicalName3 = this.f14394g.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final void mo16192l() throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3075f) {
            try {
                ((C3075f) obj).onDestroy();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: m */
    public final zzcab mo16193m() {
        Object obj = this.f14394g;
        if (!(obj instanceof C3062a)) {
            return null;
        }
        zzcab.m34959Y(((C3062a) obj).getSDKVersionInfo());
        throw null;
    }

    /* renamed from: m3 */
    public final void mo16194m3(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        Date date;
        zzbfd zzbfd2 = zzbfd;
        String str3 = str;
        String str4 = str2;
        ib0 ib02 = ib0;
        Object obj = this.f14394g;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof C3062a)) {
            ul0.m31857b("Requesting interstitial ad from adapter.");
            Object obj2 = this.f14394g;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List<String> list = zzbfd2.f27199k;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzbfd2.f27196h;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    tb0 tb0 = new tb0(date, zzbfd2.f27198j, hashSet, zzbfd2.f27205q, m21211g7(zzbfd), zzbfd2.f27201m, zzbfd2.f27212x, zzbfd2.f27214z, m21212h7(str3, zzbfd2));
                    Bundle bundle = zzbfd2.f27207s;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) C4865b.m20502K0(aVar), new dc0(ib02), m21210f7(str3, zzbfd2, str4), tb0, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    ul0.m31860e(BuildConfig.FLAVOR, th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3062a) {
                try {
                    ((C3062a) obj2).loadInterstitialAd(new C3082m((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, m21210f7(str3, zzbfd2, str4), m21209e7(zzbfd2), m21211g7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m21212h7(str3, zzbfd2), this.f14403p), new yb0(this, ib02));
                } catch (Throwable th2) {
                    ul0.m31860e(BuildConfig.FLAVOR, th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C3062a.class.getCanonicalName();
            String canonicalName3 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: q2 */
    public final void mo16195q2(C4863a aVar, zzbfd zzbfd, String str, ph0 ph0, String str2) throws RemoteException {
        Object obj = this.f14394g;
        if (obj instanceof C3062a) {
            this.f14397j = aVar;
            this.f14396i = ph0;
            ph0.mo17500a0(C4865b.m20503f2(obj));
            return;
        }
        String canonicalName = C3062a.class.getCanonicalName();
        String canonicalName2 = this.f14394g.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        ul0.m31862g(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: r3 */
    public final void mo16196r3(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        String str2 = str;
        if (this.f14394g instanceof C3062a) {
            ul0.m31857b("Requesting rewarded interstitial ad from adapter.");
            try {
                ac0 ac0 = new ac0(this, ib0);
                Bundle f7 = m21210f7(str2, zzbfd2, (String) null);
                Bundle e7 = m21209e7(zzbfd2);
                boolean g7 = m21211g7(zzbfd);
                Location location = zzbfd2.f27205q;
                int i = zzbfd2.f27201m;
                int i2 = zzbfd2.f27214z;
                String h7 = m21212h7(str2, zzbfd2);
                C3087r rVar = r5;
                C3087r rVar2 = new C3087r((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, f7, e7, g7, location, i, i2, h7, BuildConfig.FLAVOR);
                ((C3062a) this.f14394g).loadRewardedInterstitialAd(rVar, ac0);
            } catch (Exception e) {
                ul0.m31860e(BuildConfig.FLAVOR, e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3062a.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: s */
    public final void mo16197s() throws RemoteException {
        if (this.f14394g instanceof C3062a) {
            C3086q qVar = this.f14401n;
            if (qVar != null) {
                qVar.mo11223a((Context) C4865b.m20502K0(this.f14397j));
            } else {
                ul0.m31859d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3062a.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: s1 */
    public final void mo16198s1(C4863a aVar) throws RemoteException {
        Context context = (Context) C4865b.m20502K0(aVar);
        Object obj = this.f14394g;
        if (obj instanceof C3091t) {
            ((C3091t) obj).mo11236a(context);
        }
    }

    /* renamed from: t5 */
    public final void mo16199t5(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        String str2 = str;
        if (this.f14394g instanceof C3062a) {
            ul0.m31857b("Requesting rewarded ad from adapter.");
            try {
                ac0 ac0 = new ac0(this, ib0);
                Bundle f7 = m21210f7(str2, zzbfd2, (String) null);
                Bundle e7 = m21209e7(zzbfd2);
                boolean g7 = m21211g7(zzbfd);
                Location location = zzbfd2.f27205q;
                int i = zzbfd2.f27201m;
                int i2 = zzbfd2.f27214z;
                String h7 = m21212h7(str2, zzbfd2);
                C3087r rVar = r5;
                C3087r rVar2 = new C3087r((Context) C4865b.m20502K0(aVar), BuildConfig.FLAVOR, f7, e7, g7, location, i, i2, h7, BuildConfig.FLAVOR);
                ((C3062a) this.f14394g).loadRewardedAd(rVar, ac0);
            } catch (Exception e) {
                ul0.m31860e(BuildConfig.FLAVOR, e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3062a.class.getCanonicalName();
            String canonicalName2 = this.f14394g.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            ul0.m31862g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: x4 */
    public final void mo16200x4(zzbfd zzbfd, String str) throws RemoteException {
        mo16180X4(zzbfd, str, (String) null);
    }

    public final Bundle zze() {
        Object obj = this.f14394g;
        if (obj instanceof zzcqk) {
            return ((zzcqk) obj).zza();
        }
        String canonicalName = zzcqk.class.getCanonicalName();
        String canonicalName2 = this.f14394g.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        ul0.m31862g(sb.toString());
        return new Bundle();
    }

    public bc0(C3075f fVar) {
        this.f14394g = fVar;
    }
}
