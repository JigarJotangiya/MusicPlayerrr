package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h62<AdT> implements yr3<g62<AdT>> {

    /* renamed from: a */
    private final ms3<wt2> f17547a;

    /* renamed from: b */
    private final ms3<b62> f17548b;

    /* renamed from: c */
    private final ms3<g81> f17549c;

    /* renamed from: d */
    private final ms3<iv2> f17550d;

    /* renamed from: e */
    private final ms3<lv2> f17551e;

    /* renamed from: f */
    private final ms3<j41<AdT>> f17552f;

    /* renamed from: g */
    private final ms3<Executor> f17553g;

    /* renamed from: h */
    private final ms3<ScheduledExecutorService> f17554h;

    /* renamed from: i */
    private final ms3<p22> f17555i;

    public h62(ms3<wt2> ms3, ms3<b62> ms32, ms3<g81> ms33, ms3<iv2> ms34, ms3<lv2> ms35, ms3<j41<AdT>> ms36, ms3<Executor> ms37, ms3<ScheduledExecutorService> ms38, ms3<p22> ms39) {
        this.f17547a = ms3;
        this.f17548b = ms32;
        this.f17549c = ms33;
        this.f17550d = ms34;
        this.f17551e = ms35;
        this.f17552f = ms36;
        this.f17553g = ms37;
        this.f17554h = ms38;
        this.f17555i = ms39;
    }

    /* renamed from: b */
    public final g62<AdT> mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new g62(this.f17547a.mo10679a(), this.f17548b.mo10679a(), this.f17549c.mo10679a(), this.f17550d.mo10679a(), this.f17551e.mo10679a(), this.f17552f.mo10679a(), e93, this.f17554h.mo10679a(), this.f17555i.mo10679a());
    }
}
