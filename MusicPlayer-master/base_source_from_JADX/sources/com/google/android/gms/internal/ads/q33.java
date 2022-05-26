package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class q33 {
    /* renamed from: a */
    static int m29342a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    static int m29343b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int b = y33.m34010b(obj);
        int i4 = b & i;
        int c = m29344c(obj3, i4);
        if (c != 0) {
            int i5 = ~i;
            int i6 = b & i5;
            int i7 = -1;
            while (true) {
                i2 = c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !q13.m29306a(obj, objArr[i2]) || (objArr2 != null && !q13.m29306a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    int i9 = i8;
                    i7 = i2;
                    c = i9;
                }
            }
            int i10 = i3 & i;
            if (i7 == -1) {
                m29346e(obj3, i4, i10);
            } else {
                iArr[i7] = (i10 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    static int m29344c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    static Object m29345d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    /* renamed from: e */
    static void m29346e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
