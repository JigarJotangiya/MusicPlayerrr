package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class py3<T extends Exception> {

    /* renamed from: a */
    private T f21762a;

    /* renamed from: b */
    private long f21763b;

    public py3(long j) {
    }

    /* renamed from: a */
    public final void mo20345a() {
        this.f21762a = null;
    }

    /* renamed from: b */
    public final void mo20346b(T t) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f21762a == null) {
            this.f21762a = t;
            this.f21763b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f21763b) {
            T t2 = this.f21762a;
            this.f21762a = null;
            throw t2;
        }
    }
}
