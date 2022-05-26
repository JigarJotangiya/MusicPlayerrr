package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.m2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6387m2 {

    /* renamed from: a */
    private byte[] f29573a = new byte[4096];

    /* renamed from: b */
    private int f29574b;

    /* renamed from: c */
    private long f29575c;

    /* renamed from: d */
    private long f29576d;

    /* renamed from: e */
    private int f29577e;

    /* renamed from: f */
    private int f29578f;

    /* renamed from: g */
    private int f29579g;

    /* renamed from: h */
    private boolean f29580h;

    /* renamed from: i */
    private String f29581i;

    public C6387m2() {
        mo25333d();
    }

    /* renamed from: e */
    private final int m37736e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f29574b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f29573a, this.f29574b, min);
        int i5 = this.f29574b + min;
        this.f29574b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: a */
    public final int mo25330a() {
        return this.f29578f;
    }

    /* renamed from: b */
    public final int mo25331b(byte[] bArr, int i, int i2) {
        int e = m37736e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f29575c == -1) {
            long b = C6400p0.m37766b(this.f29573a, 0);
            this.f29575c = b;
            if (b == 67324752) {
                this.f29580h = false;
                this.f29576d = C6400p0.m37766b(this.f29573a, 18);
                this.f29579g = C6400p0.m37765a(this.f29573a, 8);
                this.f29577e = C6400p0.m37765a(this.f29573a, 26);
                int a = this.f29577e + 30 + C6400p0.m37765a(this.f29573a, 28);
                this.f29578f = a;
                int length = this.f29573a.length;
                if (length < a) {
                    do {
                        length += length;
                    } while (length < a);
                    this.f29573a = Arrays.copyOf(this.f29573a, length);
                }
            } else {
                this.f29580h = true;
            }
        }
        int e2 = m37736e(this.f29578f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f29580h && this.f29581i == null) {
            this.f29581i = new String(this.f29573a, 30, this.f29577e);
        }
        return i3;
    }

    /* renamed from: c */
    public final C6393n3 mo25332c() {
        int i = this.f29574b;
        int i2 = this.f29578f;
        if (i < i2) {
            return new C6395o0(this.f29581i, this.f29576d, this.f29579g, true, this.f29580h, Arrays.copyOf(this.f29573a, i));
        }
        C6395o0 o0Var = new C6395o0(this.f29581i, this.f29576d, this.f29579g, false, this.f29580h, Arrays.copyOf(this.f29573a, i2));
        mo25333d();
        return o0Var;
    }

    /* renamed from: d */
    public final void mo25333d() {
        this.f29574b = 0;
        this.f29577e = -1;
        this.f29575c = -1;
        this.f29580h = false;
        this.f29578f = 30;
        this.f29576d = -1;
        this.f29579g = -1;
        this.f29581i = null;
    }
}
