package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ih */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5189ih {

    /* renamed from: d */
    private static final long[] f17993d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f17994a = new byte[8];

    /* renamed from: b */
    private int f17995b;

    /* renamed from: c */
    private int f17996c;

    /* renamed from: b */
    public static int m25184b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f17993d[i2] & ((long) i)) > 0 ? 1 : ((f17993d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m25185c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f17993d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo18331a() {
        return this.f17996c;
    }

    /* renamed from: d */
    public final void mo18332d() {
        this.f17995b = 0;
        this.f17996c = 0;
    }

    /* renamed from: e */
    public final long mo18333e(C5410og ogVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f17995b == 0) {
            if (!ogVar.mo19988h(this.f17994a, 0, 1, z)) {
                return -1;
            }
            int b = m25184b(this.f17994a[0] & 255);
            this.f17996c = b;
            if (b != -1) {
                this.f17995b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f17996c;
        if (i2 > i) {
            this.f17995b = 0;
            return -2;
        }
        if (i2 != 1) {
            ogVar.mo19988h(this.f17994a, 1, i2 - 1, false);
        }
        this.f17995b = 0;
        return m25185c(this.f17994a, this.f17996c, z2);
    }
}
