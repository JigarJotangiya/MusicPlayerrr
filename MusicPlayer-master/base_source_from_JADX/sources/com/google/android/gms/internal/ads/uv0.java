package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class uv0 implements ll2 {

    /* renamed from: a */
    private final Context f24473a;

    /* renamed from: b */
    private final zzbfi f24474b;

    /* renamed from: c */
    private final String f24475c;

    /* renamed from: d */
    private final mx0 f24476d;

    /* renamed from: e */
    private final ms3<Context> f24477e;

    /* renamed from: f */
    private final ms3<zzbfi> f24478f;

    /* renamed from: g */
    private final ms3<v92> f24479g;

    /* renamed from: h */
    private final ms3<aa2> f24480h;

    /* renamed from: i */
    private final ms3<gl2> f24481i;

    /* synthetic */ uv0(mx0 mx0, Context context, String str, zzbfi zzbfi, tv0 tv0) {
        this.f24476d = mx0;
        this.f24473a = context;
        this.f24474b = zzbfi;
        this.f24475c = str;
        yr3 b = zr3.m34774b(context);
        this.f24477e = b;
        yr3 b2 = zr3.m34774b(zzbfi);
        this.f24478f = b2;
        ms3<v92> c = xr3.m33787c(new w92(mx0.f20382p));
        this.f24479g = c;
        ms3<aa2> c2 = xr3.m33787c(ca2.m21837b());
        this.f24480h = c2;
        this.f24481i = xr3.m33787c(new hl2(b, mx0.f20384q, b2, mx0.f20342P, c, c2, wp2.m33263b()));
    }

    public final c92 zza() {
        return new c92(this.f24473a, this.f24474b, this.f24475c, this.f24481i.mo10679a(), this.f24479g.mo10679a());
    }
}
