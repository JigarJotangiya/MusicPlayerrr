package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jl3 extends OutputStream {

    /* renamed from: l */
    private static final byte[] f18520l = new byte[0];

    /* renamed from: g */
    private final int f18521g = 128;

    /* renamed from: h */
    private final ArrayList<kl3> f18522h = new ArrayList<>();

    /* renamed from: i */
    private int f18523i;

    /* renamed from: j */
    private byte[] f18524j = new byte[128];

    /* renamed from: k */
    private int f18525k;

    jl3(int i) {
    }

    /* renamed from: p */
    private final void m25770p(int i) {
        this.f18522h.add(new il3(this.f18524j));
        int length = this.f18523i + this.f18524j.length;
        this.f18523i = length;
        this.f18524j = new byte[Math.max(this.f18521g, Math.max(i, length >>> 1))];
        this.f18525k = 0;
    }

    /* renamed from: c */
    public final synchronized int mo18662c() {
        return this.f18523i + this.f18525k;
    }

    /* renamed from: d */
    public final synchronized kl3 mo18663d() {
        int i = this.f18525k;
        byte[] bArr = this.f18524j;
        int length = bArr.length;
        if (i >= length) {
            this.f18522h.add(new il3(bArr));
            this.f18524j = f18520l;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.f18522h.add(new il3(bArr2));
        }
        this.f18523i += this.f18525k;
        this.f18525k = 0;
        return kl3.zzu(this.f18522h);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo18662c())});
    }

    public final synchronized void write(int i) {
        if (this.f18525k == this.f18524j.length) {
            m25770p(1);
        }
        byte[] bArr = this.f18524j;
        int i2 = this.f18525k;
        this.f18525k = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f18524j;
        int length = bArr2.length;
        int i3 = this.f18525k;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f18525k += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m25770p(i5);
        System.arraycopy(bArr, i + i4, this.f18524j, 0, i5);
        this.f18525k = i5;
    }
}
