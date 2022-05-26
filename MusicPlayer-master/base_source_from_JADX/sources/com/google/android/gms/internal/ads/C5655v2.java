package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5655v2 implements C5470q2 {

    /* renamed from: l */
    private static final float[] f24544l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C5064f4 f24545a;

    /* renamed from: b */
    private final no2 f24546b = new no2();

    /* renamed from: c */
    private final boolean[] f24547c = new boolean[4];

    /* renamed from: d */
    private final C5581t2 f24548d = new C5581t2(128);

    /* renamed from: e */
    private final C5026e3 f24549e = new C5026e3(178, 128);

    /* renamed from: f */
    private C5618u2 f24550f;

    /* renamed from: g */
    private long f24551g;

    /* renamed from: h */
    private String f24552h;

    /* renamed from: i */
    private da4 f24553i;

    /* renamed from: j */
    private boolean f24554j;

    /* renamed from: k */
    private long f24555k = -9223372036854775807L;

    C5655v2(C5064f4 f4Var) {
        this.f24545a = f4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.u2 r1 = r0.f24550f
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            com.google.android.gms.internal.ads.da4 r1 = r0.f24553i
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            int r1 = r19.mo19784k()
            int r2 = r19.mo19785l()
            byte[] r3 = r19.mo19781h()
            long r4 = r0.f24551g
            int r6 = r19.mo19782i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f24551g = r4
            com.google.android.gms.internal.ads.da4 r4 = r0.f24553i
            int r5 = r19.mo19782i()
            r6 = r19
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f24547c
            int r4 = com.google.android.gms.internal.ads.df2.m22488a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f24554j
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.t2 r4 = r0.f24548d
            r4.mo20998a(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.u2 r4 = r0.f24550f
            r4.mo21208a(r3, r1, r2)
            com.google.android.gms.internal.ads.e3 r4 = r0.f24549e
            r4.mo17105a(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo19781h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f24554j
            if (r9 != 0) goto L_0x0181
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.t2 r9 = r0.f24548d
            r9.mo20998a(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.t2 r12 = r0.f24548d
            boolean r9 = r12.mo21000c(r7, r9)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.da4 r9 = r0.f24553i
            com.google.android.gms.internal.ads.t2 r12 = r0.f24548d
            int r13 = r12.f23691d
            java.lang.String r14 = r0.f24552h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.f23692e
            int r12 = r12.f23690c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.mn2 r15 = new com.google.android.gms.internal.ads.mn2
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.mo19477k(r13)
            r10 = 4
            r15.mo19477k(r10)
            r15.mo19475i()
            r13 = 8
            r15.mo19476j(r13)
            boolean r16 = r15.mo19478l()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.mo19476j(r10)
            r15.mo19476j(r11)
        L_0x00a2:
            int r10 = r15.mo19469c(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r10 != r5) goto L_0x00c7
            r5 = 8
            int r10 = r15.mo19469c(r5)
            int r5 = r15.mo19469c(r5)
            if (r5 != 0) goto L_0x00c2
            android.util.Log.w(r13, r11)
            goto L_0x00d4
        L_0x00c2:
            float r10 = (float) r10
            float r5 = (float) r5
            float r16 = r10 / r5
            goto L_0x00ce
        L_0x00c7:
            r5 = 7
            if (r10 >= r5) goto L_0x00d1
            float[] r5 = f24544l
            r16 = r5[r10]
        L_0x00ce:
            r5 = r16
            goto L_0x00d6
        L_0x00d1:
            android.util.Log.w(r13, r11)
        L_0x00d4:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            boolean r10 = r15.mo19478l()
            r11 = 2
            if (r10 == 0) goto L_0x0110
            r15.mo19476j(r11)
            r10 = 1
            r15.mo19476j(r10)
            boolean r10 = r15.mo19478l()
            if (r10 == 0) goto L_0x0110
            r10 = 15
            r15.mo19476j(r10)
            r15.mo19475i()
            r15.mo19476j(r10)
            r15.mo19475i()
            r15.mo19476j(r10)
            r15.mo19475i()
            r11 = 3
            r15.mo19476j(r11)
            r11 = 11
            r15.mo19476j(r11)
            r15.mo19475i()
            r15.mo19476j(r10)
            r15.mo19475i()
        L_0x0110:
            r10 = 2
            int r10 = r15.mo19469c(r10)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "Unhandled video object layer shape"
            android.util.Log.w(r13, r10)
        L_0x011c:
            r15.mo19475i()
            r10 = 16
            int r10 = r15.mo19469c(r10)
            r15.mo19475i()
            boolean r11 = r15.mo19478l()
            if (r11 == 0) goto L_0x0143
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r13, r10)
            goto L_0x0143
        L_0x0136:
            int r10 = r10 + -1
            r11 = 0
        L_0x0139:
            if (r10 <= 0) goto L_0x0140
            int r11 = r11 + 1
            int r10 = r10 >> 1
            goto L_0x0139
        L_0x0140:
            r15.mo19476j(r11)
        L_0x0143:
            r15.mo19475i()
            r10 = 13
            int r11 = r15.mo19469c(r10)
            r15.mo19475i()
            int r10 = r15.mo19469c(r10)
            r15.mo19475i()
            r15.mo19475i()
            com.google.android.gms.internal.ads.jb4 r13 = new com.google.android.gms.internal.ads.jb4
            r13.<init>()
            r13.mo18587h(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo18599s(r14)
            r13.mo18604x(r11)
            r13.mo18583f(r10)
            r13.mo18596p(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo18589i(r5)
            com.google.android.gms.internal.ads.w r5 = r13.mo18605y()
            r9.mo16885a(r5)
            r5 = 1
            r0.f24554j = r5
            goto L_0x0183
        L_0x0181:
            r17 = r5
        L_0x0183:
            com.google.android.gms.internal.ads.u2 r5 = r0.f24550f
            r5.mo21208a(r3, r1, r4)
            com.google.android.gms.internal.ads.e3 r5 = r0.f24549e
            if (r8 <= 0) goto L_0x0191
            r5.mo17105a(r3, r1, r4)
            r10 = 0
            goto L_0x0192
        L_0x0191:
            int r10 = -r8
        L_0x0192:
            com.google.android.gms.internal.ads.e3 r1 = r0.f24549e
            boolean r1 = r1.mo17108d(r10)
            if (r1 == 0) goto L_0x01b8
            com.google.android.gms.internal.ads.e3 r1 = r0.f24549e
            byte[] r5 = r1.f15843d
            int r1 = r1.f15844e
            int r1 = com.google.android.gms.internal.ads.df2.m22489b(r5, r1)
            com.google.android.gms.internal.ads.no2 r5 = r0.f24546b
            int r8 = com.google.android.gms.internal.ads.wy2.f25579a
            com.google.android.gms.internal.ads.e3 r8 = r0.f24549e
            byte[] r8 = r8.f15843d
            r5.mo19777d(r8, r1)
            com.google.android.gms.internal.ads.f4 r1 = r0.f24545a
            long r8 = r0.f24555k
            com.google.android.gms.internal.ads.no2 r5 = r0.f24546b
            r1.mo17483a(r8, r5)
        L_0x01b8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01ce
            byte[] r5 = r19.mo19781h()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cc
            com.google.android.gms.internal.ads.e3 r5 = r0.f24549e
            r5.mo17107c(r1)
        L_0x01cc:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01ce:
            int r1 = r2 - r4
            long r4 = r0.f24551g
            com.google.android.gms.internal.ads.u2 r8 = r0.f24550f
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f24554j
            r8.mo21209b(r4, r1, r9)
            com.google.android.gms.internal.ads.u2 r1 = r0.f24550f
            long r4 = r0.f24555k
            r1.mo21210c(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5655v2.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f24552h = c4Var.mo16482b();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 2);
        this.f24553i = s;
        this.f24550f = new C5618u2(s);
        this.f24545a.mo17484b(b94, c4Var);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24555k = j;
        }
    }

    public final void zze() {
        df2.m22492e(this.f24547c);
        this.f24548d.mo20999b();
        C5618u2 u2Var = this.f24550f;
        if (u2Var != null) {
            u2Var.mo21211d();
        }
        this.f24549e.mo17106b();
        this.f24551g = 0;
        this.f24555k = -9223372036854775807L;
    }
}
