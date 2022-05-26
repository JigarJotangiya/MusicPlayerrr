package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dy3 {

    /* renamed from: a */
    public final int f15783a;

    /* renamed from: b */
    public final int f15784b;

    /* renamed from: c */
    public final int f15785c;

    /* renamed from: d */
    public final byte[] f15786d;

    /* renamed from: e */
    private int f15787e;

    static {
        cx3 cx3 = cx3.f15361a;
    }

    public dy3(int i, int i2, int i3, byte[] bArr) {
        this.f15783a = i;
        this.f15784b = i2;
        this.f15785c = i3;
        this.f15786d = bArr;
    }

    /* renamed from: a */
    public static int m22755a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: b */
    public static int m22756b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dy3.class == obj.getClass()) {
            dy3 dy3 = (dy3) obj;
            return this.f15783a == dy3.f15783a && this.f15784b == dy3.f15784b && this.f15785c == dy3.f15785c && Arrays.equals(this.f15786d, dy3.f15786d);
        }
    }

    public final int hashCode() {
        int i = this.f15787e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f15783a + 527) * 31) + this.f15784b) * 31) + this.f15785c) * 31) + Arrays.hashCode(this.f15786d);
        this.f15787e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f15783a;
        int i2 = this.f15784b;
        int i3 = this.f15785c;
        boolean z = this.f15786d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
