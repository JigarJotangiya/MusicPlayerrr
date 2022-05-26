package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vs2 implements yr3<ScheduledExecutorService> {

    /* renamed from: a */
    private final ms3<ThreadFactory> f24916a;

    public vs2(ms3<ThreadFactory> ms3) {
        this.f24916a = ms3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        v03.m32115a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, this.f24916a.mo10679a()));
        gs3.m24490b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
