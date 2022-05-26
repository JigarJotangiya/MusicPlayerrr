package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.x */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5726x {

    /* renamed from: d */
    private static final long[] f25606d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f25607a = new byte[8];

    /* renamed from: b */
    private int f25608b;

    /* renamed from: c */
    private int f25609c;

    /* renamed from: b */
    public static int m33496b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f25606d[i2] & ((long) i)) > 0 ? 1 : ((f25606d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m33497c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f25606d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo21947a() {
        return this.f25609c;
    }

    /* renamed from: d */
    public final long mo21948d(z84 z84, boolean z, boolean z2, int i) throws IOException {
        if (this.f25608b == 0) {
            if (!z84.mo19927e(this.f25607a, 0, 1, z)) {
                return -1;
            }
            int b = m33496b(this.f25607a[0] & 255);
            this.f25609c = b;
            if (b != -1) {
                this.f25608b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f25609c;
        if (i2 > i) {
            this.f25608b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((t84) z84).mo19927e(this.f25607a, 1, i2 - 1, false);
        }
        this.f25608b = 0;
        return m33497c(this.f25607a, this.f25609c, z2);
    }

    /* renamed from: e */
    public final void mo21949e() {
        this.f25608b = 0;
        this.f25609c = 0;
    }
}
