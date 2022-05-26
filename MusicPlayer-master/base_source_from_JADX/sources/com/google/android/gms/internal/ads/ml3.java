package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ml3 extends sl3 {

    /* renamed from: f */
    private final byte[] f20081f;

    /* renamed from: g */
    private int f20082g;

    /* renamed from: h */
    private int f20083h;

    /* renamed from: i */
    private int f20084i;

    /* renamed from: j */
    private final int f20085j;

    /* renamed from: k */
    private int f20086k;

    /* renamed from: l */
    private int f20087l = Integer.MAX_VALUE;

    /* synthetic */ ml3(byte[] bArr, int i, int i2, boolean z, ll3 ll3) {
        super((rl3) null);
        this.f20081f = bArr;
        this.f20082g = i2 + i;
        this.f20084i = i;
        this.f20085j = i;
    }

    /* renamed from: C */
    private final void m27315C() {
        int i = this.f20082g + this.f20083h;
        this.f20082g = i;
        int i2 = i - this.f20085j;
        int i3 = this.f20087l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f20083h = i4;
            this.f20082g = i - i4;
            return;
        }
        this.f20083h = 0;
    }

    /* renamed from: A */
    public final void mo19417A(int i) throws bn3 {
        if (this.f20086k != i) {
            throw bn3.zzb();
        }
    }

    /* renamed from: B */
    public final void mo19418B(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f20082g;
            int i3 = this.f20084i;
            if (i <= i2 - i3) {
                this.f20084i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw bn3.zzf();
        }
        throw bn3.zzj();
    }

    /* renamed from: D */
    public final byte mo19419D() throws IOException {
        int i = this.f20084i;
        if (i != this.f20082g) {
            byte[] bArr = this.f20081f;
            this.f20084i = i + 1;
            return bArr[i];
        }
        throw bn3.zzj();
    }

    /* renamed from: E */
    public final int mo19420E() throws IOException {
        int i = this.f20084i;
        if (this.f20082g - i >= 4) {
            byte[] bArr = this.f20081f;
            this.f20084i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw bn3.zzj();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19421F() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f20084i
            int r1 = r5.f20082g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f20081f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f20084i = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f20084i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo19424I()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ml3.mo19421F():int");
    }

    /* renamed from: G */
    public final long mo19422G() throws IOException {
        int i = this.f20084i;
        if (this.f20082g - i >= 8) {
            byte[] bArr = this.f20081f;
            this.f20084i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw bn3.zzj();
    }

    /* renamed from: H */
    public final long mo19423H() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f20084i;
        int i2 = this.f20082g;
        if (i2 != i) {
            byte[] bArr = this.f20081f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f20084i = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f20084i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f20084i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f20084i = i4;
                    return j;
                }
                j = (long) b;
                this.f20084i = i4;
                return j;
            }
        }
        return mo19424I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final long mo19424I() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte D = mo19419D();
            j |= ((long) (D & Byte.MAX_VALUE)) << i;
            if ((D & 128) == 0) {
                return j;
            }
        }
        throw bn3.zze();
    }

    /* renamed from: a */
    public final void mo19425a(int i) {
        this.f20087l = i;
        m27315C();
    }

    /* renamed from: b */
    public final boolean mo19426b() throws IOException {
        return this.f20084i == this.f20082g;
    }

    /* renamed from: c */
    public final boolean mo19427c() throws IOException {
        return mo19423H() != 0;
    }

    /* renamed from: d */
    public final boolean mo19428d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f20082g - this.f20084i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f20081f;
                    int i4 = this.f20084i;
                    this.f20084i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw bn3.zze();
            }
            while (i3 < 10) {
                if (mo19419D() < 0) {
                    i3++;
                }
            }
            throw bn3.zze();
            return true;
        } else if (i2 == 1) {
            mo19418B(8);
            return true;
        } else if (i2 == 2) {
            mo19418B(mo19421F());
            return true;
        } else if (i2 == 3) {
            do {
                q = mo19438q();
                if (q == 0 || !mo19428d(q)) {
                    mo19417A(((i >>> 3) << 3) | 4);
                }
                q = mo19438q();
                break;
            } while (!mo19428d(q));
            mo19417A(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo19418B(4);
                return true;
            }
            throw bn3.zza();
        }
    }

    /* renamed from: h */
    public final double mo19429h() throws IOException {
        return Double.longBitsToDouble(mo19422G());
    }

    /* renamed from: i */
    public final float mo19430i() throws IOException {
        return Float.intBitsToFloat(mo19420E());
    }

    /* renamed from: j */
    public final int mo19431j() {
        return this.f20084i - this.f20085j;
    }

    /* renamed from: k */
    public final int mo19432k(int i) throws bn3 {
        if (i >= 0) {
            int i2 = i + (this.f20084i - this.f20085j);
            if (i2 >= 0) {
                int i3 = this.f20087l;
                if (i2 <= i3) {
                    this.f20087l = i2;
                    m27315C();
                    return i3;
                }
                throw bn3.zzj();
            }
            throw bn3.zzg();
        }
        throw bn3.zzf();
    }

    /* renamed from: l */
    public final int mo19433l() throws IOException {
        return mo19421F();
    }

    /* renamed from: m */
    public final int mo19434m() throws IOException {
        return mo19420E();
    }

    /* renamed from: n */
    public final int mo19435n() throws IOException {
        return mo19421F();
    }

    /* renamed from: o */
    public final int mo19436o() throws IOException {
        return mo19420E();
    }

    /* renamed from: p */
    public final int mo19437p() throws IOException {
        return sl3.m30774e(mo19421F());
    }

    /* renamed from: q */
    public final int mo19438q() throws IOException {
        if (mo19426b()) {
            this.f20086k = 0;
            return 0;
        }
        int F = mo19421F();
        this.f20086k = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw bn3.zzc();
    }

    /* renamed from: r */
    public final int mo19439r() throws IOException {
        return mo19421F();
    }

    /* renamed from: s */
    public final long mo19440s() throws IOException {
        return mo19422G();
    }

    /* renamed from: t */
    public final long mo19441t() throws IOException {
        return mo19423H();
    }

    /* renamed from: u */
    public final long mo19442u() throws IOException {
        return mo19422G();
    }

    /* renamed from: v */
    public final long mo19443v() throws IOException {
        return sl3.m30775f(mo19423H());
    }

    /* renamed from: w */
    public final long mo19444w() throws IOException {
        return mo19423H();
    }

    /* renamed from: x */
    public final kl3 mo19445x() throws IOException {
        int F = mo19421F();
        if (F > 0) {
            int i = this.f20082g;
            int i2 = this.f20084i;
            if (F <= i - i2) {
                kl3 zzw = kl3.zzw(this.f20081f, i2, F);
                this.f20084i += F;
                return zzw;
            }
        }
        if (F == 0) {
            return kl3.zzb;
        }
        if (F > 0) {
            int i3 = this.f20082g;
            int i4 = this.f20084i;
            if (F <= i3 - i4) {
                int i5 = F + i4;
                this.f20084i = i5;
                return kl3.zzz(Arrays.copyOfRange(this.f20081f, i4, i5));
            }
        }
        if (F <= 0) {
            throw bn3.zzf();
        }
        throw bn3.zzj();
    }

    /* renamed from: y */
    public final String mo19446y() throws IOException {
        int F = mo19421F();
        if (F > 0) {
            int i = this.f20082g;
            int i2 = this.f20084i;
            if (F <= i - i2) {
                String str = new String(this.f20081f, i2, F, zm3.f26835a);
                this.f20084i += F;
                return str;
            }
        }
        if (F == 0) {
            return BuildConfig.FLAVOR;
        }
        if (F < 0) {
            throw bn3.zzf();
        }
        throw bn3.zzj();
    }

    /* renamed from: z */
    public final String mo19447z() throws IOException {
        int F = mo19421F();
        if (F > 0) {
            int i = this.f20082g;
            int i2 = this.f20084i;
            if (F <= i - i2) {
                String h = aq3.m20920h(this.f20081f, i2, F);
                this.f20084i += F;
                return h;
            }
        }
        if (F == 0) {
            return BuildConfig.FLAVOR;
        }
        if (F <= 0) {
            throw bn3.zzf();
        }
        throw bn3.zzj();
    }
}
