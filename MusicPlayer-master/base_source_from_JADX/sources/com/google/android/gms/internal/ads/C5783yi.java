package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5783yi implements C5821zj {

    /* renamed from: g */
    private final C5821zj[] f26367g;

    public C5783yi(C5821zj[] zjVarArr) {
        this.f26367g = zjVarArr;
    }

    /* renamed from: b */
    public final boolean mo17936b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C5821zj zjVar : this.f26367g) {
                if (zjVar.zza() == zza) {
                    z |= zjVar.mo17936b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (C5821zj zza : this.f26367g) {
            long zza2 = zza.zza();
            if (zza2 != Long.MIN_VALUE) {
                j = Math.min(j, zza2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
