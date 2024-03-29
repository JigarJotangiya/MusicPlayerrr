package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ju1 {

    /* renamed from: a */
    private static final byte[] f18640a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f18641b = {BuildConfig.FLAVOR, "A", "B", "C"};

    /* renamed from: c */
    public static final /* synthetic */ int f18642c = 0;

    /* renamed from: a */
    public static String m25964a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static String m25965b(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f18641b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(wy2.m33438d("hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i7])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static byte[] m25966c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f18640a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
