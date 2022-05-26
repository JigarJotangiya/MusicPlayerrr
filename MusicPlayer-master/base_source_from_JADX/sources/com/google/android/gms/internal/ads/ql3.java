package com.google.android.gms.internal.ads;

import com.un4seen.bass.BASS;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ql3 extends sl3 {

    /* renamed from: f */
    private final InputStream f21960f;

    /* renamed from: g */
    private final byte[] f21961g;

    /* renamed from: h */
    private int f21962h;

    /* renamed from: i */
    private int f21963i;

    /* renamed from: j */
    private int f21964j;

    /* renamed from: k */
    private int f21965k;

    /* renamed from: l */
    private int f21966l;

    /* renamed from: m */
    private int f21967m = Integer.MAX_VALUE;

    /* synthetic */ ql3(InputStream inputStream, int i, pl3 pl3) {
        super((rl3) null);
        zm3.m34701f(inputStream, "input");
        this.f21960f = inputStream;
        this.f21961g = new byte[4096];
        this.f21962h = 0;
        this.f21964j = 0;
        this.f21966l = 0;
    }

    /* renamed from: C */
    private final List<byte[]> m29562C(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f21960f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f21966l += read;
                    i2 += read;
                } else {
                    throw bn3.zzj();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: D */
    private final void m29563D() {
        int i = this.f21962h + this.f21963i;
        this.f21962h = i;
        int i2 = this.f21966l + i;
        int i3 = this.f21967m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f21963i = i4;
            this.f21962h = i - i4;
            return;
        }
        this.f21963i = 0;
    }

    /* renamed from: E */
    private final void m29564E(int i) throws IOException {
        if (m29565F(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f21966l) - this.f21964j) {
            throw bn3.zzi();
        }
        throw bn3.zzj();
    }

    /* renamed from: F */
    private final boolean m29565F(int i) throws IOException {
        int i2 = this.f21964j;
        int i3 = this.f21962h;
        if (i2 + i > i3) {
            int i4 = this.f21966l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f21967m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f21961g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f21966l + i2;
                this.f21966l = i4;
                i3 = this.f21962h - i2;
                this.f21962h = i3;
                this.f21964j = 0;
            }
            try {
                int read = this.f21960f.read(this.f21961g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.f21960f.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f21962h += read;
                    m29563D();
                    if (this.f21962h >= i) {
                        return true;
                    }
                    return m29565F(i);
                }
            } catch (bn3 e) {
                e.zzk();
                throw e;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: G */
    private final byte[] m29566G(int i, boolean z) throws IOException {
        byte[] H = m29567H(i);
        if (H != null) {
            return H;
        }
        int i2 = this.f21964j;
        int i3 = this.f21962h;
        int i4 = i3 - i2;
        this.f21966l += i3;
        this.f21964j = 0;
        this.f21962h = 0;
        List<byte[]> C = m29562C(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21961g, i2, bArr, 0, i4);
        for (byte[] next : C) {
            int length = next.length;
            System.arraycopy(next, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: H */
    private final byte[] m29567H(int i) throws IOException {
        if (i == 0) {
            return zm3.f26836b;
        }
        if (i >= 0) {
            int i2 = this.f21966l;
            int i3 = this.f21964j;
            int i4 = i2 + i3 + i;
            if (BASS.BASS_DATA_FFT512 + i4 <= 0) {
                int i5 = this.f21967m;
                if (i4 <= i5) {
                    int i6 = this.f21962h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f21960f.available()) {
                                return null;
                            }
                        } catch (bn3 e) {
                            e.zzk();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f21961g, this.f21964j, bArr, 0, i6);
                    this.f21966l += this.f21962h;
                    this.f21964j = 0;
                    this.f21962h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f21960f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f21966l += read;
                                i6 += read;
                            } else {
                                throw bn3.zzj();
                            }
                        } catch (bn3 e2) {
                            e2.zzk();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo20458B((i5 - i2) - i3);
                throw bn3.zzj();
            }
            throw bn3.zzi();
        }
        throw bn3.zzf();
    }

    /* renamed from: A */
    public final void mo19417A(int i) throws bn3 {
        if (this.f21965k != i) {
            throw bn3.zzb();
        }
    }

    /* renamed from: B */
    public final void mo20458B(int i) throws IOException {
        int i2 = this.f21962h;
        int i3 = this.f21964j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f21964j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f21966l;
            int i6 = i5 + i3;
            int i7 = this.f21967m;
            if (i6 + i <= i7) {
                this.f21966l = i6;
                this.f21962h = 0;
                this.f21964j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f21960f.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            String valueOf = String.valueOf(this.f21960f.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (bn3 e) {
                        e.zzk();
                        throw e;
                    } catch (Throwable th) {
                        this.f21966l += i4;
                        m29563D();
                        throw th;
                    }
                }
                this.f21966l += i4;
                m29563D();
                if (i4 < i) {
                    int i9 = this.f21962h;
                    int i10 = i9 - this.f21964j;
                    this.f21964j = i9;
                    m29564E(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f21962h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f21964j = i12;
                            m29564E(1);
                        } else {
                            this.f21964j = i11;
                            return;
                        }
                    }
                }
            } else {
                mo20458B((i7 - i5) - i3);
                throw bn3.zzj();
            }
        } else {
            throw bn3.zzf();
        }
    }

    /* renamed from: I */
    public final byte mo20459I() throws IOException {
        if (this.f21964j == this.f21962h) {
            m29564E(1);
        }
        byte[] bArr = this.f21961g;
        int i = this.f21964j;
        this.f21964j = i + 1;
        return bArr[i];
    }

    /* renamed from: J */
    public final int mo20460J() throws IOException {
        int i = this.f21964j;
        if (this.f21962h - i < 4) {
            m29564E(4);
            i = this.f21964j;
        }
        byte[] bArr = this.f21961g;
        this.f21964j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20461K() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f21964j
            int r1 = r5.f21962h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f21961g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f21964j = r3
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
            r5.f21964j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo20464N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ql3.mo20461K():int");
    }

    /* renamed from: L */
    public final long mo20462L() throws IOException {
        int i = this.f21964j;
        if (this.f21962h - i < 8) {
            m29564E(8);
            i = this.f21964j;
        }
        byte[] bArr = this.f21961g;
        this.f21964j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: M */
    public final long mo20463M() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f21964j;
        int i2 = this.f21962h;
        if (i2 != i) {
            byte[] bArr = this.f21961g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f21964j = i3;
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
                                                    this.f21964j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f21964j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f21964j = i4;
                    return j;
                }
                j = (long) b;
                this.f21964j = i4;
                return j;
            }
        }
        return mo20464N();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final long mo20464N() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = mo20459I();
            j |= ((long) (I & Byte.MAX_VALUE)) << i;
            if ((I & 128) == 0) {
                return j;
            }
        }
        throw bn3.zze();
    }

    /* renamed from: a */
    public final void mo19425a(int i) {
        this.f21967m = i;
        m29563D();
    }

    /* renamed from: b */
    public final boolean mo19426b() throws IOException {
        return this.f21964j == this.f21962h && !m29565F(1);
    }

    /* renamed from: c */
    public final boolean mo19427c() throws IOException {
        return mo20463M() != 0;
    }

    /* renamed from: d */
    public final boolean mo19428d(int i) throws IOException {
        int q;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f21962h - this.f21964j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f21961g;
                    int i4 = this.f21964j;
                    this.f21964j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw bn3.zze();
            }
            while (i3 < 10) {
                if (mo20459I() < 0) {
                    i3++;
                }
            }
            throw bn3.zze();
            return true;
        } else if (i2 == 1) {
            mo20458B(8);
            return true;
        } else if (i2 == 2) {
            mo20458B(mo20461K());
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
                mo20458B(4);
                return true;
            }
            throw bn3.zza();
        }
    }

    /* renamed from: h */
    public final double mo19429h() throws IOException {
        return Double.longBitsToDouble(mo20462L());
    }

    /* renamed from: i */
    public final float mo19430i() throws IOException {
        return Float.intBitsToFloat(mo20460J());
    }

    /* renamed from: j */
    public final int mo19431j() {
        return this.f21966l + this.f21964j;
    }

    /* renamed from: k */
    public final int mo19432k(int i) throws bn3 {
        if (i >= 0) {
            int i2 = i + this.f21966l + this.f21964j;
            int i3 = this.f21967m;
            if (i2 <= i3) {
                this.f21967m = i2;
                m29563D();
                return i3;
            }
            throw bn3.zzj();
        }
        throw bn3.zzf();
    }

    /* renamed from: l */
    public final int mo19433l() throws IOException {
        return mo20461K();
    }

    /* renamed from: m */
    public final int mo19434m() throws IOException {
        return mo20460J();
    }

    /* renamed from: n */
    public final int mo19435n() throws IOException {
        return mo20461K();
    }

    /* renamed from: o */
    public final int mo19436o() throws IOException {
        return mo20460J();
    }

    /* renamed from: p */
    public final int mo19437p() throws IOException {
        return sl3.m30774e(mo20461K());
    }

    /* renamed from: q */
    public final int mo19438q() throws IOException {
        if (mo19426b()) {
            this.f21965k = 0;
            return 0;
        }
        int K = mo20461K();
        this.f21965k = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw bn3.zzc();
    }

    /* renamed from: r */
    public final int mo19439r() throws IOException {
        return mo20461K();
    }

    /* renamed from: s */
    public final long mo19440s() throws IOException {
        return mo20462L();
    }

    /* renamed from: t */
    public final long mo19441t() throws IOException {
        return mo20463M();
    }

    /* renamed from: u */
    public final long mo19442u() throws IOException {
        return mo20462L();
    }

    /* renamed from: v */
    public final long mo19443v() throws IOException {
        return sl3.m30775f(mo20463M());
    }

    /* renamed from: w */
    public final long mo19444w() throws IOException {
        return mo20463M();
    }

    /* renamed from: x */
    public final kl3 mo19445x() throws IOException {
        int K = mo20461K();
        int i = this.f21962h;
        int i2 = this.f21964j;
        if (K <= i - i2 && K > 0) {
            kl3 zzw = kl3.zzw(this.f21961g, i2, K);
            this.f21964j += K;
            return zzw;
        } else if (K == 0) {
            return kl3.zzb;
        } else {
            byte[] H = m29567H(K);
            if (H != null) {
                return kl3.zzv(H);
            }
            int i3 = this.f21964j;
            int i4 = this.f21962h;
            int i5 = i4 - i3;
            this.f21966l += i4;
            this.f21964j = 0;
            this.f21962h = 0;
            List<byte[]> C = m29562C(K - i5);
            byte[] bArr = new byte[K];
            System.arraycopy(this.f21961g, i3, bArr, 0, i5);
            for (byte[] next : C) {
                int length = next.length;
                System.arraycopy(next, 0, bArr, i5, length);
                i5 += length;
            }
            return kl3.zzz(bArr);
        }
    }

    /* renamed from: y */
    public final String mo19446y() throws IOException {
        int K = mo20461K();
        if (K > 0) {
            int i = this.f21962h;
            int i2 = this.f21964j;
            if (K <= i - i2) {
                String str = new String(this.f21961g, i2, K, zm3.f26835a);
                this.f21964j += K;
                return str;
            }
        }
        if (K == 0) {
            return BuildConfig.FLAVOR;
        }
        if (K > this.f21962h) {
            return new String(m29566G(K, false), zm3.f26835a);
        }
        m29564E(K);
        String str2 = new String(this.f21961g, this.f21964j, K, zm3.f26835a);
        this.f21964j += K;
        return str2;
    }

    /* renamed from: z */
    public final String mo19447z() throws IOException {
        byte[] bArr;
        int K = mo20461K();
        int i = this.f21964j;
        int i2 = this.f21962h;
        if (K <= i2 - i && K > 0) {
            bArr = this.f21961g;
            this.f21964j = i + K;
        } else if (K == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (K <= i2) {
                m29564E(K);
                bArr = this.f21961g;
                this.f21964j = K;
            } else {
                bArr = m29566G(K, false);
            }
            i = 0;
        }
        return aq3.m20920h(bArr, i, K);
    }
}
