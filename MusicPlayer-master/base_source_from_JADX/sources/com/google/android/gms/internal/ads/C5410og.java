package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.og */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5410og {

    /* renamed from: g */
    private static final byte[] f20995g = new byte[4096];

    /* renamed from: a */
    private final C5673vk f20996a;

    /* renamed from: b */
    private final long f20997b;

    /* renamed from: c */
    private long f20998c;

    /* renamed from: d */
    private byte[] f20999d = new byte[65536];

    /* renamed from: e */
    private int f21000e;

    /* renamed from: f */
    private int f21001f;

    public C5410og(C5673vk vkVar, long j, long j2) {
        this.f20996a = vkVar;
        this.f20998c = j;
        this.f20997b = j2;
    }

    /* renamed from: j */
    private final int m28478j(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f20996a.mo15842a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m28479k(byte[] bArr, int i, int i2) {
        int i3 = this.f21001f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f20999d, 0, bArr, i, min);
        m28482n(min);
        return min;
    }

    /* renamed from: l */
    private final int m28480l(int i) {
        int min = Math.min(this.f21001f, i);
        m28482n(min);
        return min;
    }

    /* renamed from: m */
    private final void m28481m(int i) {
        if (i != -1) {
            this.f20998c += (long) i;
        }
    }

    /* renamed from: n */
    private final void m28482n(int i) {
        int i2 = this.f21001f - i;
        this.f21001f = i2;
        this.f21000e = 0;
        byte[] bArr = this.f20999d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f20999d = bArr2;
    }

    /* renamed from: a */
    public final int mo19981a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int k = m28479k(bArr, i, i2);
        if (k == 0) {
            k = m28478j(bArr, i, i2, 0, true);
        }
        m28481m(k);
        return k;
    }

    /* renamed from: b */
    public final int mo19982b(int i) throws IOException, InterruptedException {
        int l = m28480l(i);
        if (l == 0) {
            l = m28478j(f20995g, 0, Math.min(i, 4096), 0, true);
        }
        m28481m(l);
        return l;
    }

    /* renamed from: c */
    public final long mo19983c() {
        return this.f20997b;
    }

    /* renamed from: d */
    public final long mo19984d() {
        return this.f20998c;
    }

    /* renamed from: e */
    public final void mo19985e() {
        this.f21000e = 0;
    }

    /* renamed from: f */
    public final boolean mo19986f(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f21000e + i;
        int length = this.f20999d.length;
        if (i2 > length) {
            this.f20999d = Arrays.copyOf(this.f20999d, C4934bm.m21435e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f21001f - this.f21000e, i);
        while (min < i) {
            min = m28478j(this.f20999d, this.f21000e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f21000e + i;
        this.f21000e = i3;
        this.f21001f = Math.max(this.f21001f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean mo19987g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo19986f(i2, false)) {
            return false;
        }
        System.arraycopy(this.f20999d, this.f21000e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public final boolean mo19988h(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int k = m28479k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = m28478j(bArr, i, i2, k, z);
        }
        m28481m(k);
        return k != -1;
    }

    /* renamed from: i */
    public final boolean mo19989i(int i, boolean z) throws IOException, InterruptedException {
        int l = m28480l(i);
        while (l < i && l != -1) {
            l = m28478j(f20995g, -l, Math.min(i, l + 4096), l, false);
        }
        m28481m(l);
        return l != -1;
    }
}
