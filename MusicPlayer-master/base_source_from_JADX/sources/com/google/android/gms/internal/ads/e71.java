package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e71 implements yr3<d71> {

    /* renamed from: a */
    private final ms3<x81> f15882a;

    /* renamed from: b */
    private final ms3<bp2> f15883b;

    /* renamed from: c */
    private final ms3<ScheduledExecutorService> f15884c;

    /* renamed from: d */
    private final ms3<Executor> f15885d;

    public e71(ms3<x81> ms3, ms3<bp2> ms32, ms3<ScheduledExecutorService> ms33, ms3<Executor> ms34) {
        this.f15882a = ms3;
        this.f15883b = ms32;
        this.f15884c = ms33;
        this.f15885d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new d71(this.f15882a.mo10679a(), ((x41) this.f15883b).mo21974b(), this.f15884c.mo10679a(), e93);
    }
}
