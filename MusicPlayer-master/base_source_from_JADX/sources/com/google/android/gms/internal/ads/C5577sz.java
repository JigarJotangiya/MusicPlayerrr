package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.sz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5577sz {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m31001a(e23<T> e23) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T zza = e23.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
