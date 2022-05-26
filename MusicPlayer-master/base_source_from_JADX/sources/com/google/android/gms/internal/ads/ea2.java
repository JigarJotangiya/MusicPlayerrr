package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ea2 extends C5796yv {

    /* renamed from: g */
    private final zzbfi f15899g;

    /* renamed from: h */
    private final Context f15900h;

    /* renamed from: i */
    private final cn2 f15901i;

    /* renamed from: j */
    private final String f15902j;

    /* renamed from: k */
    private final v92 f15903k;

    /* renamed from: l */
    private final do2 f15904l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public rg1 f15905m;

    /* renamed from: n */
    private boolean f15906n = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22601q0)).booleanValue();

    public ea2(Context context, zzbfi zzbfi, String str, cn2 cn2, v92 v92, do2 do2) {
        this.f15899g = zzbfi;
        this.f15902j = str;
        this.f15900h = context;
        this.f15901i = cn2;
        this.f15903k = v92;
        this.f15904l = do2;
    }

    /* renamed from: g7 */
    private final synchronized boolean m22883g7() {
        rg1 rg1;
        rg1 = this.f15905m;
        return rg1 != null && !rg1.mo20659h();
    }

    /* renamed from: B */
    public final void mo10923B() {
    }

    /* renamed from: B1 */
    public final void mo10924B1(C5389nw nwVar) {
        this.f15903k.mo21448x(nwVar);
    }

    /* renamed from: E2 */
    public final void mo10925E2(zzbjd zzbjd) {
    }

    /* renamed from: G */
    public final synchronized void mo10926G() {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        rg1 rg1 = this.f15905m;
        if (rg1 != null) {
            rg1.mo17840d().mo17135N0((Context) null);
        }
    }

    /* renamed from: I */
    public final synchronized void mo10927I() {
        C3292l.m14236d("resume must be called on the main UI thread.");
        rg1 rg1 = this.f15905m;
        if (rg1 != null) {
            rg1.mo17840d().mo17137W0((Context) null);
        }
    }

    /* renamed from: J0 */
    public final synchronized boolean mo10928J0() {
        C3292l.m14236d("isLoaded must be called on the main UI thread.");
        return m22883g7();
    }

    /* renamed from: J2 */
    public final void mo10929J2(C5278kw kwVar) {
    }

    /* renamed from: J5 */
    public final synchronized void mo10930J5(m00 m00) {
        C3292l.m14236d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f15901i.mo16688h(m00);
    }

    /* renamed from: M5 */
    public final synchronized boolean mo10931M5() {
        return this.f15901i.zza();
    }

    /* renamed from: N4 */
    public final void mo10932N4(lh0 lh0) {
        this.f15904l.mo16973R(lh0);
    }

    /* renamed from: O */
    public final synchronized void mo10933O() {
        C3292l.m14236d("pause must be called on the main UI thread.");
        rg1 rg1 = this.f15905m;
        if (rg1 != null) {
            rg1.mo17840d().mo17136P0((Context) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    /* renamed from: O5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10934O5(com.google.android.gms.internal.ads.zzbfd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C3292l.m14236d(r0)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ all -> 0x0051 }
            android.content.Context r0 = r4.f15900h     // Catch:{ all -> 0x0051 }
            boolean r0 = com.google.android.gms.ads.internal.util.C2979b2.m13264l(r0)     // Catch:{ all -> 0x0051 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbeu r0 = r5.f27213y     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x002a
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.ul0.m31859d(r5)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.v92 r5 = r4.f15903k     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0028
            r0 = 4
            com.google.android.gms.internal.ads.zzbew r0 = com.google.android.gms.internal.ads.nq2.m28048d(r0, r2, r2)     // Catch:{ all -> 0x0051 }
            r5.mo16370c(r0)     // Catch:{ all -> 0x0051 }
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            boolean r0 = r4.m22883g7()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0032
            monitor-exit(r4)
            return r1
        L_0x0032:
            android.content.Context r0 = r4.f15900h     // Catch:{ all -> 0x0051 }
            boolean r1 = r5.f27200l     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.jq2.m25820a(r0, r1)     // Catch:{ all -> 0x0051 }
            r4.f15905m = r2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.cn2 r0 = r4.f15901i     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r4.f15902j     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.vm2 r2 = new com.google.android.gms.internal.ads.vm2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.zzbfi r3 = r4.f15899g     // Catch:{ all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.da2 r3 = new com.google.android.gms.internal.ads.da2     // Catch:{ all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            boolean r5 = r0.mo16308a(r5, r1, r2, r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ea2.mo10934O5(com.google.android.gms.internal.ads.zzbfd):boolean");
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) {
    }

    /* renamed from: R6 */
    public final void mo10936R6(boolean z) {
    }

    /* renamed from: S6 */
    public final void mo10937S6(zzbkq zzbkq) {
    }

    /* renamed from: W0 */
    public final void mo10938W0(String str) {
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) {
    }

    /* renamed from: d */
    public final zzbfi mo10940d() {
        return null;
    }

    /* renamed from: f */
    public final Bundle mo10942f() {
        C3292l.m14236d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    /* renamed from: f0 */
    public final synchronized void mo10943f0() {
        C3292l.m14236d("showInterstitial must be called on the main UI thread.");
        rg1 rg1 = this.f15905m;
        if (rg1 == null) {
            ul0.m31862g("Interstitial can not be shown before loaded.");
            this.f15903k.mo15619n0(nq2.m28048d(9, (String) null, (zzbew) null));
            return;
        }
        rg1.mo20660i(this.f15906n, (Activity) null);
    }

    /* renamed from: g */
    public final C5314lv mo10944g() {
        return this.f15903k.mo21442a();
    }

    /* renamed from: h */
    public final C5130gw mo10945h() {
        return this.f15903k.mo21443b();
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) {
        C3292l.m14236d("setPaidEventListener must be called on the main UI thread.");
        this.f15903k.mo21446u(ixVar);
    }

    /* renamed from: i */
    public final synchronized C5316lx mo10947i() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue()) {
            return null;
        }
        rg1 rg1 = this.f15905m;
        if (rg1 == null) {
            return null;
        }
        return rg1.mo17839c();
    }

    /* renamed from: j */
    public final C5427ox mo10948j() {
        return null;
    }

    /* renamed from: j4 */
    public final void mo10949j4(kf0 kf0, String str) {
    }

    /* renamed from: k */
    public final C4863a mo10950k() {
        return null;
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) {
        C3292l.m14236d("setAppEventListener must be called on the main UI thread.");
        this.f15903k.mo21447v(gwVar);
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) {
        C3292l.m14236d("setAdListener must be called on the main UI thread.");
        this.f15903k.mo21444e(lvVar);
    }

    /* renamed from: n */
    public final synchronized String mo10953n() {
        rg1 rg1 = this.f15905m;
        if (rg1 == null || rg1.mo17839c() == null) {
            return null;
        }
        return this.f15905m.mo17839c().zze();
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) {
    }

    /* renamed from: q6 */
    public final void mo10957q6(hf0 hf0) {
    }

    /* renamed from: s5 */
    public final synchronized void mo10958s5(boolean z) {
        C3292l.m14236d("setImmersiveMode must be called on the main UI thread.");
        this.f15906n = z;
    }

    /* renamed from: s6 */
    public final void mo10959s6(C5018dw dwVar) {
        C3292l.m14236d("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: v5 */
    public final void mo10960v5(zzbfi zzbfi) {
    }

    /* renamed from: x1 */
    public final void mo10961x1(zzbfd zzbfd, C5462pv pvVar) {
        this.f15903k.mo21445r(pvVar);
        mo10934O5(zzbfd);
    }

    /* renamed from: x2 */
    public final synchronized void mo10962x2(C4863a aVar) {
        if (this.f15905m == null) {
            ul0.m31862g("Interstitial can not be shown before loaded.");
            this.f15903k.mo15619n0(nq2.m28048d(9, (String) null, (zzbew) null));
            return;
        }
        this.f15905m.mo20660i(this.f15906n, (Activity) C4865b.m20502K0(aVar));
    }

    /* renamed from: y2 */
    public final void mo10963y2(String str) {
    }

    public final synchronized String zzr() {
        return this.f15902j;
    }

    public final synchronized String zzs() {
        rg1 rg1 = this.f15905m;
        if (rg1 == null || rg1.mo17839c() == null) {
            return null;
        }
        return this.f15905m.mo17839c().zze();
    }
}
