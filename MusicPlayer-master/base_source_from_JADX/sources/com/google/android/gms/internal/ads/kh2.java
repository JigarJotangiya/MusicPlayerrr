package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kh2 implements yr3<ih2> {

    /* renamed from: a */
    private final ms3<xk0> f18877a;

    /* renamed from: b */
    private final ms3<Context> f18878b;

    /* renamed from: c */
    private final ms3<ScheduledExecutorService> f18879c;

    /* renamed from: d */
    private final ms3<Executor> f18880d;

    /* renamed from: e */
    private final ms3<Integer> f18881e;

    public kh2(ms3<xk0> ms3, ms3<Context> ms32, ms3<ScheduledExecutorService> ms33, ms3<Executor> ms34, ms3<Integer> ms35) {
        this.f18877a = ms3;
        this.f18878b = ms32;
        this.f18879c = ms33;
        this.f18880d = ms34;
        this.f18881e = ms35;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new ih2(new xk0(), ((rt0) this.f18878b).mo20741b(), this.f18879c.mo10679a(), e93, ((vi2) this.f18881e).mo10679a().intValue(), (byte[]) null);
    }
}
