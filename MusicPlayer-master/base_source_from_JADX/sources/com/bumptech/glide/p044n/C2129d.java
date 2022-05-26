package com.bumptech.glide.p044n;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.n.d */
/* compiled from: GifHeaderParser */
public class C2129d {

    /* renamed from: a */
    private final byte[] f7264a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f7265b;

    /* renamed from: c */
    private C2128c f7266c;

    /* renamed from: d */
    private int f7267d = 0;

    /* renamed from: b */
    private boolean m9940b() {
        return this.f7266c.f7252b != 0;
    }

    /* renamed from: d */
    private int m9941d() {
        try {
            return this.f7265b.get() & 255;
        } catch (Exception unused) {
            this.f7266c.f7252b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m9942e() {
        this.f7266c.f7254d.f7240a = m9951n();
        this.f7266c.f7254d.f7241b = m9951n();
        this.f7266c.f7254d.f7242c = m9951n();
        this.f7266c.f7254d.f7243d = m9951n();
        int d = m9941d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C2127b bVar = this.f7266c.f7254d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f7244e = z;
        if (z2) {
            bVar.f7250k = m9944g(pow);
        } else {
            bVar.f7250k = null;
        }
        this.f7266c.f7254d.f7249j = this.f7265b.position();
        m9954r();
        if (!m9940b()) {
            C2128c cVar = this.f7266c;
            cVar.f7253c++;
            cVar.f7255e.add(cVar.f7254d);
        }
    }

    /* renamed from: f */
    private void m9943f() {
        int d = m9941d();
        this.f7267d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f7267d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f7265b.get(this.f7264a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f7267d, e);
                    }
                    this.f7266c.f7252b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m9944g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f7265b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f7266c.f7252b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m9945h() {
        m9946i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m9946i(int i) {
        boolean z = false;
        while (!z && !m9940b() && this.f7266c.f7253c <= i) {
            int d = m9941d();
            if (d == 33) {
                int d2 = m9941d();
                if (d2 == 1) {
                    m9953q();
                } else if (d2 == 249) {
                    this.f7266c.f7254d = new C2127b();
                    m9947j();
                } else if (d2 == 254) {
                    m9953q();
                } else if (d2 != 255) {
                    m9953q();
                } else {
                    m9943f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f7264a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m9950m();
                    } else {
                        m9953q();
                    }
                }
            } else if (d == 44) {
                C2128c cVar = this.f7266c;
                if (cVar.f7254d == null) {
                    cVar.f7254d = new C2127b();
                }
                m9942e();
            } else if (d != 59) {
                this.f7266c.f7252b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m9947j() {
        m9941d();
        int d = m9941d();
        C2127b bVar = this.f7266c.f7254d;
        int i = (d & 28) >> 2;
        bVar.f7246g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f7246g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f7245f = z;
        int n = m9951n();
        if (n < 2) {
            n = 10;
        }
        C2127b bVar2 = this.f7266c.f7254d;
        bVar2.f7248i = n * 10;
        bVar2.f7247h = m9941d();
        m9941d();
    }

    /* renamed from: k */
    private void m9948k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m9941d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f7266c.f7252b = 1;
            return;
        }
        m9949l();
        if (this.f7266c.f7258h && !m9940b()) {
            C2128c cVar = this.f7266c;
            cVar.f7251a = m9944g(cVar.f7259i);
            C2128c cVar2 = this.f7266c;
            cVar2.f7262l = cVar2.f7251a[cVar2.f7260j];
        }
    }

    /* renamed from: l */
    private void m9949l() {
        this.f7266c.f7256f = m9951n();
        this.f7266c.f7257g = m9951n();
        int d = m9941d();
        C2128c cVar = this.f7266c;
        cVar.f7258h = (d & 128) != 0;
        cVar.f7259i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f7266c.f7260j = m9941d();
        this.f7266c.f7261k = m9941d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9950m() {
        /*
            r3 = this;
        L_0x0000:
            r3.m9943f()
            byte[] r0 = r3.f7264a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.n.c r2 = r3.f7266c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f7263m = r0
        L_0x001b:
            int r0 = r3.f7267d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m9940b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p044n.C2129d.m9950m():void");
    }

    /* renamed from: n */
    private int m9951n() {
        return this.f7265b.getShort();
    }

    /* renamed from: o */
    private void m9952o() {
        this.f7265b = null;
        Arrays.fill(this.f7264a, (byte) 0);
        this.f7266c = new C2128c();
        this.f7267d = 0;
    }

    /* renamed from: q */
    private void m9953q() {
        int d;
        do {
            d = m9941d();
            this.f7265b.position(Math.min(this.f7265b.position() + d, this.f7265b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m9954r() {
        m9941d();
        m9953q();
    }

    /* renamed from: a */
    public void mo8326a() {
        this.f7265b = null;
        this.f7266c = null;
    }

    /* renamed from: c */
    public C2128c mo8327c() {
        if (this.f7265b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m9940b()) {
            return this.f7266c;
        } else {
            m9948k();
            if (!m9940b()) {
                m9945h();
                C2128c cVar = this.f7266c;
                if (cVar.f7253c < 0) {
                    cVar.f7252b = 1;
                }
            }
            return this.f7266c;
        }
    }

    /* renamed from: p */
    public C2129d mo8328p(ByteBuffer byteBuffer) {
        m9952o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7265b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f7265b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
