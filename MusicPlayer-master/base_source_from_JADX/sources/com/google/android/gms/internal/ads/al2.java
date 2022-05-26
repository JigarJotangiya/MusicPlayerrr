package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.internal.C3292l;
import java.util.concurrent.atomic.AtomicBoolean;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class al2 extends C5796yv implements C2958q, C5381no {

    /* renamed from: g */
    private final mt0 f13964g;

    /* renamed from: h */
    private final Context f13965h;

    /* renamed from: i */
    private AtomicBoolean f13966i = new AtomicBoolean();

    /* renamed from: j */
    private final String f13967j;

    /* renamed from: k */
    private final uk2 f13968k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final sk2 f13969l;

    /* renamed from: m */
    private long f13970m = -1;

    /* renamed from: n */
    private y01 f13971n;

    /* renamed from: o */
    protected x11 f13972o;

    public al2(mt0 mt0, Context context, String str, uk2 uk2, sk2 sk2) {
        this.f13964g = mt0;
        this.f13965h = context;
        this.f13967j = str;
        this.f13968k = uk2;
        this.f13969l = sk2;
        sk2.mo20866p(this);
    }

    /* renamed from: f7 */
    private final synchronized void m20808f7(int i) {
        if (this.f13966i.compareAndSet(false, true)) {
            this.f13969l.mo20863h();
            y01 y01 = this.f13971n;
            if (y01 != null) {
                C2971s.m13200c().mo21125e(y01);
            }
            if (this.f13972o != null) {
                long j = -1;
                if (this.f13970m != -1) {
                    j = C2971s.m13198a().mo11989b() - this.f13970m;
                }
                this.f13972o.mo21954k(j, i);
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

    /* renamed from: F5 */
    public final void mo10899F5() {
    }

    /* renamed from: G */
    public final synchronized void mo10926G() {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        x11 x11 = this.f13972o;
        if (x11 != null) {
            x11.mo17837a();
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

    /* renamed from: M5 */
    public final synchronized boolean mo10931M5() {
        return this.f13968k.zza();
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
        if (C2979b2.m13264l(this.f13965h)) {
            if (zzbfd.f27213y == null) {
                ul0.m31859d("Failed to load the ad because app ID is missing.");
                this.f13969l.mo16370c(nq2.m28048d(4, (String) null, (zzbew) null));
                return false;
            }
        }
        if (mo10931M5()) {
            return false;
        }
        this.f13966i = new AtomicBoolean();
        return this.f13968k.mo16308a(zzbfd, this.f13967j, new yk2(this), new zk2(this));
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
        this.f13968k.mo16311k(zzbfo);
    }

    /* renamed from: a */
    public final synchronized void mo10900a() {
        if (this.f13972o != null) {
            this.f13970m = C2971s.m13198a().mo11989b();
            int h = this.f13972o.mo21951h();
            if (h > 0) {
                y01 y01 = new y01(this.f13964g.mo19514e(), C2971s.m13198a());
                this.f13971n = y01;
                y01.mo22126c(h, new xk2(this));
            }
        }
    }

    /* renamed from: d */
    public final synchronized zzbfi mo10940d() {
        return null;
    }

    /* renamed from: f */
    public final Bundle mo10942f() {
        return new Bundle();
    }

    /* renamed from: f0 */
    public final synchronized void mo10943f0() {
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
        return null;
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) {
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) {
    }

    /* renamed from: l */
    public final void mo15860l() {
        this.f13964g.mo19513d().execute(new wk2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo15861m() {
        m20808f7(5);
    }

    /* renamed from: n */
    public final synchronized String mo10953n() {
        return null;
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) {
        this.f13969l.mo20868u(woVar);
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
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

    /* renamed from: y3 */
    public final void mo10902y3() {
    }

    /* renamed from: z */
    public final void mo10903z(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            m20808f7(2);
        } else if (i2 == 1) {
            m20808f7(4);
        } else if (i2 == 2) {
            m20808f7(3);
        } else if (i2 == 3) {
            m20808f7(6);
        }
    }

    public final void zza() {
        m20808f7(3);
    }

    public final synchronized void zze() {
        x11 x11 = this.f13972o;
        if (x11 != null) {
            x11.mo21954k(C2971s.m13198a().mo11989b() - this.f13970m, 1);
        }
    }

    public final synchronized String zzr() {
        return this.f13967j;
    }

    public final synchronized String zzs() {
        return null;
    }
}
