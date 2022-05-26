package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5139h4 implements C5176i4 {

    /* renamed from: m */
    private static final int[] f17508m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f17509n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final b94 f17510a;

    /* renamed from: b */
    private final da4 f17511b;

    /* renamed from: c */
    private final C5287l4 f17512c;

    /* renamed from: d */
    private final int f17513d;

    /* renamed from: e */
    private final byte[] f17514e;

    /* renamed from: f */
    private final no2 f17515f;

    /* renamed from: g */
    private final int f17516g;

    /* renamed from: h */
    private final C5689w f17517h;

    /* renamed from: i */
    private int f17518i;

    /* renamed from: j */
    private long f17519j;

    /* renamed from: k */
    private int f17520k;

    /* renamed from: l */
    private long f17521l;

    public C5139h4(b94 b94, da4 da4, C5287l4 l4Var) throws C5464px {
        this.f17510a = b94;
        this.f17511b = da4;
        this.f17512c = l4Var;
        int max = Math.max(1, l4Var.f19193c / 10);
        this.f17516g = max;
        no2 no2 = new no2(l4Var.f19196f);
        no2.mo19790q();
        int q = no2.mo19790q();
        this.f17513d = q;
        int i = l4Var.f19192b;
        int i2 = (((l4Var.f19194d - (i * 4)) * 8) / (l4Var.f19195e * i)) + 1;
        if (q == i2) {
            int K = wy2.m33416K(max, q);
            this.f17514e = new byte[(l4Var.f19194d * K)];
            this.f17515f = new no2(K * (q + q) * i);
            int i3 = ((l4Var.f19193c * l4Var.f19194d) * 8) / q;
            jb4 jb4 = new jb4();
            jb4.mo18599s("audio/raw");
            jb4.mo18580d0(i3);
            jb4.mo18595o(i3);
            jb4.mo18592l((max + max) * i);
            jb4.mo18582e0(l4Var.f19192b);
            jb4.mo18600t(l4Var.f19193c);
            jb4.mo18594n(2);
            this.f17517h = jb4.mo18605y();
            return;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Expected frames per block: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(q);
        throw C5464px.zza(sb.toString(), (Throwable) null);
    }

    /* renamed from: d */
    private final int m24648d(int i) {
        int i2 = this.f17512c.f19192b;
        return i / (i2 + i2);
    }

    /* renamed from: e */
    private final int m24649e(int i) {
        return (i + i) * this.f17512c.f19192b;
    }

    /* renamed from: f */
    private final void m24650f(int i) {
        long j = this.f17519j;
        long Z = wy2.m33431Z(this.f17521l, 1000000, (long) this.f17512c.f19193c);
        int e = m24649e(i);
        this.f17511b.mo16889e(j + Z, 1, e, this.f17520k - e, (ca4) null);
        this.f17521l += (long) i;
        this.f17520k -= e;
    }

    /* renamed from: a */
    public final void mo18066a(long j) {
        this.f17518i = 0;
        this.f17519j = j;
        this.f17520k = 0;
        this.f17521l = 0;
    }

    /* renamed from: b */
    public final void mo18067b(int i, long j) {
        this.f17510a.mo15723r(new C5398o4(this.f17512c, this.f17513d, (long) i, j));
        this.f17511b.mo16885a(this.f17517h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: c */
    public final boolean mo18068c(com.google.android.gms.internal.ads.z84 r20, long r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f17516g
            int r4 = r0.f17520k
            int r4 = r0.m24648d(r4)
            int r3 = r3 - r4
            int r4 = r0.f17513d
            int r3 = com.google.android.gms.internal.ads.wy2.m33416K(r3, r4)
            com.google.android.gms.internal.ads.l4 r4 = r0.f17512c
            int r4 = r4.f19194d
            int r3 = r3 * r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0044
            int r7 = r0.f17518i
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f17514e
            int r10 = r0.f17518i
            int r8 = (int) r7
            r7 = r20
            int r8 = r7.mo15695c(r9, r10, r8)
            r9 = -1
            if (r8 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f17518i
            int r9 = r9 + r8
            r0.f17518i = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f17518i
            com.google.android.gms.internal.ads.l4 r2 = r0.f17512c
            int r2 = r2.f19194d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014e
            byte[] r2 = r0.f17514e
            com.google.android.gms.internal.ads.no2 r3 = r0.f17515f
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0117
            r8 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.l4 r9 = r0.f17512c
            int r9 = r9.f19192b
            if (r8 >= r9) goto L_0x010f
            byte[] r9 = r3.mo19781h()
            com.google.android.gms.internal.ads.l4 r10 = r0.f17512c
            int r11 = r10.f19194d
            int r10 = r10.f19192b
            int r12 = r7 * r11
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r11 = r11 / r10
            int r11 = r11 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f17509n
            r16 = r16[r12]
            int r4 = r0.f17513d
            int r4 = r4 * r7
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r4 = r4 + r4
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r9[r4] = r15
            int r15 = r4 + 1
            int r5 = r14 >> 8
            byte r5 = (byte) r5
            r9[r15] = r5
            r5 = 0
        L_0x00a3:
            int r15 = r11 + r11
            if (r5 >= r15) goto L_0x0107
            int r15 = r5 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r5 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r5 % 2
            if (r18 != 0) goto L_0x00bf
            r15 = r15 & 15
            goto L_0x00c1
        L_0x00bf:
            int r15 = r15 >> 4
        L_0x00c1:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d4
            int r2 = -r2
        L_0x00d4:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r11
            r11 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.android.gms.internal.ads.wy2.m33417L(r14, r2, r11)
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r4] = r2
            int r2 = r4 + 1
            int r11 = r14 >> 8
            byte r11 = (byte) r11
            r9[r2] = r11
            int[] r2 = f17508m
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r11 = 0
            int r12 = com.google.android.gms.internal.ads.wy2.m33417L(r12, r11, r2)
            int[] r11 = f17509n
            r11 = r11[r12]
            int r5 = r5 + 1
            r2 = r16
            r16 = r11
            r11 = r21
            goto L_0x00a3
        L_0x0107:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x010f:
            r16 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0052
        L_0x0117:
            int r2 = r0.f17513d
            int r2 = r2 * r1
            int r2 = r0.m24649e(r2)
            r4 = 0
            r3.mo19779f(r4)
            r3.mo19778e(r2)
            int r2 = r0.f17518i
            com.google.android.gms.internal.ads.l4 r3 = r0.f17512c
            int r3 = r3.f19194d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f17518i = r2
            com.google.android.gms.internal.ads.no2 r1 = r0.f17515f
            int r1 = r1.mo19785l()
            com.google.android.gms.internal.ads.da4 r2 = r0.f17511b
            com.google.android.gms.internal.ads.no2 r3 = r0.f17515f
            com.google.android.gms.internal.ads.ba4.m21199b(r2, r3, r1)
            int r2 = r0.f17520k
            int r2 = r2 + r1
            r0.f17520k = r2
            int r1 = r0.m24648d(r2)
            int r2 = r0.f17516g
            if (r1 < r2) goto L_0x014e
            r0.m24650f(r2)
        L_0x014e:
            if (r6 == 0) goto L_0x015b
            int r1 = r0.f17520k
            int r1 = r0.m24648d(r1)
            if (r1 <= 0) goto L_0x015b
            r0.m24650f(r1)
        L_0x015b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5139h4.mo18068c(com.google.android.gms.internal.ads.z84, long):boolean");
    }
}
