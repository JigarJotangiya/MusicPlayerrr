package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5395o1 implements C5654v1 {

    /* renamed from: a */
    private final C5617u1 f20849a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f20850b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f20851c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4914b2 f20852d;

    /* renamed from: e */
    private int f20853e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f20854f;

    /* renamed from: g */
    private long f20855g;

    /* renamed from: h */
    private long f20856h;

    /* renamed from: i */
    private long f20857i;

    /* renamed from: j */
    private long f20858j;

    /* renamed from: k */
    private long f20859k;

    /* renamed from: l */
    private long f20860l;

    public C5395o1(C4914b2 b2Var, long j, long j2, long j3, long j4, boolean z) {
        gs1.m24486d(j >= 0 && j2 > j);
        this.f20852d = b2Var;
        this.f20850b = j;
        this.f20851c = j2;
        if (j3 == j2 - j || z) {
            this.f20854f = j4;
            this.f20853e = 4;
        } else {
            this.f20853e = 0;
        }
        this.f20849a = new C5617u1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15644b(com.google.android.gms.internal.ads.z84 r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f20853e
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00fa
            if (r2 == r3) goto L_0x010d
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0018
            if (r2 == r10) goto L_0x0015
            return r6
        L_0x0015:
            r2 = r6
            goto L_0x00bb
        L_0x0018:
            long r2 = r0.f20857i
            long r11 = r0.f20858j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0024
        L_0x0020:
            r2 = r6
            r11 = r2
            goto L_0x00b4
        L_0x0024:
            long r2 = r24.zze()
            com.google.android.gms.internal.ads.u1 r11 = r0.f20849a
            long r12 = r0.f20858j
            boolean r11 = r11.mo21205c(r1, r12)
            if (r11 != 0) goto L_0x0043
            long r11 = r0.f20857i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003b
            r2 = r6
            goto L_0x00b4
        L_0x003b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0043:
            com.google.android.gms.internal.ads.u1 r11 = r0.f20849a
            r11.mo21204b(r1, r5)
            r24.mo19928h()
            long r11 = r0.f20856h
            com.google.android.gms.internal.ads.u1 r13 = r0.f20849a
            long r14 = r13.f24138b
            long r11 = r11 - r14
            int r8 = r13.f24140d
            int r9 = r13.f24141e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x0065
            r16 = 72000(0x11940, double:3.55727E-319)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0065
            goto L_0x0020
        L_0x0065:
            if (r9 >= 0) goto L_0x006c
            r0.f20858j = r2
            r0.f20860l = r14
            goto L_0x007a
        L_0x006c:
            long r2 = r24.zze()
            long r13 = (long) r8
            long r2 = r2 + r13
            r0.f20857i = r2
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            long r2 = r2.f24138b
            r0.f20859k = r2
        L_0x007a:
            long r2 = r0.f20858j
            long r13 = r0.f20857i
            long r2 = r2 - r13
            r16 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x008b
            r0.f20858j = r13
            r2 = r6
            r11 = r13
            goto L_0x00b4
        L_0x008b:
            long r2 = (long) r8
            if (r9 > 0) goto L_0x0091
            r8 = 2
            goto L_0x0093
        L_0x0091:
            r8 = 1
        L_0x0093:
            long r13 = r24.zze()
            long r4 = r0.f20858j
            long r6 = r0.f20857i
            long r2 = r2 * r8
            long r13 = r13 - r2
            long r2 = r4 - r6
            long r11 = r11 * r2
            long r2 = r0.f20860l
            long r8 = r0.f20859k
            long r2 = r2 - r8
            long r11 = r11 / r2
            long r17 = r13 + r11
            r2 = -1
            long r21 = r4 + r2
            r19 = r6
            long r11 = com.google.android.gms.internal.ads.wy2.m33426U(r17, r19, r21)
        L_0x00b4:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b9
            return r11
        L_0x00b9:
            r0.f20853e = r10
        L_0x00bb:
            com.google.android.gms.internal.ads.u1 r4 = r0.f20849a
            r4.mo21205c(r1, r2)
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            r3 = 0
            r2.mo21204b(r1, r3)
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            long r3 = r2.f24138b
            long r5 = r0.f20856h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00dd
            r24.mo19928h()
            r1 = 4
            r0.f20853e = r1
            long r1 = r0.f20859k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00dd:
            r4 = 2
            int r3 = r2.f24140d
            int r2 = r2.f24141e
            r6 = r1
            com.google.android.gms.internal.ads.t84 r6 = (com.google.android.gms.internal.ads.t84) r6
            int r3 = r3 + r2
            r2 = 0
            r6.mo21042o(r3, r2)
            long r2 = r24.zze()
            r0.f20857i = r2
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            long r2 = r2.f24138b
            r0.f20859k = r2
            r2 = -1
            goto L_0x00bb
        L_0x00fa:
            long r4 = r24.zze()
            r0.f20855g = r4
            r0.f20853e = r3
            long r6 = r0.f20851c
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x010d
            return r6
        L_0x010d:
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            r2.mo21203a()
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            r4 = -1
            boolean r2 = r2.mo21205c(r1, r4)
            if (r2 == 0) goto L_0x0170
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            r4 = 0
            r2.mo21204b(r1, r4)
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            int r5 = r2.f24140d
            int r2 = r2.f24141e
            r6 = r1
            com.google.android.gms.internal.ads.t84 r6 = (com.google.android.gms.internal.ads.t84) r6
            int r5 = r5 + r2
            r6.mo21042o(r5, r4)
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            long r4 = r2.f24138b
        L_0x0133:
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            int r6 = r2.f24137a
            r7 = 4
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0168
            r6 = -1
            boolean r2 = r2.mo21205c(r1, r6)
            if (r2 == 0) goto L_0x0168
            long r8 = r24.zze()
            long r10 = r0.f20851c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0168
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            boolean r2 = r2.mo21204b(r1, r3)
            if (r2 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            int r8 = r2.f24140d
            int r2 = r2.f24141e
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.c94.m21833e(r1, r8)
            if (r2 != 0) goto L_0x0163
            goto L_0x0168
        L_0x0163:
            com.google.android.gms.internal.ads.u1 r2 = r0.f20849a
            long r4 = r2.f24138b
            goto L_0x0133
        L_0x0168:
            r0.f20854f = r4
            r1 = 4
            r0.f20853e = r1
            long r1 = r0.f20855g
            return r1
        L_0x0170:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5395o1.mo15644b(com.google.android.gms.internal.ads.z84):long");
    }

    /* renamed from: c */
    public final void mo15645c(long j) {
        this.f20856h = wy2.m33426U(j, 0, this.f20854f - 1);
        this.f20853e = 2;
        this.f20857i = this.f20850b;
        this.f20858j = this.f20851c;
        this.f20859k = 0;
        this.f20860l = this.f20854f;
    }

    public final /* bridge */ /* synthetic */ z94 zze() {
        if (this.f20854f != 0) {
            return new C5358n1(this, (C5321m1) null);
        }
        return null;
    }
}
