package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i61 implements yr3<qf1<i81>> {

    /* renamed from: a */
    private final ms3<rs1> f17906a;

    /* renamed from: b */
    private final ms3<Executor> f17907b;

    /* renamed from: c */
    private final ms3<e02> f17908c;

    public i61(ms3<rs1> ms3, ms3<Executor> ms32, ms3<e02> ms33) {
        this.f17906a = ms3;
        this.f17907b = ms32;
        this.f17908c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        rs1 a = this.f17906a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f17908c.mo10679a(), e93) : new qf1(a, e93);
    }
}
