package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a81 implements yr3<zi0> {

    /* renamed from: a */
    private final ms3<Context> f13814a;

    /* renamed from: b */
    private final ms3<zzcjf> f13815b;

    /* renamed from: c */
    private final ms3<bp2> f13816c;

    /* renamed from: d */
    private final ms3<wi0> f13817d;

    public a81(z71 z71, ms3<Context> ms3, ms3<zzcjf> ms32, ms3<bp2> ms33, ms3<wi0> ms34) {
        this.f13814a = ms3;
        this.f13815b = ms32;
        this.f13816c = ms33;
        this.f13817d = ms34;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10679a() {
        Context a = this.f13814a.mo10679a();
        zzcjf b = ((cu0) this.f13815b).mo16749b();
        bp2 b2 = ((x41) this.f13816c).mo21974b();
        wi0 wi0 = new wi0();
        zzcgc zzcgc = b2.f14610B;
        if (zzcgc != null) {
            return new ti0(a, b, zzcgc, b2.f14665t.f17224b, wi0, (byte[]) null);
        }
        return null;
    }
}
