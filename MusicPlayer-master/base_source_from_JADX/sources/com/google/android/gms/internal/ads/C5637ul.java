package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ul */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5637ul {

    /* renamed from: a */
    private final byte[] f24358a;

    /* renamed from: b */
    private final int f24359b;

    /* renamed from: c */
    private int f24360c;

    /* renamed from: d */
    private int f24361d = 0;

    public C5637ul(byte[] bArr, int i, int i2) {
        this.f24358a = bArr;
        this.f24360c = i;
        this.f24359b = i2;
        m31849g();
    }

    /* renamed from: f */
    private final int m31848f() {
        int i = 0;
        int i2 = 0;
        while (!mo21306e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo21302a(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private final void m31849g() {
        int i;
        int i2;
        int i3 = this.f24360c;
        boolean z = true;
        if (i3 < 0 || (i = this.f24361d) < 0 || i >= 8 || (i3 >= (i2 = this.f24359b) && !(i3 == i2 && i == 0))) {
            z = false;
        }
        C5304ll.m26776e(z);
    }

    /* renamed from: h */
    private final boolean m31850h(int i) {
        if (i < 2 || i >= this.f24359b) {
            return false;
        }
        byte[] bArr = this.f24358a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo21302a(int i) {
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4 = i >> 3;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (m31850h(this.f24360c + 1)) {
                i3 = this.f24360c + 2;
            } else {
                i3 = this.f24360c + 1;
            }
            int i6 = this.f24361d;
            if (i6 != 0) {
                byte[] bArr = this.f24358a;
                b2 = ((bArr[i3] & 255) >>> (8 - i6)) | ((bArr[this.f24360c] & 255) << i6);
            } else {
                b2 = this.f24358a[this.f24360c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f24360c = i3;
        }
        if (i > 0) {
            int i7 = this.f24361d + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (m31850h(this.f24360c + 1)) {
                i2 = this.f24360c + 2;
            } else {
                i2 = this.f24360c + 1;
            }
            if (i7 > 8) {
                byte[] bArr2 = this.f24358a;
                b = (b4 & (((255 & bArr2[i2]) >> (16 - i7)) | ((bArr2[this.f24360c] & 255) << (i7 - 8)))) | b3;
                this.f24360c = i2;
            } else {
                b = (b4 & ((255 & this.f24358a[this.f24360c]) >> (8 - i7))) | b3;
                if (i7 == 8) {
                    this.f24360c = i2;
                }
            }
            b3 = b;
            this.f24361d = i7 % 8;
        }
        m31849g();
        return b3;
    }

    /* renamed from: b */
    public final int mo21303b() {
        int f = m31848f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: c */
    public final int mo21304c() {
        return m31848f();
    }

    /* renamed from: d */
    public final void mo21305d(int i) {
        int i2 = this.f24360c;
        int i3 = (i >> 3) + i2;
        this.f24360c = i3;
        int i4 = this.f24361d + (i & 7);
        this.f24361d = i4;
        if (i4 > 7) {
            this.f24360c = i3 + 1;
            this.f24361d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f24360c) {
                m31849g();
                return;
            } else if (m31850h(i2)) {
                this.f24360c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo21306e() {
        return mo21302a(1) == 1;
    }
}
