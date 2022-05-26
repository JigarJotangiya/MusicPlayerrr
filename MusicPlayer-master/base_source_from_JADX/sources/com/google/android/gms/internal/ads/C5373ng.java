package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ng */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5373ng implements C5669vg {

    /* renamed from: a */
    public final long[] f20616a;

    /* renamed from: b */
    public final long[] f20617b;

    /* renamed from: c */
    private final long f20618c;

    public C5373ng(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20616a = jArr;
        this.f20617b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f20618c = jArr2[i] + jArr3[i];
            return;
        }
        this.f20618c = 0;
    }

    /* renamed from: a */
    public final long mo19724a(long j) {
        return this.f20616a[C4934bm.m21433c(this.f20617b, j, true, true)];
    }

    /* renamed from: b */
    public final boolean mo19725b() {
        return true;
    }

    public final long zza() {
        return this.f20618c;
    }
}
