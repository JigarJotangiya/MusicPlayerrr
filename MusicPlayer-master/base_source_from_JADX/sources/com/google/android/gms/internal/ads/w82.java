package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.internal.C3292l;
import java.util.Collections;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w82 extends C5796yv {

    /* renamed from: g */
    private final Context f25273g;

    /* renamed from: h */
    private final C5314lv f25274h;

    /* renamed from: i */
    private final up2 f25275i;

    /* renamed from: j */
    private final e21 f25276j;

    /* renamed from: k */
    private final ViewGroup f25277k;

    public w82(Context context, C5314lv lvVar, up2 up2, e21 e21) {
        this.f25273g = context;
        this.f25274h = lvVar;
        this.f25275i = up2;
        this.f25276j = e21;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(e21.mo17084i(), C2971s.m13215r().mo11020j());
        frameLayout.setMinimumHeight(mo10940d().f27217i);
        frameLayout.setMinimumWidth(mo10940d().f27220l);
        this.f25277k = frameLayout;
    }

    /* renamed from: B */
    public final void mo10923B() throws RemoteException {
        this.f25276j.mo17088m();
    }

    /* renamed from: B1 */
    public final void mo10924B1(C5389nw nwVar) {
    }

    /* renamed from: E2 */
    public final void mo10925E2(zzbjd zzbjd) throws RemoteException {
    }

    /* renamed from: G */
    public final void mo10926G() throws RemoteException {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        this.f25276j.mo17837a();
    }

    /* renamed from: I */
    public final void mo10927I() throws RemoteException {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        this.f25276j.mo17840d().mo17137W0((Context) null);
    }

    /* renamed from: J0 */
    public final boolean mo10928J0() throws RemoteException {
        return false;
    }

    /* renamed from: J2 */
    public final void mo10929J2(C5278kw kwVar) throws RemoteException {
        ul0.m31861f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: J5 */
    public final void mo10930J5(m00 m00) throws RemoteException {
        ul0.m31861f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: M5 */
    public final boolean mo10931M5() throws RemoteException {
        return false;
    }

    /* renamed from: N4 */
    public final void mo10932N4(lh0 lh0) throws RemoteException {
    }

    /* renamed from: O */
    public final void mo10933O() throws RemoteException {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        this.f25276j.mo17840d().mo17136P0((Context) null);
    }

    /* renamed from: O5 */
    public final boolean mo10934O5(zzbfd zzbfd) throws RemoteException {
        ul0.m31861f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) throws RemoteException {
        ul0.m31861f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: R6 */
    public final void mo10936R6(boolean z) throws RemoteException {
        ul0.m31861f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: S6 */
    public final void mo10937S6(zzbkq zzbkq) throws RemoteException {
        ul0.m31861f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: W0 */
    public final void mo10938W0(String str) throws RemoteException {
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) throws RemoteException {
    }

    /* renamed from: d */
    public final zzbfi mo10940d() {
        C3292l.m14236d("getAdSize must be called on the main UI thread.");
        return yp2.m34266a(this.f25273g, Collections.singletonList(this.f25276j.mo17086k()));
    }

    /* renamed from: f */
    public final Bundle mo10942f() throws RemoteException {
        ul0.m31861f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    /* renamed from: f0 */
    public final void mo10943f0() throws RemoteException {
    }

    /* renamed from: g */
    public final C5314lv mo10944g() throws RemoteException {
        return this.f25274h;
    }

    /* renamed from: h */
    public final C5130gw mo10945h() throws RemoteException {
        return this.f25275i.f24405n;
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) {
        ul0.m31861f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: i */
    public final C5316lx mo10947i() {
        return this.f25276j.mo17839c();
    }

    /* renamed from: j */
    public final C5427ox mo10948j() throws RemoteException {
        return this.f25276j.mo17085j();
    }

    /* renamed from: j4 */
    public final void mo10949j4(kf0 kf0, String str) throws RemoteException {
    }

    /* renamed from: k */
    public final C4863a mo10950k() throws RemoteException {
        return C4865b.m20503f2(this.f25277k);
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) throws RemoteException {
        v92 v92 = this.f25275i.f24394c;
        if (v92 != null) {
            v92.mo21447v(gwVar);
        }
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) throws RemoteException {
        ul0.m31861f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: n */
    public final String mo10953n() throws RemoteException {
        if (this.f25276j.mo17839c() != null) {
            return this.f25276j.mo17839c().zze();
        }
        return null;
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) throws RemoteException {
    }

    /* renamed from: q6 */
    public final void mo10957q6(hf0 hf0) throws RemoteException {
    }

    /* renamed from: s5 */
    public final void mo10958s5(boolean z) throws RemoteException {
    }

    /* renamed from: s6 */
    public final void mo10959s6(C5018dw dwVar) throws RemoteException {
        ul0.m31861f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: v5 */
    public final void mo10960v5(zzbfi zzbfi) throws RemoteException {
        C3292l.m14236d("setAdSize must be called on the main UI thread.");
        e21 e21 = this.f25276j;
        if (e21 != null) {
            e21.mo17089n(this.f25277k, zzbfi);
        }
    }

    /* renamed from: x1 */
    public final void mo10961x1(zzbfd zzbfd, C5462pv pvVar) {
    }

    /* renamed from: x2 */
    public final void mo10962x2(C4863a aVar) {
    }

    /* renamed from: y2 */
    public final void mo10963y2(String str) throws RemoteException {
    }

    public final String zzr() throws RemoteException {
        return this.f25275i.f24397f;
    }

    public final String zzs() throws RemoteException {
        if (this.f25276j.mo17839c() != null) {
            return this.f25276j.mo17839c().zze();
        }
        return null;
    }
}
