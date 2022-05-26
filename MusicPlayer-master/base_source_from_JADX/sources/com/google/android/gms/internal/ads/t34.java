package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t34 implements da4 {

    /* renamed from: A */
    private pz3 f23709A;

    /* renamed from: a */
    private final n34 f23710a;

    /* renamed from: b */
    private final p34 f23711b = new p34();

    /* renamed from: c */
    private final z34<r34> f23712c = new z34<>(o34.f20890a);

    /* renamed from: d */
    private final oz3 f23713d;

    /* renamed from: e */
    private s34 f23714e;

    /* renamed from: f */
    private C5689w f23715f;

    /* renamed from: g */
    private int f23716g = 1000;

    /* renamed from: h */
    private int[] f23717h = new int[1000];

    /* renamed from: i */
    private long[] f23718i = new long[1000];

    /* renamed from: j */
    private int[] f23719j = new int[1000];

    /* renamed from: k */
    private int[] f23720k = new int[1000];

    /* renamed from: l */
    private long[] f23721l = new long[1000];

    /* renamed from: m */
    private ca4[] f23722m = new ca4[1000];

    /* renamed from: n */
    private int f23723n;

    /* renamed from: o */
    private int f23724o;

    /* renamed from: p */
    private int f23725p;

    /* renamed from: q */
    private int f23726q;

    /* renamed from: r */
    private long f23727r = Long.MIN_VALUE;

    /* renamed from: s */
    private long f23728s = Long.MIN_VALUE;

    /* renamed from: t */
    private long f23729t = Long.MIN_VALUE;

    /* renamed from: u */
    private boolean f23730u;

    /* renamed from: v */
    private boolean f23731v = true;

    /* renamed from: w */
    private boolean f23732w = true;

    /* renamed from: x */
    private C5689w f23733x;

    /* renamed from: y */
    private boolean f23734y;

    /* renamed from: z */
    private boolean f23735z;

    protected t34(r54 r54, Looper looper, oz3 oz3, iz3 iz3, byte[] bArr) {
        this.f23713d = oz3;
        this.f23710a = new n34(r54, (byte[]) null);
    }

    /* renamed from: A */
    static /* synthetic */ void m31053A(r34 r34) {
        nz3 nz3 = r34.f22727b;
        int i = mz3.f20428a;
    }

    /* renamed from: L */
    private final int m31054L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f23721l[i] > j ? 1 : (this.f23721l[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.f23720k[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.f23716g) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: g */
    private final int m31055g(int i) {
        int i2 = this.f23725p + i;
        int i3 = this.f23716g;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m31056h(com.google.android.gms.internal.ads.qt3 r6, com.google.android.gms.internal.ads.k31 r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.p34 r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f18744d = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.m31064p()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.f23730u     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.w r7 = r5.f23733x     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.w r8 = r5.f23715f     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.m31061m(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.mo17029c(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.z34<com.google.android.gms.internal.ads.r34> r9 = r5.f23712c     // Catch:{ all -> 0x0083 }
            int r0 = r5.f23724o     // Catch:{ all -> 0x0083 }
            int r4 = r5.f23726q     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.mo22331a(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.r34 r9 = (com.google.android.gms.internal.ads.r34) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.w r9 = r9.f22726a     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.w r8 = r5.f23715f     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.f23726q     // Catch:{ all -> 0x0083 }
            int r6 = r5.m31055g(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.m31065q(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.f18744d = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.f23720k     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.mo17029c(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.f23721l     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.f18745e = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.f23727r     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mo17028a(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.f23719j     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f21325a = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.f23718i     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f21326b = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.ca4[] r7 = r5.f23722m     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f21327c = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.m31061m(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.m31056h(com.google.android.gms.internal.ads.qt3, com.google.android.gms.internal.ads.k31, boolean, boolean, com.google.android.gms.internal.ads.p34):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m31057i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f23723n     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f23721l     // Catch:{ all -> 0x002f }
            int r4 = r9.f23725p     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f23726q     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m31054L(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m31059k(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.m31057i(long, boolean, boolean):long");
    }

    /* renamed from: j */
    private final synchronized long m31058j() {
        int i = this.f23723n;
        if (i == 0) {
            return -1;
        }
        return m31059k(i);
    }

    /* renamed from: k */
    private final long m31059k(int i) {
        long j = this.f23728s;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = m31055g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.f23721l[g]);
                if ((this.f23720k[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.f23716g - 1;
                }
            }
        }
        this.f23728s = Math.max(j, j2);
        this.f23723n -= i;
        int i3 = this.f23724o + i;
        this.f23724o = i3;
        int i4 = this.f23725p + i;
        this.f23725p = i4;
        int i5 = this.f23716g;
        if (i4 >= i5) {
            this.f23725p = i4 - i5;
        }
        int i6 = this.f23726q - i;
        this.f23726q = i6;
        if (i6 < 0) {
            this.f23726q = 0;
        }
        this.f23712c.mo22335e(i3);
        if (this.f23723n != 0) {
            return this.f23718i[this.f23725p];
        }
        int i7 = this.f23725p;
        if (i7 == 0) {
            i7 = this.f23716g;
        }
        int i8 = i7 - 1;
        return this.f23718i[i8] + ((long) this.f23719j[i8]);
    }

    /* renamed from: l */
    private final synchronized void m31060l(long j, int i, long j2, int i2, ca4 ca4) {
        int i3 = this.f23723n;
        if (i3 > 0) {
            int g = m31055g(i3 - 1);
            gs1.m24486d(this.f23718i[g] + ((long) this.f23719j[g]) <= j2);
        }
        this.f23730u = (536870912 & i) != 0;
        this.f23729t = Math.max(this.f23729t, j);
        int g2 = m31055g(this.f23723n);
        this.f23721l[g2] = j;
        this.f23718i[g2] = j2;
        this.f23719j[g2] = i2;
        this.f23720k[g2] = i;
        this.f23722m[g2] = ca4;
        this.f23717h[g2] = 0;
        if (this.f23712c.mo22336f() || !this.f23712c.mo22332b().f22726a.equals(this.f23733x)) {
            nz3 nz3 = nz3.f20773a;
            z34<r34> z34 = this.f23712c;
            int i4 = this.f23724o + this.f23723n;
            C5689w wVar = this.f23733x;
            Objects.requireNonNull(wVar);
            z34.mo22333c(i4, new r34(wVar, nz3, (q34) null));
        }
        int i5 = this.f23723n + 1;
        this.f23723n = i5;
        int i6 = this.f23716g;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            ca4[] ca4Arr = new ca4[i7];
            int i8 = this.f23725p;
            int i9 = i6 - i8;
            System.arraycopy(this.f23718i, i8, jArr, 0, i9);
            System.arraycopy(this.f23721l, this.f23725p, jArr2, 0, i9);
            System.arraycopy(this.f23720k, this.f23725p, iArr2, 0, i9);
            System.arraycopy(this.f23719j, this.f23725p, iArr3, 0, i9);
            System.arraycopy(this.f23722m, this.f23725p, ca4Arr, 0, i9);
            System.arraycopy(this.f23717h, this.f23725p, iArr, 0, i9);
            int i10 = this.f23725p;
            System.arraycopy(this.f23718i, 0, jArr, i9, i10);
            System.arraycopy(this.f23721l, 0, jArr2, i9, i10);
            System.arraycopy(this.f23720k, 0, iArr2, i9, i10);
            System.arraycopy(this.f23719j, 0, iArr3, i9, i10);
            System.arraycopy(this.f23722m, 0, ca4Arr, i9, i10);
            System.arraycopy(this.f23717h, 0, iArr, i9, i10);
            this.f23718i = jArr;
            this.f23721l = jArr2;
            this.f23720k = iArr2;
            this.f23719j = iArr3;
            this.f23722m = ca4Arr;
            this.f23717h = iArr;
            this.f23725p = 0;
            this.f23716g = i7;
        }
    }

    /* renamed from: m */
    private final void m31061m(C5689w wVar, qt3 qt3) {
        zzs zzs;
        C5689w wVar2 = this.f23715f;
        pz3 pz3 = null;
        if (wVar2 == null) {
            zzs = null;
        } else {
            zzs = wVar2.f25136o;
        }
        this.f23715f = wVar;
        zzs zzs2 = wVar.f25136o;
        qt3.f22027a = wVar.mo21658c(this.f23713d.mo19043a(wVar));
        qt3.f22028b = this.f23709A;
        if (wVar2 == null || !wy2.m33453p(zzs, zzs2)) {
            if (wVar.f25136o != null) {
                pz3 = new pz3(new gz3(new rz3(1), 6001));
            }
            this.f23709A = pz3;
            qt3.f22028b = pz3;
        }
    }

    /* renamed from: n */
    private final void m31062n() {
        if (this.f23709A != null) {
            this.f23709A = null;
            this.f23715f = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m31063o() {
        this.f23726q = 0;
        this.f23710a.mo19609g();
    }

    /* renamed from: p */
    private final boolean m31064p() {
        return this.f23726q != this.f23723n;
    }

    /* renamed from: q */
    private final boolean m31065q(int i) {
        if (this.f23709A != null) {
            return (this.f23720k[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m31066r(C5689w wVar) {
        this.f23732w = false;
        if (wy2.m33453p(wVar, this.f23733x)) {
            return false;
        }
        if (this.f23712c.mo22336f() || !this.f23712c.mo22332b().f22726a.equals(wVar)) {
            this.f23733x = wVar;
        } else {
            this.f23733x = this.f23712c.mo22332b().f22726a;
        }
        C5689w wVar2 = this.f23733x;
        this.f23734y = C5463pw.m29202f(wVar2.f25133l, wVar2.f25130i);
        this.f23735z = false;
        return true;
    }

    /* renamed from: B */
    public final void mo21010B() throws IOException {
        pz3 pz3 = this.f23709A;
        if (pz3 != null) {
            throw pz3.mo20353a();
        }
    }

    /* renamed from: C */
    public final void mo21011C() {
        mo21027z();
        m31062n();
    }

    /* renamed from: D */
    public final void mo21012D() {
        mo21013E(true);
        m31062n();
    }

    /* renamed from: E */
    public final void mo21013E(boolean z) {
        this.f23710a.mo19608f();
        this.f23723n = 0;
        this.f23724o = 0;
        this.f23725p = 0;
        this.f23726q = 0;
        this.f23731v = true;
        this.f23727r = Long.MIN_VALUE;
        this.f23728s = Long.MIN_VALUE;
        this.f23729t = Long.MIN_VALUE;
        this.f23730u = false;
        this.f23712c.mo22334d();
        if (z) {
            this.f23733x = null;
            this.f23732w = true;
        }
    }

    /* renamed from: F */
    public final void mo21014F(long j) {
        this.f23727r = j;
    }

    /* renamed from: G */
    public final void mo21015G(s34 s34) {
        this.f23714e = s34;
    }

    /* renamed from: H */
    public final synchronized void mo21016H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f23726q + i <= this.f23723n) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gs1.m24486d(z);
        this.f23726q += i;
    }

    /* renamed from: I */
    public final synchronized boolean mo21017I() {
        return this.f23730u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo21018J(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m31064p()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f23730u     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.w r4 = r3.f23733x     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.w r2 = r3.f23715f     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.z34<com.google.android.gms.internal.ads.r34> r4 = r3.f23712c     // Catch:{ all -> 0x003e }
            int r0 = r3.f23724o     // Catch:{ all -> 0x003e }
            int r2 = r3.f23726q     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo22331a(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.r34 r4 = (com.google.android.gms.internal.ads.r34) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.w r4 = r4.f22726a     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.w r0 = r3.f23715f     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f23726q     // Catch:{ all -> 0x003e }
            int r4 = r3.m31055g(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m31065q(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.mo21018J(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo21019K(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m31063o()     // Catch:{ all -> 0x003f }
            int r0 = r8.f23726q     // Catch:{ all -> 0x003f }
            int r2 = r8.m31055g(r0)     // Catch:{ all -> 0x003f }
            boolean r0 = r8.m31064p()     // Catch:{ all -> 0x003f }
            r7 = 0
            if (r0 == 0) goto L_0x003d
            long[] r0 = r8.f23721l     // Catch:{ all -> 0x003f }
            r3 = r0[r2]     // Catch:{ all -> 0x003f }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003d
            long r0 = r8.f23729t     // Catch:{ all -> 0x003f }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003d
        L_0x0021:
            int r11 = r8.f23723n     // Catch:{ all -> 0x003f }
            int r0 = r8.f23726q     // Catch:{ all -> 0x003f }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m31054L(r2, r3, r4, r6)     // Catch:{ all -> 0x003f }
            r0 = -1
            if (r11 != r0) goto L_0x0033
            monitor-exit(r8)
            return r7
        L_0x0033:
            r8.f23727r = r9     // Catch:{ all -> 0x003f }
            int r9 = r8.f23726q     // Catch:{ all -> 0x003f }
            int r9 = r9 + r11
            r8.f23726q = r9     // Catch:{ all -> 0x003f }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003d:
            monitor-exit(r8)
            return r7
        L_0x003f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.mo21019K(long, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo16885a(C5689w wVar) {
        boolean r = m31066r(wVar);
        s34 s34 = this.f23714e;
        if (s34 != null && r) {
            s34.mo17830n(wVar);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ int mo16886b(o91 o91, int i, boolean z) {
        return ba4.m21198a(this, o91, i, true);
    }

    /* renamed from: c */
    public final int mo16887c(o91 o91, int i, boolean z, int i2) throws IOException {
        return this.f23710a.mo19603a(o91, i, z);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo16888d(no2 no2, int i) {
        ba4.m21199b(this, no2, i);
    }

    /* renamed from: e */
    public final void mo16889e(long j, int i, int i2, int i3, ca4 ca4) {
        int i4 = i & 1;
        if (this.f23731v) {
            if (i4 != 0) {
                this.f23731v = false;
            } else {
                return;
            }
        }
        if (this.f23734y) {
            if (j >= this.f23727r) {
                if (i4 == 0) {
                    if (!this.f23735z) {
                        String valueOf = String.valueOf(this.f23733x);
                        String.valueOf(valueOf).length();
                        Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(valueOf)));
                        this.f23735z = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        m31060l(j, i, (this.f23710a.mo19604b() - ((long) i2)) - ((long) i3), i2, ca4);
    }

    /* renamed from: f */
    public final void mo16890f(no2 no2, int i, int i2) {
        this.f23710a.mo19610h(no2, i);
    }

    /* renamed from: s */
    public final int mo21020s() {
        return this.f23724o + this.f23726q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r9 != -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo21021t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f23726q     // Catch:{ all -> 0x003c }
            int r2 = r8.m31055g(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m31064p()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f23721l     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f23729t     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            if (r11 != 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            int r9 = r8.f23723n     // Catch:{ all -> 0x003c }
            int r10 = r8.f23726q     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0027:
            int r11 = r8.f23723n     // Catch:{ all -> 0x003c }
            int r0 = r8.f23726q     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m31054L(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0039
            return r7
        L_0x0039:
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.mo21021t(long, boolean):int");
    }

    /* renamed from: u */
    public final int mo21022u() {
        return this.f23724o + this.f23723n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21023v(com.google.android.gms.internal.ads.qt3 r9, com.google.android.gms.internal.ads.k31 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.p34 r7 = r8.f23711b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m31056h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo17033g()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.n34 r9 = r8.f23710a
            com.google.android.gms.internal.ads.p34 r11 = r8.f23711b
            r9.mo19606d(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.n34 r9 = r8.f23710a
            com.google.android.gms.internal.ads.p34 r11 = r8.f23711b
            r9.mo19607e(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f23726q
            int r9 = r9 + r1
            r8.f23726q = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t34.mo21023v(com.google.android.gms.internal.ads.qt3, com.google.android.gms.internal.ads.k31, int, boolean):int");
    }

    /* renamed from: w */
    public final synchronized long mo21024w() {
        return this.f23729t;
    }

    /* renamed from: x */
    public final synchronized C5689w mo21025x() {
        if (this.f23732w) {
            return null;
        }
        return this.f23733x;
    }

    /* renamed from: y */
    public final void mo21026y(long j, boolean z, boolean z2) {
        this.f23710a.mo19605c(m31057i(j, false, z2));
    }

    /* renamed from: z */
    public final void mo21027z() {
        this.f23710a.mo19605c(m31058j());
    }
}
