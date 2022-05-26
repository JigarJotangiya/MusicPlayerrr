package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4928bg {

    /* renamed from: a */
    private final int f14431a;

    /* renamed from: b */
    private final int f14432b;

    /* renamed from: c */
    private final int f14433c;

    /* renamed from: d */
    private final int f14434d;

    /* renamed from: e */
    private final int f14435e;

    /* renamed from: f */
    private final short[] f14436f;

    /* renamed from: g */
    private int f14437g;

    /* renamed from: h */
    private short[] f14438h;

    /* renamed from: i */
    private int f14439i;

    /* renamed from: j */
    private short[] f14440j;

    /* renamed from: k */
    private int f14441k;

    /* renamed from: l */
    private short[] f14442l;

    /* renamed from: m */
    private int f14443m = 0;

    /* renamed from: n */
    private int f14444n = 0;

    /* renamed from: o */
    private float f14445o = 1.0f;

    /* renamed from: p */
    private float f14446p = 1.0f;

    /* renamed from: q */
    private int f14447q;

    /* renamed from: r */
    private int f14448r;

    /* renamed from: s */
    private int f14449s;

    /* renamed from: t */
    private int f14450t;

    /* renamed from: u */
    private int f14451u = 0;

    /* renamed from: v */
    private int f14452v;

    /* renamed from: w */
    private int f14453w;

    /* renamed from: x */
    private int f14454x;

    public C4928bg(int i, int i2) {
        this.f14431a = i;
        this.f14432b = i2;
        this.f14433c = i / 400;
        int i3 = i / 65;
        this.f14434d = i3;
        int i4 = i3 + i3;
        this.f14435e = i4;
        this.f14436f = new short[i4];
        this.f14437g = i4;
        int i5 = i2 * i4;
        this.f14438h = new short[i5];
        this.f14439i = i4;
        this.f14440j = new short[i5];
        this.f14441k = i4;
        this.f14442l = new short[i5];
    }

    /* renamed from: g */
    private final int m21300g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f14432b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f14453w = i5 / i7;
        this.f14454x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m21301h(short[] sArr, int i, int i2) {
        m21304k(i2);
        int i3 = this.f14432b;
        System.arraycopy(sArr, i * i3, this.f14440j, this.f14448r * i3, i3 * i2);
        this.f14448r += i2;
    }

    /* renamed from: i */
    private final void m21302i(short[] sArr, int i, int i2) {
        int i3 = this.f14435e / i2;
        int i4 = this.f14432b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f14436f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final void m21303j(int i) {
        int i2 = this.f14447q;
        int i3 = this.f14437g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f14437g = i4;
            this.f14438h = Arrays.copyOf(this.f14438h, i4 * this.f14432b);
        }
    }

    /* renamed from: k */
    private final void m21304k(int i) {
        int i2 = this.f14448r;
        int i3 = this.f14439i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f14439i = i4;
            this.f14440j = Arrays.copyOf(this.f14440j, i4 * this.f14432b);
        }
    }

    /* renamed from: l */
    private static void m21305l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: m */
    private final void m21306m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f14448r;
        float f = this.f14445o / this.f14446p;
        double d = (double) f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f14447q;
            if (i11 >= this.f14435e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f14450t;
                    if (i13 > 0) {
                        int min = Math.min(this.f14435e, i13);
                        m21301h(this.f14438h, i12, min);
                        this.f14450t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f14438h;
                        int i14 = this.f14431a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f14432b == i10 && i15 == i10) {
                            i5 = m21300g(sArr, i12, this.f14433c, this.f14434d);
                        } else {
                            m21302i(sArr, i12, i15);
                            int g = m21300g(this.f14436f, 0, this.f14433c / i15, this.f14434d / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f14433c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f14434d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f14432b == i10) {
                                    i5 = m21300g(sArr, i12, i18, i19);
                                } else {
                                    m21302i(sArr, i12, i10);
                                    i5 = m21300g(this.f14436f, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f14453w;
                        int i23 = (i22 == 0 || (i8 = this.f14451u) == 0 || this.f14454x > i22 * 3 || i22 + i22 <= this.f14452v * 3) ? i5 : i8;
                        this.f14452v = i22;
                        this.f14451u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f14438h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f));
                            } else {
                                this.f14450t = (int) ((((float) i23) * (2.0f - f)) / (-1.0f + f));
                                i7 = i23;
                            }
                            m21304k(i7);
                            int i24 = i7;
                            m21305l(i7, this.f14432b, this.f14440j, this.f14448r, sArr2, i12, sArr2, i12 + i23);
                            this.f14448r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f14438h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i25) * f) / (1.0f - f));
                            } else {
                                this.f14450t = (int) ((((float) i25) * ((f + f) - 4.0f)) / (1.0f - f));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            m21304k(i26);
                            int i27 = this.f14432b;
                            System.arraycopy(sArr3, i12 * i27, this.f14440j, this.f14448r * i27, i27 * i25);
                            m21305l(i6, this.f14432b, this.f14440j, this.f14448r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f14448r += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f14435e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f14447q - i12;
                short[] sArr4 = this.f14438h;
                int i29 = this.f14432b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f14447q = i28;
            }
        } else {
            m21301h(this.f14438h, 0, this.f14447q);
            this.f14447q = 0;
        }
        float f2 = this.f14446p;
        if (f2 != 1.0f && this.f14448r != i9) {
            int i30 = this.f14431a;
            int i31 = (int) (((float) i30) / f2);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f14448r - i9;
            int i33 = this.f14449s;
            int i34 = this.f14441k;
            if (i33 + i32 > i34) {
                int i35 = i34 + (i34 / 2) + i32;
                this.f14441k = i35;
                this.f14442l = Arrays.copyOf(this.f14442l, i35 * this.f14432b);
            }
            short[] sArr5 = this.f14440j;
            int i36 = this.f14432b;
            System.arraycopy(sArr5, i9 * i36, this.f14442l, this.f14449s * i36, i36 * i32);
            this.f14448r = i9;
            this.f14449s += i32;
            int i37 = 0;
            while (true) {
                i = this.f14449s;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f14443m + 1;
                    i4 = this.f14444n;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    m21304k(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f14432b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f14440j;
                        int i40 = this.f14448r;
                        short[] sArr7 = this.f14442l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f14444n;
                        int i43 = this.f14443m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                    this.f14444n++;
                    this.f14448r++;
                }
                this.f14443m = i3;
                if (i3 == i30) {
                    this.f14443m = 0;
                    C5304ll.m26776e(i4 == i31);
                    this.f14444n = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f14442l;
                int i47 = this.f14432b;
                System.arraycopy(sArr8, i2 * i47, sArr8, 0, (i - i2) * i47);
                this.f14449s -= i2;
            }
        }
    }

    /* renamed from: a */
    public final int mo16226a() {
        return this.f14448r;
    }

    /* renamed from: b */
    public final void mo16227b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f14432b, this.f14448r);
        shortBuffer.put(this.f14440j, 0, this.f14432b * min);
        int i = this.f14448r - min;
        this.f14448r = i;
        short[] sArr = this.f14440j;
        int i2 = this.f14432b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo16228c() {
        int i;
        int i2 = this.f14447q;
        float f = this.f14445o;
        float f2 = this.f14446p;
        int i3 = this.f14448r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f14449s)) / f2) + 0.5f));
        int i4 = this.f14435e;
        m21303j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f14435e;
            i = i6 + i6;
            int i7 = this.f14432b;
            if (i5 >= i * i7) {
                break;
            }
            this.f14438h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f14447q += i;
        m21306m();
        if (this.f14448r > i3) {
            this.f14448r = i3;
        }
        this.f14447q = 0;
        this.f14450t = 0;
        this.f14449s = 0;
    }

    /* renamed from: d */
    public final void mo16229d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f14432b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m21303j(i2);
        shortBuffer.get(this.f14438h, this.f14447q * this.f14432b, (i3 + i3) / 2);
        this.f14447q += i2;
        m21306m();
    }

    /* renamed from: e */
    public final void mo16230e(float f) {
        this.f14446p = f;
    }

    /* renamed from: f */
    public final void mo16231f(float f) {
        this.f14445o = f;
    }
}
