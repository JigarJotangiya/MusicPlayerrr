package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q61 implements yr3<qf1<C5497qt>> {

    /* renamed from: a */
    private final ms3<rs1> f21833a;

    /* renamed from: b */
    private final ms3<Executor> f21834b;

    /* renamed from: c */
    private final ms3<e02> f21835c;

    public q61(ms3<rs1> ms3, ms3<Executor> ms32, ms3<e02> ms33) {
        this.f21833a = ms3;
        this.f21834b = ms32;
        this.f21835c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        rs1 a = this.f21833a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f21835c.mo10679a(), e93) : new qf1(a, e93);
    }
}
