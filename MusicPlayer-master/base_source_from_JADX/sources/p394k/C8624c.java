package p394k;

import p369i.p387z.p389d.C8594l;
import p394k.p395c0.C8626b;

/* renamed from: k.c */
/* compiled from: -Util.kt */
public final class C8624c {
    /* renamed from: a */
    public static final boolean m46823a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C8594l.m46771e(bArr, "a");
        C8594l.m46771e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m46824b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m46825c(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static final short m46826d(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: e */
    public static final String m46827e(byte b) {
        return new String(new char[]{C8626b.m46838f()[(b >> 4) & 15], C8626b.m46838f()[b & 15]});
    }
}
