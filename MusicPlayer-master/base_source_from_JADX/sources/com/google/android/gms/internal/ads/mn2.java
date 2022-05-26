package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mn2 {

    /* renamed from: a */
    public byte[] f20098a;

    /* renamed from: b */
    private int f20099b;

    /* renamed from: c */
    private int f20100c;

    /* renamed from: d */
    private int f20101d;

    public mn2() {
        this.f20098a = wy2.f25584f;
    }

    public mn2(byte[] bArr, int i) {
        this.f20098a = bArr;
        this.f20101d = i;
    }

    /* renamed from: m */
    private final void m27356m() {
        int i;
        int i2 = this.f20099b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f20101d) && !(i2 == i && this.f20100c == 0))) {
            z = false;
        }
        gs1.m24488f(z);
    }

    /* renamed from: a */
    public final int mo19467a() {
        return ((this.f20101d - this.f20099b) * 8) - this.f20100c;
    }

    /* renamed from: b */
    public final int mo19468b() {
        return (this.f20099b * 8) + this.f20100c;
    }

    /* renamed from: c */
    public final int mo19469c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f20100c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f20100c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f20100c = i4;
            byte[] bArr = this.f20098a;
            int i5 = this.f20099b;
            this.f20099b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f20098a;
        int i6 = this.f20099b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f20100c = 0;
            this.f20099b = i6 + 1;
        }
        m27356m();
        return i7;
    }

    /* renamed from: d */
    public final void mo19470d() {
        if (this.f20100c != 0) {
            this.f20100c = 0;
            this.f20099b++;
            m27356m();
        }
    }

    /* renamed from: e */
    public final void mo19471e(int i, int i2) {
        int i3 = i & 16383;
        int min = Math.min(8 - this.f20100c, 14);
        int i4 = this.f20100c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f20098a;
        int i6 = this.f20099b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f20098a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f20098a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        mo19476j(14);
        m27356m();
    }

    /* renamed from: f */
    public final void mo19472f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f20098a;
            int i5 = this.f20099b;
            int i6 = i5 + 1;
            this.f20099b = i6;
            byte b = bArr2[i5];
            int i7 = this.f20100c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i8));
            bArr[i3] = b3;
            int i9 = this.f20100c;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.f20098a;
                int i10 = this.f20099b;
                this.f20099b = i10 + 1;
                b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b3;
                i9 -= 8;
            }
            int i11 = i9 + i8;
            this.f20100c = i11;
            byte[] bArr4 = this.f20098a;
            int i12 = this.f20099b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
            if (i11 == 8) {
                this.f20100c = 0;
                this.f20099b = i12 + 1;
            }
            m27356m();
        }
    }

    /* renamed from: g */
    public final void mo19473g(byte[] bArr, int i) {
        this.f20098a = bArr;
        this.f20099b = 0;
        this.f20100c = 0;
        this.f20101d = i;
    }

    /* renamed from: h */
    public final void mo19474h(int i) {
        int i2 = i / 8;
        this.f20099b = i2;
        this.f20100c = i - (i2 * 8);
        m27356m();
    }

    /* renamed from: i */
    public final void mo19475i() {
        int i = this.f20100c + 1;
        this.f20100c = i;
        if (i == 8) {
            this.f20100c = 0;
            this.f20099b++;
        }
        m27356m();
    }

    /* renamed from: j */
    public final void mo19476j(int i) {
        int i2 = i / 8;
        int i3 = this.f20099b + i2;
        this.f20099b = i3;
        int i4 = this.f20100c + (i - (i2 * 8));
        this.f20100c = i4;
        if (i4 > 7) {
            this.f20099b = i3 + 1;
            this.f20100c = i4 - 8;
        }
        m27356m();
    }

    /* renamed from: k */
    public final void mo19477k(int i) {
        gs1.m24488f(this.f20100c == 0);
        this.f20099b += i;
        m27356m();
    }

    /* renamed from: l */
    public final boolean mo19478l() {
        boolean z = (this.f20098a[this.f20099b] & (128 >> this.f20100c)) != 0;
        mo19475i();
        return z;
    }
}
