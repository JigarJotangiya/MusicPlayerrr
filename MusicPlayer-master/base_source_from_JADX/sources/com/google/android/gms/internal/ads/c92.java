package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.internal.C3292l;
import java.util.Collections;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c92 extends C5796yv implements xa1 {

    /* renamed from: g */
    private final Context f14906g;

    /* renamed from: h */
    private final gl2 f14907h;

    /* renamed from: i */
    private final String f14908i;

    /* renamed from: j */
    private final v92 f14909j;

    /* renamed from: k */
    private zzbfi f14910k;

    /* renamed from: l */
    private final sp2 f14911l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public e21 f14912m;

    public c92(Context context, zzbfi zzbfi, String str, gl2 gl2, v92 v92) {
        this.f14906g = context;
        this.f14907h = gl2;
        this.f14910k = zzbfi;
        this.f14908i = str;
        this.f14909j = v92;
        this.f14911l = gl2.mo17973g();
        gl2.mo17977n(this);
    }

    /* renamed from: g7 */
    private final synchronized void m21756g7(zzbfi zzbfi) {
        this.f14911l.mo20914G(zzbfi);
        this.f14911l.mo20919L(this.f14910k.f27228t);
    }

    /* renamed from: h7 */
    private final synchronized boolean m21757h7(zzbfd zzbfd) throws RemoteException {
        C3292l.m14236d("loadAd must be called on the main UI thread.");
        C2971s.m13214q();
        if (!C2979b2.m13264l(this.f14906g) || zzbfd.f27213y != null) {
            jq2.m25820a(this.f14906g, zzbfd.f27200l);
            return this.f14907h.mo16308a(zzbfd, this.f14908i, (ka2) null, new b92(this));
        }
        ul0.m31859d("Failed to load the ad because app ID is missing.");
        v92 v92 = this.f14909j;
        if (v92 != null) {
            v92.mo16370c(nq2.m28048d(4, (String) null, (zzbew) null));
        }
        return false;
    }

    /* renamed from: B */
    public final synchronized void mo10923B() {
        C3292l.m14236d("recordManualImpression must be called on the main UI thread.");
        e21 e21 = this.f14912m;
        if (e21 != null) {
            e21.mo17088m();
        }
    }

    /* renamed from: B1 */
    public final void mo10924B1(C5389nw nwVar) {
    }

    /* renamed from: E2 */
    public final void mo10925E2(zzbjd zzbjd) {
    }

    /* renamed from: G */
    public final synchronized void mo10926G() {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        e21 e21 = this.f14912m;
        if (e21 != null) {
            e21.mo17837a();
        }
    }

    /* renamed from: I */
    public final synchronized void mo10927I() {
        C3292l.m14236d("resume must be called on the main UI thread.");
        e21 e21 = this.f14912m;
        if (e21 != null) {
            e21.mo17840d().mo17137W0((Context) null);
        }
    }

    /* renamed from: J0 */
    public final boolean mo10928J0() {
        return false;
    }

    /* renamed from: J2 */
    public final synchronized void mo10929J2(C5278kw kwVar) {
        C3292l.m14236d("setCorrelationIdProvider must be called on the main UI thread");
        this.f14911l.mo20931o(kwVar);
    }

    /* renamed from: J5 */
    public final synchronized void mo10930J5(m00 m00) {
        C3292l.m14236d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14907h.mo17978o(m00);
    }

    /* renamed from: M5 */
    public final synchronized boolean mo10931M5() {
        return this.f14907h.zza();
    }

    /* renamed from: N4 */
    public final void mo10932N4(lh0 lh0) {
    }

    /* renamed from: O */
    public final synchronized void mo10933O() {
        C3292l.m14236d("pause must be called on the main UI thread.");
        e21 e21 = this.f14912m;
        if (e21 != null) {
            e21.mo17840d().mo17136P0((Context) null);
        }
    }

    /* renamed from: O5 */
    public final synchronized boolean mo10934O5(zzbfd zzbfd) throws RemoteException {
        m21756g7(this.f14910k);
        return m21757h7(zzbfd);
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) {
        C3292l.m14236d("setAdListener must be called on the main UI thread.");
        this.f14907h.mo17976m(ivVar);
    }

    /* renamed from: R6 */
    public final synchronized void mo10936R6(boolean z) {
        C3292l.m14236d("setManualImpressionsEnabled must be called from the main thread.");
        this.f14911l.mo20920M(z);
    }

    /* renamed from: S6 */
    public final synchronized void mo10937S6(zzbkq zzbkq) {
        C3292l.m14236d("setVideoOptions must be called on the main UI thread.");
        this.f14911l.mo20927e(zzbkq);
    }

    /* renamed from: W0 */
    public final void mo10938W0(String str) {
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) {
    }

    /* renamed from: d */
    public final synchronized zzbfi mo10940d() {
        C3292l.m14236d("getAdSize must be called on the main UI thread.");
        e21 e21 = this.f14912m;
        if (e21 != null) {
            return yp2.m34266a(this.f14906g, Collections.singletonList(e21.mo17086k()));
        }
        return this.f14911l.mo20933v();
    }

    /* renamed from: f */
    public final Bundle mo10942f() {
        C3292l.m14236d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: f0 */
    public final void mo10943f0() {
    }

    /* renamed from: g */
    public final C5314lv mo10944g() {
        return this.f14909j.mo21442a();
    }

    /* renamed from: h */
    public final C5130gw mo10945h() {
        return this.f14909j.mo21443b();
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) {
        C3292l.m14236d("setPaidEventListener must be called on the main UI thread.");
        this.f14909j.mo21446u(ixVar);
    }

    /* renamed from: i */
    public final synchronized C5316lx mo10947i() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue()) {
            return null;
        }
        e21 e21 = this.f14912m;
        if (e21 == null) {
            return null;
        }
        return e21.mo17839c();
    }

    /* renamed from: j */
    public final synchronized C5427ox mo10948j() {
        C3292l.m14236d("getVideoController must be called from the main thread.");
        e21 e21 = this.f14912m;
        if (e21 == null) {
            return null;
        }
        return e21.mo17085j();
    }

    /* renamed from: j4 */
    public final void mo10949j4(kf0 kf0, String str) {
    }

    /* renamed from: k */
    public final C4863a mo10950k() {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        return C4865b.m20503f2(this.f14907h.mo17972c());
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) {
        C3292l.m14236d("setAppEventListener must be called on the main UI thread.");
        this.f14909j.mo21447v(gwVar);
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) {
        C3292l.m14236d("setAdListener must be called on the main UI thread.");
        this.f14909j.mo21444e(lvVar);
    }

    /* renamed from: n */
    public final synchronized String mo10953n() {
        e21 e21 = this.f14912m;
        if (e21 == null || e21.mo17839c() == null) {
            return null;
        }
        return this.f14912m.mo17839c().zze();
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) {
    }

    /* renamed from: q6 */
    public final void mo10957q6(hf0 hf0) {
    }

    /* renamed from: s5 */
    public final void mo10958s5(boolean z) {
    }

    /* renamed from: s6 */
    public final void mo10959s6(C5018dw dwVar) {
        C3292l.m14236d("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: v5 */
    public final synchronized void mo10960v5(zzbfi zzbfi) {
        C3292l.m14236d("setAdSize must be called on the main UI thread.");
        this.f14911l.mo20914G(zzbfi);
        this.f14910k = zzbfi;
        e21 e21 = this.f14912m;
        if (e21 != null) {
            e21.mo17089n(this.f14907h.mo17972c(), zzbfi);
        }
    }

    /* renamed from: x1 */
    public final void mo10961x1(zzbfd zzbfd, C5462pv pvVar) {
    }

    /* renamed from: x2 */
    public final void mo10962x2(C4863a aVar) {
    }

    /* renamed from: y2 */
    public final void mo10963y2(String str) {
    }

    public final synchronized void zza() {
        if (this.f14907h.mo17979p()) {
            zzbfi v = this.f14911l.mo20933v();
            e21 e21 = this.f14912m;
            if (!(e21 == null || e21.mo17087l() == null || !this.f14911l.mo20930m())) {
                v = yp2.m34266a(this.f14906g, Collections.singletonList(this.f14912m.mo17087l()));
            }
            m21756g7(v);
            try {
                m21757h7(this.f14911l.mo20932t());
            } catch (RemoteException unused) {
                ul0.m31862g("Failed to refresh the banner ad.");
            }
        } else {
            this.f14907h.mo17975l();
        }
    }

    public final synchronized String zzr() {
        return this.f14908i;
    }

    public final synchronized String zzs() {
        e21 e21 = this.f14912m;
        if (e21 == null || e21.mo17839c() == null) {
            return null;
        }
        return this.f14912m.mo17839c().zze();
    }
}
