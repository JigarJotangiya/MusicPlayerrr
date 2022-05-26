package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.px */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5464px extends IOException {
    public final boolean zza;
    public final int zzb;

    protected C5464px(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static C5464px zza(String str, Throwable th) {
        return new C5464px(str, th, true, 1);
    }

    public static C5464px zzb(String str, Throwable th) {
        return new C5464px(str, th, true, 0);
    }

    public static C5464px zzc(String str) {
        return new C5464px(str, (Throwable) null, false, 1);
    }
}
