package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: com.google.android.gms.internal.ads.ab */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4886ab {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public NetworkCapabilities f13834a;

    C4886ab(ConnectivityManager connectivityManager) {
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C5812za(this));
            } catch (RuntimeException unused) {
                synchronized (C4886ab.class) {
                    this.f13834a = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static C4886ab m20651c(Context context) {
        if (context != null) {
            return new C4886ab((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15734a() {
        /*
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.ab> r0 = com.google.android.gms.internal.ads.C4886ab.class
            monitor-enter(r0)
            android.net.NetworkCapabilities r1 = r3.f13834a     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            r2 = 4
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 2
            return r0
        L_0x0012:
            android.net.NetworkCapabilities r1 = r3.f13834a     // Catch:{ all -> 0x0030 }
            r2 = 1
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 1
            return r0
        L_0x001f:
            android.net.NetworkCapabilities r1 = r3.f13834a     // Catch:{ all -> 0x0030 }
            r2 = 0
            boolean r1 = r1.hasTransport(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = 0
            return r0
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            r0 = -1
            return r0
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4886ab.mo15734a():long");
    }

    /* renamed from: b */
    public final NetworkCapabilities mo15735b() {
        return this.f13834a;
    }
}
