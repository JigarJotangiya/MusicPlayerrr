package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rg2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class af2<S extends rg2> implements sg2<S> {

    /* renamed from: a */
    private final sg2<S> f13863a;

    /* renamed from: b */
    private final long f13864b;

    /* renamed from: c */
    private final ScheduledExecutorService f13865c;

    public af2(sg2<S> sg2, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f13863a = sg2;
        this.f13864b = j;
        this.f13865c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final d93<S> mo15767a() {
        d93<S> a = this.f13863a.mo15767a();
        long j = this.f13864b;
        if (j > 0) {
            a = s83.m30613o(a, j, TimeUnit.MILLISECONDS, this.f13865c);
        }
        return s83.m30605g(a, Throwable.class, ze2.f26746a, hm0.f17713f);
    }
}
