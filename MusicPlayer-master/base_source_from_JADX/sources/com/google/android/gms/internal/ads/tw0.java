package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tw0 implements fn2 {

    /* renamed from: a */
    private final mx0 f24036a;

    /* renamed from: b */
    private final ms3<Context> f24037b;

    /* renamed from: c */
    private final ms3<zzbfi> f24038c;

    /* renamed from: d */
    private final ms3<String> f24039d;

    /* renamed from: e */
    private final ms3<v92> f24040e;

    /* renamed from: f */
    private final ms3<do2> f24041f;

    /* renamed from: g */
    private final ms3<cn2> f24042g;

    /* renamed from: h */
    private final ms3<ea2> f24043h;

    /* synthetic */ tw0(mx0 mx0, Context context, String str, zzbfi zzbfi, sw0 sw0) {
        this.f24036a = mx0;
        yr3 b = zr3.m34774b(context);
        this.f24037b = b;
        yr3 b2 = zr3.m34774b(zzbfi);
        this.f24038c = b2;
        yr3 b3 = zr3.m34774b(str);
        this.f24039d = b3;
        ms3<v92> c = xr3.m33787c(new w92(mx0.f20382p));
        this.f24040e = c;
        ms3<do2> c2 = xr3.m33787c(new eo2(mx0.f20395v0));
        this.f24041f = c2;
        yr3 yr3 = b;
        ms3<cn2> c3 = xr3.m33787c(new dn2(yr3, mx0.f20384q, mx0.f20342P, c, c2, wp2.m33263b()));
        this.f24042g = c3;
        this.f24043h = xr3.m33787c(new fa2(yr3, b2, b3, c3, c, c2));
    }

    public final ea2 zza() {
        return this.f24043h.mo10679a();
    }
}
