package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ea4 {

    /* renamed from: a */
    private final byte[] f15907a;

    /* renamed from: b */
    private final int f15908b;

    /* renamed from: c */
    private int f15909c;

    /* renamed from: d */
    private int f15910d;

    public ea4(byte[] bArr) {
        this.f15907a = bArr;
        this.f15908b = bArr.length;
    }

    /* renamed from: a */
    public final int mo17148a() {
        return (this.f15909c * 8) + this.f15910d;
    }

    /* renamed from: b */
    public final int mo17149b(int i) {
        int i2 = this.f15909c;
        int min = Math.min(i, 8 - this.f15910d);
        int i3 = i2 + 1;
        int i4 = ((this.f15907a[i2] & 255) >> this.f15910d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f15907a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo17150c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo17150c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f15909c + i3;
        this.f15909c = i4;
        int i5 = this.f15910d + (i - (i3 * 8));
        this.f15910d = i5;
        if (i5 > 7) {
            i4++;
            this.f15909c = i4;
            i5 -= 8;
            this.f15910d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f15908b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        gs1.m24488f(z);
    }

    /* renamed from: d */
    public final boolean mo17151d() {
        byte b = this.f15907a[this.f15909c];
        int i = this.f15910d;
        mo17150c(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }
}
