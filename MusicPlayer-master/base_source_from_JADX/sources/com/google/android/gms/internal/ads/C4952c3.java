package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4952c3 implements C5470q2 {

    /* renamed from: a */
    private final String f14790a;

    /* renamed from: b */
    private final no2 f14791b;

    /* renamed from: c */
    private final mn2 f14792c;

    /* renamed from: d */
    private da4 f14793d;

    /* renamed from: e */
    private String f14794e;

    /* renamed from: f */
    private C5689w f14795f;

    /* renamed from: g */
    private int f14796g;

    /* renamed from: h */
    private int f14797h;

    /* renamed from: i */
    private int f14798i;

    /* renamed from: j */
    private int f14799j;

    /* renamed from: k */
    private long f14800k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f14801l;

    /* renamed from: m */
    private int f14802m;

    /* renamed from: n */
    private int f14803n;

    /* renamed from: o */
    private int f14804o;

    /* renamed from: p */
    private boolean f14805p;

    /* renamed from: q */
    private long f14806q;

    /* renamed from: r */
    private int f14807r;

    /* renamed from: s */
    private long f14808s;

    /* renamed from: t */
    private int f14809t;

    /* renamed from: u */
    private String f14810u;

    public C4952c3(String str) {
        this.f14790a = str;
        no2 no2 = new no2(1024);
        this.f14791b = no2;
        byte[] h = no2.mo19781h();
        this.f14792c = new mn2(h, h.length);
    }

    /* renamed from: e */
    private final int m21644e(mn2 mn2) throws C5464px {
        int a = mn2.mo19467a();
        z74 b = a84.m20626b(mn2, true);
        this.f14810u = b.f26704c;
        this.f14807r = b.f26702a;
        this.f14809t = b.f26703b;
        return a - mn2.mo19467a();
    }

    /* renamed from: f */
    private static long m21645f(mn2 mn2) {
        return (long) mn2.mo19469c((mn2.mo19469c(2) + 1) * 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.f14801l == false) goto L_0x01b9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r15) throws com.google.android.gms.internal.ads.C5464px {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.da4 r0 = r14.f14793d
            com.google.android.gms.internal.ads.gs1.m24484b(r0)
        L_0x0005:
            int r0 = r15.mo19782i()
            if (r0 <= 0) goto L_0x021c
            int r0 = r14.f14796g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x0212
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01fc
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ce
            int r0 = r15.mo19782i()
            int r3 = r14.f14798i
            int r6 = r14.f14797h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.mn2 r3 = r14.f14792c
            byte[] r3 = r3.f20098a
            int r6 = r14.f14797h
            r15.mo19775b(r3, r6, r0)
            int r3 = r14.f14797h
            int r3 = r3 + r0
            r14.f14797h = r3
            int r0 = r14.f14798i
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.mn2 r0 = r14.f14792c
            r0.mo19474h(r4)
            com.google.android.gms.internal.ads.mn2 r0 = r14.f14792c
            boolean r3 = r0.mo19478l()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.f14801l = r2
            int r3 = r0.mo19469c(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.mo19469c(r2)
            r7 = 1
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = 0
        L_0x0058:
            r14.f14802m = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            m21645f(r0)
            r7 = 1
        L_0x0062:
            boolean r3 = r0.mo19478l()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.mo19469c(r3)
            r14.f14803n = r8
            r8 = 4
            int r9 = r0.mo19469c(r8)
            int r10 = r0.mo19469c(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.mo19468b()
            int r10 = r14.m21644e(r0)
            r0.mo19474h(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.mo19472f(r9, r4, r10)
            com.google.android.gms.internal.ads.jb4 r10 = new com.google.android.gms.internal.ads.jb4
            r10.<init>()
            java.lang.String r11 = r14.f14794e
            r10.mo18587h(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.mo18599s(r11)
            java.lang.String r11 = r14.f14810u
            r10.mo18584f0(r11)
            int r11 = r14.f14809t
            r10.mo18582e0(r11)
            int r11 = r14.f14807r
            r10.mo18600t(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.mo18589i(r9)
            java.lang.String r9 = r14.f14790a
            r10.mo18591k(r9)
            com.google.android.gms.internal.ads.w r9 = r10.mo18605y()
            com.google.android.gms.internal.ads.w r10 = r14.f14795f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.f14795f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f25147z
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f14808s = r10
            com.google.android.gms.internal.ads.da4 r10 = r14.f14793d
            r10.mo16885a(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = m21645f(r0)
            int r10 = (int) r9
            int r9 = r14.m21644e(r0)
            int r10 = r10 - r9
            r0.mo19476j(r10)
        L_0x00e5:
            int r9 = r0.mo19469c(r1)
            r14.f14804o = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.mo19476j(r2)
            goto L_0x0113
        L_0x0106:
            r0.mo19476j(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.mo19476j(r1)
            goto L_0x0113
        L_0x0110:
            r0.mo19476j(r5)
        L_0x0113:
            boolean r1 = r0.mo19478l()
            r14.f14805p = r1
            r8 = 0
            r14.f14806q = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.mo19478l()
            long r2 = r14.f14806q
            long r2 = r2 << r5
            int r7 = r0.mo19469c(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f14806q = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = m21645f(r0)
            r14.f14806q = r1
        L_0x0139:
            boolean r1 = r0.mo19478l()
            if (r1 == 0) goto L_0x0157
            r0.mo19476j(r5)
            goto L_0x0157
        L_0x0143:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.f14801l
            if (r1 != 0) goto L_0x0157
            goto L_0x01b9
        L_0x0157:
            int r1 = r14.f14802m
            if (r1 != 0) goto L_0x01c9
            int r1 = r14.f14803n
            if (r1 != 0) goto L_0x01c4
            int r1 = r14.f14804o
            if (r1 != 0) goto L_0x01bf
            r1 = 0
        L_0x0164:
            int r2 = r0.mo19469c(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bd
            int r1 = r0.mo19468b()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.no2 r2 = r14.f14791b
            int r1 = r1 >> 3
            r2.mo19779f(r1)
            goto L_0x018e
        L_0x017e:
            com.google.android.gms.internal.ads.no2 r1 = r14.f14791b
            byte[] r1 = r1.mo19781h()
            int r2 = r10 * 8
            r0.mo19472f(r1, r4, r2)
            com.google.android.gms.internal.ads.no2 r1 = r14.f14791b
            r1.mo19779f(r4)
        L_0x018e:
            com.google.android.gms.internal.ads.da4 r1 = r14.f14793d
            com.google.android.gms.internal.ads.no2 r2 = r14.f14791b
            com.google.android.gms.internal.ads.ba4.m21199b(r1, r2, r10)
            long r7 = r14.f14800k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.da4 r6 = r14.f14793d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo16889e(r7, r9, r10, r11, r12)
            long r1 = r14.f14800k
            long r5 = r14.f14808s
            long r1 = r1 + r5
            r14.f14800k = r1
        L_0x01af:
            boolean r1 = r14.f14805p
            if (r1 == 0) goto L_0x01b9
            long r1 = r14.f14806q
            int r2 = (int) r1
            r0.mo19476j(r2)
        L_0x01b9:
            r14.f14796g = r4
            goto L_0x0005
        L_0x01bd:
            r1 = r10
            goto L_0x0164
        L_0x01bf:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x01c4:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x01c9:
            com.google.android.gms.internal.ads.px r15 = com.google.android.gms.internal.ads.C5464px.zza(r6, r6)
            throw r15
        L_0x01ce:
            int r0 = r14.f14799j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.mo19792s()
            r0 = r0 | r2
            r14.f14798i = r0
            com.google.android.gms.internal.ads.no2 r2 = r14.f14791b
            byte[] r2 = r2.mo19781h()
            int r2 = r2.length
            if (r0 <= r2) goto L_0x01f6
            int r0 = r14.f14798i
            com.google.android.gms.internal.ads.no2 r2 = r14.f14791b
            r2.mo19776c(r0)
            com.google.android.gms.internal.ads.mn2 r0 = r14.f14792c
            com.google.android.gms.internal.ads.no2 r2 = r14.f14791b
            byte[] r2 = r2.mo19781h()
            int r3 = r2.length
            r0.mo19473g(r2, r3)
        L_0x01f6:
            r14.f14797h = r4
            r14.f14796g = r1
            goto L_0x0005
        L_0x01fc:
            int r0 = r15.mo19792s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x020c
            r14.f14799j = r0
            r14.f14796g = r3
            goto L_0x0005
        L_0x020c:
            if (r0 == r1) goto L_0x0005
            r14.f14796g = r4
            goto L_0x0005
        L_0x0212:
            int r0 = r15.mo19792s()
            if (r0 != r1) goto L_0x0005
            r14.f14796g = r2
            goto L_0x0005
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4952c3.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f14793d = b94.mo15724s(c4Var.mo16481a(), 1);
        this.f14794e = c4Var.mo16482b();
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f14800k = j;
        }
    }

    public final void zze() {
        this.f14796g = 0;
        this.f14800k = -9223372036854775807L;
        this.f14801l = false;
    }
}
