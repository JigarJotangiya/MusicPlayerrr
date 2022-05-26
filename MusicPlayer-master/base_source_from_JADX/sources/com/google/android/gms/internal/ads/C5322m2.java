package com.google.android.gms.internal.ads;

import android.util.Log;
import com.un4seen.bass.BASS;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5322m2 implements C5470q2 {

    /* renamed from: v */
    private static final byte[] f19706v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f19707a;

    /* renamed from: b */
    private final mn2 f19708b = new mn2(new byte[7], 7);

    /* renamed from: c */
    private final no2 f19709c = new no2(Arrays.copyOf(f19706v, 10));

    /* renamed from: d */
    private final String f19710d;

    /* renamed from: e */
    private String f19711e;

    /* renamed from: f */
    private da4 f19712f;

    /* renamed from: g */
    private da4 f19713g;

    /* renamed from: h */
    private int f19714h;

    /* renamed from: i */
    private int f19715i;

    /* renamed from: j */
    private int f19716j;

    /* renamed from: k */
    private boolean f19717k;

    /* renamed from: l */
    private boolean f19718l;

    /* renamed from: m */
    private int f19719m;

    /* renamed from: n */
    private int f19720n;

    /* renamed from: o */
    private int f19721o;

    /* renamed from: p */
    private boolean f19722p;

    /* renamed from: q */
    private long f19723q;

    /* renamed from: r */
    private int f19724r;

    /* renamed from: s */
    private long f19725s;

    /* renamed from: t */
    private da4 f19726t;

    /* renamed from: u */
    private long f19727u;

    public C5322m2(boolean z, String str) {
        m27085g();
        this.f19719m = -1;
        this.f19720n = -1;
        this.f19723q = -9223372036854775807L;
        this.f19725s = -9223372036854775807L;
        this.f19707a = z;
        this.f19710d = str;
    }

    /* renamed from: e */
    public static boolean m27083e(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: f */
    private final void m27084f() {
        this.f19718l = false;
        m27085g();
    }

    /* renamed from: g */
    private final void m27085g() {
        this.f19714h = 0;
        this.f19715i = 0;
        this.f19716j = 256;
    }

    /* renamed from: h */
    private final void m27086h() {
        this.f19714h = 3;
        this.f19715i = 0;
    }

    /* renamed from: i */
    private final void m27087i(da4 da4, long j, int i, int i2) {
        this.f19714h = 4;
        this.f19715i = i;
        this.f19726t = da4;
        this.f19727u = j;
        this.f19724r = i2;
    }

    /* renamed from: j */
    private final boolean m27088j(no2 no2, byte[] bArr, int i) {
        int min = Math.min(no2.mo19782i(), i - this.f19715i);
        no2.mo19775b(bArr, this.f19715i, min);
        int i2 = this.f19715i + min;
        this.f19715i = i2;
        return i2 == i;
    }

    /* renamed from: k */
    private static final boolean m27089k(byte b, byte b2) {
        return m27083e((b2 & 255) | 65280);
    }

    /* renamed from: l */
    private static final boolean m27090l(no2 no2, byte[] bArr, int i) {
        if (no2.mo19782i() < i) {
            return false;
        }
        no2.mo19775b(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public final void mo15668a(no2 no2) throws C5464px {
        int i;
        byte b;
        int i2;
        no2 no22 = no2;
        Objects.requireNonNull(this.f19712f);
        int i3 = wy2.f25579a;
        while (no2.mo19782i() > 0) {
            int i4 = this.f19714h;
            int i5 = 13;
            int i6 = 2;
            if (i4 == 0) {
                byte[] h = no2.mo19781h();
                int k = no2.mo19784k();
                int l = no2.mo19785l();
                while (true) {
                    if (k >= l) {
                        no22.mo19779f(k);
                        break;
                    }
                    i = k + 1;
                    b = h[k] & 255;
                    if (this.f19716j == 512 && m27089k((byte) -1, (byte) b)) {
                        if (this.f19718l) {
                            break;
                        }
                        int i7 = i - 2;
                        no22.mo19779f(i7 + 1);
                        if (m27090l(no22, this.f19708b.f20098a, 1)) {
                            this.f19708b.mo19474h(4);
                            int c = this.f19708b.mo19469c(1);
                            int i8 = this.f19719m;
                            if (i8 == -1 || c == i8) {
                                if (this.f19720n != -1) {
                                    if (!m27090l(no22, this.f19708b.f20098a, 1)) {
                                        break;
                                    }
                                    this.f19708b.mo19474h(i6);
                                    if (this.f19708b.mo19469c(4) == this.f19720n) {
                                        no22.mo19779f(i7 + 2);
                                    }
                                }
                                if (!m27090l(no22, this.f19708b.f20098a, 4)) {
                                    break;
                                }
                                this.f19708b.mo19474h(14);
                                int c2 = this.f19708b.mo19469c(i5);
                                if (c2 >= 7) {
                                    byte[] h2 = no2.mo19781h();
                                    int l2 = no2.mo19785l();
                                    int i9 = i7 + c2;
                                    if (i9 >= l2) {
                                        break;
                                    }
                                    if ((r8 = h2[i9]) != -1) {
                                    }
                                }
                            }
                        }
                    }
                    int i10 = this.f19716j;
                    byte b2 = i10 | b;
                    if (b2 == 329) {
                        i2 = BASS.BASS_ATTRIB_MUSIC_VOL_INST;
                    } else if (b2 == 511) {
                        i2 = 512;
                    } else if (b2 != 836) {
                        if (b2 == 1075) {
                            this.f19714h = 2;
                            this.f19715i = 3;
                            this.f19724r = 0;
                            this.f19709c.mo19779f(0);
                            no22.mo19779f(i);
                            break;
                        } else if (i10 != 256) {
                            this.f19716j = 256;
                            k = i - 1;
                            i5 = 13;
                            i6 = 2;
                        } else {
                            k = i;
                            i5 = 13;
                            i6 = 2;
                        }
                    } else {
                        i2 = 1024;
                    }
                    this.f19716j = i2;
                    k = i;
                    i5 = 13;
                    i6 = 2;
                }
                this.f19721o = (b & 8) >> 3;
                this.f19717k = 1 == ((b & 1) ^ 1);
                if (!this.f19718l) {
                    this.f19714h = 1;
                    this.f19715i = 0;
                } else {
                    m27086h();
                }
                no22.mo19779f(i);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(no2.mo19782i(), this.f19724r - this.f19715i);
                        this.f19726t.mo16888d(no22, min);
                        int i11 = this.f19715i + min;
                        this.f19715i = i11;
                        int i12 = this.f19724r;
                        if (i11 == i12) {
                            long j = this.f19725s;
                            if (j != -9223372036854775807L) {
                                this.f19726t.mo16889e(j, 1, i12, 0, (ca4) null);
                                this.f19725s += this.f19727u;
                            }
                            m27085g();
                        }
                    } else {
                        if (m27088j(no22, this.f19708b.f20098a, true != this.f19717k ? 5 : 7)) {
                            this.f19708b.mo19474h(0);
                            if (!this.f19722p) {
                                int c3 = this.f19708b.mo19469c(2) + 1;
                                if (c3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f19708b.mo19476j(5);
                                int c4 = this.f19708b.mo19469c(3);
                                int i13 = this.f19720n;
                                int i14 = a84.f13823c;
                                byte[] bArr = {(byte) (((i13 >> 1) & 7) | 16), (byte) (((c4 << 3) & 120) | ((i13 << 7) & 128))};
                                z74 a = a84.m20625a(bArr);
                                jb4 jb4 = new jb4();
                                jb4.mo18587h(this.f19711e);
                                jb4.mo18599s("audio/mp4a-latm");
                                jb4.mo18584f0(a.f26704c);
                                jb4.mo18582e0(a.f26703b);
                                jb4.mo18600t(a.f26702a);
                                jb4.mo18589i(Collections.singletonList(bArr));
                                jb4.mo18591k(this.f19710d);
                                C5689w y = jb4.mo18605y();
                                this.f19723q = 1024000000 / ((long) y.f25147z);
                                this.f19712f.mo16885a(y);
                                this.f19722p = true;
                            } else {
                                this.f19708b.mo19476j(10);
                            }
                            this.f19708b.mo19476j(4);
                            int c5 = this.f19708b.mo19469c(13) - 7;
                            if (this.f19717k) {
                                c5 -= 2;
                            }
                            m27087i(this.f19712f, this.f19723q, 0, c5);
                        }
                    }
                } else if (m27088j(no22, this.f19709c.mo19781h(), 10)) {
                    this.f19713g.mo16888d(this.f19709c, 10);
                    this.f19709c.mo19779f(6);
                    m27087i(this.f19713g, 0, 10, 10 + this.f19709c.mo19791r());
                }
            } else if (no2.mo19782i() != 0) {
                this.f19708b.f20098a[0] = no2.mo19781h()[no2.mo19784k()];
                this.f19708b.mo19474h(2);
                int c6 = this.f19708b.mo19469c(4);
                int i15 = this.f19720n;
                if (i15 == -1 || c6 == i15) {
                    if (!this.f19718l) {
                        this.f19718l = true;
                        this.f19719m = this.f19721o;
                        this.f19720n = c6;
                    }
                    m27086h();
                } else {
                    m27084f();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f19711e = c4Var.mo16482b();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 1);
        this.f19712f = s;
        this.f19726t = s;
        if (this.f19707a) {
            c4Var.mo16483c();
            da4 s2 = b94.mo15724s(c4Var.mo16481a(), 5);
            this.f19713g = s2;
            jb4 jb4 = new jb4();
            jb4.mo18587h(c4Var.mo16482b());
            jb4.mo18599s("application/id3");
            s2.mo16885a(jb4.mo18605y());
            return;
        }
        this.f19713g = new x84();
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f19725s = j;
        }
    }

    public final void zze() {
        this.f19725s = -9223372036854775807L;
        m27084f();
    }
}
