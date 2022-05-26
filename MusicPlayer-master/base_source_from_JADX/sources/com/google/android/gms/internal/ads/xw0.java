package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xw0 implements vo2 {

    /* renamed from: a */
    private final mx0 f26086a;

    /* renamed from: b */
    private final ms3<Context> f26087b;

    /* renamed from: c */
    private final ms3<om2<wp1, rp1>> f26088c;

    /* renamed from: d */
    private final ms3<do2> f26089d;

    /* renamed from: e */
    private final ms3<pp2> f26090e;

    /* renamed from: f */
    private final ms3<oo2> f26091f;

    /* renamed from: g */
    private final ms3<yo2> f26092g;

    /* renamed from: h */
    private final ms3<String> f26093h;

    /* renamed from: i */
    private final ms3<so2> f26094i;

    /* synthetic */ xw0(mx0 mx0, Context context, String str, ww0 ww0) {
        this.f26086a = mx0;
        yr3 b = zr3.m34774b(context);
        this.f26087b = b;
        tm2 tm2 = new tm2(b, mx0.f20395v0, mx0.f20397w0);
        this.f26088c = tm2;
        ms3<do2> c = xr3.m33787c(new eo2(mx0.f20395v0));
        this.f26089d = c;
        ms3<pp2> c2 = xr3.m33787c(rp2.m30289b());
        this.f26090e = c2;
        ms3<oo2> c3 = xr3.m33787c(new po2(b, mx0.f20384q, mx0.f20342P, tm2, c, wp2.m33263b(), c2));
        this.f26091f = c3;
        this.f26092g = xr3.m33787c(new zo2(c3, c, c2));
        yr3 c4 = zr3.m34775c(str);
        this.f26093h = c4;
        this.f26094i = xr3.m33787c(new to2(c4, c3, b, c, c2));
    }

    /* renamed from: a */
    public final yo2 mo21593a() {
        return this.f26092g.mo10679a();
    }

    public final so2 zza() {
        return this.f26094i.mo10679a();
    }
}
