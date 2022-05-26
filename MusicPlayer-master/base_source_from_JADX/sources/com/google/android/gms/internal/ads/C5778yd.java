package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.yd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5778yd extends Exception {
    private C5778yd(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    public static C5778yd zza(Exception exc, int i) {
        return new C5778yd(1, (String) null, exc, i);
    }

    public static C5778yd zzb(IOException iOException) {
        return new C5778yd(0, (String) null, iOException, -1);
    }

    static C5778yd zzc(RuntimeException runtimeException) {
        return new C5778yd(2, (String) null, runtimeException, -1);
    }
}
