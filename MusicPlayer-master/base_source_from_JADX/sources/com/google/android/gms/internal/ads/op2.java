package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class op2 {

    /* renamed from: a */
    private byte[] f21112a;

    /* renamed from: b */
    private int f21113b;

    /* renamed from: c */
    private int f21114c;

    /* renamed from: d */
    private int f21115d = 0;

    public op2(byte[] bArr, int i, int i2) {
        this.f21112a = bArr;
        this.f21114c = i;
        this.f21113b = i2;
        m28641h();
    }

    /* renamed from: g */
    private final int m28640g() {
        int i = 0;
        int i2 = 0;
        while (!mo20073f()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo20068a(i2);
        }
        return i3 + i;
    }

    /* renamed from: h */
    private final void m28641h() {
        int i;
        int i2 = this.f21114c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f21113b) && !(i2 == i && this.f21115d == 0))) {
            z = false;
        }
        gs1.m24488f(z);
    }

    /* renamed from: i */
    private final boolean m28642i(int i) {
        if (i < 2 || i >= this.f21113b) {
            return false;
        }
        byte[] bArr = this.f21112a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo20068a(int i) {
        int i2;
        int i3;
        this.f21115d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f21115d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f21115d = i5;
            byte[] bArr = this.f21112a;
            int i6 = this.f21114c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m28642i(i6 + 1)) {
                i3 = 1;
            }
            this.f21114c = i6 + i3;
        }
        byte[] bArr2 = this.f21112a;
        int i7 = this.f21114c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f21115d = 0;
            if (true != m28642i(i7 + 1)) {
                i3 = 1;
            }
            this.f21114c = i7 + i3;
        }
        m28641h();
        return i8;
    }

    /* renamed from: b */
    public final int mo20069b() {
        int g = m28640g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    /* renamed from: c */
    public final int mo20070c() {
        return m28640g();
    }

    /* renamed from: d */
    public final void mo20071d() {
        int i = 1;
        int i2 = this.f21115d + 1;
        this.f21115d = i2;
        if (i2 == 8) {
            this.f21115d = 0;
            int i3 = this.f21114c;
            if (true == m28642i(i3 + 1)) {
                i = 2;
            }
            this.f21114c = i3 + i;
        }
        m28641h();
    }

    /* renamed from: e */
    public final void mo20072e(int i) {
        int i2 = this.f21114c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f21114c = i4;
        int i5 = this.f21115d + (i - (i3 * 8));
        this.f21115d = i5;
        if (i5 > 7) {
            this.f21114c = i4 + 1;
            this.f21115d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f21114c) {
                m28641h();
                return;
            } else if (m28642i(i2)) {
                this.f21114c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo20073f() {
        boolean z = (this.f21112a[this.f21114c] & (128 >> this.f21115d)) != 0;
        mo20071d();
        return z;
    }
}
