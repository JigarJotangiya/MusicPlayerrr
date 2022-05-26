package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ra4 implements y84 {

    /* renamed from: n */
    public static final f94 f22801n = qa4.f21890b;

    /* renamed from: a */
    private final byte[] f22802a = new byte[42];

    /* renamed from: b */
    private final no2 f22803b = new no2(new byte[32768], 0);

    /* renamed from: c */
    private final g94 f22804c = new g94();

    /* renamed from: d */
    private b94 f22805d;

    /* renamed from: e */
    private da4 f22806e;

    /* renamed from: f */
    private int f22807f = 0;

    /* renamed from: g */
    private zzdd f22808g;

    /* renamed from: h */
    private n94 f22809h;

    /* renamed from: i */
    private int f22810i;

    /* renamed from: j */
    private int f22811j;

    /* renamed from: k */
    private pa4 f22812k;

    /* renamed from: l */
    private int f22813l;

    /* renamed from: m */
    private long f22814m;

    public ra4(int i) {
    }

    /* renamed from: a */
    private final long m30024a(no2 no2, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f22809h);
        int k = no2.mo19784k();
        while (k <= no2.mo19785l() - 16) {
            no2.mo19779f(k);
            if (h94.m24738c(no2, this.f22809h, this.f22811j, this.f22804c)) {
                no2.mo19779f(k);
                return this.f22804c.f17002a;
            }
            k++;
        }
        if (z) {
            while (k <= no2.mo19785l() - this.f22810i) {
                no2.mo19779f(k);
                try {
                    z2 = h94.m24738c(no2, this.f22809h, this.f22811j, this.f22804c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (no2.mo19784k() <= no2.mo19785l() && z2) {
                    no2.mo19779f(k);
                    return this.f22804c.f17002a;
                }
                k++;
            }
            no2.mo19779f(no2.mo19785l());
            return -1;
        }
        no2.mo19779f(k);
        return -1;
    }

    /* renamed from: c */
    private final void m30025c() {
        long j = this.f22814m;
        n94 n94 = this.f22809h;
        int i = wy2.f25579a;
        this.f22806e.mo16889e((j * 1000000) / ((long) n94.f20559e), 1, this.f22813l, 0, (ca4) null);
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        k94.m26169a(z84, false);
        no2 no2 = new no2(4);
        ((t84) z84).mo19929i(no2.mo19781h(), 0, 4, false);
        if (no2.mo19766A() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        boolean l;
        n94 n94;
        z94 z94;
        z84 z842 = z84;
        int i = this.f22807f;
        boolean z = true;
        if (i == 0) {
            z84.mo19928h();
            long f = z84.mo16585f();
            zzdd a = k94.m26169a(z842, true);
            ((t84) z842).mo21042o((int) (z84.mo16585f() - f), false);
            this.f22808g = a;
            this.f22807f = 1;
            return 0;
        } else if (i == 1) {
            ((t84) z842).mo19929i(this.f22802a, 0, 42, false);
            z84.mo19928h();
            this.f22807f = 2;
            return 0;
        } else if (i == 2) {
            no2 no2 = new no2(4);
            ((t84) z842).mo19927e(no2.mo19781h(), 0, 4, false);
            if (no2.mo19766A() == 1716281667) {
                this.f22807f = 3;
                return 0;
            }
            throw C5464px.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            i94 i94 = new i94(this.f22809h);
            do {
                z84.mo19928h();
                mn2 mn2 = new mn2(new byte[4], 4);
                t84 t84 = (t84) z842;
                t84.mo19929i(mn2.f20098a, 0, 4, false);
                l = mn2.mo19478l();
                int c = mn2.mo19469c(7);
                int c2 = mn2.mo19469c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    t84.mo19927e(bArr, 0, 38, false);
                    i94.f17927a = new n94(bArr, 4);
                } else {
                    n94 n942 = i94.f17927a;
                    if (n942 == null) {
                        throw new IllegalArgumentException();
                    } else if (c == 3) {
                        no2 no22 = new no2(c2);
                        t84.mo19927e(no22.mo19781h(), 0, c2, false);
                        i94.f17927a = n942.mo19662f(k94.m26170b(no22));
                    } else if (c == 4) {
                        no2 no23 = new no2(c2);
                        t84.mo19927e(no23.mo19781h(), 0, c2, false);
                        no23.mo19780g(4);
                        i94.f17927a = n942.mo19663g(Arrays.asList(ia4.m25126b(no23, false, false).f16499a));
                    } else if (c == 6) {
                        no2 no24 = new no2(c2);
                        t84.mo19927e(no24.mo19781h(), 0, c2, false);
                        no24.mo19780g(4);
                        int m = no24.mo19786m();
                        String F = no24.mo19771F(no24.mo19786m(), g13.f16856a);
                        String F2 = no24.mo19771F(no24.mo19786m(), g13.f16857b);
                        int m2 = no24.mo19786m();
                        int m3 = no24.mo19786m();
                        int m4 = no24.mo19786m();
                        int m5 = no24.mo19786m();
                        int m6 = no24.mo19786m();
                        byte[] bArr2 = new byte[m6];
                        no24.mo19775b(bArr2, 0, m6);
                        i94.f17927a = n942.mo19661e(Collections.singletonList(new zzyz(m, F, F2, m2, m3, m4, m5, bArr2)));
                    } else {
                        t84.mo21042o(c2, false);
                    }
                }
                n94 = i94.f17927a;
                int i2 = wy2.f25579a;
                this.f22809h = n94;
            } while (!l);
            Objects.requireNonNull(n94);
            this.f22810i = Math.max(n94.f20557c, 6);
            this.f22806e.mo16885a(this.f22809h.mo19659c(this.f22802a, this.f22808g));
            this.f22807f = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.f22806e);
            Objects.requireNonNull(this.f22809h);
            pa4 pa4 = this.f22812k;
            if (pa4 != null && pa4.mo20241e()) {
                return this.f22812k.mo20237a(z842, w94);
            }
            if (this.f22814m == -1) {
                this.f22814m = h94.m24737b(z842, this.f22809h);
                return 0;
            }
            int l2 = this.f22803b.mo19785l();
            if (l2 < 32768) {
                int c3 = z842.mo15695c(this.f22803b.mo19781h(), l2, 32768 - l2);
                if (c3 != -1) {
                    z = false;
                }
                if (!z) {
                    this.f22803b.mo19778e(l2 + c3);
                } else if (this.f22803b.mo19782i() == 0) {
                    m30025c();
                    return -1;
                }
            } else {
                z = false;
            }
            int k = this.f22803b.mo19784k();
            int i3 = this.f22813l;
            int i4 = this.f22810i;
            if (i3 < i4) {
                no2 no25 = this.f22803b;
                no25.mo19780g(Math.min(i4 - i3, no25.mo19782i()));
            }
            long a2 = m30024a(this.f22803b, z);
            int k2 = this.f22803b.mo19784k() - k;
            this.f22803b.mo19779f(k);
            ba4.m21199b(this.f22806e, this.f22803b, k2);
            this.f22813l += k2;
            if (a2 != -1) {
                m30025c();
                this.f22813l = 0;
                this.f22814m = a2;
            }
            if (this.f22803b.mo19782i() >= 16) {
                return 0;
            }
            int i5 = this.f22803b.mo19782i();
            System.arraycopy(this.f22803b.mo19781h(), this.f22803b.mo19784k(), this.f22803b.mo19781h(), 0, i5);
            this.f22803b.mo19779f(0);
            this.f22803b.mo19778e(i5);
            return 0;
        } else {
            z84.mo19928h();
            no2 no26 = new no2(2);
            ((t84) z842).mo19929i(no26.mo19781h(), 0, 2, false);
            int w = no26.mo19796w();
            if ((w >> 2) == 16382) {
                z84.mo19928h();
                this.f22811j = w;
                b94 b94 = this.f22805d;
                int i6 = wy2.f25579a;
                long zze = z84.zze();
                long b = z84.mo16584b();
                n94 n943 = this.f22809h;
                Objects.requireNonNull(n943);
                if (n943.f20565k != null) {
                    z94 = new l94(n943, zze);
                } else if (b == -1 || n943.f20564j <= 0) {
                    z94 = new y94(n943.mo19657a(), 0);
                } else {
                    pa4 pa42 = new pa4(n943, this.f22811j, zze, b);
                    this.f22812k = pa42;
                    z94 = pa42.mo20238b();
                }
                b94.mo15723r(z94);
                this.f22807f = 5;
                return 0;
            }
            z84.mo19928h();
            throw C5464px.zza("First frame does not start with sync code.", (Throwable) null);
        }
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f22805d = b94;
        this.f22806e = b94.mo15724s(0, 1);
        b94.mo15722I();
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f22807f = 0;
        } else {
            pa4 pa4 = this.f22812k;
            if (pa4 != null) {
                pa4.mo20240d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f22814m = j3;
        this.f22813l = 0;
        this.f22803b.mo19776c(0);
    }
}
