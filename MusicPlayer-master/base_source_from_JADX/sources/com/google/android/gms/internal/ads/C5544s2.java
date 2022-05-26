package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5544s2 implements C5470q2 {

    /* renamed from: q */
    private static final double[] f23299q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f23300a;

    /* renamed from: b */
    private da4 f23301b;

    /* renamed from: c */
    private final C5064f4 f23302c;

    /* renamed from: d */
    private final no2 f23303d;

    /* renamed from: e */
    private final C5026e3 f23304e;

    /* renamed from: f */
    private final boolean[] f23305f = new boolean[4];

    /* renamed from: g */
    private final C5507r2 f23306g = new C5507r2(128);

    /* renamed from: h */
    private long f23307h;

    /* renamed from: i */
    private boolean f23308i;

    /* renamed from: j */
    private boolean f23309j;

    /* renamed from: k */
    private long f23310k;

    /* renamed from: l */
    private long f23311l;

    /* renamed from: m */
    private long f23312m;

    /* renamed from: n */
    private long f23313n;

    /* renamed from: o */
    private boolean f23314o;

    /* renamed from: p */
    private boolean f23315p;

    C5544s2(C5064f4 f4Var) {
        no2 no2;
        this.f23302c = f4Var;
        if (f4Var != null) {
            this.f23304e = new C5026e3(178, 128);
            no2 = new no2();
        } else {
            no2 = null;
            this.f23304e = null;
        }
        this.f23303d = no2;
        this.f23311l = -9223372036854775807L;
        this.f23313n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0189  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.da4 r1 = r0.f23301b
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            int r1 = r20.mo19784k()
            int r2 = r20.mo19785l()
            byte[] r3 = r20.mo19781h()
            long r4 = r0.f23307h
            int r6 = r20.mo19782i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f23307h = r4
            com.google.android.gms.internal.ads.da4 r4 = r0.f23301b
            int r5 = r20.mo19782i()
            r6 = r20
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f23305f
            int r4 = com.google.android.gms.internal.ads.df2.m22488a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f23309j
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.r2 r4 = r0.f23306g
            r4.mo20548a(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.e3 r4 = r0.f23304e
            if (r4 == 0) goto L_0x0040
            r4.mo17105a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r20.mo19781h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f23309j
            if (r9 != 0) goto L_0x0130
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.r2 r9 = r0.f23306g
            r9.mo20548a(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.r2 r12 = r0.f23306g
            boolean r9 = r12.mo20550c(r7, r9)
            if (r9 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.r2 r9 = r0.f23306g
            java.lang.String r12 = r0.f23300a
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.f22709d
            int r14 = r9.f22707b
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            int r17 = r10 >> 4
            r15 = r15 | r17
            r10 = r10 & 15
            r11 = 8
            int r10 = r10 << r11
            r18 = 6
            byte r11 = r13[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = 7
            byte r14 = r13[r11]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r11 = 4
            int r14 = r14 >> r11
            r11 = 2
            if (r14 == r11) goto L_0x00af
            r11 = 3
            if (r14 == r11) goto L_0x00a9
            r11 = 4
            if (r14 == r11) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r10 * 121
            float r11 = (float) r11
            int r14 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r10 * 16
            float r11 = (float) r11
            int r14 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r10 * 4
            float r11 = (float) r11
            int r14 = r15 * 3
        L_0x00b4:
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x00b6:
            com.google.android.gms.internal.ads.jb4 r14 = new com.google.android.gms.internal.ads.jb4
            r14.<init>()
            r14.mo18587h(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.mo18599s(r12)
            r14.mo18604x(r15)
            r14.mo18583f(r10)
            r14.mo18596p(r11)
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r14.mo18589i(r10)
            com.google.android.gms.internal.ads.w r10 = r14.mo18605y()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            r14 = 0
            if (r11 < 0) goto L_0x010f
            r12 = 8
            if (r11 >= r12) goto L_0x010f
            double[] r12 = f23299q
            r11 = r12[r11]
            int r9 = r9.f22708c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0105
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r15
            int r9 = r9 + 1
            r16 = r5
            double r5 = (double) r9
            double r13 = r13 / r5
            double r11 = r11 * r13
            goto L_0x0107
        L_0x0105:
            r16 = r5
        L_0x0107:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r11
            long r14 = (long) r5
            goto L_0x0111
        L_0x010f:
            r16 = r5
        L_0x0111:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            android.util.Pair r5 = android.util.Pair.create(r10, r5)
            com.google.android.gms.internal.ads.da4 r6 = r0.f23301b
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.ads.w r9 = (com.google.android.gms.internal.ads.C5689w) r9
            r6.mo16885a(r9)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.f23310k = r5
            r5 = 1
            r0.f23309j = r5
            goto L_0x0132
        L_0x0130:
            r16 = r5
        L_0x0132:
            com.google.android.gms.internal.ads.e3 r5 = r0.f23304e
            r6 = 178(0xb2, float:2.5E-43)
            if (r5 == 0) goto L_0x017a
            if (r8 <= 0) goto L_0x013f
            r5.mo17105a(r3, r1, r4)
            r1 = 0
            goto L_0x0140
        L_0x013f:
            int r1 = -r8
        L_0x0140:
            com.google.android.gms.internal.ads.e3 r5 = r0.f23304e
            boolean r1 = r5.mo17108d(r1)
            if (r1 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.e3 r1 = r0.f23304e
            byte[] r5 = r1.f15843d
            int r1 = r1.f15844e
            int r1 = com.google.android.gms.internal.ads.df2.m22489b(r5, r1)
            com.google.android.gms.internal.ads.no2 r5 = r0.f23303d
            int r8 = com.google.android.gms.internal.ads.wy2.f25579a
            com.google.android.gms.internal.ads.e3 r8 = r0.f23304e
            byte[] r8 = r8.f15843d
            r5.mo19777d(r8, r1)
            com.google.android.gms.internal.ads.f4 r1 = r0.f23302c
            long r8 = r0.f23313n
            com.google.android.gms.internal.ads.no2 r5 = r0.f23303d
            r1.mo17483a(r8, r5)
        L_0x0166:
            if (r7 != r6) goto L_0x017a
            byte[] r1 = r20.mo19781h()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x0178
            com.google.android.gms.internal.ads.e3 r1 = r0.f23304e
            r1.mo17107c(r6)
        L_0x0178:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x017a:
            if (r7 == 0) goto L_0x0189
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x0181
            goto L_0x0189
        L_0x0181:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e4
            r1 = 1
            r0.f23314o = r1
            goto L_0x01e4
        L_0x0189:
            int r1 = r2 - r4
            boolean r4 = r0.f23315p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01af
            boolean r4 = r0.f23309j
            if (r4 == 0) goto L_0x01af
            long r9 = r0.f23313n
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01af
            boolean r11 = r0.f23314o
            long r12 = r0.f23307h
            long r14 = r0.f23312m
            com.google.android.gms.internal.ads.da4 r8 = r0.f23301b
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            r14 = 0
            r13 = r1
            r8.mo16889e(r9, r11, r12, r13, r14)
        L_0x01af:
            boolean r4 = r0.f23308i
            if (r4 == 0) goto L_0x01bb
            boolean r4 = r0.f23315p
            if (r4 == 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1 = 0
            r4 = 1
            goto L_0x01dd
        L_0x01bb:
            long r8 = r0.f23307h
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f23312m = r8
            long r8 = r0.f23311l
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            goto L_0x01d3
        L_0x01c8:
            long r8 = r0.f23313n
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d2
            long r10 = r0.f23310k
            long r8 = r8 + r10
            goto L_0x01d3
        L_0x01d2:
            r8 = r5
        L_0x01d3:
            r0.f23313n = r8
            r1 = 0
            r0.f23314o = r1
            r0.f23311l = r5
            r4 = 1
            r0.f23308i = r4
        L_0x01dd:
            if (r7 != 0) goto L_0x01e1
            r10 = 1
            goto L_0x01e2
        L_0x01e1:
            r10 = 0
        L_0x01e2:
            r0.f23315p = r10
        L_0x01e4:
            r6 = r20
            r1 = r16
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5544s2.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f23300a = c4Var.mo16482b();
        this.f23301b = b94.mo15724s(c4Var.mo16481a(), 2);
        C5064f4 f4Var = this.f23302c;
        if (f4Var != null) {
            f4Var.mo17484b(b94, c4Var);
        }
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        this.f23311l = j;
    }

    public final void zze() {
        df2.m22492e(this.f23305f);
        this.f23306g.mo20549b();
        C5026e3 e3Var = this.f23304e;
        if (e3Var != null) {
            e3Var.mo17106b();
        }
        this.f23307h = 0;
        this.f23308i = false;
        this.f23311l = -9223372036854775807L;
        this.f23313n = -9223372036854775807L;
    }
}
