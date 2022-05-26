package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cz3 {

    /* renamed from: a */
    private final int f15374a;

    /* renamed from: b */
    private final int f15375b;

    /* renamed from: c */
    private final float f15376c;

    /* renamed from: d */
    private final float f15377d;

    /* renamed from: e */
    private final float f15378e;

    /* renamed from: f */
    private final int f15379f;

    /* renamed from: g */
    private final int f15380g;

    /* renamed from: h */
    private final int f15381h;

    /* renamed from: i */
    private final short[] f15382i;

    /* renamed from: j */
    private short[] f15383j;

    /* renamed from: k */
    private int f15384k;

    /* renamed from: l */
    private short[] f15385l;

    /* renamed from: m */
    private int f15386m;

    /* renamed from: n */
    private short[] f15387n;

    /* renamed from: o */
    private int f15388o;

    /* renamed from: p */
    private int f15389p;

    /* renamed from: q */
    private int f15390q;

    /* renamed from: r */
    private int f15391r;

    /* renamed from: s */
    private int f15392s;

    /* renamed from: t */
    private int f15393t;

    /* renamed from: u */
    private int f15394u;

    /* renamed from: v */
    private int f15395v;

    public cz3(int i, int i2, float f, float f2, int i3) {
        this.f15374a = i;
        this.f15375b = i2;
        this.f15376c = f;
        this.f15377d = f2;
        this.f15378e = ((float) i) / ((float) i3);
        this.f15379f = i / 400;
        int i4 = i / 65;
        this.f15380g = i4;
        int i5 = i4 + i4;
        this.f15381h = i5;
        this.f15382i = new short[i5];
        int i6 = i5 * i2;
        this.f15383j = new short[i6];
        this.f15385l = new short[i6];
        this.f15387n = new short[i6];
    }

    /* renamed from: g */
    private final int m22240g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f15375b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
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
        this.f15394u = i5 / i7;
        this.f15395v = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m22241h(short[] sArr, int i, int i2) {
        short[] l = m22245l(this.f15385l, this.f15386m, i2);
        this.f15385l = l;
        int i3 = this.f15375b;
        System.arraycopy(sArr, i * i3, l, this.f15386m * i3, i3 * i2);
        this.f15386m += i2;
    }

    /* renamed from: i */
    private final void m22242i(short[] sArr, int i, int i2) {
        int i3 = this.f15381h / i2;
        int i4 = this.f15375b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f15382i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private static void m22243j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: k */
    private final void m22244k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f15386m;
        float f = this.f15376c;
        float f2 = this.f15377d;
        float f3 = f / f2;
        float f4 = this.f15378e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f15384k;
            if (i11 >= this.f15381h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f15391r;
                    if (i13 > 0) {
                        int min = Math.min(this.f15381h, i13);
                        m22241h(this.f15383j, i12, min);
                        this.f15391r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f15383j;
                        int i14 = this.f15374a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f15375b == i10 && i15 == i10) {
                            i5 = m22240g(sArr, i12, this.f15379f, this.f15380g);
                        } else {
                            m22242i(sArr, i12, i15);
                            int g = m22240g(this.f15382i, 0, this.f15379f / i15, this.f15380g / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f15379f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f15380g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f15375b == i10) {
                                    i5 = m22240g(sArr, i12, i18, i19);
                                } else {
                                    m22242i(sArr, i12, i10);
                                    i5 = m22240g(this.f15382i, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f15394u;
                        int i23 = (i22 == 0 || (i8 = this.f15392s) == 0 || this.f15395v > i22 * 3 || i22 + i22 <= this.f15393t * 3) ? i5 : i8;
                        this.f15393t = i22;
                        this.f15392s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f15383j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f15391r = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] l = m22245l(this.f15385l, this.f15386m, i7);
                            this.f15385l = l;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m22243j(i7, this.f15375b, l, this.f15386m, sArr3, i12, sArr3, i12 + i23);
                            this.f15386m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f15383j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f15391r = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] l2 = m22245l(this.f15385l, this.f15386m, i26);
                            this.f15385l = l2;
                            int i27 = this.f15375b;
                            System.arraycopy(sArr4, i12 * i27, l2, this.f15386m * i27, i27 * i25);
                            m22243j(i6, this.f15375b, this.f15385l, this.f15386m + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f15386m += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f15381h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f15384k - i12;
                short[] sArr5 = this.f15383j;
                int i29 = this.f15375b;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f15384k = i28;
                f5 = 1.0f;
            }
        } else {
            m22241h(this.f15383j, 0, this.f15384k);
            this.f15384k = 0;
        }
        if (f4 != f5 && this.f15386m != i9) {
            int i30 = this.f15374a;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f15386m - i9;
            short[] l3 = m22245l(this.f15387n, this.f15388o, i32);
            this.f15387n = l3;
            short[] sArr6 = this.f15385l;
            int i33 = this.f15375b;
            System.arraycopy(sArr6, i9 * i33, l3, this.f15388o * i33, i33 * i32);
            this.f15386m = i9;
            this.f15388o += i32;
            int i34 = 0;
            while (true) {
                i = this.f15388o;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f15389p + 1;
                    i4 = this.f15390q;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f15385l = m22245l(this.f15385l, this.f15386m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f15375b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f15385l;
                        int i37 = this.f15386m;
                        short[] sArr8 = this.f15387n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f15390q;
                        int i40 = this.f15389p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f15390q++;
                    this.f15386m++;
                }
                this.f15389p = i3;
                if (i3 == i30) {
                    this.f15389p = 0;
                    gs1.m24488f(i4 == i31);
                    this.f15390q = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f15387n;
                int i44 = this.f15375b;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f15388o -= i2;
            }
        }
    }

    /* renamed from: l */
    private final short[] m22245l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f15375b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: a */
    public final int mo16792a() {
        int i = this.f15386m * this.f15375b;
        return i + i;
    }

    /* renamed from: b */
    public final int mo16793b() {
        int i = this.f15384k * this.f15375b;
        return i + i;
    }

    /* renamed from: c */
    public final void mo16794c() {
        this.f15384k = 0;
        this.f15386m = 0;
        this.f15388o = 0;
        this.f15389p = 0;
        this.f15390q = 0;
        this.f15391r = 0;
        this.f15392s = 0;
        this.f15393t = 0;
        this.f15394u = 0;
        this.f15395v = 0;
    }

    /* renamed from: d */
    public final void mo16795d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f15375b, this.f15386m);
        shortBuffer.put(this.f15385l, 0, this.f15375b * min);
        int i = this.f15386m - min;
        this.f15386m = i;
        short[] sArr = this.f15385l;
        int i2 = this.f15375b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: e */
    public final void mo16796e() {
        int i;
        int i2 = this.f15384k;
        float f = this.f15376c;
        float f2 = this.f15377d;
        int i3 = this.f15386m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f15388o)) / (this.f15378e * f2)) + 0.5f));
        short[] sArr = this.f15383j;
        int i4 = this.f15381h;
        this.f15383j = m22245l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f15381h;
            i = i6 + i6;
            int i7 = this.f15375b;
            if (i5 >= i * i7) {
                break;
            }
            this.f15383j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f15384k += i;
        m22244k();
        if (this.f15386m > i3) {
            this.f15386m = i3;
        }
        this.f15384k = 0;
        this.f15391r = 0;
        this.f15388o = 0;
    }

    /* renamed from: f */
    public final void mo16797f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f15375b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = m22245l(this.f15383j, this.f15384k, i2);
        this.f15383j = l;
        shortBuffer.get(l, this.f15384k * this.f15375b, (i3 + i3) / 2);
        this.f15384k += i2;
        m22244k();
    }
}
