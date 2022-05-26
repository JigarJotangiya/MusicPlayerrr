package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5766y2 implements C5470q2 {

    /* renamed from: a */
    private final C5471q3 f26212a;

    /* renamed from: b */
    private final C5026e3 f26213b = new C5026e3(7, 128);

    /* renamed from: c */
    private final C5026e3 f26214c = new C5026e3(8, 128);

    /* renamed from: d */
    private final C5026e3 f26215d = new C5026e3(6, 128);

    /* renamed from: e */
    private long f26216e;

    /* renamed from: f */
    private final boolean[] f26217f = new boolean[3];

    /* renamed from: g */
    private String f26218g;

    /* renamed from: h */
    private da4 f26219h;

    /* renamed from: i */
    private C5692w2 f26220i;

    /* renamed from: j */
    private boolean f26221j;

    /* renamed from: k */
    private long f26222k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f26223l;

    /* renamed from: m */
    private final no2 f26224m = new no2();

    public C5766y2(C5471q3 q3Var, boolean z, boolean z2) {
        this.f26212a = q3Var;
    }

    /* renamed from: e */
    private final void m33990e(byte[] bArr, int i, int i2) {
        if (!this.f26221j) {
            this.f26213b.mo17105a(bArr, i, i2);
            this.f26214c.mo17105a(bArr, i, i2);
        }
        this.f26215d.mo17105a(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0185 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.da4 r1 = r0.f26219h
            com.google.android.gms.internal.ads.gs1.m24484b(r1)
            int r1 = com.google.android.gms.internal.ads.wy2.f25579a
            int r1 = r20.mo19784k()
            int r2 = r20.mo19785l()
            byte[] r3 = r20.mo19781h()
            long r4 = r0.f26216e
            int r6 = r20.mo19782i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f26216e = r4
            com.google.android.gms.internal.ads.da4 r4 = r0.f26219h
            int r5 = r20.mo19782i()
            r6 = r20
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r6, r5)
        L_0x002a:
            boolean[] r4 = r0.f26217f
            int r4 = com.google.android.gms.internal.ads.df2.m22488a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x0195
            int r5 = r4 + 3
            byte r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L_0x003f
            r0.m33990e(r3, r1, r4)
        L_0x003f:
            int r14 = r2 - r4
            long r7 = r0.f26216e
            long r11 = (long) r14
            long r8 = r7 - r11
            if (r6 >= 0) goto L_0x004a
            int r4 = -r6
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            long r6 = r0.f26222k
            boolean r11 = r0.f26221j
            r12 = 4
            if (r11 == 0) goto L_0x0058
        L_0x0052:
            r18 = r2
            r17 = r5
            goto L_0x013b
        L_0x0058:
            com.google.android.gms.internal.ads.e3 r11 = r0.f26213b
            r11.mo17108d(r4)
            com.google.android.gms.internal.ads.e3 r11 = r0.f26214c
            r11.mo17108d(r4)
            boolean r11 = r0.f26221j
            if (r11 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.e3 r11 = r0.f26213b
            boolean r11 = r11.mo17109e()
            if (r11 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.e3 r11 = r0.f26214c
            boolean r11 = r11.mo17109e()
            if (r11 == 0) goto L_0x0052
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.internal.ads.e3 r13 = r0.f26213b
            byte[] r15 = r13.f15843d
            int r13 = r13.f15844e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.e3 r13 = r0.f26214c
            byte[] r15 = r13.f15843d
            int r13 = r13.f15844e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.e3 r13 = r0.f26213b
            byte[] r15 = r13.f15843d
            int r13 = r13.f15844e
            com.google.android.gms.internal.ads.ce2 r13 = com.google.android.gms.internal.ads.df2.m22491d(r15, r12, r13)
            com.google.android.gms.internal.ads.e3 r15 = r0.f26214c
            byte[] r1 = r15.f15843d
            int r15 = r15.f15844e
            com.google.android.gms.internal.ads.bd2 r1 = com.google.android.gms.internal.ads.df2.m22490c(r1, r12, r15)
            int r15 = r13.f14951a
            int r12 = r13.f14952b
            r17 = r5
            int r5 = r13.f14953c
            java.lang.String r5 = com.google.android.gms.internal.ads.ju1.m25964a(r15, r12, r5)
            com.google.android.gms.internal.ads.da4 r12 = r0.f26219h
            com.google.android.gms.internal.ads.jb4 r15 = new com.google.android.gms.internal.ads.jb4
            r15.<init>()
            r18 = r2
            java.lang.String r2 = r0.f26218g
            r15.mo18587h(r2)
            java.lang.String r2 = "video/avc"
            r15.mo18599s(r2)
            r15.mo18584f0(r5)
            int r2 = r13.f14955e
            r15.mo18604x(r2)
            int r2 = r13.f14956f
            r15.mo18583f(r2)
            float r2 = r13.f14957g
            r15.mo18596p(r2)
            r15.mo18589i(r11)
            com.google.android.gms.internal.ads.w r2 = r15.mo18605y()
            r12.mo16885a(r2)
            r2 = 1
            r0.f26221j = r2
            com.google.android.gms.internal.ads.w2 r2 = r0.f26220i
            r2.mo21680b(r13)
            com.google.android.gms.internal.ads.w2 r2 = r0.f26220i
            r2.mo21679a(r1)
            com.google.android.gms.internal.ads.e3 r1 = r0.f26213b
            r1.mo17106b()
            com.google.android.gms.internal.ads.e3 r1 = r0.f26214c
            r1.mo17106b()
            goto L_0x013b
        L_0x00fc:
            r18 = r2
            r17 = r5
            com.google.android.gms.internal.ads.e3 r1 = r0.f26213b
            boolean r1 = r1.mo17109e()
            if (r1 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.e3 r1 = r0.f26213b
            byte[] r2 = r1.f15843d
            int r1 = r1.f15844e
            r5 = 4
            com.google.android.gms.internal.ads.ce2 r1 = com.google.android.gms.internal.ads.df2.m22491d(r2, r5, r1)
            com.google.android.gms.internal.ads.w2 r2 = r0.f26220i
            r2.mo21680b(r1)
            com.google.android.gms.internal.ads.e3 r1 = r0.f26213b
            r1.mo17106b()
            goto L_0x013b
        L_0x011e:
            com.google.android.gms.internal.ads.e3 r1 = r0.f26214c
            boolean r1 = r1.mo17109e()
            if (r1 == 0) goto L_0x013b
            com.google.android.gms.internal.ads.e3 r1 = r0.f26214c
            byte[] r2 = r1.f15843d
            int r1 = r1.f15844e
            r5 = 4
            com.google.android.gms.internal.ads.bd2 r1 = com.google.android.gms.internal.ads.df2.m22490c(r2, r5, r1)
            com.google.android.gms.internal.ads.w2 r2 = r0.f26220i
            r2.mo21679a(r1)
            com.google.android.gms.internal.ads.e3 r1 = r0.f26214c
            r1.mo17106b()
        L_0x013b:
            com.google.android.gms.internal.ads.e3 r1 = r0.f26215d
            boolean r1 = r1.mo17108d(r4)
            if (r1 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.e3 r1 = r0.f26215d
            byte[] r2 = r1.f15843d
            int r1 = r1.f15844e
            int r1 = com.google.android.gms.internal.ads.df2.m22489b(r2, r1)
            com.google.android.gms.internal.ads.no2 r2 = r0.f26224m
            com.google.android.gms.internal.ads.e3 r4 = r0.f26215d
            byte[] r4 = r4.f15843d
            r2.mo19777d(r4, r1)
            com.google.android.gms.internal.ads.no2 r1 = r0.f26224m
            r2 = 4
            r1.mo19779f(r2)
            com.google.android.gms.internal.ads.q3 r1 = r0.f26212a
            com.google.android.gms.internal.ads.no2 r2 = r0.f26224m
            r1.mo20386a(r6, r2)
        L_0x0163:
            com.google.android.gms.internal.ads.w2 r11 = r0.f26220i
            boolean r15 = r0.f26221j
            boolean r1 = r0.f26223l
            r12 = r8
            r16 = r1
            boolean r1 = r11.mo21683e(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x0175
            r1 = 0
            r0.f26223l = r1
        L_0x0175:
            long r11 = r0.f26222k
            boolean r1 = r0.f26221j
            if (r1 != 0) goto L_0x0185
            com.google.android.gms.internal.ads.e3 r1 = r0.f26213b
            r1.mo17107c(r10)
            com.google.android.gms.internal.ads.e3 r1 = r0.f26214c
            r1.mo17107c(r10)
        L_0x0185:
            com.google.android.gms.internal.ads.e3 r1 = r0.f26215d
            r1.mo17107c(r10)
            com.google.android.gms.internal.ads.w2 r7 = r0.f26220i
            r7.mo21682d(r8, r10, r11)
            r1 = r17
            r2 = r18
            goto L_0x002a
        L_0x0195:
            r0.m33990e(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5766y2.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f26218g = c4Var.mo16482b();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 2);
        this.f26219h = s;
        this.f26220i = new C5692w2(s, false, false);
        this.f26212a.mo20387b(b94, c4Var);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26222k = j;
        }
        this.f26223l |= (i & 2) != 0;
    }

    public final void zze() {
        this.f26216e = 0;
        this.f26223l = false;
        this.f26222k = -9223372036854775807L;
        df2.m22492e(this.f26217f);
        this.f26213b.mo17106b();
        this.f26214c.mo17106b();
        this.f26215d.mo17106b();
        C5692w2 w2Var = this.f26220i;
        if (w2Var != null) {
            w2Var.mo21681c();
        }
    }
}
