package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2942b;
import com.google.android.gms.ads.internal.overlay.C2960s;
import com.google.android.gms.ads.internal.overlay.C2961t;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.internal.C3292l;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rj2 extends C5796yv implements C2942b, C5381no, fa1 {

    /* renamed from: g */
    private final mt0 f22873g;

    /* renamed from: h */
    private final Context f22874h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ViewGroup f22875i;

    /* renamed from: j */
    private AtomicBoolean f22876j = new AtomicBoolean();

    /* renamed from: k */
    private final String f22877k;

    /* renamed from: l */
    private final lj2 f22878l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final sk2 f22879m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final zzcjf f22880n;

    /* renamed from: o */
    private long f22881o = -1;

    /* renamed from: p */
    private y01 f22882p;

    /* renamed from: q */
    protected n11 f22883q;

    public rj2(mt0 mt0, Context context, String str, lj2 lj2, sk2 sk2, zzcjf zzcjf) {
        this.f22875i = new FrameLayout(context);
        this.f22873g = mt0;
        this.f22874h = context;
        this.f22877k = str;
        this.f22878l = lj2;
        this.f22879m = sk2;
        sk2.mo20865n(this);
        this.f22880n = zzcjf;
    }

    /* renamed from: g7 */
    static /* bridge */ /* synthetic */ C2961t m30158g7(rj2 rj2, n11 n11) {
        boolean o = n11.mo19591o();
        int intValue = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22468Z2)).intValue();
        C2960s sVar = new C2960s();
        sVar.f9906d = 50;
        int i = 0;
        sVar.f9903a = true != o ? 0 : intValue;
        if (true != o) {
            i = intValue;
        }
        sVar.f9904b = i;
        sVar.f9905c = intValue;
        return new C2961t(rj2.f22874h, sVar, rj2);
    }

    /* renamed from: j7 */
    private final synchronized void m30161j7(int i) {
        if (this.f22876j.compareAndSet(false, true)) {
            n11 n11 = this.f22883q;
            if (!(n11 == null || n11.mo19593q() == null)) {
                this.f22879m.mo20870x(this.f22883q.mo19593q());
            }
            this.f22879m.mo20863h();
            this.f22875i.removeAllViews();
            y01 y01 = this.f22882p;
            if (y01 != null) {
                C2971s.m13200c().mo21125e(y01);
            }
            if (this.f22883q != null) {
                long j = -1;
                if (this.f22881o != -1) {
                    j = C2971s.m13198a().mo11989b() - this.f22881o;
                }
                this.f22883q.mo19592p(j, i);
            }
            mo10926G();
        }
    }

    /* renamed from: B */
    public final synchronized void mo10923B() {
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
        n11 n11 = this.f22883q;
        if (n11 != null) {
            n11.mo17837a();
        }
    }

    /* renamed from: I */
    public final synchronized void mo10927I() {
        C3292l.m14236d("resume must be called on the main UI thread.");
    }

    /* renamed from: J0 */
    public final boolean mo10928J0() {
        return false;
    }

    /* renamed from: J2 */
    public final synchronized void mo10929J2(C5278kw kwVar) {
    }

    /* renamed from: J5 */
    public final synchronized void mo10930J5(m00 m00) {
    }

    /* renamed from: K0 */
    public final void mo10860K0() {
        m30161j7(4);
    }

    /* renamed from: M5 */
    public final synchronized boolean mo10931M5() {
        return this.f22878l.zza();
    }

    /* renamed from: N4 */
    public final void mo10932N4(lh0 lh0) {
    }

    /* renamed from: O */
    public final synchronized void mo10933O() {
        C3292l.m14236d("pause must be called on the main UI thread.");
    }

    /* renamed from: O5 */
    public final synchronized boolean mo10934O5(zzbfd zzbfd) throws RemoteException {
        C3292l.m14236d("loadAd must be called on the main UI thread.");
        C2971s.m13214q();
        if (C2979b2.m13264l(this.f22874h)) {
            if (zzbfd.f27213y == null) {
                ul0.m31859d("Failed to load the ad because app ID is missing.");
                this.f22879m.mo16370c(nq2.m28048d(4, (String) null, (zzbew) null));
                return false;
            }
        }
        if (mo10931M5()) {
            return false;
        }
        this.f22876j = new AtomicBoolean();
        return this.f22878l.mo16308a(zzbfd, this.f22877k, new pj2(this), new qj2(this));
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) {
    }

    /* renamed from: R6 */
    public final synchronized void mo10936R6(boolean z) {
    }

    /* renamed from: S6 */
    public final synchronized void mo10937S6(zzbkq zzbkq) {
    }

    /* renamed from: W0 */
    public final void mo10938W0(String str) {
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) {
        this.f22878l.mo16311k(zzbfo);
    }

    /* renamed from: d */
    public final synchronized zzbfi mo10940d() {
        C3292l.m14236d("getAdSize must be called on the main UI thread.");
        n11 n11 = this.f22883q;
        if (n11 == null) {
            return null;
        }
        return yp2.m34266a(this.f22874h, Collections.singletonList(n11.mo19586j()));
    }

    /* renamed from: e */
    public final void mo17514e() {
        if (this.f22883q != null) {
            this.f22881o = C2971s.m13198a().mo11989b();
            int h = this.f22883q.mo19584h();
            if (h > 0) {
                y01 y01 = new y01(this.f22873g.mo19514e(), C2971s.m13198a());
                this.f22882p = y01;
                y01.mo22126c(h, new oj2(this));
            }
        }
    }

    /* renamed from: f */
    public final Bundle mo10942f() {
        return new Bundle();
    }

    /* renamed from: f0 */
    public final void mo10943f0() {
    }

    /* renamed from: g */
    public final C5314lv mo10944g() {
        return null;
    }

    /* renamed from: h */
    public final C5130gw mo10945h() {
        return null;
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) {
    }

    /* renamed from: i */
    public final synchronized C5316lx mo10947i() {
        return null;
    }

    /* renamed from: j */
    public final synchronized C5427ox mo10948j() {
        return null;
    }

    /* renamed from: j4 */
    public final void mo10949j4(kf0 kf0, String str) {
    }

    /* renamed from: k */
    public final C4863a mo10950k() {
        C3292l.m14236d("getAdFrame must be called on the main UI thread.");
        return C4865b.m20503f2(this.f22875i);
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) {
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo20669l() {
        m30161j7(5);
    }

    /* renamed from: n */
    public final synchronized String mo10953n() {
        return null;
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) {
        this.f22879m.mo20868u(woVar);
    }

    /* renamed from: q6 */
    public final void mo10957q6(hf0 hf0) {
    }

    /* renamed from: s5 */
    public final void mo10958s5(boolean z) {
    }

    /* renamed from: s6 */
    public final void mo10959s6(C5018dw dwVar) {
    }

    /* renamed from: v5 */
    public final synchronized void mo10960v5(zzbfi zzbfi) {
        C3292l.m14236d("setAdSize must be called on the main UI thread.");
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

    public final void zza() {
        m30161j7(3);
    }

    public final void zzp() {
        C4980cv.m22123b();
        if (nl0.m27924p()) {
            m30161j7(5);
        } else {
            this.f22873g.mo19513d().execute(new nj2(this));
        }
    }

    public final synchronized String zzr() {
        return this.f22877k;
    }

    public final synchronized String zzs() {
        return null;
    }
}
