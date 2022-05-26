package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.common.util.C3359d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jj0 extends dk0 {

    /* renamed from: b */
    private final C3359d f18493b;

    /* renamed from: c */
    private final ms3<Context> f18494c;

    /* renamed from: d */
    private final ms3<C3024o1> f18495d;

    /* renamed from: e */
    private final ms3<ck0> f18496e;

    /* renamed from: f */
    private final ms3<aj0> f18497f;

    /* renamed from: g */
    private final ms3<C3359d> f18498g;

    /* renamed from: h */
    private final ms3<cj0> f18499h;

    /* renamed from: i */
    private final ms3<ej0> f18500i;

    /* renamed from: j */
    private final ms3<hk0> f18501j;

    /* synthetic */ jj0(Context context, C3359d dVar, C3024o1 o1Var, ck0 ck0, ij0 ij0) {
        this.f18493b = dVar;
        yr3 b = zr3.m34774b(context);
        this.f18494c = b;
        yr3 b2 = zr3.m34774b(o1Var);
        this.f18495d = b2;
        yr3 b3 = zr3.m34774b(ck0);
        this.f18496e = b3;
        this.f18497f = xr3.m33787c(new bj0(b, b2, b3));
        yr3 b4 = zr3.m34774b(dVar);
        this.f18498g = b4;
        ms3<cj0> c = xr3.m33787c(new dj0(b4, b2, b3));
        this.f18499h = c;
        fj0 fj0 = new fj0(b4, c);
        this.f18500i = fj0;
        this.f18501j = xr3.m33787c(new ik0(b, fj0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aj0 mo16941a() {
        return this.f18497f.mo10679a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ej0 mo16942b() {
        return new ej0(this.f18493b, this.f18499h.mo10679a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final hk0 mo16943c() {
        return this.f18501j.mo10679a();
    }
}
