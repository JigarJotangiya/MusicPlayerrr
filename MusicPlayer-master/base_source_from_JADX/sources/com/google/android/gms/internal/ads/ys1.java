package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ys1 implements yr3<qf1<u91>> {

    /* renamed from: a */
    private final ms3<ts1> f26508a;

    /* renamed from: b */
    private final ms3<Executor> f26509b;

    /* renamed from: c */
    private final ms3<g02> f26510c;

    public ys1(ms3<ts1> ms3, ms3<Executor> ms32, ms3<g02> ms33) {
        this.f26508a = ms3;
        this.f26509b = ms32;
        this.f26510c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        ts1 a = this.f26508a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f26510c.mo10679a(), e93) : new qf1(a, e93);
    }
}
