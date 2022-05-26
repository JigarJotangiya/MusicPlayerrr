package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k51<T> {

    /* renamed from: a */
    private final zx1 f18781a;

    /* renamed from: b */
    private final up2 f18782b;

    /* renamed from: c */
    private final wt2 f18783c;

    /* renamed from: d */
    private final uy0 f18784d;

    /* renamed from: e */
    private final g62<T> f18785e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final od1 f18786f;

    /* renamed from: g */
    private np2 f18787g;

    /* renamed from: h */
    private final ez1 f18788h;

    /* renamed from: i */
    private final j71 f18789i;

    /* renamed from: j */
    private final Executor f18790j;

    /* renamed from: k */
    private final ry1 f18791k;

    /* renamed from: l */
    private final p22 f18792l;

    k51(zx1 zx1, up2 up2, wt2 wt2, uy0 uy0, g62<T> g62, od1 od1, np2 np2, ez1 ez1, j71 j71, Executor executor, ry1 ry1, p22 p22) {
        this.f18781a = zx1;
        this.f18782b = up2;
        this.f18783c = wt2;
        this.f18784d = uy0;
        this.f18785e = g62;
        this.f18786f = od1;
        this.f18787g = np2;
        this.f18788h = ez1;
        this.f18789i = j71;
        this.f18790j = executor;
        this.f18791k = ry1;
        this.f18792l = p22;
    }

    /* renamed from: a */
    public final zzbew mo18841a(Throwable th) {
        return nq2.m28046b(th, this.f18792l);
    }

    /* renamed from: c */
    public final od1 mo18842c() {
        return this.f18786f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ np2 mo18843d(np2 np2) throws Exception {
        this.f18784d.mo21398a(np2);
        return np2;
    }

    /* renamed from: e */
    public final d93<zzcdq> mo18844e(zzffu zzffu) {
        at2 a = this.f18783c.mo19824b(pt2.GET_CACHE_KEY, this.f18789i.mo18556c()).mo19539f(new g51(this, zzffu)).mo19534a();
        s83.m30616r(a, new i51(this), this.f18790j);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ d93 mo18845f(zzffu zzffu, zzcdq zzcdq) throws Exception {
        zzcdq.f27356o = zzffu;
        return this.f18788h.mo17439a(zzcdq);
    }

    /* renamed from: g */
    public final d93<Void> mo18846g(zzcdq zzcdq) {
        at2 a = this.f18783c.mo19824b(pt2.NOTIFY_CACHE_HIT, this.f18788h.mo17444f(zzcdq)).mo19534a();
        s83.m30616r(a, new j51(this), this.f18790j);
        return a;
    }

    /* renamed from: h */
    public final d93<T> mo18847h(d93<np2> d93) {
        mt2<O2> f = this.f18783c.mo19824b(pt2.RENDERER, d93).mo19538e(new f51(this)).mo19539f(this.f18785e);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22628t3)).booleanValue()) {
            f = f.mo19542i((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22636u3)).intValue(), TimeUnit.SECONDS);
        }
        return f.mo19534a();
    }

    /* renamed from: i */
    public final d93<np2> mo18848i() {
        zzbfd zzbfd = this.f18782b.f24395d;
        if (zzbfd.f27194D == null && zzbfd.f27213y == null) {
            return mo18849j(this.f18789i.mo18556c());
        }
        wt2 wt2 = this.f18783c;
        return ft2.m23962c(this.f18781a.mo22445c(), pt2.SERVER_TRANSACTION, wt2).mo19534a();
    }

    /* renamed from: j */
    public final d93<np2> mo18849j(d93<zzcdq> d93) {
        np2 np2 = this.f18787g;
        if (np2 != null) {
            wt2 wt2 = this.f18783c;
            return ft2.m23962c(s83.m30607i(np2), pt2.SERVER_TRANSACTION, wt2).mo19534a();
        }
        C2971s.m13201d().mo18472j();
        return this.f18783c.mo19824b(pt2.SERVER_TRANSACTION, d93).mo19539f(new h51(this.f18791k)).mo19534a();
    }

    /* renamed from: k */
    public final void mo18850k(np2 np2) {
        this.f18787g = np2;
    }
}
