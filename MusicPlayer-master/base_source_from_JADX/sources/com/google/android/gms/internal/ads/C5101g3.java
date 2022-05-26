package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.g3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5101g3 implements C4990d4 {

    /* renamed from: a */
    private final C5470q2 f16881a;

    /* renamed from: b */
    private final mn2 f16882b = new mn2(new byte[10], 10);

    /* renamed from: c */
    private int f16883c = 0;

    /* renamed from: d */
    private int f16884d;

    /* renamed from: e */
    private tv2 f16885e;

    /* renamed from: f */
    private boolean f16886f;

    /* renamed from: g */
    private boolean f16887g;

    /* renamed from: h */
    private boolean f16888h;

    /* renamed from: i */
    private int f16889i;

    /* renamed from: j */
    private int f16890j;

    /* renamed from: k */
    private boolean f16891k;

    public C5101g3(C5470q2 q2Var) {
        this.f16881a = q2Var;
    }

    /* renamed from: d */
    private final void m24090d(int i) {
        this.f16883c = i;
        this.f16884d = 0;
    }

    /* renamed from: e */
    private final boolean m24091e(no2 no2, byte[] bArr, int i) {
        int min = Math.min(no2.mo19782i(), i - this.f16884d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            no2.mo19780g(min);
        } else {
            no2.mo19775b(bArr, this.f16884d, min);
        }
        int i2 = this.f16884d + min;
        this.f16884d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo16851a(no2 no2, int i) throws C5464px {
        long j;
        no2 no22 = no2;
        gs1.m24484b(this.f16885e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f16883c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f16890j;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f16881a.mo15669b();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m24090d(1);
        }
        int i6 = i;
        while (no2.mo19782i() > 0) {
            int i7 = this.f16883c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int i9 = no2.mo19782i();
                        int i10 = this.f16890j;
                        if (i10 != i2) {
                            i8 = i9 - i10;
                        }
                        if (i8 > 0) {
                            i9 -= i8;
                            no22.mo19778e(no2.mo19784k() + i9);
                        }
                        this.f16881a.mo15668a(no22);
                        int i11 = this.f16890j;
                        if (i11 != i2) {
                            int i12 = i11 - i9;
                            this.f16890j = i12;
                            if (i12 == 0) {
                                this.f16881a.mo15669b();
                                m24090d(1);
                            }
                        }
                    } else {
                        if (m24091e(no22, this.f16882b.f20098a, Math.min(10, this.f16889i)) && m24091e(no22, (byte[]) null, this.f16889i)) {
                            this.f16882b.mo19474h(0);
                            if (this.f16886f) {
                                this.f16882b.mo19476j(4);
                                int c = this.f16882b.mo19469c(3);
                                this.f16882b.mo19476j(1);
                                int c2 = this.f16882b.mo19469c(15);
                                this.f16882b.mo19476j(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f16882b.mo19469c(15));
                                this.f16882b.mo19476j(1);
                                if (!this.f16888h && this.f16887g) {
                                    this.f16882b.mo19476j(4);
                                    int c4 = this.f16882b.mo19469c(3);
                                    this.f16882b.mo19476j(1);
                                    int c5 = this.f16882b.mo19469c(15);
                                    this.f16882b.mo19476j(1);
                                    int c6 = this.f16882b.mo19469c(15);
                                    this.f16882b.mo19476j(1);
                                    this.f16885e.mo21172b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f16888h = true;
                                }
                                j = this.f16885e.mo21172b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.f16891k ? 0 : 4;
                            this.f16881a.mo15671d(j, i6);
                            m24090d(3);
                            i2 = -1;
                        }
                    }
                } else if (m24091e(no22, this.f16882b.f20098a, 9)) {
                    int i13 = 0;
                    this.f16882b.mo19474h(0);
                    int c7 = this.f16882b.mo19469c(24);
                    if (c7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c7);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.f16890j = -1;
                    } else {
                        this.f16882b.mo19476j(8);
                        int c8 = this.f16882b.mo19469c(16);
                        this.f16882b.mo19476j(5);
                        this.f16891k = this.f16882b.mo19478l();
                        this.f16882b.mo19476j(2);
                        this.f16886f = this.f16882b.mo19478l();
                        this.f16887g = this.f16882b.mo19478l();
                        this.f16882b.mo19476j(6);
                        int c9 = this.f16882b.mo19469c(8);
                        this.f16889i = c9;
                        if (c8 == 0) {
                            this.f16890j = -1;
                        } else {
                            int i14 = (c8 - 3) - c9;
                            this.f16890j = i14;
                            if (i14 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i14);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.f16890j = -1;
                                i13 = 2;
                            }
                        }
                        i2 = -1;
                        i13 = 2;
                    }
                    m24090d(i13);
                } else {
                    i2 = -1;
                }
            } else {
                no22.mo19780g(no2.mo19782i());
            }
            i3 = 2;
        }
    }

    /* renamed from: b */
    public final void mo16852b() {
        this.f16883c = 0;
        this.f16884d = 0;
        this.f16888h = false;
        this.f16881a.zze();
    }

    /* renamed from: c */
    public final void mo16853c(tv2 tv2, b94 b94, C4953c4 c4Var) {
        this.f16885e = tv2;
        this.f16881a.mo15670c(b94, c4Var);
    }
}
