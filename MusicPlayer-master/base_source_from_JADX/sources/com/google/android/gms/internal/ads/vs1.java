package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vs1 implements yr3<qf1<cb1>> {

    /* renamed from: a */
    private final ms3<ts1> f24913a;

    /* renamed from: b */
    private final ms3<Executor> f24914b;

    /* renamed from: c */
    private final ms3<g02> f24915c;

    public vs1(ms3<ts1> ms3, ms3<Executor> ms32, ms3<g02> ms33) {
        this.f24913a = ms3;
        this.f24914b = ms32;
        this.f24915c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        ts1 a = this.f24913a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue() ? new qf1(this.f24915c.mo10679a(), e93) : new qf1(a, e93);
    }
}
