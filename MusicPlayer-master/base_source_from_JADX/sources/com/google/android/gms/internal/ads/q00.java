package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q00 {

    /* renamed from: a */
    private MotionEvent f21778a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f21779b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final ScheduledExecutorService f21780c;

    public q00(Context context, ScheduledExecutorService scheduledExecutorService, s00 s00, byte[] bArr) {
        this.f21780c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final d93<String> mo20354a() {
        return (j83) s83.m30613o(j83.m25564E(s83.m30607i(null)), e10.f15822c.mo20989e().longValue(), TimeUnit.MILLISECONDS, this.f21780c);
    }

    /* renamed from: b */
    public final void mo20355b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f21778a.getEventTime()) {
            this.f21778a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f21779b.getEventTime()) {
            this.f21779b = MotionEvent.obtain(motionEvent);
        }
    }
}
