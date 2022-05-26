package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zs1 implements yr3<qf1<xt2>> {

    /* renamed from: a */
    private final ms3<kt1> f26898a;

    /* renamed from: b */
    private final ms3<Executor> f26899b;

    /* renamed from: c */
    private final ms3<n02> f26900c;

    public zs1(ms3<kt1> ms3, ms3<Executor> ms32, ms3<n02> ms33) {
        this.f26898a = ms3;
        this.f26899b = ms32;
        this.f26900c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        kt1 a = this.f26898a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f26900c.mo10679a(), e93) : new qf1(a, e93);
    }
}
