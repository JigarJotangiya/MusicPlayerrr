package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5027e4 {
    /* renamed from: a */
    public static int m22836a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m22837b(no2 no2, int i, int i2) {
        no2.mo19779f(i);
        if (no2.mo19782i() < 5) {
            return -9223372036854775807L;
        }
        int m = no2.mo19786m();
        if ((8388608 & m) != 0 || ((m >> 8) & 8191) != i2 || (m & 32) == 0 || no2.mo19792s() < 7 || no2.mo19782i() < 7 || (no2.mo19792s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        no2.mo19775b(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
