package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.ml */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5341ml {

    /* renamed from: a */
    private static final byte[] f20073a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f20074b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f20075c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m27304a(byte[] bArr) {
        C5563sl slVar = new C5563sl(bArr, bArr.length);
        int c = m27306c(slVar);
        int d = m27307d(slVar);
        int a = slVar.mo20871a(4);
        if (c == 5 || c == 29) {
            d = m27307d(slVar);
            if (m27306c(slVar) == 22) {
                a = slVar.mo20871a(4);
            }
        }
        int i = f20075c[a];
        C5304ll.m26774c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m27305b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f20073a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    private static int m27306c(C5563sl slVar) {
        int a = slVar.mo20871a(5);
        return a == 31 ? slVar.mo20871a(6) + 32 : a;
    }

    /* renamed from: d */
    private static int m27307d(C5563sl slVar) {
        int a = slVar.mo20871a(4);
        if (a == 15) {
            return slVar.mo20871a(24);
        }
        C5304ll.m26774c(a < 13);
        return f20074b[a];
    }
}
