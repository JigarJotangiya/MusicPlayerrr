package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ol3 extends sl3 {

    /* renamed from: f */
    private final Iterable<ByteBuffer> f21038f;

    /* renamed from: g */
    private final Iterator<ByteBuffer> f21039g;

    /* renamed from: h */
    private ByteBuffer f21040h;

    /* renamed from: i */
    private int f21041i;

    /* renamed from: j */
    private int f21042j;

    /* renamed from: k */
    private int f21043k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f21044l;

    /* renamed from: m */
    private int f21045m;

    /* renamed from: n */
    private long f21046n;

    /* renamed from: o */
    private long f21047o;

    /* renamed from: p */
    private long f21048p;

    /* synthetic */ ol3(Iterable iterable, int i, boolean z, nl3 nl3) {
        super((rl3) null);
        this.f21041i = i;
        this.f21038f = iterable;
        this.f21039g = iterable.iterator();
        this.f21045m = 0;
        if (i == 0) {
            this.f21040h = zm3.f26837c;
            this.f21046n = 0;
            this.f21047o = 0;
            this.f21048p = 0;
            return;
        }
        m28559G();
    }

    /* renamed from: C */
    private final int m28555C() {
        return (int) ((((long) (this.f21041i - this.f21045m)) - this.f21046n) + this.f21047o);
    }

    /* renamed from: D */
    private final void m28556D() throws bn3 {
        if (this.f21039g.hasNext()) {
            m28559G();
            return;
        }
        throw bn3.zzj();
    }

    /* renamed from: E */
    private final void m28557E(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= m28555C()) {
            int i3 = i2;
            while (i3 > 0) {
                if (this.f21048p - this.f21046n == 0) {
                    m28556D();
                }
                int min = Math.min(i3, (int) (this.f21048p - this.f21046n));
                long j = (long) min;
                vp3.m32655w(this.f21046n, bArr, (long) (i2 - i3), j);
                i3 -= min;
                this.f21046n += j;
            }
        } else if (i2 > 0) {
            throw bn3.zzj();
        }
    }

    /* renamed from: F */
    private final void m28558F() {
        int i = this.f21041i + this.f21042j;
        this.f21041i = i;
        int i2 = this.f21043k;
        if (i > i2) {
            int i3 = i - i2;
            this.f21042j = i3;
            this.f21041i = i - i3;
            return;
        }
        this.f21042j = 0;
    }

    /* renamed from: G */
    private final void m28559G() {
        ByteBuffer next = this.f21039g.next();
        this.f21040h = next;
        this.f21045m += (int) (this.f21046n - this.f21047o);
        long position = (long) next.position();
        this.f21046n = position;
        this.f21047o = position;
        this.f21048p = (long) this.f21040h.limit();
        long m = vp3.m32645m(this.f21040h);
        this.f21046n += m;
        this.f21047o += m;
        this.f21048p += m;
    }

    /* renamed from: A */
    public final void mo19417A(int i) throws bn3 {
        if (this.f21044l != i) {
            throw bn3.zzb();
        }
    }

    /* renamed from: B */
    public final void mo20023B(int i) throws IOException {
        if (i >= 0 && ((long) i) <= (((long) (this.f21041i - this.f21045m)) - this.f21046n) + this.f21047o) {
            while (i > 0) {
                if (this.f21048p - this.f21046n == 0) {
                    m28556D();
                }
                int min = Math.min(i, (int) (this.f21048p - this.f21046n));
                i -= min;
                this.f21046n += (long) min;
            }
        } else if (i < 0) {
            throw bn3.zzf();
        } else {
            throw bn3.zzj();
        }
    }

    /* renamed from: H */
    public final byte mo20024H() throws IOException {
        if (this.f21048p - this.f21046n == 0) {
            m28556D();
        }
        long j = this.f21046n;
        this.f21046n = 1 + j;
        return vp3.m32641i(j);
    }

    /* renamed from: I */
    public final int mo20025I() throws IOException {
        byte H;
        byte H2;
        long j = this.f21048p;
        long j2 = this.f21046n;
        if (j - j2 >= 4) {
            this.f21046n = 4 + j2;
            H = (vp3.m32641i(j2) & 255) | ((vp3.m32641i(1 + j2) & 255) << 8) | ((vp3.m32641i(2 + j2) & 255) << 16);
            H2 = vp3.m32641i(j2 + 3);
        } else {
            H = (mo20024H() & 255) | ((mo20024H() & 255) << 8) | ((mo20024H() & 255) << 16);
            H2 = mo20024H();
        }
        return H | ((H2 & 255) << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (com.google.android.gms.internal.ads.vp3.m32641i(r4) >= 0) goto L_0x0089;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20026J() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f21046n
            long r2 = r10.f21048p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x008c
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.vp3.m32641i(r0)
            if (r0 < 0) goto L_0x001a
            long r4 = r10.f21046n
            long r4 = r4 + r2
            r10.f21046n = r4
            return r0
        L_0x001a:
            long r6 = r10.f21048p
            long r8 = r10.f21046n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0033
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0089
        L_0x0033:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0042
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0040:
            r6 = r4
            goto L_0x0089
        L_0x0042:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0052
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0089
        L_0x0052:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r4)
            if (r1 >= 0) goto L_0x0089
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r6)
            if (r1 >= 0) goto L_0x0040
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.vp3.m32641i(r4)
            if (r1 < 0) goto L_0x008c
        L_0x0089:
            r10.f21046n = r6
            return r0
        L_0x008c:
            long r0 = r10.mo20029M()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol3.mo20026J():int");
    }

    /* renamed from: K */
    public final long mo20027K() throws IOException {
        long H;
        byte H2;
        long j = this.f21048p;
        long j2 = this.f21046n;
        if (j - j2 >= 8) {
            this.f21046n = 8 + j2;
            H = (((long) vp3.m32641i(j2)) & 255) | ((((long) vp3.m32641i(1 + j2)) & 255) << 8) | ((((long) vp3.m32641i(2 + j2)) & 255) << 16) | ((((long) vp3.m32641i(3 + j2)) & 255) << 24) | ((((long) vp3.m32641i(4 + j2)) & 255) << 32) | ((((long) vp3.m32641i(5 + j2)) & 255) << 40) | ((((long) vp3.m32641i(6 + j2)) & 255) << 48);
            H2 = vp3.m32641i(j2 + 7);
        } else {
            H = (((long) mo20024H()) & 255) | ((((long) mo20024H()) & 255) << 8) | ((((long) mo20024H()) & 255) << 16) | ((((long) mo20024H()) & 255) << 24) | ((((long) mo20024H()) & 255) << 32) | ((((long) mo20024H()) & 255) << 40) | ((((long) mo20024H()) & 255) << 48);
            H2 = mo20024H();
        }
        return H | ((((long) H2) & 255) << 56);
    }

    /* renamed from: L */
    public final long mo20028L() throws IOException {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f21046n;
        if (this.f21048p != j4) {
            long j5 = j4 + 1;
            byte i = vp3.m32641i(j4);
            if (i >= 0) {
                this.f21046n++;
                return (long) i;
            } else if (this.f21048p - this.f21046n >= 10) {
                long j6 = j5 + 1;
                byte i2 = i ^ (vp3.m32641i(j5) << 7);
                if (i2 < 0) {
                    b = i2 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = j6 + 1;
                    byte i3 = i2 ^ (vp3.m32641i(j6) << 14);
                    if (i3 >= 0) {
                        j = (long) (i3 ^ 16256);
                    } else {
                        j6 = j7 + 1;
                        byte i4 = i3 ^ (vp3.m32641i(j7) << 21);
                        if (i4 < 0) {
                            b = i4 ^ -2080896;
                        } else {
                            j7 = j6 + 1;
                            long i5 = ((long) i4) ^ (((long) vp3.m32641i(j6)) << 28);
                            if (i5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long i6 = i5 ^ (((long) vp3.m32641i(j7)) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    i5 = i6 ^ (((long) vp3.m32641i(j8)) << 42);
                                    if (i5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        i6 = i5 ^ (((long) vp3.m32641i(j7)) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (i6 ^ (((long) vp3.m32641i(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) vp3.m32641i(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f21046n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = i6 ^ j2;
                                j6 = j8;
                                this.f21046n = j6;
                                return j;
                            }
                            j = i5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f21046n = j6;
                    return j;
                }
                j = (long) b;
                this.f21046n = j6;
                return j;
            }
        }
        return mo20029M();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final long mo20029M() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte H = mo20024H();
            j |= ((long) (H & Byte.MAX_VALUE)) << i;
            if ((H & 128) == 0) {
                return j;
            }
        }
        throw bn3.zze();
    }

    /* renamed from: a */
    public final void mo19425a(int i) {
        this.f21043k = i;
        m28558F();
    }

    /* renamed from: b */
    public final boolean mo19426b() throws IOException {
        return (((long) this.f21045m) + this.f21046n) - this.f21047o == ((long) this.f21041i);
    }

    /* renamed from: c */
    public final boolean mo19427c() throws IOException {
        return mo20028L() != 0;
    }

    /* renamed from: d */
    public final boolean mo19428d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo20024H() >= 0) {
                    return true;
                }
            }
            throw bn3.zze();
        } else if (i2 == 1) {
            mo20023B(8);
            return true;
        } else if (i2 == 2) {
            mo20023B(mo20026J());
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
                mo20023B(4);
                return true;
            }
            throw bn3.zza();
        }
    }

    /* renamed from: h */
    public final double mo19429h() throws IOException {
        return Double.longBitsToDouble(mo20027K());
    }

    /* renamed from: i */
    public final float mo19430i() throws IOException {
        return Float.intBitsToFloat(mo20025I());
    }

    /* renamed from: j */
    public final int mo19431j() {
        return (int) ((((long) this.f21045m) + this.f21046n) - this.f21047o);
    }

    /* renamed from: k */
    public final int mo19432k(int i) throws bn3 {
        if (i >= 0) {
            int j = i + mo19431j();
            int i2 = this.f21043k;
            if (j <= i2) {
                this.f21043k = j;
                m28558F();
                return i2;
            }
            throw bn3.zzj();
        }
        throw bn3.zzf();
    }

    /* renamed from: l */
    public final int mo19433l() throws IOException {
        return mo20026J();
    }

    /* renamed from: m */
    public final int mo19434m() throws IOException {
        return mo20025I();
    }

    /* renamed from: n */
    public final int mo19435n() throws IOException {
        return mo20026J();
    }

    /* renamed from: o */
    public final int mo19436o() throws IOException {
        return mo20025I();
    }

    /* renamed from: p */
    public final int mo19437p() throws IOException {
        return sl3.m30774e(mo20026J());
    }

    /* renamed from: q */
    public final int mo19438q() throws IOException {
        if (mo19426b()) {
            this.f21044l = 0;
            return 0;
        }
        int J = mo20026J();
        this.f21044l = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw bn3.zzc();
    }

    /* renamed from: r */
    public final int mo19439r() throws IOException {
        return mo20026J();
    }

    /* renamed from: s */
    public final long mo19440s() throws IOException {
        return mo20027K();
    }

    /* renamed from: t */
    public final long mo19441t() throws IOException {
        return mo20028L();
    }

    /* renamed from: u */
    public final long mo19442u() throws IOException {
        return mo20027K();
    }

    /* renamed from: v */
    public final long mo19443v() throws IOException {
        return sl3.m30775f(mo20028L());
    }

    /* renamed from: w */
    public final long mo19444w() throws IOException {
        return mo20028L();
    }

    /* renamed from: x */
    public final kl3 mo19445x() throws IOException {
        int J = mo20026J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f21048p;
            long j3 = this.f21046n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                vp3.m32655w(j3, bArr, 0, j);
                this.f21046n += j;
                return kl3.zzz(bArr);
            }
        }
        if (J > 0 && J <= m28555C()) {
            byte[] bArr2 = new byte[J];
            m28557E(bArr2, 0, J);
            return kl3.zzz(bArr2);
        } else if (J == 0) {
            return kl3.zzb;
        } else {
            if (J < 0) {
                throw bn3.zzf();
            }
            throw bn3.zzj();
        }
    }

    /* renamed from: y */
    public final String mo19446y() throws IOException {
        int J = mo20026J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f21048p;
            long j3 = this.f21046n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[J];
                vp3.m32655w(j3, bArr, 0, j);
                String str = new String(bArr, zm3.f26835a);
                this.f21046n += j;
                return str;
            }
        }
        if (J > 0 && J <= m28555C()) {
            byte[] bArr2 = new byte[J];
            m28557E(bArr2, 0, J);
            return new String(bArr2, zm3.f26835a);
        } else if (J == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (J < 0) {
                throw bn3.zzf();
            }
            throw bn3.zzj();
        }
    }

    /* renamed from: z */
    public final String mo19447z() throws IOException {
        int J = mo20026J();
        if (J > 0) {
            long j = (long) J;
            long j2 = this.f21048p;
            long j3 = this.f21046n;
            if (j <= j2 - j3) {
                String g = aq3.m20919g(this.f21040h, (int) (j3 - this.f21047o), J);
                this.f21046n += j;
                return g;
            }
        }
        if (J >= 0 && J <= m28555C()) {
            byte[] bArr = new byte[J];
            m28557E(bArr, 0, J);
            return aq3.m20920h(bArr, 0, J);
        } else if (J == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (J <= 0) {
                throw bn3.zzf();
            }
            throw bn3.zzj();
        }
    }
}
