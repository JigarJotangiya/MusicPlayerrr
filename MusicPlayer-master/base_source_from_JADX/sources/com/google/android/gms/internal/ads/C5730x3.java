package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5730x3 implements y84 {

    /* renamed from: q */
    public static final f94 f25631q = C5619u3.f24165b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<tv2> f25632a;

    /* renamed from: b */
    private final no2 f25633b;

    /* renamed from: c */
    private final SparseIntArray f25634c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4916b4 f25635d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray<C4990d4> f25636e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseBooleanArray f25637f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f25638g;

    /* renamed from: h */
    private final C5582t3 f25639h;

    /* renamed from: i */
    private C5545s3 f25640i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public b94 f25641j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f25642k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f25643l;

    /* renamed from: m */
    private boolean f25644m;

    /* renamed from: n */
    private boolean f25645n;

    /* renamed from: o */
    private int f25646o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f25647p;

    public C5730x3(int i) {
        this(1, 0, 112800);
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        byte[] h = this.f25633b.mo19781h();
        t84 t84 = (t84) z84;
        t84.mo19929i(h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (h[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            t84.mo21042o(i, false);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ae, code lost:
        if (r2 == false) goto L_0x01b0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r19, com.google.android.gms.internal.ads.w94 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.mo16584b()
            boolean r3 = r0.f25643l
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x00a8
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.t3 r3 = r0.f25639h
            boolean r3 = r3.mo21008d()
            if (r3 == 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            com.google.android.gms.internal.ads.t3 r3 = r0.f25639h
            int r4 = r0.f25647p
            int r1 = r3.mo21005a(r1, r2, r4)
            return r1
        L_0x0028:
            boolean r3 = r0.f25644m
            r7 = 0
            if (r3 != 0) goto L_0x007d
            r0.f25644m = r15
            com.google.android.gms.internal.ads.t3 r3 = r0.f25639h
            long r3 = r3.mo21006b()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.s3 r9 = new com.google.android.gms.internal.ads.s3
            com.google.android.gms.internal.ads.t3 r3 = r0.f25639h
            com.google.android.gms.internal.ads.tv2 r4 = r3.mo21007c()
            com.google.android.gms.internal.ads.t3 r3 = r0.f25639h
            long r5 = r3.mo21006b()
            int r3 = r0.f25647p
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.f25640i = r15
            com.google.android.gms.internal.ads.b94 r3 = r0.f25641j
            com.google.android.gms.internal.ads.z94 r4 = r15.mo20238b()
            r3.mo15723r(r4)
            goto L_0x007e
        L_0x006b:
            r13 = r7
            com.google.android.gms.internal.ads.b94 r3 = r0.f25641j
            com.google.android.gms.internal.ads.y94 r4 = new com.google.android.gms.internal.ads.y94
            com.google.android.gms.internal.ads.t3 r5 = r0.f25639h
            long r5 = r5.mo21006b()
            r4.<init>(r5, r13)
            r3.mo15723r(r4)
            goto L_0x007e
        L_0x007d:
            r13 = r7
        L_0x007e:
            boolean r3 = r0.f25645n
            if (r3 == 0) goto L_0x0095
            r3 = 0
            r0.f25645n = r3
            r0.mo16804h(r13, r13)
            long r4 = r19.zze()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r2.f25288a = r13
            r1 = 1
            return r1
        L_0x0095:
            r3 = 0
        L_0x0096:
            com.google.android.gms.internal.ads.s3 r4 = r0.f25640i
            if (r4 == 0) goto L_0x00a9
            boolean r4 = r4.mo20241e()
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            com.google.android.gms.internal.ads.s3 r3 = r0.f25640i
            int r1 = r3.mo20237a(r1, r2)
            return r1
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            com.google.android.gms.internal.ads.no2 r2 = r0.f25633b
            byte[] r2 = r2.mo19781h()
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            int r4 = r4.mo19784k()
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 < r5) goto L_0x00bc
            goto L_0x00d2
        L_0x00bc:
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            int r4 = r4.mo19782i()
            if (r4 <= 0) goto L_0x00cd
            com.google.android.gms.internal.ads.no2 r6 = r0.f25633b
            int r6 = r6.mo19784k()
            java.lang.System.arraycopy(r2, r6, r2, r3, r4)
        L_0x00cd:
            com.google.android.gms.internal.ads.no2 r6 = r0.f25633b
            r6.mo19777d(r2, r4)
        L_0x00d2:
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            int r4 = r4.mo19782i()
            r6 = -1
            if (r4 >= r5) goto L_0x00f1
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            int r4 = r4.mo19785l()
            int r7 = 9400 - r4
            int r7 = r1.mo15695c(r2, r4, r7)
            if (r7 != r6) goto L_0x00ea
            return r6
        L_0x00ea:
            com.google.android.gms.internal.ads.no2 r6 = r0.f25633b
            int r4 = r4 + r7
            r6.mo19778e(r4)
            goto L_0x00d2
        L_0x00f1:
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            int r1 = r1.mo19784k()
            com.google.android.gms.internal.ads.no2 r2 = r0.f25633b
            int r2 = r2.mo19785l()
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            byte[] r4 = r4.mo19781h()
            int r4 = com.google.android.gms.internal.ads.C5027e4.m22836a(r4, r1, r2)
            com.google.android.gms.internal.ads.no2 r5 = r0.f25633b
            r5.mo19779f(r4)
            int r5 = r4 + 188
            if (r5 <= r2) goto L_0x0117
            int r2 = r0.f25646o
            int r4 = r4 - r1
            int r2 = r2 + r4
            r0.f25646o = r2
            goto L_0x0119
        L_0x0117:
            r0.f25646o = r3
        L_0x0119:
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            int r1 = r1.mo19785l()
            if (r5 <= r1) goto L_0x0122
            return r3
        L_0x0122:
            com.google.android.gms.internal.ads.no2 r2 = r0.f25633b
            int r2 = r2.mo19786m()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0133
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            r1.mo19779f(r5)
            return r3
        L_0x0133:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x013a
            r10 = 1
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            int r4 = r2 >> 8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = r2 & 32
            r8 = r2 & 16
            if (r8 == 0) goto L_0x014e
            android.util.SparseArray<com.google.android.gms.internal.ads.d4> r8 = r0.f25636e
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.d4 r8 = (com.google.android.gms.internal.ads.C4990d4) r8
            goto L_0x014f
        L_0x014e:
            r8 = 0
        L_0x014f:
            if (r8 != 0) goto L_0x0157
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            r1.mo19779f(r5)
            return r3
        L_0x0157:
            r2 = r2 & 15
            android.util.SparseIntArray r9 = r0.f25634c
            int r13 = r2 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.f25634c
            r13.put(r4, r2)
            if (r9 != r2) goto L_0x016e
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            r1.mo19779f(r5)
            return r3
        L_0x016e:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r2 == r9) goto L_0x0177
            r8.mo16852b()
        L_0x0177:
            if (r7 == 0) goto L_0x0193
            com.google.android.gms.internal.ads.no2 r2 = r0.f25633b
            int r2 = r2.mo19792s()
            com.google.android.gms.internal.ads.no2 r7 = r0.f25633b
            int r7 = r7.mo19792s()
            r7 = r7 & 64
            if (r7 == 0) goto L_0x018b
            r7 = 2
            goto L_0x018c
        L_0x018b:
            r7 = 0
        L_0x018c:
            r10 = r10 | r7
            com.google.android.gms.internal.ads.no2 r7 = r0.f25633b
            int r2 = r2 + r6
            r7.mo19780g(r2)
        L_0x0193:
            boolean r2 = r0.f25643l
            if (r2 != 0) goto L_0x019f
            android.util.SparseBooleanArray r6 = r0.f25638g
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x01b0
        L_0x019f:
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            r4.mo19778e(r5)
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            r8.mo16851a(r4, r10)
            com.google.android.gms.internal.ads.no2 r4 = r0.f25633b
            r4.mo19778e(r1)
            if (r2 != 0) goto L_0x01bd
        L_0x01b0:
            boolean r1 = r0.f25643l
            if (r1 == 0) goto L_0x01bd
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01bd
            r1 = 1
            r0.f25645n = r1
        L_0x01bd:
            com.google.android.gms.internal.ads.no2 r1 = r0.f25633b
            r1.mo19779f(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5730x3.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f25641j = b94;
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        C5545s3 s3Var;
        int size = this.f25632a.size();
        for (int i = 0; i < size; i++) {
            tv2 tv2 = this.f25632a.get(i);
            if (tv2.mo21175e() != -9223372036854775807L) {
                long c = tv2.mo21173c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            tv2.mo21176f(j2);
        }
        if (!(j2 == 0 || (s3Var = this.f25640i) == null)) {
            s3Var.mo20240d(j2);
        }
        this.f25633b.mo19776c(0);
        this.f25634c.clear();
        for (int i2 = 0; i2 < this.f25636e.size(); i2++) {
            this.f25636e.valueAt(i2).mo16852b();
        }
        this.f25646o = 0;
    }

    public C5730x3(int i, int i2, int i3) {
        tv2 tv2 = new tv2(0);
        this.f25635d = new C5359n2(0);
        this.f25632a = Collections.singletonList(tv2);
        this.f25633b = new no2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f25637f = sparseBooleanArray;
        this.f25638g = new SparseBooleanArray();
        SparseArray<C4990d4> sparseArray = new SparseArray<>();
        this.f25636e = sparseArray;
        this.f25634c = new SparseIntArray();
        this.f25639h = new C5582t3(112800);
        this.f25641j = b94.f14380c;
        this.f25647p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f25636e.put(sparseArray2.keyAt(i4), (C4990d4) sparseArray2.valueAt(i4));
        }
        this.f25636e.put(0, new C5434p3(new C5656v3(this)));
    }
}
