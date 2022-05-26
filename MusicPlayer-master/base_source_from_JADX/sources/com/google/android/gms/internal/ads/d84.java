package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d84 {

    /* renamed from: a */
    private static final int[] f15542a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f15543b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f15544c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f15545d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f15546e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f15547f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f15548g = 0;

    /* renamed from: a */
    public static int m22378a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m22382e((b & 192) >> 6, b & 63);
    }

    /* renamed from: b */
    public static C5689w m22379b(no2 no2, String str, String str2, zzs zzs) {
        int i = f15543b[(no2.mo19792s() & 192) >> 6];
        int s = no2.mo19792s();
        int i2 = f15545d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        jb4 jb4 = new jb4();
        jb4.mo18587h(str);
        jb4.mo18599s("audio/ac3");
        jb4.mo18582e0(i2);
        jb4.mo18600t(i);
        jb4.mo18576b(zzs);
        jb4.mo18591k(str2);
        return jb4.mo18605y();
    }

    /* renamed from: c */
    public static C5689w m22380c(no2 no2, String str, String str2, zzs zzs) {
        no2.mo19780g(2);
        int i = f15543b[(no2.mo19792s() & 192) >> 6];
        int s = no2.mo19792s();
        int i2 = f15545d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((no2.mo19792s() & 30) >> 1) > 0 && (2 & no2.mo19792s()) != 0) {
            i2 += 2;
        }
        String str3 = (no2.mo19782i() <= 0 || (no2.mo19792s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        jb4 jb4 = new jb4();
        jb4.mo18587h(str);
        jb4.mo18599s(str3);
        jb4.mo18582e0(i2);
        jb4.mo18600t(i);
        jb4.mo18576b(zzs);
        jb4.mo18591k(str2);
        return jb4.mo18605y();
    }

    /* renamed from: d */
    public static c84 m22381d(mn2 mn2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        mn2 mn22 = mn2;
        int b = mn2.mo19468b();
        mn22.mo19476j(40);
        int c = mn22.mo19469c(5);
        mn22.mo19474h(b);
        int i12 = -1;
        if (c > 10) {
            mn22.mo19476j(16);
            int c2 = mn22.mo19469c(2);
            if (c2 == 0) {
                i12 = 0;
            } else if (c2 == 1) {
                i12 = 1;
            } else if (c2 == 2) {
                i12 = 2;
            }
            mn22.mo19476j(3);
            int c3 = mn22.mo19469c(11) + 1;
            int i13 = c3 + c3;
            int c4 = mn22.mo19469c(2);
            if (c4 == 3) {
                i6 = f15544c[mn22.mo19469c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = mn22.mo19469c(2);
                i7 = f15542a[i8];
                i6 = f15543b[c4];
            }
            int i14 = i7 * 256;
            int c5 = mn22.mo19469c(3);
            boolean l = mn2.mo19478l();
            int i15 = f15545d[c5] + (l ? 1 : 0);
            mn22.mo19476j(10);
            if (mn2.mo19478l()) {
                mn22.mo19476j(8);
            }
            if (c5 == 0) {
                mn22.mo19476j(5);
                if (mn2.mo19478l()) {
                    mn22.mo19476j(8);
                }
                i9 = 0;
                c5 = 0;
            } else {
                i9 = c5;
            }
            if (i12 == 1) {
                if (mn2.mo19478l()) {
                    mn22.mo19476j(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (mn2.mo19478l()) {
                if (i9 > 2) {
                    mn22.mo19476j(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    mn22.mo19476j(6);
                }
                if ((i9 & 4) != 0) {
                    mn22.mo19476j(6);
                }
                if (l && mn2.mo19478l()) {
                    mn22.mo19476j(5);
                }
                if (i10 == 0) {
                    if (mn2.mo19478l()) {
                        mn22.mo19476j(6);
                    }
                    if (i9 == 0 && mn2.mo19478l()) {
                        mn22.mo19476j(6);
                    }
                    if (mn2.mo19478l()) {
                        mn22.mo19476j(6);
                    }
                    int c6 = mn22.mo19469c(2);
                    if (c6 == 1) {
                        mn22.mo19476j(5);
                    } else if (c6 == 2) {
                        mn22.mo19476j(12);
                    } else if (c6 == 3) {
                        int c7 = mn22.mo19469c(5);
                        if (mn2.mo19478l()) {
                            mn22.mo19476j(5);
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(4);
                            }
                            if (mn2.mo19478l()) {
                                if (mn2.mo19478l()) {
                                    mn22.mo19476j(4);
                                }
                                if (mn2.mo19478l()) {
                                    mn22.mo19476j(4);
                                }
                            }
                        }
                        if (mn2.mo19478l()) {
                            mn22.mo19476j(5);
                            if (mn2.mo19478l()) {
                                mn22.mo19476j(7);
                                if (mn2.mo19478l()) {
                                    mn22.mo19476j(8);
                                    mn22.mo19476j((c7 + 2) * 8);
                                    mn2.mo19470d();
                                }
                            }
                        }
                        mn22.mo19476j((c7 + 2) * 8);
                        mn2.mo19470d();
                    }
                    if (i9 < 2) {
                        if (mn2.mo19478l()) {
                            mn22.mo19476j(14);
                        }
                        if (c5 == 0 && mn2.mo19478l()) {
                            mn22.mo19476j(14);
                        }
                    }
                    if (mn2.mo19478l()) {
                        if (i8 == 0) {
                            mn22.mo19476j(5);
                            i10 = 0;
                            i8 = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (mn2.mo19478l()) {
                                    mn22.mo19476j(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (mn2.mo19478l()) {
                mn22.mo19476j(5);
                if (i9 == 2) {
                    mn22.mo19476j(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    mn22.mo19476j(2);
                }
                if (mn2.mo19478l()) {
                    i11 = 8;
                    mn22.mo19476j(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && mn2.mo19478l()) {
                    mn22.mo19476j(i11);
                }
                if (c4 < 3) {
                    mn2.mo19475i();
                }
            }
            if (i10 == 0 && i8 != 3) {
                mn2.mo19475i();
            }
            if (i10 == 2 && (i8 == 3 || mn2.mo19478l())) {
                mn22.mo19476j(6);
            }
            str = (mn2.mo19478l() && mn22.mo19469c(6) == 1 && mn22.mo19469c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i13;
            i = i14;
            i3 = i6;
            i4 = i15;
        } else {
            mn22.mo19476j(32);
            int c8 = mn22.mo19469c(2);
            String str2 = c8 == 3 ? null : "audio/ac3";
            int e = m22382e(c8, mn22.mo19469c(6));
            mn22.mo19476j(8);
            int c9 = mn22.mo19469c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                mn22.mo19476j(2);
            }
            if ((c9 & 4) != 0) {
                mn22.mo19476j(2);
            }
            if (c9 == 2) {
                mn22.mo19476j(2);
            }
            str = str2;
            i2 = e;
            i3 = c8 < 3 ? f15543b[c8] : -1;
            i4 = f15545d[c9] + (mn2.mo19478l() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new c84(str, i5, i4, i3, i2, i, (b84) null);
    }

    /* renamed from: e */
    private static int m22382e(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f15543b[i];
        if (i4 == 44100) {
            int i5 = f15547f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f15546e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
