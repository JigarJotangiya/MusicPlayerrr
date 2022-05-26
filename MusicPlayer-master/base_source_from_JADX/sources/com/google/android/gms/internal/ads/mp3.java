package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mp3 {

    /* renamed from: f */
    private static final mp3 f20123f = new mp3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f20124a;

    /* renamed from: b */
    private int[] f20125b;

    /* renamed from: c */
    private Object[] f20126c;

    /* renamed from: d */
    private int f20127d;

    /* renamed from: e */
    private boolean f20128e;

    private mp3() {
        this(0, new int[8], new Object[8], true);
    }

    private mp3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f20127d = -1;
        this.f20124a = i;
        this.f20125b = iArr;
        this.f20126c = objArr;
        this.f20128e = z;
    }

    /* renamed from: c */
    public static mp3 m27385c() {
        return f20123f;
    }

    /* renamed from: d */
    static mp3 m27386d(mp3 mp3, mp3 mp32) {
        int i = mp3.f20124a + mp32.f20124a;
        int[] copyOf = Arrays.copyOf(mp3.f20125b, i);
        System.arraycopy(mp32.f20125b, 0, copyOf, mp3.f20124a, mp32.f20124a);
        Object[] copyOf2 = Arrays.copyOf(mp3.f20126c, i);
        System.arraycopy(mp32.f20126c, 0, copyOf2, mp3.f20124a, mp32.f20124a);
        return new mp3(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static mp3 m27387e() {
        return new mp3(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo19486a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f20127d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f20124a; i6++) {
            int i7 = this.f20125b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f20126c[i6]).longValue();
                    i = xl3.m33733a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = xl3.m33733a(i8 << 3);
                    int zzd = ((kl3) this.f20126c[i6]).zzd();
                    i5 += a + xl3.m33733a(zzd) + zzd;
                } else if (i9 == 3) {
                    int D = xl3.m33732D(i8);
                    i3 = D + D;
                    i2 = ((mp3) this.f20126c[i6]).mo19486a();
                } else if (i9 == 5) {
                    ((Integer) this.f20126c[i6]).intValue();
                    i = xl3.m33733a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(bn3.zza());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f20126c[i6]).longValue();
                i3 = xl3.m33733a(i8 << 3);
                i2 = xl3.m33734b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f20127d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo19487b() {
        int i = this.f20127d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20124a; i3++) {
            int i4 = this.f20125b[i3];
            int a = xl3.m33733a(8);
            int zzd = ((kl3) this.f20126c[i3]).zzd();
            i2 += a + a + xl3.m33733a(16) + xl3.m33733a(i4 >>> 3) + xl3.m33733a(24) + xl3.m33733a(zzd) + zzd;
        }
        this.f20127d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mp3)) {
            return false;
        }
        mp3 mp3 = (mp3) obj;
        int i = this.f20124a;
        if (i == mp3.f20124a) {
            int[] iArr = this.f20125b;
            int[] iArr2 = mp3.f20125b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f20126c;
                    Object[] objArr2 = mp3.f20126c;
                    int i3 = this.f20124a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo19489f() {
        this.f20128e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo19490g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f20124a; i2++) {
            bo3.m21461b(sb, i, String.valueOf(this.f20125b[i2] >>> 3), this.f20126c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo19491h(int i, Object obj) {
        if (this.f20128e) {
            int i2 = this.f20124a;
            int[] iArr = this.f20125b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f20125b = Arrays.copyOf(iArr, i3);
                this.f20126c = Arrays.copyOf(this.f20126c, i3);
            }
            int[] iArr2 = this.f20125b;
            int i4 = this.f20124a;
            iArr2[i4] = i;
            this.f20126c[i4] = obj;
            this.f20124a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f20124a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f20125b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f20126c;
        int i7 = this.f20124a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo19493i(yl3 yl3) throws IOException {
        if (this.f20124a != 0) {
            for (int i = 0; i < this.f20124a; i++) {
                int i2 = this.f20125b[i];
                Object obj = this.f20126c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    yl3.mo22221E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    yl3.mo22250x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    yl3.mo22241o(i3, (kl3) obj);
                } else if (i4 == 3) {
                    yl3.mo22232e(i3);
                    ((mp3) obj).mo19493i(yl3);
                    yl3.mo22245s(i3);
                } else if (i4 == 5) {
                    yl3.mo22248v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(bn3.zza());
                }
            }
        }
    }
}
