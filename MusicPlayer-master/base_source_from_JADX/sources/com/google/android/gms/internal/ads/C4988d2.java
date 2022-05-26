package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4988d2 extends C4914b2 {

    /* renamed from: n */
    private C4951c2 f15459n;

    /* renamed from: o */
    private int f15460o;

    /* renamed from: p */
    private boolean f15461p;

    /* renamed from: q */
    private ha4 f15462q;

    /* renamed from: r */
    private fa4 f15463r;

    C4988d2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo16005a(no2 no2) {
        int i;
        int i2 = 0;
        if ((no2.mo19781h()[0] & 1) == 1) {
            return -1;
        }
        byte b = no2.mo19781h()[0];
        C4951c2 c2Var = this.f15459n;
        gs1.m24484b(c2Var);
        if (!c2Var.f14780c[(b >> 1) & (255 >>> (8 - c2Var.f14781d))].f17008a) {
            i = c2Var.f14778a.f17597e;
        } else {
            i = c2Var.f14778a.f17598f;
        }
        if (this.f15461p) {
            i2 = (this.f15460o + i) / 4;
        }
        long j = (long) i2;
        if (no2.mo19783j() < no2.mo19785l() + 4) {
            byte[] copyOf = Arrays.copyOf(no2.mo19781h(), no2.mo19785l() + 4);
            no2.mo19777d(copyOf, copyOf.length);
        } else {
            no2.mo19778e(no2.mo19785l() + 4);
        }
        byte[] h = no2.mo19781h();
        h[no2.mo19785l() - 4] = (byte) ((int) (j & 255));
        h[no2.mo19785l() - 3] = (byte) ((int) ((j >>> 8) & 255));
        h[no2.mo19785l() - 2] = (byte) ((int) ((j >>> 16) & 255));
        h[no2.mo19785l() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f15461p = true;
        this.f15460o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16006b(boolean z) {
        super.mo16006b(z);
        if (z) {
            this.f15459n = null;
            this.f15462q = null;
            this.f15463r = null;
        }
        this.f15460o = 0;
        this.f15461p = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0409 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x040b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16007c(com.google.android.gms.internal.ads.no2 r26, long r27, com.google.android.gms.internal.ads.C5728x1 r29) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.c2 r3 = r0.f15459n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.gms.internal.ads.w r1 = r2.f25615a
            java.util.Objects.requireNonNull(r1)
            return r4
        L_0x0011:
            com.google.android.gms.internal.ads.ha4 r6 = r0.f15462q
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.ia4.m25127c(r11, r1, r4)
            int r13 = r26.mo19789p()
            int r14 = r26.mo19792s()
            int r15 = r26.mo19789p()
            int r6 = r26.mo19788o()
            if (r6 > 0) goto L_0x002f
            r16 = -1
            goto L_0x0031
        L_0x002f:
            r16 = r6
        L_0x0031:
            int r6 = r26.mo19788o()
            if (r6 > 0) goto L_0x003a
            r17 = -1
            goto L_0x003c
        L_0x003a:
            r17 = r6
        L_0x003c:
            int r6 = r26.mo19788o()
            if (r6 > 0) goto L_0x0045
            r18 = -1
            goto L_0x0047
        L_0x0045:
            r18 = r6
        L_0x0047:
            int r3 = r26.mo19792s()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.mo19792s()
            byte[] r8 = r26.mo19781h()
            int r1 = r26.mo19785l()
            byte[] r22 = java.util.Arrays.copyOf(r8, r1)
            com.google.android.gms.internal.ads.ha4 r1 = new com.google.android.gms.internal.ads.ha4
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L_0x0077
            r21 = 0
            goto L_0x0079
        L_0x0077:
            r21 = 1
        L_0x0079:
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f15462q = r1
            goto L_0x008f
        L_0x0084:
            com.google.android.gms.internal.ads.fa4 r8 = r0.f15463r
            if (r8 != 0) goto L_0x0092
            r9 = 1
            com.google.android.gms.internal.ads.fa4 r1 = com.google.android.gms.internal.ads.ia4.m25126b(r1, r9, r9)
            r0.f15463r = r1
        L_0x008f:
            r7 = 0
            goto L_0x0405
        L_0x0092:
            int r9 = r26.mo19785l()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.mo19781h()
            int r11 = r26.mo19785l()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.f17593a
            r11 = 5
            com.google.android.gms.internal.ads.ia4.m25127c(r11, r1, r4)
            int r12 = r26.mo19792s()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.ea4 r13 = new com.google.android.gms.internal.ads.ea4
            byte[] r14 = r26.mo19781h()
            r13.<init>(r14)
            int r1 = r26.mo19784k()
            r14 = 8
            int r1 = r1 * 8
            r13.mo17150c(r1)
            r1 = 0
        L_0x00c4:
            r15 = 24
            r3 = 16
            if (r1 >= r12) goto L_0x01e3
            int r14 = r13.mo17149b(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x01c6
            int r3 = r13.mo17149b(r3)
            int r7 = r13.mo17149b(r15)
            long[] r14 = new long[r7]
            boolean r15 = r13.mo17151d()
            r18 = 0
            if (r15 != 0) goto L_0x0122
            boolean r15 = r13.mo17151d()
            r4 = 0
        L_0x00ea:
            if (r4 >= r7) goto L_0x011f
            if (r15 == 0) goto L_0x010a
            boolean r21 = r13.mo17151d()
            if (r21 == 0) goto L_0x0102
            int r21 = r13.mo17149b(r11)
            r22 = 1
            int r5 = r21 + 1
            r23 = r12
            long r11 = (long) r5
            r14[r4] = r11
            goto L_0x0108
        L_0x0102:
            r23 = r12
            r22 = 1
            r14[r4] = r18
        L_0x0108:
            r5 = 5
            goto L_0x0118
        L_0x010a:
            r23 = r12
            r5 = 5
            r22 = 1
            int r11 = r13.mo17149b(r5)
            int r11 = r11 + 1
            long r11 = (long) r11
            r14[r4] = r11
        L_0x0118:
            int r4 = r4 + 1
            r12 = r23
            r5 = 4
            r11 = 5
            goto L_0x00ea
        L_0x011f:
            r23 = r12
            goto L_0x015a
        L_0x0122:
            r23 = r12
            r5 = 5
            r22 = 1
            int r4 = r13.mo17149b(r5)
            int r4 = r4 + 1
            r5 = 0
        L_0x012e:
            if (r5 >= r7) goto L_0x015a
            int r11 = r7 - r5
            int r11 = com.google.android.gms.internal.ads.ia4.m25125a(r11)
            int r11 = r13.mo17149b(r11)
            r12 = 0
        L_0x013b:
            if (r12 >= r11) goto L_0x014f
            if (r5 >= r7) goto L_0x014f
            r22 = r8
            r24 = r9
            long r8 = (long) r4
            r14[r5] = r8
            int r5 = r5 + 1
            int r12 = r12 + 1
            r8 = r22
            r9 = r24
            goto L_0x013b
        L_0x014f:
            r22 = r8
            r24 = r9
            int r4 = r4 + 1
            r8 = r22
            r9 = r24
            goto L_0x012e
        L_0x015a:
            r22 = r8
            r24 = r9
            r4 = 4
            int r5 = r13.mo17149b(r4)
            r8 = 2
            if (r5 > r8) goto L_0x01ad
            r9 = 1
            if (r5 == r9) goto L_0x016c
            if (r5 != r8) goto L_0x019e
            r5 = 2
        L_0x016c:
            r8 = 32
            r13.mo17150c(r8)
            r13.mo17150c(r8)
            int r8 = r13.mo17149b(r4)
            int r8 = r8 + r9
            r13.mo17150c(r9)
            if (r5 != r9) goto L_0x0193
            if (r3 == 0) goto L_0x0197
            long r4 = (long) r7
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r14 = (long) r3
            double r14 = (double) r14
            double r11 = r11 / r14
            double r3 = java.lang.Math.pow(r4, r11)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            r18 = r3
            goto L_0x0197
        L_0x0193:
            long r4 = (long) r7
            long r11 = (long) r3
            long r18 = r4 * r11
        L_0x0197:
            long r3 = (long) r8
            long r3 = r3 * r18
            int r4 = (int) r3
            r13.mo17150c(r4)
        L_0x019e:
            int r1 = r1 + 1
            r8 = r22
            r12 = r23
            r9 = r24
            r4 = 0
            r5 = 4
            r11 = 5
            r14 = 8
            goto L_0x00c4
        L_0x01ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 53
            r1.<init>(r2)
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x01c6:
            r2 = 0
            int r1 = r13.mo17148a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 66
            r3.<init>(r4)
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x01e3:
            r22 = r8
            r24 = r9
            r1 = 6
            int r4 = r13.mo17149b(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01ef:
            if (r5 >= r4) goto L_0x0202
            int r7 = r13.mo17149b(r3)
            if (r7 != 0) goto L_0x01fa
            int r5 = r5 + 1
            goto L_0x01ef
        L_0x01fa:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x0202:
            int r4 = r13.mo17149b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x0209:
            r8 = 3
            r9 = 52
            if (r7 >= r4) goto L_0x02c5
            int r11 = r13.mo17149b(r3)
            if (r11 == 0) goto L_0x0299
            if (r11 != r5) goto L_0x0282
            r5 = 5
            int r9 = r13.mo17149b(r5)
            int[] r5 = new int[r9]
            r11 = 0
            r12 = -1
        L_0x021f:
            if (r11 >= r9) goto L_0x0230
            r14 = 4
            int r15 = r13.mo17149b(r14)
            r5[r11] = r15
            if (r15 <= r12) goto L_0x022b
            r12 = r15
        L_0x022b:
            int r11 = r11 + 1
            r15 = 24
            goto L_0x021f
        L_0x0230:
            int r12 = r12 + 1
            int[] r11 = new int[r12]
            r14 = 0
        L_0x0235:
            if (r14 >= r12) goto L_0x0264
            int r15 = r13.mo17149b(r8)
            r19 = 1
            int r15 = r15 + 1
            r11[r14] = r15
            r15 = 2
            int r23 = r13.mo17149b(r15)
            if (r23 <= 0) goto L_0x024e
            r15 = 8
            r13.mo17150c(r15)
            goto L_0x0250
        L_0x024e:
            r15 = 8
        L_0x0250:
            r8 = 0
        L_0x0251:
            int r1 = r19 << r23
            if (r8 >= r1) goto L_0x025f
            r13.mo17150c(r15)
            int r8 = r8 + 1
            r15 = 8
            r19 = 1
            goto L_0x0251
        L_0x025f:
            int r14 = r14 + 1
            r1 = 6
            r8 = 3
            goto L_0x0235
        L_0x0264:
            r1 = 2
            r13.mo17150c(r1)
            r1 = 4
            int r8 = r13.mo17149b(r1)
            r1 = 0
            r12 = 0
            r14 = 0
        L_0x0270:
            if (r1 >= r9) goto L_0x02bd
            r15 = r5[r1]
            r15 = r11[r15]
            int r12 = r12 + r15
        L_0x0277:
            if (r14 >= r12) goto L_0x027f
            r13.mo17150c(r8)
            int r14 = r14 + 1
            goto L_0x0277
        L_0x027f:
            int r1 = r1 + 1
            goto L_0x0270
        L_0x0282:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x0299:
            r1 = 8
            r13.mo17150c(r1)
            r13.mo17150c(r3)
            r13.mo17150c(r3)
            r5 = 6
            r13.mo17150c(r5)
            r13.mo17150c(r1)
            r5 = 4
            int r8 = r13.mo17149b(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = 0
        L_0x02b3:
            if (r5 >= r8) goto L_0x02bd
            r13.mo17150c(r1)
            int r5 = r5 + 1
            r1 = 8
            goto L_0x02b3
        L_0x02bd:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            r15 = 24
            goto L_0x0209
        L_0x02c5:
            int r4 = r13.mo17149b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x02cc:
            if (r7 >= r4) goto L_0x033a
            int r8 = r13.mo17149b(r3)
            r11 = 2
            if (r8 > r11) goto L_0x0332
            r8 = 24
            r13.mo17150c(r8)
            r13.mo17150c(r8)
            r13.mo17150c(r8)
            int r11 = r13.mo17149b(r1)
            int r11 = r11 + r5
            r1 = 8
            r13.mo17150c(r1)
            int[] r5 = new int[r11]
            r12 = 0
        L_0x02ed:
            if (r12 >= r11) goto L_0x030e
            r14 = 3
            int r15 = r13.mo17149b(r14)
            boolean r18 = r13.mo17151d()
            if (r18 == 0) goto L_0x0300
            r8 = 5
            int r19 = r13.mo17149b(r8)
            goto L_0x0303
        L_0x0300:
            r8 = 5
            r19 = 0
        L_0x0303:
            int r19 = r19 * 8
            int r19 = r19 + r15
            r5[r12] = r19
            int r12 = r12 + 1
            r8 = 24
            goto L_0x02ed
        L_0x030e:
            r8 = 5
            r14 = 3
            r12 = 0
        L_0x0311:
            if (r12 >= r11) goto L_0x032d
            r15 = 0
        L_0x0314:
            if (r15 >= r1) goto L_0x0328
            r19 = r5[r12]
            r21 = 1
            int r23 = r21 << r15
            r19 = r19 & r23
            if (r19 == 0) goto L_0x0323
            r13.mo17150c(r1)
        L_0x0323:
            int r15 = r15 + 1
            r1 = 8
            goto L_0x0314
        L_0x0328:
            int r12 = r12 + 1
            r1 = 8
            goto L_0x0311
        L_0x032d:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            goto L_0x02cc
        L_0x0332:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x033a:
            int r4 = r13.mo17149b(r1)
            r1 = 1
            int r4 = r4 + r1
            r1 = 0
        L_0x0341:
            if (r1 >= r4) goto L_0x03c6
            int r5 = r13.mo17149b(r3)
            if (r5 == 0) goto L_0x0362
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "VorbisUtil"
            android.util.Log.e(r7, r5)
            r5 = 2
            r11 = 4
            goto L_0x03bb
        L_0x0362:
            boolean r5 = r13.mo17151d()
            if (r5 == 0) goto L_0x0370
            r5 = 4
            int r7 = r13.mo17149b(r5)
            r5 = 1
            int r7 = r7 + r5
            goto L_0x0372
        L_0x0370:
            r5 = 1
            r7 = 1
        L_0x0372:
            boolean r8 = r13.mo17151d()
            if (r8 == 0) goto L_0x0395
            r8 = 8
            int r11 = r13.mo17149b(r8)
            int r11 = r11 + r5
            r5 = 0
        L_0x0380:
            if (r5 >= r11) goto L_0x0395
            int r8 = r10 + -1
            int r12 = com.google.android.gms.internal.ads.ia4.m25125a(r8)
            r13.mo17150c(r12)
            int r8 = com.google.android.gms.internal.ads.ia4.m25125a(r8)
            r13.mo17150c(r8)
            int r5 = r5 + 1
            goto L_0x0380
        L_0x0395:
            r5 = 2
            int r8 = r13.mo17149b(r5)
            if (r8 != 0) goto L_0x03be
            r8 = 1
            if (r7 <= r8) goto L_0x03a9
            r8 = 0
        L_0x03a0:
            if (r8 >= r10) goto L_0x03a9
            r11 = 4
            r13.mo17150c(r11)
            int r8 = r8 + 1
            goto L_0x03a0
        L_0x03a9:
            r11 = 4
            r8 = 0
        L_0x03ab:
            if (r8 >= r7) goto L_0x03bb
            r12 = 8
            r13.mo17150c(r12)
            r13.mo17150c(r12)
            r13.mo17150c(r12)
            int r8 = r8 + 1
            goto L_0x03ab
        L_0x03bb:
            int r1 = r1 + 1
            goto L_0x0341
        L_0x03be:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x03c6:
            r1 = 6
            int r1 = r13.mo17149b(r1)
            r4 = 1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.ga4[] r9 = new com.google.android.gms.internal.ads.ga4[r1]
            r4 = 0
        L_0x03d0:
            if (r4 >= r1) goto L_0x03ee
            boolean r5 = r13.mo17151d()
            int r7 = r13.mo17149b(r3)
            int r8 = r13.mo17149b(r3)
            r10 = 8
            int r11 = r13.mo17149b(r10)
            com.google.android.gms.internal.ads.ga4 r12 = new com.google.android.gms.internal.ads.ga4
            r12.<init>(r5, r7, r8, r11)
            r9[r4] = r12
            int r4 = r4 + 1
            goto L_0x03d0
        L_0x03ee:
            boolean r3 = r13.mo17151d()
            if (r3 == 0) goto L_0x0445
            com.google.android.gms.internal.ads.c2 r3 = new com.google.android.gms.internal.ads.c2
            r4 = -1
            int r1 = r1 + r4
            int r10 = com.google.android.gms.internal.ads.ia4.m25125a(r1)
            r5 = r3
            r7 = r22
            r8 = r24
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r3
        L_0x0405:
            r0.f15459n = r7
            if (r7 != 0) goto L_0x040b
            r1 = 1
            return r1
        L_0x040b:
            com.google.android.gms.internal.ads.ha4 r1 = r7.f14778a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f17599g
            r3.add(r4)
            byte[] r4 = r7.f14779b
            r3.add(r4)
            com.google.android.gms.internal.ads.jb4 r4 = new com.google.android.gms.internal.ads.jb4
            r4.<init>()
            java.lang.String r5 = "audio/vorbis"
            r4.mo18599s(r5)
            int r5 = r1.f17596d
            r4.mo18580d0(r5)
            int r5 = r1.f17595c
            r4.mo18595o(r5)
            int r5 = r1.f17593a
            r4.mo18582e0(r5)
            int r1 = r1.f17594b
            r4.mo18600t(r1)
            r4.mo18589i(r3)
            com.google.android.gms.internal.ads.w r1 = r4.mo18605y()
            r2.f25615a = r1
            r1 = 1
            return r1
        L_0x0445:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4988d2.mo16007c(com.google.android.gms.internal.ads.no2, long, com.google.android.gms.internal.ads.x1):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo16012h(long j) {
        super.mo16012h(j);
        int i = 0;
        this.f15461p = j != 0;
        ha4 ha4 = this.f15462q;
        if (ha4 != null) {
            i = ha4.f17597e;
        }
        this.f15460o = i;
    }
}
