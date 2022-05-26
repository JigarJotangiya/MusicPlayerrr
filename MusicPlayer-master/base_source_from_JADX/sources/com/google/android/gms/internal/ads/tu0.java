package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tu0 extends lh2 {

    /* renamed from: a */
    private final ti2 f24002a;

    /* renamed from: b */
    private final mx0 f24003b;

    /* renamed from: c */
    private final ms3<Integer> f24004c;

    /* renamed from: d */
    private final ms3<ih2> f24005d;

    /* renamed from: e */
    private final ms3<String> f24006e;

    /* renamed from: f */
    private final ms3<rh2> f24007f;

    /* renamed from: g */
    private final ms3<xh2> f24008g;

    /* renamed from: h */
    private final ms3<bi2> f24009h;

    /* renamed from: i */
    private final ms3<ji2> f24010i;

    /* renamed from: j */
    private final ms3<qi2> f24011j;

    /* renamed from: k */
    private final ms3<ij2> f24012k = new kj2(ps2.m29144b());

    /* renamed from: l */
    private final ms3<Boolean> f24013l;

    /* renamed from: m */
    private final ms3<dj2> f24014m;

    /* renamed from: n */
    private final ms3<String> f24015n;

    /* renamed from: o */
    private final ms3<os1> f24016o;

    /* renamed from: p */
    private final ms3<os1> f24017p;

    /* renamed from: q */
    private final ms3<os1> f24018q;

    /* renamed from: r */
    private final ms3<os1> f24019r;

    /* renamed from: s */
    private final ms3<Map<pt2, os1>> f24020s;

    /* renamed from: t */
    private final ms3<Set<qf1<xt2>>> f24021t;

    /* renamed from: u */
    private final ms3<Set<qf1<xt2>>> f24022u;

    /* renamed from: v */
    private final ms3 f24023v;

    /* renamed from: w */
    private final ms3<wt2> f24024w;

    /* synthetic */ tu0(mx0 mx0, ti2 ti2, su0 su0) {
        ti2 ti22 = ti2;
        this.f24003b = mx0;
        this.f24002a = ti22;
        vi2 vi2 = new vi2(ti22);
        this.f24004c = vi2;
        this.f24005d = new kh2(oy0.f21232a, mx0.f20368i, mx0.f20380o, ps2.m29144b(), vi2);
        ui2 ui2 = new ui2(ti22);
        this.f24006e = ui2;
        this.f24007f = new th2(eu0.f16114a, mx0.f20368i, ui2, ps2.m29144b());
        this.f24008g = new zh2(oy0.f21232a, vi2, mx0.f20368i, mx0.f20355b0, mx0.f20380o, ps2.m29144b(), ui2);
        this.f24009h = new di2(iy0.f18275a, ps2.m29144b(), mx0.f20368i);
        this.f24010i = new li2(ky0.f19104a, ps2.m29144b(), ui2);
        this.f24011j = new si2(my0.f20407a, mx0.f20380o, mx0.f20368i);
        wi2 wi2 = new wi2(ti22);
        this.f24013l = wi2;
        ui2 ui22 = ui2;
        this.f24014m = new fj2(mx0.f20355b0, wi2, qy0.f22279a, ps2.m29144b(), ui22, mx0.f20380o);
        xi2 xi2 = new xi2(ti22);
        this.f24015n = xi2;
        ms3<os1> c = xr3.m33787c(hs1.m24910b());
        this.f24016o = c;
        ms3<os1> c2 = xr3.m33787c(es1.m23124b());
        this.f24017p = c2;
        ms3<os1> c3 = xr3.m33787c(js1.m25943b());
        this.f24018q = c3;
        ms3<os1> c4 = xr3.m33787c(ls1.m26927b());
        this.f24019r = c4;
        bs3 c5 = cs3.m22109c(4);
        c5.mo16382b(pt2.GMS_SIGNALS, c);
        c5.mo16382b(pt2.BUILD_URL, c2);
        c5.mo16382b(pt2.HTTP, c3);
        c5.mo16382b(pt2.PRE_PROCESS, c4);
        cs3 c6 = c5.mo16383c();
        this.f24020s = c6;
        ms3<Set<qf1<xt2>>> c7 = xr3.m33787c(new ms1(xi2, mx0.f20368i, ps2.m29144b(), c6));
        this.f24021t = c7;
        js3 b = ks3.m26414b(0, 1);
        b.mo18730a(c7);
        ks3 c8 = b.mo18732c();
        this.f24022u = c8;
        zt2 zt2 = new zt2(c8);
        this.f24023v = zt2;
        this.f24024w = xr3.m33787c(new yt2(ps2.m29144b(), mx0.f20380o, zt2));
    }

    /* renamed from: d */
    private final oh2 m31495d() {
        xk0 xk0 = new xk0();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        String d = this.f24002a.mo21075d();
        gs3.m24490b(d);
        return new oh2(xk0, e93, d, this.f24002a.mo21073b(), this.f24002a.mo21072a(), (byte[]) null);
    }

    /* renamed from: e */
    private final ni2 m31496e() {
        C4910az azVar = new C4910az();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        List<String> f = this.f24002a.mo21077f();
        gs3.m24490b(f);
        return new ni2(azVar, e93, f, (List<String>) null);
    }

    /* renamed from: a */
    public final vg2<JSONObject> mo19167a() {
        tk0 tk0 = new tk0();
        vk0 vk0 = new vk0();
        Object a = this.f24003b.f20403z0.mo10679a();
        oh2 d = m31495d();
        ni2 e = m31496e();
        sr3<ih2> b = xr3.m33786b(this.f24005d);
        sr3<rh2> b2 = xr3.m33786b(this.f24007f);
        sr3<xh2> b3 = xr3.m33786b(this.f24008g);
        sr3<bi2> b4 = xr3.m33786b(this.f24009h);
        sr3<ji2> b5 = xr3.m33786b(this.f24010i);
        sr3<qi2> b6 = xr3.m33786b(this.f24011j);
        sr3<ij2> b7 = xr3.m33786b(this.f24012k);
        sr3<dj2> b8 = xr3.m33786b(this.f24014m);
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return aj2.m20771b(tk0, vk0, a, d, e, b, b2, b3, b4, b5, b6, b7, b8, e93, (ScheduledExecutorService) this.f24003b.f20380o.mo10679a());
    }

    /* renamed from: b */
    public final vg2<JSONObject> mo19168b() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        tk0 tk0 = new tk0();
        gs3.m24490b(e93);
        String c = this.f24002a.mo21074c();
        gs3.m24490b(c);
        af2 af2 = new af2(new ji2(tk0, e93, c, (byte[]) null), 0, (ScheduledExecutorService) this.f24003b.f20380o.mo10679a());
        Context a = this.f24003b.f20354b.mo20311a();
        gs3.m24490b(a);
        af2 af22 = new af2(new qi2(new bf0(), (ScheduledExecutorService) this.f24003b.f20380o.mo10679a(), a, (byte[]) null), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22611r2)).longValue(), (ScheduledExecutorService) this.f24003b.f20380o.mo10679a());
        xk0 xk0 = new xk0();
        Context a2 = this.f24003b.f20354b.mo20311a();
        gs3.m24490b(a2);
        gs3.m24490b(e93);
        af2 af23 = new af2(new ih2(xk0, a2, (ScheduledExecutorService) this.f24003b.f20380o.mo10679a(), e93, this.f24002a.mo21072a(), (byte[]) null), 0, (ScheduledExecutorService) this.f24003b.f20380o.mo10679a());
        gs3.m24490b(e93);
        af2 af24 = new af2(new ij2(e93), 0, (ScheduledExecutorService) this.f24003b.f20380o.mo10679a());
        zi2 zi2 = zi2.f26796a;
        Context a3 = this.f24003b.f20354b.mo20311a();
        gs3.m24490b(a3);
        String c2 = this.f24002a.mo21074c();
        gs3.m24490b(c2);
        gs3.m24490b(e93);
        rh2 rh2 = new rh2((qg0) null, a3, c2, e93);
        C5382np npVar = new C5382np();
        gs3.m24490b(e93);
        Context a4 = this.f24003b.f20354b.mo20311a();
        gs3.m24490b(a4);
        xk0 xk02 = new xk0();
        int a5 = this.f24002a.mo21072a();
        Context a6 = this.f24003b.f20354b.mo20311a();
        gs3.m24490b(a6);
        gs3.m24490b(e93);
        String c3 = this.f24002a.mo21074c();
        gs3.m24490b(c3);
        af2 af25 = af23;
        Object[] objArr = {new bi2(npVar, e93, a4, (byte[]) null), m31496e(), m31495d(), new xh2(xk02, a5, a6, (fl0) this.f24003b.f20355b0.mo10679a(), (ScheduledExecutorService) this.f24003b.f20380o.mo10679a(), e93, c3, (byte[]) null), (sg2) this.f24003b.f20403z0.mo10679a()};
        return new vg2<>(e93, r43.zzm(af2, af22, af25, af24, zi2, rh2, objArr));
    }

    /* renamed from: c */
    public final wt2 mo19169c() {
        return this.f24024w.mo10679a();
    }
}
