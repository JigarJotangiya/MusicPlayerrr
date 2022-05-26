package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C2958q;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sk2 implements h81, fa1, km2, C2958q, sa1, v81, yf1 {

    /* renamed from: g */
    private final zq2 f23521g;

    /* renamed from: h */
    private final AtomicReference<C5714wo> f23522h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C5751xo> f23523i = new AtomicReference<>();

    /* renamed from: j */
    private final AtomicReference<C4974cp> f23524j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicReference<fa1> f23525k = new AtomicReference<>();

    /* renamed from: l */
    private final AtomicReference<C2958q> f23526l = new AtomicReference<>();

    /* renamed from: m */
    private final AtomicReference<C5205ix> f23527m = new AtomicReference<>();

    /* renamed from: n */
    private sk2 f23528n = null;

    public sk2(zq2 zq2) {
        this.f23521g = zq2;
    }

    /* renamed from: d */
    public static sk2 m30749d(sk2 sk2) {
        sk2 sk22 = new sk2(sk2.f23521g);
        sk22.f23528n = sk2;
        return sk22;
    }

    /* renamed from: F5 */
    public final void mo10899F5() {
    }

    /* renamed from: a */
    public final void mo10900a() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo10900a();
            return;
        }
        bm2.m21449a(this.f23526l, fk2.f16661a);
        bm2.m21449a(this.f23524j, dk2.f15647a);
        bm2.m21449a(this.f23524j, rk2.f22890a);
    }

    /* renamed from: b */
    public final void mo16976b(km2 km2) {
        this.f23528n = (sk2) km2;
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo16370c(zzbew);
            return;
        }
        bm2.m21449a(this.f23522h, new jk2(zzbew));
        bm2.m21449a(this.f23522h, new kk2(zzbew));
    }

    /* renamed from: e */
    public final void mo17514e() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo17514e();
        } else {
            bm2.m21449a(this.f23525k, hk2.f17693a);
        }
    }

    /* renamed from: g */
    public final void mo16977g(zzbfk zzbfk) {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo16977g(zzbfk);
        } else {
            bm2.m21449a(this.f23527m, new mk2(zzbfk));
        }
    }

    /* renamed from: h */
    public final void mo20863h() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo20863h();
            return;
        }
        this.f23521g.mo22419a();
        bm2.m21449a(this.f23523i, ok2.f21024a);
        bm2.m21449a(this.f23524j, qk2.f21947a);
    }

    /* renamed from: k */
    public final void mo20864k(C5603to toVar) {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo20864k(toVar);
        } else {
            bm2.m21449a(this.f23522h, new ck2(toVar));
        }
    }

    /* renamed from: n */
    public final void mo20865n(fa1 fa1) {
        this.f23525k.set(fa1);
    }

    /* renamed from: n0 */
    public final void mo15619n0(zzbew zzbew) {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo15619n0(zzbew);
        } else {
            bm2.m21449a(this.f23524j, new lk2(zzbew));
        }
    }

    /* renamed from: o */
    public final void mo15729o() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo15729o();
        } else {
            bm2.m21449a(this.f23524j, pk2.f21416a);
        }
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo10901o5();
        } else {
            bm2.m21449a(this.f23526l, ek2.f15985a);
        }
    }

    /* renamed from: p */
    public final void mo20866p(C2958q qVar) {
        this.f23526l.set(qVar);
    }

    /* renamed from: r */
    public final void mo20867r(C5205ix ixVar) {
        this.f23527m.set(ixVar);
    }

    /* renamed from: u */
    public final void mo20868u(C5714wo woVar) {
        this.f23522h.set(woVar);
    }

    /* renamed from: v */
    public final void mo20869v(C4974cp cpVar) {
        this.f23524j.set(cpVar);
    }

    /* renamed from: x */
    public final void mo20870x(C5751xo xoVar) {
        this.f23523i.set(xoVar);
    }

    /* renamed from: y3 */
    public final void mo10902y3() {
    }

    /* renamed from: z */
    public final void mo10903z(int i) {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.mo10903z(i);
        } else {
            bm2.m21449a(this.f23526l, new nk2(i));
        }
    }

    public final void zze() {
        sk2 sk2 = this.f23528n;
        if (sk2 != null) {
            sk2.zze();
        } else {
            bm2.m21449a(this.f23526l, gk2.f17164a);
        }
    }
}
