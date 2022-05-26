package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ex3 implements w60, wx3, x74, q24, k54, jz3 {

    /* renamed from: g */
    private final ht1 f16359g;

    /* renamed from: h */
    private final od0 f16360h;

    /* renamed from: i */
    private final ff0 f16361i = new ff0();

    /* renamed from: j */
    private final dx3 f16362j;

    /* renamed from: k */
    private final SparseArray<fx3> f16363k;

    /* renamed from: l */
    private x82<gx3> f16364l;

    /* renamed from: m */
    private t90 f16365m;

    /* renamed from: n */
    private r22 f16366n;

    /* renamed from: o */
    private boolean f16367o;

    public ex3(ht1 ht1) {
        this.f16359g = ht1;
        this.f16364l = new x82<>(wy2.m33432a(), ht1, yw3.f26574a);
        od0 od0 = new od0();
        this.f16360h = od0;
        this.f16362j = new dx3(od0);
        this.f16363k = new SparseArray<>();
    }

    /* renamed from: I */
    public static /* synthetic */ void m23310I(ex3 ex3) {
        fx3 F = ex3.mo17381F();
        ex3.mo17391Q(F, 1036, new ax3(F));
        ex3.f16364l.mo21991e();
    }

    /* renamed from: U */
    private final fx3 m23311U(f24 f24) {
        bg0 bg0;
        Objects.requireNonNull(this.f16365m);
        if (f24 == null) {
            bg0 = null;
        } else {
            bg0 = this.f16362j.mo17035a(f24);
        }
        if (f24 != null && bg0 != null) {
            return mo17382G(bg0, bg0.mo16241n(f24.f25531a, this.f16360h).f20976c, f24);
        }
        int d = ((zt3) this.f16365m).mo17321d();
        bg0 m = this.f16365m.mo17328m();
        if (d >= m.mo15664c()) {
            m = bg0.f14455a;
        }
        return mo17382G(m, d, (f24) null);
    }

    /* renamed from: h0 */
    private final fx3 m23312h0(int i, f24 f24) {
        t90 t90 = this.f16365m;
        Objects.requireNonNull(t90);
        if (f24 == null) {
            bg0 m = t90.mo17328m();
            if (i >= m.mo15664c()) {
                m = bg0.f14455a;
            }
            return mo17382G(m, i, (f24) null);
        } else if (this.f16362j.mo17035a(f24) != null) {
            return m23311U(f24);
        } else {
            return mo17382G(bg0.f14455a, i, f24);
        }
    }

    /* renamed from: i0 */
    private final fx3 m23313i0() {
        return m23311U(this.f16362j.mo17038d());
    }

    /* renamed from: j0 */
    private final fx3 m23314j0() {
        return m23311U(this.f16362j.mo17039e());
    }

    /* renamed from: A */
    public final void mo15960A(int i, f24 f24, x14 x14, c24 c24, IOException iOException, boolean z) {
        fx3 h0 = m23312h0(i, f24);
        mo17391Q(h0, 1003, new hw3(h0, x14, c24, iOException, z));
    }

    /* renamed from: B */
    public final void mo17378B(float f) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1019, new bx3(j0, f));
    }

    /* renamed from: C */
    public final void mo17379C(C5689w wVar, eb3 eb3) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1010, new pv3(j0, wVar, eb3));
    }

    /* renamed from: D */
    public final void mo15961D(int i, f24 f24, c24 c24) {
        fx3 h0 = m23312h0(i, f24);
        mo17391Q(h0, 1004, new iw3(h0, c24));
    }

    /* renamed from: E */
    public final void mo17380E(String str) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1024, new ow3(j0, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final fx3 mo17381F() {
        return m23311U(this.f16362j.mo17036b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final fx3 mo17382G(bg0 bg0, int i, f24 f24) {
        bg0 bg02 = bg0;
        int i2 = i;
        boolean z = true;
        f24 f242 = true == bg0.mo16242o() ? null : f24;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!bg02.equals(this.f16365m.mo17328m()) || i2 != ((zt3) this.f16365m).mo17321d()) {
            z = false;
        }
        long j = 0;
        if (f242 == null || !f242.mo21902b()) {
            if (z) {
                j = this.f16365m.mo17324h();
            } else if (!bg0.mo16242o()) {
                long j2 = bg02.mo15666e(i2, this.f16361i, 0).f16573k;
                j = bw3.m21570d(0);
            }
        } else if (z && this.f16365m.zze() == f242.f25532b && this.f16365m.mo17320c() == f242.f25533c) {
            j = this.f16365m.mo17325i();
        }
        return new fx3(elapsedRealtime, bg0, i, f242, j, this.f16365m.mo17328m(), ((zt3) this.f16365m).mo17321d(), this.f16362j.mo17036b(), this.f16365m.mo17325i(), this.f16365m.mo17326j());
    }

    /* renamed from: H */
    public final void mo17383H(int i) {
        fx3 F = mo17381F();
        mo17391Q(F, 6, new gv3(F, i));
    }

    /* renamed from: J */
    public final void mo17384J(gx3 gx3) {
        this.f16364l.mo21988b(gx3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo17385K(t90 t90, gx3 gx3, i84 i84) {
        SparseArray<fx3> sparseArray = this.f16363k;
        SparseArray sparseArray2 = new SparseArray(i84.mo18308b());
        for (int i = 0; i < i84.mo18308b(); i++) {
            int a = i84.mo18307a(i);
            fx3 fx3 = sparseArray.get(a);
            Objects.requireNonNull(fx3);
            sparseArray2.append(a, fx3);
        }
    }

    /* renamed from: L */
    public final void mo17386L(int i) {
        fx3 F = mo17381F();
        mo17391Q(F, 4, new fv3(F, i));
    }

    /* renamed from: M */
    public final void mo17387M(String str) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1013, new nw3(j0, str));
    }

    /* renamed from: N */
    public final void mo17388N() {
        if (!this.f16367o) {
            fx3 F = mo17381F();
            this.f16367o = true;
            mo17391Q(F, -1, new ev3(F));
        }
    }

    /* renamed from: O */
    public final void mo17389O() {
        r22 r22 = this.f16366n;
        gs1.m24484b(r22);
        r22.mo20553a(new zw3(this));
    }

    /* renamed from: P */
    public final void mo17390P(gx3 gx3) {
        this.f16364l.mo21992f(gx3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final void mo17391Q(fx3 fx3, int i, u52<gx3> u52) {
        this.f16363k.put(i, fx3);
        x82<gx3> x82 = this.f16364l;
        x82.mo21990d(i, u52);
        x82.mo21989c();
    }

    /* renamed from: R */
    public final void mo17392R(t90 t90, Looper looper) {
        boolean z = true;
        if (this.f16365m != null && !this.f16362j.f15768b.isEmpty()) {
            z = false;
        }
        gs1.m24488f(z);
        this.f16365m = t90;
        this.f16366n = this.f16359g.mo18209a(looper, (Handler.Callback) null);
        this.f16364l = this.f16364l.mo21987a(looper, new xw3(this, t90));
    }

    /* renamed from: S */
    public final void mo17393S(boolean z) {
        fx3 F = mo17381F();
        mo17391Q(F, 3, new rw3(F, z));
    }

    /* renamed from: T */
    public final void mo17394T(List<f24> list, f24 f24) {
        dx3 dx3 = this.f16362j;
        t90 t90 = this.f16365m;
        Objects.requireNonNull(t90);
        dx3.mo17041h(list, f24, t90);
    }

    /* renamed from: V */
    public final void mo17395V(i10 i10) {
        fx3 F = mo17381F();
        mo17391Q(F, 12, new uv3(F, i10));
    }

    /* renamed from: W */
    public final void mo17396W(s80 s80, s80 s802, int i) {
        if (i == 1) {
            this.f16367o = false;
            i = 1;
        }
        dx3 dx3 = this.f16362j;
        t90 t90 = this.f16365m;
        Objects.requireNonNull(t90);
        dx3.mo17040g(t90);
        fx3 F = mo17381F();
        mo17391Q(F, 11, new mv3(F, i, s80, s802));
    }

    /* renamed from: X */
    public final void mo17397X(boolean z, int i) {
        fx3 F = mo17381F();
        mo17391Q(F, -1, new ww3(F, z, i));
    }

    /* renamed from: Y */
    public final void mo17398Y(e50 e50) {
        fx3 F = mo17381F();
        mo17391Q(F, 13, new vv3(F, e50));
    }

    /* renamed from: Z */
    public final void mo17399Z(boolean z) {
        fx3 F = mo17381F();
        mo17391Q(F, 7, new sw3(F, z));
    }

    /* renamed from: a */
    public final void mo17400a(boolean z) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1017, new tw3(j0, z));
    }

    /* renamed from: a0 */
    public final void mo17401a0(boolean z, int i) {
        fx3 F = mo17381F();
        mo17391Q(F, 5, new vw3(F, z, i));
    }

    /* renamed from: b */
    public final void mo17402b(cw0 cw0) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1028, new yv3(j0, cw0));
    }

    /* renamed from: b0 */
    public final void mo17403b0(bg0 bg0, int i) {
        dx3 dx3 = this.f16362j;
        t90 t90 = this.f16365m;
        Objects.requireNonNull(t90);
        dx3.mo17042i(t90);
        fx3 F = mo17381F();
        mo17391Q(F, 0, new hv3(F, i));
    }

    /* renamed from: c */
    public final void mo17404c(int i, long j, long j2) {
        fx3 U = m23311U(this.f16362j.mo17037c());
        mo17391Q(U, 1006, new lv3(U, i, j, j2));
    }

    /* renamed from: c0 */
    public final void mo17405c0(au0 au0) {
        fx3 F = mo17381F();
        mo17391Q(F, 2, new xv3(F, au0));
    }

    /* renamed from: d */
    public final void mo17406d(da3 da3) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1020, new dw3(j0, da3));
    }

    /* renamed from: d0 */
    public final void mo17407d0(C5755xs xsVar) {
        fx3 F = mo17381F();
        mo17391Q(F, 14, new sv3(F, xsVar));
    }

    /* renamed from: e */
    public final /* synthetic */ void mo17408e(int i, boolean z) {
    }

    /* renamed from: e0 */
    public final void mo17409e0(C5825zn znVar, int i) {
        fx3 F = mo17381F();
        mo17391Q(F, 1, new rv3(F, znVar, i));
    }

    /* renamed from: f */
    public final void mo17410f(Exception exc) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1018, new kw3(j0, exc));
    }

    /* renamed from: f0 */
    public final void mo17411f0(uj0 uj0, uk0 uk0) {
        fx3 F = mo17381F();
        mo17391Q(F, 2, new wv3(F, uj0, uk0));
    }

    /* renamed from: g */
    public final void mo17412g(String str, long j, long j2) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1009, new pw3(j0, str, j2, j));
    }

    /* renamed from: g0 */
    public final void mo17413g0(C5133gz gzVar) {
        C5719wt wtVar;
        fx3 fx3 = null;
        if ((gzVar instanceof ji3) && (wtVar = ((ji3) gzVar).zzj) != null) {
            fx3 = m23311U(new f24(wtVar));
        }
        if (fx3 == null) {
            fx3 = mo17381F();
        }
        mo17391Q(fx3, 10, new tv3(fx3, gzVar));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo17414h() {
    }

    /* renamed from: i */
    public final void mo17415i(int i, long j, long j2) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1012, new kv3(j0, i, j, j2));
    }

    /* renamed from: j */
    public final void mo17416j(da3 da3) {
        fx3 i0 = m23313i0();
        mo17391Q(i0, 1025, new cw3(i0, da3));
    }

    /* renamed from: k */
    public final void mo17417k(Object obj, long j) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1027, new mw3(j0, obj, j));
    }

    /* renamed from: l */
    public final void mo17418l(int i, int i2) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1029, new iv3(j0, i, i2));
    }

    /* renamed from: m */
    public final void mo17419m() {
        fx3 F = mo17381F();
        mo17391Q(F, -1, new uw3(F));
    }

    /* renamed from: n */
    public final void mo17420n(Exception exc) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1037, new jw3(j0, exc));
    }

    /* renamed from: o */
    public final void mo17421o(long j) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1011, new nv3(j0, j));
    }

    /* renamed from: p */
    public final void mo15962p(int i, f24 f24, x14 x14, c24 c24) {
        fx3 h0 = m23312h0(i, f24);
        mo17391Q(h0, 1002, new ew3(h0, x14, c24));
    }

    /* renamed from: q */
    public final void mo17422q(C5689w wVar, eb3 eb3) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1022, new qv3(j0, wVar, eb3));
    }

    /* renamed from: r */
    public final void mo17423r(long j, int i) {
        fx3 i0 = m23313i0();
        mo17391Q(i0, 1026, new ov3(i0, j, i));
    }

    /* renamed from: s */
    public final void mo17424s(da3 da3) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1008, new aw3(j0, da3));
    }

    /* renamed from: t */
    public final void mo15963t(int i, f24 f24, x14 x14, c24 c24) {
        fx3 h0 = m23312h0(i, f24);
        mo17391Q(h0, 1001, new fw3(h0, x14, c24));
    }

    /* renamed from: u */
    public final void mo17425u(int i, long j) {
        fx3 i0 = m23313i0();
        mo17391Q(i0, 1023, new jv3(i0, i, j));
    }

    /* renamed from: v */
    public final void mo17426v(Exception exc) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1038, new lw3(j0, exc));
    }

    /* renamed from: w */
    public final void mo17427w(da3 da3) {
        fx3 i0 = m23313i0();
        mo17391Q(i0, 1014, new zv3(i0, da3));
    }

    /* renamed from: x */
    public final void mo15964x(int i, f24 f24, x14 x14, c24 c24) {
        fx3 h0 = m23312h0(i, f24);
        mo17391Q(h0, 1000, new gw3(h0, x14, c24));
    }

    /* renamed from: y */
    public final void mo17428y(String str, long j, long j2) {
        fx3 j0 = m23314j0();
        mo17391Q(j0, 1021, new qw3(j0, str, j2, j));
    }

    /* renamed from: z */
    public final /* synthetic */ void mo17429z(e04 e04) {
    }
}
