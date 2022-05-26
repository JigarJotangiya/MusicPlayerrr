package com.google.android.gms.internal.ads;

import java.io.IOException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zk3 {
    /* renamed from: a */
    static int m34644a(byte[] bArr, int i, yk3 yk3) throws bn3 {
        int j = m34653j(bArr, i, yk3);
        int i2 = yk3.f26394a;
        if (i2 < 0) {
            throw bn3.zzf();
        } else if (i2 > bArr.length - j) {
            throw bn3.zzj();
        } else if (i2 == 0) {
            yk3.f26396c = kl3.zzb;
            return j;
        } else {
            yk3.f26396c = kl3.zzw(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m34645b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m34646c(to3 to3, byte[] bArr, int i, int i2, int i3, yk3 yk3) throws IOException {
        co3 co3 = (co3) to3;
        Object zze = co3.zze();
        int H = co3.mo16701H(zze, bArr, i, i2, i3, yk3);
        co3.mo16704c(zze);
        yk3.f26396c = zze;
        return H;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m34647d(com.google.android.gms.internal.ads.to3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.yk3 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m34654k(r8, r7, r0, r10)
            int r8 = r10.f26394a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo16707f(r1, r2, r3, r4, r5)
            r6.mo16704c(r9)
            r10.f26396c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.bn3 r6 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zk3.m34647d(com.google.android.gms.internal.ads.to3, byte[], int, int, com.google.android.gms.internal.ads.yk3):int");
    }

    /* renamed from: e */
    static int m34648e(to3<?> to3, int i, byte[] bArr, int i2, int i3, ym3<?> ym3, yk3 yk3) throws IOException {
        int d = m34647d(to3, bArr, i2, i3, yk3);
        ym3.add(yk3.f26396c);
        while (d < i3) {
            int j = m34653j(bArr, d, yk3);
            if (i != yk3.f26394a) {
                break;
            }
            d = m34647d(to3, bArr, j, i3, yk3);
            ym3.add(yk3.f26396c);
        }
        return d;
    }

    /* renamed from: f */
    static int m34649f(byte[] bArr, int i, ym3<?> ym3, yk3 yk3) throws IOException {
        rm3 rm3 = (rm3) ym3;
        int j = m34653j(bArr, i, yk3);
        int i2 = yk3.f26394a + j;
        while (j < i2) {
            j = m34653j(bArr, j, yk3);
            rm3.mo20677L(yk3.f26394a);
        }
        if (j == i2) {
            return j;
        }
        throw bn3.zzj();
    }

    /* renamed from: g */
    static int m34650g(byte[] bArr, int i, yk3 yk3) throws bn3 {
        int j = m34653j(bArr, i, yk3);
        int i2 = yk3.f26394a;
        if (i2 < 0) {
            throw bn3.zzf();
        } else if (i2 == 0) {
            yk3.f26396c = BuildConfig.FLAVOR;
            return j;
        } else {
            yk3.f26396c = new String(bArr, j, i2, zm3.f26835a);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m34651h(byte[] bArr, int i, yk3 yk3) throws bn3 {
        int j = m34653j(bArr, i, yk3);
        int i2 = yk3.f26394a;
        if (i2 < 0) {
            throw bn3.zzf();
        } else if (i2 == 0) {
            yk3.f26396c = BuildConfig.FLAVOR;
            return j;
        } else {
            yk3.f26396c = aq3.m20920h(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m34652i(int i, byte[] bArr, int i2, int i3, mp3 mp3, yk3 yk3) throws bn3 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m34656m(bArr, i2, yk3);
                mp3.mo19491h(i, Long.valueOf(yk3.f26395b));
                return m;
            } else if (i4 == 1) {
                mp3.mo19491h(i, Long.valueOf(m34657n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m34653j(bArr, i2, yk3);
                int i5 = yk3.f26394a;
                if (i5 < 0) {
                    throw bn3.zzf();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        mp3.mo19491h(i, kl3.zzb);
                    } else {
                        mp3.mo19491h(i, kl3.zzw(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw bn3.zzj();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                mp3 e = mp3.m27387e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m34653j(bArr, i2, yk3);
                    int i8 = yk3.f26394a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m34652i(i8, bArr, j2, i3, e, yk3);
                }
                if (i2 > i3 || i7 != i6) {
                    throw bn3.zzg();
                }
                mp3.mo19491h(i, e);
                return i2;
            } else if (i4 == 5) {
                mp3.mo19491h(i, Integer.valueOf(m34645b(bArr, i2)));
                return i2 + 4;
            } else {
                throw bn3.zzc();
            }
        } else {
            throw bn3.zzc();
        }
    }

    /* renamed from: j */
    static int m34653j(byte[] bArr, int i, yk3 yk3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m34654k(b, bArr, i2, yk3);
        }
        yk3.f26394a = b;
        return i2;
    }

    /* renamed from: k */
    static int m34654k(int i, byte[] bArr, int i2, yk3 yk3) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            yk3.f26394a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            yk3.f26394a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            yk3.f26394a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            yk3.f26394a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                yk3.f26394a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m34655l(int i, byte[] bArr, int i2, int i3, ym3<?> ym3, yk3 yk3) {
        rm3 rm3 = (rm3) ym3;
        int j = m34653j(bArr, i2, yk3);
        rm3.mo20677L(yk3.f26394a);
        while (j < i3) {
            int j2 = m34653j(bArr, j, yk3);
            if (i != yk3.f26394a) {
                break;
            }
            j = m34653j(bArr, j2, yk3);
            rm3.mo20677L(yk3.f26394a);
        }
        return j;
    }

    /* renamed from: m */
    static int m34656m(byte[] bArr, int i, yk3 yk3) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            yk3.f26395b = j2;
            return i3;
        }
        yk3.f26395b = j;
        return i2;
    }

    /* renamed from: n */
    static long m34657n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
