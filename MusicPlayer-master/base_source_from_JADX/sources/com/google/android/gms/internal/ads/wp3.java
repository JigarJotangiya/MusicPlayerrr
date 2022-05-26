package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wp3 {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m33265a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m33271g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m33271g(b3) || m33271g(b4)) {
            throw bn3.zzd();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m33266b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m33271g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m33271g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw bn3.zzd();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m33267c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m33271g(b2)) {
            throw bn3.zzd();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m33268d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ boolean m33269e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ boolean m33270f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m33271g(byte b) {
        return b > -65;
    }
}
