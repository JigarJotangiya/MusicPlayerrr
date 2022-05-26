package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d21 implements yr3<wa1> {

    /* renamed from: a */
    private final ms3<ScheduledExecutorService> f15469a;

    /* renamed from: b */
    private final ms3<C3359d> f15470b;

    public d21(ms3<ScheduledExecutorService> ms3, ms3<C3359d> ms32) {
        this.f15469a = ms3;
        this.f15470b = ms32;
    }

    /* renamed from: b */
    public final wa1 mo10679a() {
        return new wa1(this.f15469a.mo10679a(), this.f15470b.mo10679a());
    }
}
