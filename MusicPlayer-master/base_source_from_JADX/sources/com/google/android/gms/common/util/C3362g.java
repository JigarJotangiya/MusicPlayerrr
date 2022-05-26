package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.util.g */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3362g implements C3359d {

    /* renamed from: a */
    private static final C3362g f10766a = new C3362g();

    private C3362g() {
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C3359d m14447d() {
        return f10766a;
    }

    /* renamed from: a */
    public final long mo11988a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo11989b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo11990c() {
        return System.nanoTime();
    }
}
