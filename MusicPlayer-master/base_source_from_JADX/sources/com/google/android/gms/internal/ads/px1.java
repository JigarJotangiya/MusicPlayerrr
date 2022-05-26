package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class px1 implements yr3<ox1> {

    /* renamed from: a */
    private final ms3<ScheduledExecutorService> f21746a;

    /* renamed from: b */
    private final ms3<e93> f21747b;

    /* renamed from: c */
    private final ms3<gy1> f21748c;

    /* renamed from: d */
    private final ms3<wz1> f21749d;

    public px1(ms3<ScheduledExecutorService> ms3, ms3<e93> ms32, ms3<gy1> ms33, ms3<wz1> ms34) {
        this.f21746a = ms3;
        this.f21747b = ms32;
        this.f21748c = ms33;
        this.f21749d = ms34;
    }

    /* renamed from: b */
    public final ox1 mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new ox1(this.f21746a.mo10679a(), e93, ((hy1) this.f21748c).mo10679a(), xr3.m33786b(this.f21749d));
    }
}
