package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class n34 {

    /* renamed from: a */
    private final no2 f20497a = new no2(32);

    /* renamed from: b */
    private m34 f20498b;

    /* renamed from: c */
    private m34 f20499c;

    /* renamed from: d */
    private m34 f20500d;

    /* renamed from: e */
    private long f20501e;

    /* renamed from: f */
    private final r54 f20502f;

    public n34(r54 r54, byte[] bArr) {
        this.f20502f = r54;
        m34 m34 = new m34(0, 65536);
        this.f20498b = m34;
        this.f20499c = m34;
        this.f20500d = m34;
    }

    /* renamed from: i */
    private final int m27670i(int i) {
        m34 m34 = this.f20500d;
        if (!m34.f19756c) {
            d54 b = this.f20502f.mo20588b();
            m34 m342 = new m34(this.f20500d.f19755b, 65536);
            m34.f19757d = b;
            m34.f19758e = m342;
            m34.f19756c = true;
        }
        return Math.min(i, (int) (this.f20500d.f19755b - this.f20501e));
    }

    /* renamed from: j */
    private static m34 m27671j(m34 m34, long j) {
        while (j >= m34.f19755b) {
            m34 = m34.f19758e;
        }
        return m34;
    }

    /* renamed from: k */
    private static m34 m27672k(m34 m34, long j, ByteBuffer byteBuffer, int i) {
        m34 j2 = m27671j(m34, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.f19755b - j));
            byteBuffer.put(j2.f19757d.f15514a, j2.mo19337a(j), min);
            i -= min;
            j += (long) min;
            if (j == j2.f19755b) {
                j2 = j2.f19758e;
            }
        }
        return j2;
    }

    /* renamed from: l */
    private static m34 m27673l(m34 m34, long j, byte[] bArr, int i) {
        m34 j2 = m27671j(m34, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.f19755b - j));
            System.arraycopy(j2.f19757d.f15514a, j2.mo19337a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == j2.f19755b) {
                j2 = j2.f19758e;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private static m34 m27674m(m34 m34, k31 k31, p34 p34, no2 no2) {
        m34 m342;
        int i;
        k31 k312 = k31;
        p34 p342 = p34;
        no2 no22 = no2;
        if (k31.mo18798k()) {
            long j = p342.f21326b;
            no22.mo19776c(1);
            m34 l = m27673l(m34, j, no2.mo19781h(), 1);
            long j2 = j + 1;
            byte b = no2.mo19781h()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            g01 g01 = k312.f18742b;
            byte[] bArr = g01.f16837a;
            if (bArr == null) {
                g01.f16837a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            m342 = m27673l(l, j2, g01.f16837a, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                no22.mo19776c(2);
                m342 = m27673l(m342, j3, no2.mo19781h(), 2);
                j3 += 2;
                i = no2.mo19796w();
            } else {
                i = 1;
            }
            int[] iArr = g01.f16840d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = g01.f16841e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                no22.mo19776c(i2);
                m342 = m27673l(m342, j3, no2.mo19781h(), i2);
                j3 += (long) i2;
                no22.mo19779f(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = no2.mo19796w();
                    iArr4[i3] = no2.mo19795v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = p342.f21325a - ((int) (j3 - p342.f21326b));
            }
            ca4 ca4 = p342.f21327c;
            int i4 = wy2.f25579a;
            g01.mo17792c(i, iArr2, iArr4, ca4.f14931b, g01.f16837a, ca4.f14930a, ca4.f14932c, ca4.f14933d);
            long j4 = p342.f21326b;
            int i5 = (int) (j3 - j4);
            p342.f21326b = j4 + ((long) i5);
            p342.f21325a -= i5;
        } else {
            m342 = m34;
        }
        if (k31.mo17031e()) {
            no22.mo19776c(4);
            m34 l2 = m27673l(m342, p342.f21326b, no2.mo19781h(), 4);
            int v = no2.mo19795v();
            p342.f21326b += 4;
            p342.f21325a -= 4;
            k312.mo18796i(v);
            m34 k = m27672k(l2, p342.f21326b, k312.f18743c, v);
            p342.f21326b += (long) v;
            int i6 = p342.f21325a - v;
            p342.f21325a = i6;
            ByteBuffer byteBuffer = k312.f18746f;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                k312.f18746f = ByteBuffer.allocate(i6);
            } else {
                k312.f18746f.clear();
            }
            return m27672k(k, p342.f21326b, k312.f18746f, p342.f21325a);
        }
        k312.mo18796i(p342.f21325a);
        return m27672k(m342, p342.f21326b, k312.f18743c, p342.f21325a);
    }

    /* renamed from: n */
    private final void m27675n(int i) {
        long j = this.f20501e + ((long) i);
        this.f20501e = j;
        m34 m34 = this.f20500d;
        if (j == m34.f19755b) {
            this.f20500d = m34.f19758e;
        }
    }

    /* renamed from: a */
    public final int mo19603a(o91 o91, int i, boolean z) throws IOException {
        int i2 = m27670i(i);
        m34 m34 = this.f20500d;
        int c = o91.mo15695c(m34.f19757d.f15514a, m34.mo19337a(this.f20501e), i2);
        if (c != -1) {
            m27675n(c);
            return c;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long mo19604b() {
        return this.f20501e;
    }

    /* renamed from: c */
    public final void mo19605c(long j) {
        m34 m34;
        if (j != -1) {
            while (true) {
                m34 = this.f20498b;
                if (j < m34.f19755b) {
                    break;
                }
                this.f20502f.mo20589c(m34.f19757d);
                this.f20498b = this.f20498b.mo19338b();
            }
            if (this.f20499c.f19754a < m34.f19754a) {
                this.f20499c = m34;
            }
        }
    }

    /* renamed from: d */
    public final void mo19606d(k31 k31, p34 p34) {
        m27674m(this.f20499c, k31, p34, this.f20497a);
    }

    /* renamed from: e */
    public final void mo19607e(k31 k31, p34 p34) {
        this.f20499c = m27674m(this.f20499c, k31, p34, this.f20497a);
    }

    /* renamed from: f */
    public final void mo19608f() {
        m34 m34 = this.f20498b;
        if (m34.f19756c) {
            m34 m342 = this.f20500d;
            int i = (m342.f19756c ? 1 : 0) + (((int) (m342.f19754a - m34.f19754a)) / 65536);
            d54[] d54Arr = new d54[i];
            for (int i2 = 0; i2 < i; i2++) {
                d54Arr[i2] = m34.f19757d;
                m34 = m34.mo19338b();
            }
            this.f20502f.mo20590d(d54Arr);
        }
        m34 m343 = new m34(0, 65536);
        this.f20498b = m343;
        this.f20499c = m343;
        this.f20500d = m343;
        this.f20501e = 0;
        this.f20502f.mo20593g();
    }

    /* renamed from: g */
    public final void mo19609g() {
        this.f20499c = this.f20498b;
    }

    /* renamed from: h */
    public final void mo19610h(no2 no2, int i) {
        while (i > 0) {
            int i2 = m27670i(i);
            m34 m34 = this.f20500d;
            no2.mo19775b(m34.f19757d.f15514a, m34.mo19337a(this.f20501e), i2);
            i -= i2;
            m27675n(i2);
        }
    }
}
