package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p61 implements yr3<qf1<ed1>> {

    /* renamed from: a */
    private final ms3<rs1> f21351a;

    /* renamed from: b */
    private final ms3<Executor> f21352b;

    /* renamed from: c */
    private final ms3<e02> f21353c;

    public p61(ms3<rs1> ms3, ms3<Executor> ms32, ms3<e02> ms33) {
        this.f21351a = ms3;
        this.f21352b = ms32;
        this.f21353c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        rs1 a = this.f21351a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f21353c.mo10679a(), e93) : new qf1(a, e93);
    }
}
