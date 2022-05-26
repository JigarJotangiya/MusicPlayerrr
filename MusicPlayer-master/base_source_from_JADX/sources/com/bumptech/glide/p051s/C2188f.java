package com.bumptech.glide.p051s;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.s.f */
/* compiled from: LogTime */
public final class C2188f {

    /* renamed from: a */
    private static final double f7429a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f7429a = d;
    }

    /* renamed from: a */
    public static double m10252a(long j) {
        return ((double) (m10253b() - j)) * f7429a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m10253b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
