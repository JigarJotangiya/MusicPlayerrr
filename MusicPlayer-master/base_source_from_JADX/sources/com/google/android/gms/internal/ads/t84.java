package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t84 implements z84 {

    /* renamed from: a */
    private final byte[] f23788a = new byte[4096];

    /* renamed from: b */
    private final o91 f23789b;

    /* renamed from: c */
    private final long f23790c;

    /* renamed from: d */
    private long f23791d;

    /* renamed from: e */
    private byte[] f23792e = new byte[65536];

    /* renamed from: f */
    private int f23793f;

    /* renamed from: g */
    private int f23794g;

    public t84(o91 o91, long j, long j2) {
        this.f23789b = o91;
        this.f23791d = j;
        this.f23790c = j2;
    }

    /* renamed from: p */
    private final int m31127p(byte[] bArr, int i, int i2) {
        int i3 = this.f23794g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f23792e, 0, bArr, i, min);
        m31132u(min);
        return min;
    }

    /* renamed from: q */
    private final int m31128q(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int c = this.f23789b.mo15695c(bArr, i + i3, i2 - i3);
            if (c != -1) {
                return i3 + c;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: r */
    private final int m31129r(int i) {
        int min = Math.min(this.f23794g, i);
        m31132u(min);
        return min;
    }

    /* renamed from: s */
    private final void m31130s(int i) {
        if (i != -1) {
            this.f23791d += (long) i;
        }
    }

    /* renamed from: t */
    private final void m31131t(int i) {
        int i2 = this.f23793f + i;
        int length = this.f23792e.length;
        if (i2 > length) {
            this.f23792e = Arrays.copyOf(this.f23792e, wy2.m33417L(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: u */
    private final void m31132u(int i) {
        int i2 = this.f23794g - i;
        this.f23794g = i2;
        this.f23793f = 0;
        byte[] bArr = this.f23792e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f23792e = bArr2;
    }

    /* renamed from: A */
    public final int mo19924A(int i) throws IOException {
        int r = m31129r(1);
        if (r == 0) {
            r = m31128q(this.f23788a, 0, Math.min(1, 4096), 0, true);
        }
        m31130s(r);
        return r;
    }

    /* renamed from: a */
    public final int mo19925a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m31131t(i2);
        int i4 = this.f23794g;
        int i5 = this.f23793f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m31128q(this.f23792e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f23794g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f23792e, this.f23793f, bArr, i, i3);
        this.f23793f += i3;
        return i3;
    }

    /* renamed from: b */
    public final long mo16584b() {
        return this.f23790c;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        int p = m31127p(bArr, i, i2);
        if (p == 0) {
            p = m31128q(bArr, i, i2, 0, true);
        }
        m31130s(p);
        return p;
    }

    /* renamed from: d */
    public final void mo19926d(int i) throws IOException {
        mo21042o(i, false);
    }

    /* renamed from: e */
    public final boolean mo19927e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int p = m31127p(bArr, i, i2);
        while (p < i2 && p != -1) {
            p = m31128q(bArr, i, i2, p, z);
        }
        m31130s(p);
        return p != -1;
    }

    /* renamed from: f */
    public final long mo16585f() {
        return this.f23791d + ((long) this.f23793f);
    }

    /* renamed from: h */
    public final void mo19928h() {
        this.f23793f = 0;
    }

    /* renamed from: i */
    public final boolean mo19929i(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo21041n(i2, z)) {
            return false;
        }
        System.arraycopy(this.f23792e, this.f23793f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: j */
    public final void mo19930j(byte[] bArr, int i, int i2) throws IOException {
        mo19927e(bArr, i, i2, false);
    }

    /* renamed from: k */
    public final void mo19931k(byte[] bArr, int i, int i2) throws IOException {
        mo19929i(bArr, i, i2, false);
    }

    /* renamed from: n */
    public final boolean mo21041n(int i, boolean z) throws IOException {
        m31131t(i);
        int i2 = this.f23794g - this.f23793f;
        while (i2 < i) {
            i2 = m31128q(this.f23792e, this.f23793f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f23794g = this.f23793f + i2;
        }
        this.f23793f += i;
        return true;
    }

    /* renamed from: o */
    public final boolean mo21042o(int i, boolean z) throws IOException {
        int r = m31129r(i);
        while (r < i && r != -1) {
            r = m31128q(this.f23788a, -r, Math.min(i, r + 4096), r, false);
        }
        m31130s(r);
        return r != -1;
    }

    /* renamed from: z */
    public final void mo19932z(int i) throws IOException {
        mo21041n(i, false);
    }

    public final long zze() {
        return this.f23791d;
    }
}
