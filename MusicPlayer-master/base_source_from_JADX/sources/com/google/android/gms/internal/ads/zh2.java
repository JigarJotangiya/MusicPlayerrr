package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zh2 implements yr3<xh2> {

    /* renamed from: a */
    private final ms3<xk0> f26787a;

    /* renamed from: b */
    private final ms3<Integer> f26788b;

    /* renamed from: c */
    private final ms3<Context> f26789c;

    /* renamed from: d */
    private final ms3<fl0> f26790d;

    /* renamed from: e */
    private final ms3<ScheduledExecutorService> f26791e;

    /* renamed from: f */
    private final ms3<Executor> f26792f;

    /* renamed from: g */
    private final ms3<String> f26793g;

    public zh2(ms3<xk0> ms3, ms3<Integer> ms32, ms3<Context> ms33, ms3<fl0> ms34, ms3<ScheduledExecutorService> ms35, ms3<Executor> ms36, ms3<String> ms37) {
        this.f26787a = ms3;
        this.f26788b = ms32;
        this.f26789c = ms33;
        this.f26790d = ms34;
        this.f26791e = ms35;
        this.f26792f = ms36;
        this.f26793g = ms37;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new xh2(new xk0(), ((vi2) this.f26788b).mo10679a().intValue(), ((rt0) this.f26789c).mo20741b(), this.f26790d.mo10679a(), this.f26791e.mo10679a(), e93, ((ui2) this.f26793g).mo21273b(), (byte[]) null);
    }
}
