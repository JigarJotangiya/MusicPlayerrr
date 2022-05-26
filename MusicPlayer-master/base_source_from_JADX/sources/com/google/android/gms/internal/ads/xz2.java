package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xz2 extends Exception {
    private final int zza;

    public xz2(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public xz2(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
