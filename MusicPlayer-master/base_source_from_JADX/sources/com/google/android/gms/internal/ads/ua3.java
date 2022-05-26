package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ua3 implements Comparable<ua3> {

    /* renamed from: g */
    private final byte[] f24266g;

    /* synthetic */ ua3(byte[] bArr, ta3 ta3) {
        this.f24266g = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ua3 ua3 = (ua3) obj;
        int length = this.f24266g.length;
        int length2 = ua3.f24266g.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f24266g;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = ua3.f24266g[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ua3)) {
            return false;
        }
        return Arrays.equals(this.f24266g, ((ua3) obj).f24266g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24266g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(r2 + r2);
        for (byte b : this.f24266g) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }
}
