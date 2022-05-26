package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4878a3 implements C5470q2 {

    /* renamed from: a */
    private final C5471q3 f13747a;

    /* renamed from: b */
    private String f13748b;

    /* renamed from: c */
    private da4 f13749c;

    /* renamed from: d */
    private C5804z2 f13750d;

    /* renamed from: e */
    private boolean f13751e;

    /* renamed from: f */
    private final boolean[] f13752f = new boolean[3];

    /* renamed from: g */
    private final C5026e3 f13753g = new C5026e3(32, 128);

    /* renamed from: h */
    private final C5026e3 f13754h = new C5026e3(33, 128);

    /* renamed from: i */
    private final C5026e3 f13755i = new C5026e3(34, 128);

    /* renamed from: j */
    private final C5026e3 f13756j = new C5026e3(39, 128);

    /* renamed from: k */
    private final C5026e3 f13757k = new C5026e3(40, 128);

    /* renamed from: l */
    private long f13758l;

    /* renamed from: m */
    private long f13759m = -9223372036854775807L;

    /* renamed from: n */
    private final no2 f13760n = new no2();

    public C4878a3(C5471q3 q3Var) {
        this.f13747a = q3Var;
    }

    /* renamed from: e */
    private final void m20584e(byte[] bArr, int i, int i2) {
        this.f13750d.mo22322b(bArr, i, i2);
        if (!this.f13751e) {
            this.f13753g.mo17105a(bArr, i, i2);
            this.f13754h.mo17105a(bArr, i, i2);
            this.f13755i.mo17105a(bArr, i, i2);
        }
        this.f13756j.mo17105a(bArr, i, i2);
        this.f13757k.mo17105a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r37) {
        /*
            r36 = this;
            r0 = r36
            com.google.android.gms.internal.ads.da4 r1 = r0.f13749c
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            int r1 = com.google.android.gms.internal.ads.wy2.f25579a
        L_0x0009:
            int r1 = r37.mo19782i()
            if (r1 <= 0) goto L_0x03e4
            int r1 = r37.mo19784k()
            int r2 = r37.mo19785l()
            byte[] r3 = r37.mo19781h()
            long r4 = r0.f13758l
            int r6 = r37.mo19782i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f13758l = r4
            com.google.android.gms.internal.ads.da4 r4 = r0.f13749c
            int r5 = r37.mo19782i()
            r6 = r37
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f13752f
            int r4 = com.google.android.gms.internal.ads.df2.m22488a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03e1
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m20584e(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f13758l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f13759m
            com.google.android.gms.internal.ads.z2 r9 = r0.f13750d
            boolean r15 = r0.f13751e
            r9.mo22321a(r10, r12, r15)
            boolean r9 = r0.f13751e
            if (r9 != 0) goto L_0x0341
            com.google.android.gms.internal.ads.e3 r9 = r0.f13753g
            r9.mo17108d(r4)
            com.google.android.gms.internal.ads.e3 r9 = r0.f13754h
            r9.mo17108d(r4)
            com.google.android.gms.internal.ads.e3 r9 = r0.f13755i
            r9.mo17108d(r4)
            com.google.android.gms.internal.ads.e3 r9 = r0.f13753g
            boolean r9 = r9.mo17109e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.e3 r9 = r0.f13754h
            boolean r9 = r9.mo17109e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.e3 r9 = r0.f13755i
            boolean r9 = r9.mo17109e()
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.internal.ads.da4 r9 = r0.f13749c
            java.lang.String r8 = r0.f13748b
            com.google.android.gms.internal.ads.e3 r15 = r0.f13753g
            com.google.android.gms.internal.ads.e3 r1 = r0.f13754h
            r18 = r5
            com.google.android.gms.internal.ads.e3 r5 = r0.f13755i
            int r6 = r15.f15844e
            r19 = r2
            int r2 = r1.f15844e
            int r2 = r2 + r6
            r20 = r3
            int r3 = r5.f15844e
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r15.f15843d
            r21 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r1.f15843d
            int r6 = r15.f15844e
            r17 = r12
            int r12 = r1.f15844e
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r5.f15843d
            int r6 = r15.f15844e
            int r12 = r1.f15844e
            int r6 = r6 + r12
            int r5 = r5.f15844e
            java.lang.System.arraycopy(r3, r7, r2, r6, r5)
            com.google.android.gms.internal.ads.op2 r3 = new com.google.android.gms.internal.ads.op2
            byte[] r5 = r1.f15843d
            int r1 = r1.f15844e
            r3.<init>(r5, r7, r1)
            r1 = 44
            r3.mo20072e(r1)
            r1 = 3
            int r5 = r3.mo20068a(r1)
            r3.mo20071d()
            r6 = 2
            int r22 = r3.mo20068a(r6)
            boolean r23 = r3.mo20073f()
            r12 = 5
            int r24 = r3.mo20068a(r12)
            r12 = 0
            r25 = 0
        L_0x00e8:
            r15 = 32
            if (r12 >= r15) goto L_0x00fa
            boolean r15 = r3.mo20073f()
            if (r15 == 0) goto L_0x00f7
            r15 = 1
            int r26 = r15 << r12
            r25 = r25 | r26
        L_0x00f7:
            int r12 = r12 + 1
            goto L_0x00e8
        L_0x00fa:
            r12 = 6
            int[] r15 = new int[r12]
        L_0x00fd:
            r6 = 8
            if (r7 >= r12) goto L_0x010a
            int r6 = r3.mo20068a(r6)
            r15[r7] = r6
            int r7 = r7 + 1
            goto L_0x00fd
        L_0x010a:
            int r7 = r3.mo20068a(r6)
            r6 = 0
            r12 = 0
        L_0x0110:
            if (r6 >= r5) goto L_0x0125
            boolean r29 = r3.mo20073f()
            if (r29 == 0) goto L_0x011a
            int r12 = r12 + 89
        L_0x011a:
            boolean r29 = r3.mo20073f()
            if (r29 == 0) goto L_0x0122
            int r12 = r12 + 8
        L_0x0122:
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0125:
            r3.mo20072e(r12)
            if (r5 <= 0) goto L_0x0130
            int r6 = 8 - r5
            int r6 = r6 + r6
            r3.mo20072e(r6)
        L_0x0130:
            r3.mo20070c()
            int r6 = r3.mo20070c()
            if (r6 != r1) goto L_0x013d
            r3.mo20071d()
            r6 = 3
        L_0x013d:
            int r12 = r3.mo20070c()
            int r29 = r3.mo20070c()
            boolean r30 = r3.mo20073f()
            if (r30 == 0) goto L_0x017f
            int r30 = r3.mo20070c()
            int r31 = r3.mo20070c()
            int r32 = r3.mo20070c()
            int r33 = r3.mo20070c()
            r1 = 1
            if (r6 == r1) goto L_0x016a
            r1 = 2
            if (r6 != r1) goto L_0x0166
            r34 = r10
            r1 = 2
            r6 = 2
            goto L_0x016d
        L_0x0166:
            r34 = r10
            r1 = 1
            goto L_0x016d
        L_0x016a:
            r34 = r10
            r1 = 2
        L_0x016d:
            r10 = 1
            if (r6 != r10) goto L_0x0172
            r6 = 2
            goto L_0x0173
        L_0x0172:
            r6 = 1
        L_0x0173:
            int r30 = r30 + r31
            int r1 = r1 * r30
            int r12 = r12 - r1
            int r32 = r32 + r33
            int r6 = r6 * r32
            int r29 = r29 - r6
            goto L_0x0181
        L_0x017f:
            r34 = r10
        L_0x0181:
            r3.mo20070c()
            r3.mo20070c()
            int r1 = r3.mo20070c()
            boolean r6 = r3.mo20073f()
            r10 = 1
            if (r10 == r6) goto L_0x0194
            r6 = r5
            goto L_0x0195
        L_0x0194:
            r6 = 0
        L_0x0195:
            if (r6 > r5) goto L_0x01a3
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20070c()
            int r6 = r6 + 1
            goto L_0x0195
        L_0x01a3:
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20070c()
            boolean r5 = r3.mo20073f()
            r6 = 4
            if (r5 == 0) goto L_0x0204
            boolean r5 = r3.mo20073f()
            if (r5 == 0) goto L_0x0204
            r5 = 0
        L_0x01c3:
            if (r5 >= r6) goto L_0x0204
            r10 = 0
        L_0x01c6:
            r11 = 6
            if (r10 >= r11) goto L_0x01fd
            boolean r28 = r3.mo20073f()
            if (r28 != 0) goto L_0x01d6
            r3.mo20070c()
            r32 = r13
        L_0x01d4:
            r6 = 3
            goto L_0x01f3
        L_0x01d6:
            r11 = 64
            int r30 = r5 + r5
            int r30 = r30 + 4
            r32 = r13
            r6 = 1
            int r13 = r6 << r30
            int r11 = java.lang.Math.min(r11, r13)
            if (r5 <= r6) goto L_0x01ea
            r3.mo20069b()
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            if (r6 >= r11) goto L_0x01d4
            r3.mo20069b()
            int r6 = r6 + 1
            goto L_0x01eb
        L_0x01f3:
            if (r5 != r6) goto L_0x01f7
            r11 = 3
            goto L_0x01f8
        L_0x01f7:
            r11 = 1
        L_0x01f8:
            int r10 = r10 + r11
            r13 = r32
            r6 = 4
            goto L_0x01c6
        L_0x01fd:
            r32 = r13
            r6 = 3
            int r5 = r5 + 1
            r6 = 4
            goto L_0x01c3
        L_0x0204:
            r32 = r13
            r5 = 2
            r3.mo20072e(r5)
            boolean r5 = r3.mo20073f()
            if (r5 == 0) goto L_0x021e
            r5 = 8
            r3.mo20072e(r5)
            r3.mo20070c()
            r3.mo20070c()
            r3.mo20071d()
        L_0x021e:
            int r5 = r3.mo20070c()
            r6 = 0
            r10 = 0
            r11 = 0
        L_0x0225:
            if (r6 >= r5) goto L_0x0271
            if (r6 == 0) goto L_0x022d
            boolean r10 = r3.mo20073f()
        L_0x022d:
            if (r10 == 0) goto L_0x0247
            r3.mo20071d()
            r3.mo20070c()
            r13 = 0
        L_0x0236:
            if (r13 > r11) goto L_0x0244
            boolean r14 = r3.mo20073f()
            if (r14 == 0) goto L_0x0241
            r3.mo20071d()
        L_0x0241:
            int r13 = r13 + 1
            goto L_0x0236
        L_0x0244:
            r28 = r5
            goto L_0x026c
        L_0x0247:
            int r11 = r3.mo20070c()
            int r13 = r3.mo20070c()
            int r14 = r11 + r13
            r28 = r5
            r5 = 0
        L_0x0254:
            if (r5 >= r11) goto L_0x025f
            r3.mo20070c()
            r3.mo20071d()
            int r5 = r5 + 1
            goto L_0x0254
        L_0x025f:
            r5 = 0
        L_0x0260:
            if (r5 >= r13) goto L_0x026b
            r3.mo20070c()
            r3.mo20071d()
            int r5 = r5 + 1
            goto L_0x0260
        L_0x026b:
            r11 = r14
        L_0x026c:
            int r6 = r6 + 1
            r5 = r28
            goto L_0x0225
        L_0x0271:
            boolean r5 = r3.mo20073f()
            if (r5 == 0) goto L_0x0287
            r5 = 0
        L_0x0278:
            int r6 = r3.mo20070c()
            if (r5 >= r6) goto L_0x0287
            r6 = 5
            int r10 = r1 + 5
            r3.mo20072e(r10)
            int r5 = r5 + 1
            goto L_0x0278
        L_0x0287:
            r1 = 2
            r3.mo20072e(r1)
            boolean r1 = r3.mo20073f()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x030c
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x02d7
            r1 = 8
            int r1 = r3.mo20068a(r1)
            r6 = 255(0xff, float:3.57E-43)
            if (r1 != r6) goto L_0x02b5
            r1 = 16
            int r6 = r3.mo20068a(r1)
            int r1 = r3.mo20068a(r1)
            if (r6 == 0) goto L_0x02d7
            if (r1 == 0) goto L_0x02d7
            float r5 = (float) r6
            float r1 = (float) r1
            float r5 = r5 / r1
            goto L_0x02d7
        L_0x02b5:
            r6 = 17
            if (r1 >= r6) goto L_0x02bf
            float[] r5 = com.google.android.gms.internal.ads.df2.f15601b
            r1 = r5[r1]
            r5 = r1
            goto L_0x02d7
        L_0x02bf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r10 = 46
            r6.<init>(r10)
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r6.append(r10)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r6 = "H265Reader"
            android.util.Log.w(r6, r1)
        L_0x02d7:
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x02e0
            r3.mo20071d()
        L_0x02e0:
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x02f5
            r1 = 4
            r3.mo20072e(r1)
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x02f5
            r1 = 24
            r3.mo20072e(r1)
        L_0x02f5:
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x0301
            r3.mo20070c()
            r3.mo20070c()
        L_0x0301:
            r3.mo20071d()
            boolean r1 = r3.mo20073f()
            if (r1 == 0) goto L_0x030c
            int r29 = r29 + r29
        L_0x030c:
            r1 = r29
            r26 = r15
            r27 = r7
            java.lang.String r3 = com.google.android.gms.internal.ads.ju1.m25965b(r22, r23, r24, r25, r26, r27)
            com.google.android.gms.internal.ads.jb4 r6 = new com.google.android.gms.internal.ads.jb4
            r6.<init>()
            r6.mo18587h(r8)
            java.lang.String r7 = "video/hevc"
            r6.mo18599s(r7)
            r6.mo18584f0(r3)
            r6.mo18604x(r12)
            r6.mo18583f(r1)
            r6.mo18596p(r5)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r6.mo18589i(r1)
            com.google.android.gms.internal.ads.w r1 = r6.mo18605y()
            r9.mo16885a(r1)
            r1 = 1
            r0.f13751e = r1
            goto L_0x034f
        L_0x0341:
            r19 = r2
            r20 = r3
            r18 = r5
            r21 = r7
            r34 = r10
            r17 = r12
            r32 = r13
        L_0x034f:
            com.google.android.gms.internal.ads.e3 r1 = r0.f13756j
            boolean r1 = r1.mo17108d(r4)
            if (r1 == 0) goto L_0x037a
            com.google.android.gms.internal.ads.e3 r1 = r0.f13756j
            byte[] r2 = r1.f15843d
            int r1 = r1.f15844e
            int r1 = com.google.android.gms.internal.ads.df2.m22489b(r2, r1)
            com.google.android.gms.internal.ads.no2 r2 = r0.f13760n
            com.google.android.gms.internal.ads.e3 r3 = r0.f13756j
            byte[] r3 = r3.f15843d
            r2.mo19777d(r3, r1)
            com.google.android.gms.internal.ads.no2 r1 = r0.f13760n
            r2 = 5
            r1.mo19780g(r2)
            com.google.android.gms.internal.ads.q3 r1 = r0.f13747a
            com.google.android.gms.internal.ads.no2 r2 = r0.f13760n
            r5 = r32
            r1.mo20386a(r5, r2)
            goto L_0x037c
        L_0x037a:
            r5 = r32
        L_0x037c:
            com.google.android.gms.internal.ads.e3 r1 = r0.f13757k
            boolean r1 = r1.mo17108d(r4)
            if (r1 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.e3 r1 = r0.f13757k
            byte[] r2 = r1.f15843d
            int r1 = r1.f15844e
            int r1 = com.google.android.gms.internal.ads.df2.m22489b(r2, r1)
            com.google.android.gms.internal.ads.no2 r2 = r0.f13760n
            com.google.android.gms.internal.ads.e3 r3 = r0.f13757k
            byte[] r3 = r3.f15843d
            r2.mo19777d(r3, r1)
            com.google.android.gms.internal.ads.no2 r1 = r0.f13760n
            r2 = 5
            r1.mo19780g(r2)
            com.google.android.gms.internal.ads.q3 r1 = r0.f13747a
            com.google.android.gms.internal.ads.no2 r2 = r0.f13760n
            r1.mo20386a(r5, r2)
        L_0x03a4:
            long r14 = r0.f13759m
            com.google.android.gms.internal.ads.z2 r9 = r0.f13750d
            boolean r1 = r0.f13751e
            r10 = r34
            r12 = r17
            r13 = r21
            r16 = r1
            r9.mo22324d(r10, r12, r13, r14, r16)
            boolean r1 = r0.f13751e
            if (r1 != 0) goto L_0x03cb
            com.google.android.gms.internal.ads.e3 r1 = r0.f13753g
            r2 = r21
            r1.mo17107c(r2)
            com.google.android.gms.internal.ads.e3 r1 = r0.f13754h
            r1.mo17107c(r2)
            com.google.android.gms.internal.ads.e3 r1 = r0.f13755i
            r1.mo17107c(r2)
            goto L_0x03cd
        L_0x03cb:
            r2 = r21
        L_0x03cd:
            com.google.android.gms.internal.ads.e3 r1 = r0.f13756j
            r1.mo17107c(r2)
            com.google.android.gms.internal.ads.e3 r1 = r0.f13757k
            r1.mo17107c(r2)
            r6 = r37
            r1 = r18
            r2 = r19
            r3 = r20
            goto L_0x0030
        L_0x03e1:
            r0.m20584e(r3, r1, r2)
        L_0x03e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4878a3.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f13748b = c4Var.mo16482b();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 2);
        this.f13749c = s;
        this.f13750d = new C5804z2(s);
        this.f13747a.mo20387b(b94, c4Var);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f13759m = j;
        }
    }

    public final void zze() {
        this.f13758l = 0;
        this.f13759m = -9223372036854775807L;
        df2.m22492e(this.f13752f);
        this.f13753g.mo17106b();
        this.f13754h.mo17106b();
        this.f13755i.mo17106b();
        this.f13756j.mo17106b();
        this.f13757k.mo17106b();
        C5804z2 z2Var = this.f13750d;
        if (z2Var != null) {
            z2Var.mo22323c();
        }
    }
}
