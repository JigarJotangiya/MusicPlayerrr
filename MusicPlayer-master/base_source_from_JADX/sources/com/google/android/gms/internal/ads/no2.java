package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class no2 {

    /* renamed from: a */
    private byte[] f20677a;

    /* renamed from: b */
    private int f20678b;

    /* renamed from: c */
    private int f20679c;

    public no2() {
        this.f20677a = wy2.f25584f;
    }

    public no2(byte[] bArr, int i) {
        this.f20677a = bArr;
        this.f20679c = i;
    }

    /* renamed from: A */
    public final long mo19766A() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        this.f20678b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public final long mo19767B() {
        long z = mo19799z();
        if (z >= 0) {
            return z;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(z);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    public final long mo19768C() {
        int i;
        int i2;
        long j = (long) this.f20677a[this.f20678b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f20677a[this.f20678b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f20678b += i;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: D */
    public final String mo19769D(char c) {
        int i = this.f20679c;
        int i2 = this.f20678b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f20679c && this.f20677a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f20677a;
        int i3 = this.f20678b;
        String e = wy2.m33440e(bArr, i3, i2 - i3);
        this.f20678b = i2;
        if (i2 < this.f20679c) {
            this.f20678b = i2 + 1;
        }
        return e;
    }

    /* renamed from: E */
    public final String mo19770E(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = this.f20678b;
        int i3 = (i2 + i) - 1;
        String e = wy2.m33440e(this.f20677a, i2, (i3 >= this.f20679c || this.f20677a[i3] != 0) ? i : i - 1);
        this.f20678b += i;
        return e;
    }

    /* renamed from: F */
    public final String mo19771F(int i, Charset charset) {
        String str = new String(this.f20677a, this.f20678b, i, charset);
        this.f20678b += i;
        return str;
    }

    /* renamed from: G */
    public final short mo19772G() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        this.f20678b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void mo19773H(int i) {
        byte[] bArr = this.f20677a;
        if (i > bArr.length) {
            this.f20677a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void mo19774a(mn2 mn2, int i) {
        mo19775b(mn2.f20098a, 0, i);
        mn2.mo19474h(0);
    }

    /* renamed from: b */
    public final void mo19775b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f20677a, this.f20678b, bArr, i, i2);
        this.f20678b += i2;
    }

    /* renamed from: c */
    public final void mo19776c(int i) {
        byte[] bArr = this.f20677a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo19777d(bArr, i);
    }

    /* renamed from: d */
    public final void mo19777d(byte[] bArr, int i) {
        this.f20677a = bArr;
        this.f20679c = i;
        this.f20678b = 0;
    }

    /* renamed from: e */
    public final void mo19778e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20677a.length) {
            z = true;
        }
        gs1.m24486d(z);
        this.f20679c = i;
    }

    /* renamed from: f */
    public final void mo19779f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20679c) {
            z = true;
        }
        gs1.m24486d(z);
        this.f20678b = i;
    }

    /* renamed from: g */
    public final void mo19780g(int i) {
        mo19779f(this.f20678b + i);
    }

    /* renamed from: h */
    public final byte[] mo19781h() {
        return this.f20677a;
    }

    /* renamed from: i */
    public final int mo19782i() {
        return this.f20679c - this.f20678b;
    }

    /* renamed from: j */
    public final int mo19783j() {
        return this.f20677a.length;
    }

    /* renamed from: k */
    public final int mo19784k() {
        return this.f20678b;
    }

    /* renamed from: l */
    public final int mo19785l() {
        return this.f20679c;
    }

    /* renamed from: m */
    public final int mo19786m() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        this.f20678b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo19787n() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        this.f20678b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int mo19788o() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        this.f20678b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int mo19789p() {
        int o = mo19788o();
        if (o >= 0) {
            return o;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public final int mo19790q() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        this.f20678b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int mo19791r() {
        return (mo19792s() << 21) | (mo19792s() << 14) | (mo19792s() << 7) | mo19792s();
    }

    /* renamed from: s */
    public final int mo19792s() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        this.f20678b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int mo19793t() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        this.f20678b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int mo19794u() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        this.f20678b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int mo19795v() {
        int m = mo19786m();
        if (m >= 0) {
            return m;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public final int mo19796w() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        this.f20678b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long mo19797x() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20678b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20678b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20678b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20678b = i8;
        byte b7 = bArr[i7];
        this.f20678b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: y */
    public final long mo19798y() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        this.f20678b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: z */
    public final long mo19799z() {
        byte[] bArr = this.f20677a;
        int i = this.f20678b;
        int i2 = i + 1;
        this.f20678b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f20678b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f20678b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f20678b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f20678b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f20678b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f20678b = i8;
        byte b7 = bArr[i7];
        this.f20678b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public no2(int i) {
        this.f20677a = new byte[i];
        this.f20679c = i;
    }

    public no2(byte[] bArr) {
        this.f20677a = bArr;
        this.f20679c = bArr.length;
    }
}
