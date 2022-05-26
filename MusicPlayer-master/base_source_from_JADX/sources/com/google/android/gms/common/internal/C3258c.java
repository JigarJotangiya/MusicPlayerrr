package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.internal.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3258c {
    /* renamed from: a */
    public static void m14104a(@RecentlyNonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            Log.e("Asserts", sb.toString());
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m14105b(@RecentlyNonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            Log.e("Asserts", sb.toString());
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: c */
    public static void m14106c(@RecentlyNonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
}
