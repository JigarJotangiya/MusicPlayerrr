package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r61 implements yr3<qf1<z81>> {

    /* renamed from: a */
    private final ms3<rs1> f22750a;

    /* renamed from: b */
    private final ms3<Executor> f22751b;

    /* renamed from: c */
    private final ms3<e02> f22752c;

    public r61(ms3<rs1> ms3, ms3<Executor> ms32, ms3<e02> ms33) {
        this.f22750a = ms3;
        this.f22751b = ms32;
        this.f22752c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        rs1 a = this.f22750a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f22752c.mo10679a(), e93) : new qf1(a, e93);
    }
}
