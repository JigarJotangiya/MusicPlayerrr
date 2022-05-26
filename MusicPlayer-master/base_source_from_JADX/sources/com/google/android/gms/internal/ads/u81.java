package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u81 implements yr3<s81> {

    /* renamed from: a */
    private final ms3<r81> f24224a;

    /* renamed from: b */
    private final ms3<Set<qf1<i81>>> f24225b;

    /* renamed from: c */
    private final ms3<Executor> f24226c;

    /* renamed from: d */
    private final ms3<ScheduledExecutorService> f24227d;

    public u81(ms3<r81> ms3, ms3<Set<qf1<i81>>> ms32, ms3<Executor> ms33, ms3<ScheduledExecutorService> ms34) {
        this.f24224a = ms3;
        this.f24225b = ms32;
        this.f24226c = ms33;
        this.f24227d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        r81 b = ((t81) this.f24224a).mo10679a();
        Set c = ((ks3) this.f24225b).mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new s81(b, c, e93, this.f24227d.mo10679a());
    }
}
