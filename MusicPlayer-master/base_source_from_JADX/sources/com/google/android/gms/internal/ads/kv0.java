package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kv0 implements uj2 {

    /* renamed from: a */
    private final mx0 f18997a;

    /* renamed from: b */
    private final ms3<Context> f18998b;

    /* renamed from: c */
    private final ms3<String> f18999c;

    /* renamed from: d */
    private final ms3<om2<g11, n11>> f19000d;

    /* renamed from: e */
    private final ms3<sk2> f19001e;

    /* renamed from: f */
    private final ms3<lj2> f19002f;

    /* renamed from: g */
    private final ms3<rj2> f19003g;

    /* renamed from: h */
    private final ms3<om2<s11, x11>> f19004h;

    /* renamed from: i */
    private final ms3<uk2> f19005i;

    /* renamed from: j */
    private final ms3<al2> f19006j;

    /* synthetic */ kv0(mx0 mx0, Context context, String str, jv0 jv0) {
        this.f18997a = mx0;
        yr3 b = zr3.m34774b(context);
        this.f18998b = b;
        yr3 b2 = zr3.m34774b(str);
        this.f18999c = b2;
        sm2 sm2 = new sm2(b, mx0.f20395v0, mx0.f20397w0);
        this.f19000d = sm2;
        ms3<sk2> c = xr3.m33787c(new tk2(mx0.f20395v0));
        this.f19001e = c;
        ms3<sk2> ms3 = c;
        ms3<lj2> c2 = xr3.m33787c(new mj2(b, mx0.f20384q, mx0.f20342P, sm2, ms3, wp2.m33263b()));
        this.f19002f = c2;
        this.f19003g = xr3.m33787c(new sj2(mx0.f20342P, b, b2, c2, ms3, mx0.f20370j));
        rm2 rm2 = new rm2(b, mx0.f20395v0, mx0.f20397w0);
        this.f19004h = rm2;
        ms3<uk2> c3 = xr3.m33787c(new vk2(b, mx0.f20384q, mx0.f20342P, rm2, ms3, wp2.m33263b()));
        this.f19005i = c3;
        this.f19006j = xr3.m33787c(new bl2(mx0.f20342P, b, b2, c3, ms3));
    }

    /* renamed from: a */
    public final al2 mo19011a() {
        return this.f19006j.mo10679a();
    }

    public final rj2 zza() {
        return this.f19003g.mo10679a();
    }
}
