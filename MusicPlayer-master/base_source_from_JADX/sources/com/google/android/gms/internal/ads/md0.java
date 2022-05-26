package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C2899d0;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.mediation.C3077h;
import com.google.android.gms.ads.mediation.C3081l;
import com.google.android.gms.ads.mediation.C3082m;
import com.google.android.gms.ads.mediation.C3084o;
import com.google.android.gms.ads.mediation.C3086q;
import com.google.android.gms.ads.mediation.C3087r;
import com.google.android.gms.ads.mediation.C3096y;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class md0 extends ad0 {

    /* renamed from: g */
    private final RtbAdapter f20017g;

    /* renamed from: h */
    private C3081l f20018h;

    /* renamed from: i */
    private C3086q f20019i;

    /* renamed from: j */
    private String f20020j = BuildConfig.FLAVOR;

    public md0(RtbAdapter rtbAdapter) {
        this.f20017g = rtbAdapter;
    }

    /* renamed from: f7 */
    private final Bundle m27228f7(zzbfd zzbfd) {
        Bundle bundle;
        Bundle bundle2 = zzbfd.f27207s;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f20017g.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: g7 */
    private static final Bundle m27229g7(String str) throws RemoteException {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Server parameters: ".concat(valueOf);
        } else {
            str2 = new String("Server parameters: ");
        }
        ul0.m31862g(str2);
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            throw new RemoteException();
        }
    }

    /* renamed from: h7 */
    private static final boolean m27230h7(zzbfd zzbfd) {
        if (zzbfd.f27200l) {
            return true;
        }
        C4980cv.m22123b();
        return nl0.m27921m();
    }

    /* renamed from: i7 */
    private static final String m27231i7(String str, zzbfd zzbfd) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzbfd.f27191A;
        }
    }

    /* renamed from: A0 */
    public final boolean mo16202A0(C4863a aVar) throws RemoteException {
        C3086q qVar = this.f20019i;
        if (qVar == null) {
            return false;
        }
        try {
            qVar.mo11223a((Context) C4865b.m20502K0(aVar));
            return true;
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    /* renamed from: E1 */
    public final void mo16203E1(String str, String str2, zzbfd zzbfd, C4863a aVar, pc0 pc0, ib0 ib0, zzbfi zzbfi) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        zzbfi zzbfi2 = zzbfi;
        try {
            gd0 gd0 = new gd0(this, pc0, ib0);
            RtbAdapter rtbAdapter = this.f20017g;
            Bundle g7 = m27229g7(str2);
            Bundle f7 = m27228f7(zzbfd2);
            boolean h7 = m27230h7(zzbfd);
            Location location = zzbfd2.f27205q;
            int i = zzbfd2.f27201m;
            int i2 = zzbfd2.f27214z;
            String i7 = m27231i7(str2, zzbfd);
            C2921g c = C2899d0.m12942c(zzbfi2.f27219k, zzbfi2.f27216h, zzbfi2.f27215g);
            String str3 = this.f20020j;
            C3077h hVar = r5;
            C3077h hVar2 = new C3077h((Context) C4865b.m20502K0(aVar), str, g7, f7, h7, location, i, i2, i7, c, str3);
            rtbAdapter.loadRtbBannerAd(hVar, gd0);
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: I1 */
    public final void mo16204I1(String str, String str2, zzbfd zzbfd, C4863a aVar, sc0 sc0, ib0 ib0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f20017g.loadRtbInterstitialAd(new C3082m((Context) C4865b.m20502K0(aVar), str, m27229g7(str2), m27228f7(zzbfd2), m27230h7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m27231i7(str2, zzbfd), this.f20020j), new id0(this, sc0, ib0));
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: S3 */
    public final void mo16205S3(String str, String str2, zzbfd zzbfd, C4863a aVar, vc0 vc0, ib0 ib0, zzbnw zzbnw) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            jd0 jd0 = new jd0(this, vc0, ib0);
            RtbAdapter rtbAdapter = this.f20017g;
            C3084o oVar = r4;
            C3084o oVar2 = new C3084o((Context) C4865b.m20502K0(aVar), str, m27229g7(str2), m27228f7(zzbfd2), m27230h7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m27231i7(str2, zzbfd), this.f20020j, zzbnw);
            rtbAdapter.loadRtbNativeAd(oVar, jd0);
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: Z2 */
    public final void mo16206Z2(String str, String str2, zzbfd zzbfd, C4863a aVar, yc0 yc0, ib0 ib0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f20017g.loadRtbRewardedAd(new C3087r((Context) C4865b.m20502K0(aVar), str, m27229g7(str2), m27228f7(zzbfd2), m27230h7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m27231i7(str2, zzbfd), this.f20020j), new ld0(this, yc0, ib0));
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: b1 */
    public final void mo16207b1(String str, String str2, zzbfd zzbfd, C4863a aVar, pc0 pc0, ib0 ib0, zzbfi zzbfi) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        zzbfi zzbfi2 = zzbfi;
        try {
            hd0 hd0 = new hd0(this, pc0, ib0);
            RtbAdapter rtbAdapter = this.f20017g;
            Bundle g7 = m27229g7(str2);
            Bundle f7 = m27228f7(zzbfd2);
            boolean h7 = m27230h7(zzbfd);
            Location location = zzbfd2.f27205q;
            int i = zzbfd2.f27201m;
            int i2 = zzbfd2.f27214z;
            String i7 = m27231i7(str2, zzbfd);
            C2921g c = C2899d0.m12942c(zzbfi2.f27219k, zzbfi2.f27216h, zzbfi2.f27215g);
            String str3 = this.f20020j;
            C3077h hVar = r5;
            C3077h hVar2 = new C3077h((Context) C4865b.m20502K0(aVar), str, g7, f7, h7, location, i, i2, i7, c, str3);
            rtbAdapter.loadRtbInterscrollerAd(hVar, hd0);
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final zzcab mo16208c() throws RemoteException {
        zzcab.m34959Y(this.f20017g.getVersionInfo());
        throw null;
    }

    /* renamed from: d */
    public final zzcab mo16209d() throws RemoteException {
        zzcab.m34959Y(this.f20017g.getSDKVersionInfo());
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16210g3(p159f.p243f.p245b.p246a.p248b.C4863a r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.internal.ads.zzbfi r12, com.google.android.gms.internal.ads.ed0 r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.kd0 r0 = new com.google.android.gms.internal.ads.kd0     // Catch:{ all -> 0x008c }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f20017g     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.j r1 = new com.google.android.gms.ads.mediation.j     // Catch:{ all -> 0x008c }
            int r2 = r9.hashCode()     // Catch:{ all -> 0x008c }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x003d;
                case -1052618729: goto L_0x0033;
                case -239580146: goto L_0x0029;
                case 604727084: goto L_0x001f;
                case 1911491517: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 3
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = -1
        L_0x0048:
            if (r9 == 0) goto L_0x0066
            if (r9 == r6) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            if (r9 != r3) goto L_0x0055
            com.google.android.gms.ads.b r9 = com.google.android.gms.ads.C2890b.NATIVE     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0055:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x005d:
            com.google.android.gms.ads.b r9 = com.google.android.gms.ads.C2890b.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0060:
            com.google.android.gms.ads.b r9 = com.google.android.gms.ads.C2890b.REWARDED     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0063:
            com.google.android.gms.ads.b r9 = com.google.android.gms.ads.C2890b.INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0066:
            com.google.android.gms.ads.b r9 = com.google.android.gms.ads.C2890b.BANNER     // Catch:{ all -> 0x008c }
        L_0x0068:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x008c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008c }
            r9.<init>()     // Catch:{ all -> 0x008c }
            r9.add(r1)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.a r11 = new com.google.android.gms.ads.mediation.rtb.a     // Catch:{ all -> 0x008c }
            java.lang.Object r8 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r8)     // Catch:{ all -> 0x008c }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x008c }
            int r1 = r12.f27219k     // Catch:{ all -> 0x008c }
            int r2 = r12.f27216h     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.f27215g     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.g r12 = com.google.android.gms.ads.C2899d0.m12942c(r1, r2, r12)     // Catch:{ all -> 0x008c }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x008c }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.ul0.m31860e(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md0.mo16210g3(f.f.b.a.b.a, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.internal.ads.zzbfi, com.google.android.gms.internal.ads.ed0):void");
    }

    /* renamed from: k0 */
    public final boolean mo16211k0(C4863a aVar) throws RemoteException {
        C3081l lVar = this.f20018h;
        if (lVar == null) {
            return false;
        }
        try {
            lVar.mo11209a((Context) C4865b.m20502K0(aVar));
            return true;
        } catch (Throwable th) {
            ul0.m31860e(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    /* renamed from: l2 */
    public final void mo16212l2(String str, String str2, zzbfd zzbfd, C4863a aVar, yc0 yc0, ib0 ib0) throws RemoteException {
        zzbfd zzbfd2 = zzbfd;
        try {
            this.f20017g.loadRtbRewardedInterstitialAd(new C3087r((Context) C4865b.m20502K0(aVar), str, m27229g7(str2), m27228f7(zzbfd2), m27230h7(zzbfd), zzbfd2.f27205q, zzbfd2.f27201m, zzbfd2.f27214z, m27231i7(str2, zzbfd), this.f20020j), new ld0(this, yc0, ib0));
        } catch (Throwable th) {
            ul0.m31860e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: p0 */
    public final void mo16213p0(String str) {
        this.f20020j = str;
    }

    /* renamed from: z1 */
    public final void mo16214z1(String str, String str2, zzbfd zzbfd, C4863a aVar, vc0 vc0, ib0 ib0) throws RemoteException {
        mo16205S3(str, str2, zzbfd, aVar, vc0, ib0, (zzbnw) null);
    }

    public final C5427ox zze() {
        RtbAdapter rtbAdapter = this.f20017g;
        if (rtbAdapter instanceof C3096y) {
            try {
                return ((C3096y) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                ul0.m31860e(BuildConfig.FLAVOR, th);
            }
        }
        return null;
    }
}
