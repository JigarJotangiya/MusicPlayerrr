package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ul3 extends xl3 {

    /* renamed from: d */
    private final byte[] f24367d;

    /* renamed from: e */
    private final int f24368e;

    /* renamed from: f */
    private int f24369f;

    ul3(byte[] bArr, int i, int i2) {
        super((wl3) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f24367d = bArr;
            this.f24369f = 0;
            this.f24368e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo21313E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f24367d, this.f24369f, i2);
            this.f24369f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo21314F(String str) throws IOException {
        int i = this.f24369f;
        try {
            int a = xl3.m33733a(str.length() * 3);
            int a2 = xl3.m33733a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f24369f = i2;
                int d = aq3.m20916d(str, this.f24367d, i2, this.f24368e - i2);
                this.f24369f = i;
                mo21329u((d - i) - a2);
                this.f24369f = d;
                return;
            }
            mo21329u(aq3.m20917e(str));
            byte[] bArr = this.f24367d;
            int i3 = this.f24369f;
            this.f24369f = aq3.m20916d(str, bArr, i3, this.f24368e - i3);
        } catch (zp3 e) {
            this.f24369f = i;
            mo22050e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new vl3(e2);
        }
    }

    /* renamed from: g */
    public final int mo21315g() {
        return this.f24368e - this.f24369f;
    }

    /* renamed from: h */
    public final void mo21316h(byte b) throws IOException {
        try {
            byte[] bArr = this.f24367d;
            int i = this.f24369f;
            this.f24369f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo21317i(int i, boolean z) throws IOException {
        mo21329u(i << 3);
        mo21316h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo21318j(int i, kl3 kl3) throws IOException {
        mo21329u((i << 3) | 2);
        mo21329u(kl3.zzd());
        kl3.zzo(this);
    }

    /* renamed from: k */
    public final void mo21319k(int i, int i2) throws IOException {
        mo21329u((i << 3) | 5);
        mo21320l(i2);
    }

    /* renamed from: l */
    public final void mo21320l(int i) throws IOException {
        try {
            byte[] bArr = this.f24367d;
            int i2 = this.f24369f;
            int i3 = i2 + 1;
            this.f24369f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f24369f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f24369f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f24369f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo21321m(int i, long j) throws IOException {
        mo21329u((i << 3) | 1);
        mo21322n(j);
    }

    /* renamed from: n */
    public final void mo21322n(long j) throws IOException {
        try {
            byte[] bArr = this.f24367d;
            int i = this.f24369f;
            int i2 = i + 1;
            this.f24369f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f24369f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f24369f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f24369f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f24369f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f24369f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f24369f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f24369f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo21323o(int i, int i2) throws IOException {
        mo21329u(i << 3);
        mo21324p(i2);
    }

    /* renamed from: p */
    public final void mo21324p(int i) throws IOException {
        if (i >= 0) {
            mo21329u(i);
        } else {
            mo21331w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo21325q(byte[] bArr, int i, int i2) throws IOException {
        mo21313E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo21326r(int i, String str) throws IOException {
        mo21329u((i << 3) | 2);
        mo21314F(str);
    }

    /* renamed from: s */
    public final void mo21327s(int i, int i2) throws IOException {
        mo21329u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo21328t(int i, int i2) throws IOException {
        mo21329u(i << 3);
        mo21329u(i2);
    }

    /* renamed from: u */
    public final void mo21329u(int i) throws IOException {
        if (xl3.f25873c) {
            int i2 = xk3.f25869a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f24367d;
            int i3 = this.f24369f;
            this.f24369f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f24367d;
            int i4 = this.f24369f;
            this.f24369f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo21330v(int i, long j) throws IOException {
        mo21329u(i << 3);
        mo21331w(j);
    }

    /* renamed from: w */
    public final void mo21331w(long j) throws IOException {
        if (!xl3.f25873c || this.f24368e - this.f24369f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f24367d;
                int i = this.f24369f;
                this.f24369f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f24367d;
                int i2 = this.f24369f;
                this.f24369f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new vl3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f24369f), Integer.valueOf(this.f24368e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f24367d;
                int i3 = this.f24369f;
                this.f24369f = i3 + 1;
                vp3.m32657y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f24367d;
            int i4 = this.f24369f;
            this.f24369f = i4 + 1;
            vp3.m32657y(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
