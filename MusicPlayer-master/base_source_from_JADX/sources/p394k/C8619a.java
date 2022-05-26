package p394k;

import java.util.Arrays;
import p369i.p387z.p389d.C8594l;
import p394k.C8638h;

/* renamed from: k.a */
/* compiled from: -Base64.kt */
public final class C8619a {

    /* renamed from: a */
    private static final byte[] f34952a;

    /* renamed from: b */
    private static final byte[] f34953b;

    static {
        C8638h.C8639a aVar = C8638h.Companion;
        f34952a = aVar.mo30804d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f34953b = aVar.mo30804d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    /* renamed from: a */
    public static final byte[] m46806a(String str) {
        int i;
        C8594l.m46771e(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ('A' <= charAt && 'Z' >= charAt) {
                i = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i9 == 3) {
            int i10 = i4 << 6;
            int i11 = i5 + 1;
            bArr[i5] = (byte) (i10 >> 16);
            i5 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: b */
    public static final String m46807b(byte[] bArr, byte[] bArr2) {
        C8594l.m46771e(bArr, "$this$encodeBase64");
        C8594l.m46771e(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i13] = bArr2[(b7 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return C8621b.m46812b(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m46808c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f34952a;
        }
        return m46807b(bArr, bArr2);
    }

    /* renamed from: d */
    public static final byte[] m46809d() {
        return f34953b;
    }
}
