package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5211j2 implements C5470q2 {

    /* renamed from: a */
    private final mn2 f18309a;

    /* renamed from: b */
    private final no2 f18310b;

    /* renamed from: c */
    private final String f18311c;

    /* renamed from: d */
    private String f18312d;

    /* renamed from: e */
    private da4 f18313e;

    /* renamed from: f */
    private int f18314f = 0;

    /* renamed from: g */
    private int f18315g = 0;

    /* renamed from: h */
    private boolean f18316h = false;

    /* renamed from: i */
    private boolean f18317i = false;

    /* renamed from: j */
    private long f18318j;

    /* renamed from: k */
    private C5689w f18319k;

    /* renamed from: l */
    private int f18320l;

    /* renamed from: m */
    private long f18321m = -9223372036854775807L;

    public C5211j2(String str) {
        mn2 mn2 = new mn2(new byte[16], 16);
        this.f18309a = mn2;
        this.f18310b = new no2(mn2.f20098a);
        this.f18311c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15668a(com.google.android.gms.internal.ads.no2 r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.da4 r0 = r10.f18313e
            com.google.android.gms.internal.ads.gs1.m24484b(r0)
        L_0x0005:
            int r0 = r11.mo19782i()
            if (r0 <= 0) goto L_0x012a
            int r0 = r10.f18314f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00d8
            if (r0 == r3) goto L_0x004c
            int r0 = r11.mo19782i()
            int r1 = r10.f18320l
            int r3 = r10.f18315g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.da4 r1 = r10.f18313e
            com.google.android.gms.internal.ads.ba4.m21199b(r1, r11, r0)
            int r1 = r10.f18315g
            int r1 = r1 + r0
            r10.f18315g = r1
            int r7 = r10.f18320l
            if (r1 != r7) goto L_0x0005
            long r4 = r10.f18321m
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.da4 r3 = r10.f18313e
            r6 = 1
            r8 = 0
            r9 = 0
            r3.mo16889e(r4, r6, r7, r8, r9)
            long r0 = r10.f18321m
            long r3 = r10.f18318j
            long r0 = r0 + r3
            r10.f18321m = r0
        L_0x0049:
            r10.f18314f = r2
            goto L_0x0005
        L_0x004c:
            com.google.android.gms.internal.ads.no2 r0 = r10.f18310b
            byte[] r0 = r0.mo19781h()
            int r3 = r11.mo19782i()
            int r4 = r10.f18315g
            r5 = 16
            int r4 = 16 - r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r10.f18315g
            r11.mo19775b(r0, r4, r3)
            int r0 = r10.f18315g
            int r0 = r0 + r3
            r10.f18315g = r0
            if (r0 != r5) goto L_0x0005
            com.google.android.gms.internal.ads.mn2 r0 = r10.f18309a
            r0.mo19474h(r2)
            com.google.android.gms.internal.ads.mn2 r0 = r10.f18309a
            com.google.android.gms.internal.ads.f84 r0 = com.google.android.gms.internal.ads.g84.m24211a(r0)
            com.google.android.gms.internal.ads.w r3 = r10.f18319k
            java.lang.String r4 = "audio/ac4"
            if (r3 == 0) goto L_0x008f
            int r6 = r3.f25146y
            if (r6 != r1) goto L_0x008f
            int r6 = r0.f16478a
            int r7 = r3.f25147z
            if (r6 != r7) goto L_0x008f
            java.lang.String r3 = r3.f25133l
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b4
        L_0x008f:
            com.google.android.gms.internal.ads.jb4 r3 = new com.google.android.gms.internal.ads.jb4
            r3.<init>()
            java.lang.String r6 = r10.f18312d
            r3.mo18587h(r6)
            r3.mo18599s(r4)
            r3.mo18582e0(r1)
            int r4 = r0.f16478a
            r3.mo18600t(r4)
            java.lang.String r4 = r10.f18311c
            r3.mo18591k(r4)
            com.google.android.gms.internal.ads.w r3 = r3.mo18605y()
            r10.f18319k = r3
            com.google.android.gms.internal.ads.da4 r4 = r10.f18313e
            r4.mo16885a(r3)
        L_0x00b4:
            int r3 = r0.f16479b
            r10.f18320l = r3
            int r0 = r0.f16480c
            long r3 = (long) r0
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r6
            com.google.android.gms.internal.ads.w r0 = r10.f18319k
            int r0 = r0.f25147z
            long r6 = (long) r0
            long r3 = r3 / r6
            r10.f18318j = r3
            com.google.android.gms.internal.ads.no2 r0 = r10.f18310b
            r0.mo19779f(r2)
            com.google.android.gms.internal.ads.da4 r0 = r10.f18313e
            com.google.android.gms.internal.ads.no2 r2 = r10.f18310b
            com.google.android.gms.internal.ads.ba4.m21199b(r0, r2, r5)
            r10.f18314f = r1
            goto L_0x0005
        L_0x00d8:
            int r0 = r11.mo19782i()
            if (r0 <= 0) goto L_0x0005
            boolean r0 = r10.f18316h
            r4 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00f0
            int r0 = r11.mo19792s()
            if (r0 != r4) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            r10.f18316h = r0
            goto L_0x00d8
        L_0x00f0:
            int r0 = r11.mo19792s()
            if (r0 != r4) goto L_0x00f8
            r4 = 1
            goto L_0x00f9
        L_0x00f8:
            r4 = 0
        L_0x00f9:
            r10.f18316h = r4
            r4 = 64
            r5 = 65
            if (r0 == r4) goto L_0x0104
            if (r0 != r5) goto L_0x00d8
            goto L_0x0108
        L_0x0104:
            if (r0 == r5) goto L_0x0108
            r0 = 0
            goto L_0x0109
        L_0x0108:
            r0 = 1
        L_0x0109:
            r10.f18317i = r0
            r10.f18314f = r3
            com.google.android.gms.internal.ads.no2 r0 = r10.f18310b
            byte[] r0 = r0.mo19781h()
            r6 = -84
            r0[r2] = r6
            com.google.android.gms.internal.ads.no2 r0 = r10.f18310b
            byte[] r0 = r0.mo19781h()
            boolean r2 = r10.f18317i
            if (r3 == r2) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r4 = 65
        L_0x0124:
            r0[r3] = r4
            r10.f18315g = r1
            goto L_0x0005
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5211j2.mo15668a(com.google.android.gms.internal.ads.no2):void");
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f18312d = c4Var.mo16482b();
        this.f18313e = b94.mo15724s(c4Var.mo16481a(), 1);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f18321m = j;
        }
    }

    public final void zze() {
        this.f18314f = 0;
        this.f18315g = 0;
        this.f18316h = false;
        this.f18317i = false;
        this.f18321m = -9223372036854775807L;
    }
}
