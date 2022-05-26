package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.tl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5600tl {

    /* renamed from: a */
    public byte[] f23918a;

    /* renamed from: b */
    private int f23919b;

    /* renamed from: c */
    private int f23920c;

    public C5600tl() {
    }

    public C5600tl(int i) {
        this.f23918a = new byte[i];
        this.f23920c = i;
    }

    /* renamed from: a */
    public final int mo21082a() {
        return this.f23920c - this.f23919b;
    }

    /* renamed from: b */
    public final int mo21083b() {
        byte[] bArr = this.f23918a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int mo21084c() {
        return this.f23919b;
    }

    /* renamed from: d */
    public final int mo21085d() {
        return this.f23920c;
    }

    /* renamed from: e */
    public final int mo21086e() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f23919b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f23919b = i4;
        byte b3 = bArr[i3];
        this.f23919b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int mo21087f() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        this.f23919b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int mo21088g() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        this.f23919b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo21089h() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f23919b = i3;
        byte b2 = bArr[i2];
        this.f23919b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int mo21090i() {
        int e = mo21086e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final int mo21091j() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        this.f23919b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo21092k() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f23919b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f23919b = i4;
        byte b3 = bArr[i3];
        this.f23919b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public final long mo21093l() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f23919b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f23919b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f23919b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f23919b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f23919b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f23919b = i8;
        byte b7 = bArr[i7];
        this.f23919b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final long mo21094m() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f23919b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f23919b = i4;
        byte b3 = bArr[i3];
        this.f23919b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public final long mo21095n() {
        long l = mo21093l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final String mo21096o(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = this.f23919b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f23918a, i2, (i3 >= this.f23920c || this.f23918a[i3] != 0) ? i : i - 1);
        this.f23919b += i;
        return str;
    }

    /* renamed from: p */
    public final short mo21097p() {
        byte[] bArr = this.f23918a;
        int i = this.f23919b;
        int i2 = i + 1;
        this.f23919b = i2;
        byte b = bArr[i];
        this.f23919b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void mo21098q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f23918a, this.f23919b, bArr, i, i2);
        this.f23919b += i2;
    }

    /* renamed from: r */
    public final void mo21099r() {
        this.f23919b = 0;
        this.f23920c = 0;
    }

    /* renamed from: s */
    public final void mo21100s(int i) {
        mo21101t(mo21083b() < i ? new byte[i] : this.f23918a, i);
    }

    /* renamed from: t */
    public final void mo21101t(byte[] bArr, int i) {
        this.f23918a = bArr;
        this.f23920c = i;
        this.f23919b = 0;
    }

    /* renamed from: u */
    public final void mo21102u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f23918a.length) {
            z = true;
        }
        C5304ll.m26774c(z);
        this.f23920c = i;
    }

    /* renamed from: v */
    public final void mo21103v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f23920c) {
            z = true;
        }
        C5304ll.m26774c(z);
        this.f23919b = i;
    }

    /* renamed from: w */
    public final void mo21104w(int i) {
        mo21103v(this.f23919b + i);
    }

    public C5600tl(byte[] bArr) {
        this.f23918a = bArr;
        this.f23920c = bArr.length;
    }
}
