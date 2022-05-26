package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.n3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5360n3 implements y84 {

    /* renamed from: l */
    public static final f94 f20477l = C5286l3.f19171b;

    /* renamed from: a */
    private final tv2 f20478a = new tv2(0);

    /* renamed from: b */
    private final SparseArray<C5323m3> f20479b = new SparseArray<>();

    /* renamed from: c */
    private final no2 f20480c = new no2(4096);

    /* renamed from: d */
    private final C5249k3 f20481d = new C5249k3();

    /* renamed from: e */
    private boolean f20482e;

    /* renamed from: f */
    private boolean f20483f;

    /* renamed from: g */
    private boolean f20484g;

    /* renamed from: h */
    private long f20485h;

    /* renamed from: i */
    private C5212j3 f20486i;

    /* renamed from: j */
    private b94 f20487j;

    /* renamed from: k */
    private boolean f20488k;

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        byte[] bArr = new byte[14];
        t84 t84 = (t84) z84;
        t84.mo19929i(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        t84.mo21041n(bArr[13] & 7, false);
        t84.mo19929i(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r14, com.google.android.gms.internal.ads.w94 r15) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.b94 r0 = r13.f20487j
            com.google.android.gms.internal.ads.gs1.m24484b(r0)
            long r7 = r14.mo16584b()
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.k3 r1 = r13.f20481d
            boolean r1 = r1.mo18794e()
            if (r1 == 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            com.google.android.gms.internal.ads.k3 r0 = r13.f20481d
            int r14 = r0.mo18791a(r14, r15)
            return r14
        L_0x001f:
            boolean r1 = r13.f20488k
            r11 = 1
            if (r1 != 0) goto L_0x0066
            r13.f20488k = r11
            com.google.android.gms.internal.ads.k3 r1 = r13.f20481d
            long r1 = r1.mo18792b()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.j3 r12 = new com.google.android.gms.internal.ads.j3
            com.google.android.gms.internal.ads.k3 r1 = r13.f20481d
            com.google.android.gms.internal.ads.tv2 r2 = r1.mo18793d()
            com.google.android.gms.internal.ads.k3 r1 = r13.f20481d
            long r3 = r1.mo18792b()
            r1 = r12
            r5 = r7
            r1.<init>(r2, r3, r5)
            r13.f20486i = r12
            com.google.android.gms.internal.ads.b94 r1 = r13.f20487j
            com.google.android.gms.internal.ads.z94 r2 = r12.mo20238b()
            r1.mo15723r(r2)
            goto L_0x0066
        L_0x0054:
            com.google.android.gms.internal.ads.b94 r1 = r13.f20487j
            com.google.android.gms.internal.ads.y94 r2 = new com.google.android.gms.internal.ads.y94
            com.google.android.gms.internal.ads.k3 r3 = r13.f20481d
            long r3 = r3.mo18792b()
            r5 = 0
            r2.<init>(r3, r5)
            r1.mo15723r(r2)
        L_0x0066:
            com.google.android.gms.internal.ads.j3 r1 = r13.f20486i
            if (r1 == 0) goto L_0x0078
            boolean r1 = r1.mo20241e()
            if (r1 != 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            com.google.android.gms.internal.ads.j3 r0 = r13.f20486i
            int r14 = r0.mo20237a(r14, r15)
            return r14
        L_0x0078:
            r14.mo19928h()
            if (r0 == 0) goto L_0x0083
            long r0 = r14.mo16585f()
            long r7 = r7 - r0
            goto L_0x0084
        L_0x0083:
            r7 = r9
        L_0x0084:
            r15 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            r0 = 4
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            return r15
        L_0x0091:
            com.google.android.gms.internal.ads.no2 r0 = r13.f20480c
            byte[] r0 = r0.mo19781h()
            r1 = 4
            r2 = 0
            boolean r0 = r14.mo19929i(r0, r2, r1, r11)
            if (r0 != 0) goto L_0x00a0
            return r15
        L_0x00a0:
            com.google.android.gms.internal.ads.no2 r0 = r13.f20480c
            r0.mo19779f(r2)
            com.google.android.gms.internal.ads.no2 r0 = r13.f20480c
            int r0 = r0.mo19786m()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L_0x00b0
            return r15
        L_0x00b0:
            r15 = 442(0x1ba, float:6.2E-43)
            if (r0 != r15) goto L_0x00d6
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            byte[] r15 = r15.mo19781h()
            com.google.android.gms.internal.ads.t84 r14 = (com.google.android.gms.internal.ads.t84) r14
            r0 = 10
            r14.mo19929i(r15, r2, r0, r2)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            r0 = 9
            r15.mo19779f(r0)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            int r15 = r15.mo19792s()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo21042o(r15, r2)
            return r2
        L_0x00d6:
            r15 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r3 = 6
            if (r0 != r15) goto L_0x00f7
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            byte[] r15 = r15.mo19781h()
            com.google.android.gms.internal.ads.t84 r14 = (com.google.android.gms.internal.ads.t84) r14
            r14.mo19929i(r15, r2, r1, r2)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            r15.mo19779f(r2)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            int r15 = r15.mo19796w()
            int r15 = r15 + r3
            r14.mo21042o(r15, r2)
            return r2
        L_0x00f7:
            int r15 = r0 >> 8
            if (r15 == r11) goto L_0x0101
            com.google.android.gms.internal.ads.t84 r14 = (com.google.android.gms.internal.ads.t84) r14
            r14.mo21042o(r11, r2)
            return r2
        L_0x0101:
            r15 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.google.android.gms.internal.ads.m3> r0 = r13.f20479b
            java.lang.Object r0 = r0.get(r15)
            com.google.android.gms.internal.ads.m3 r0 = (com.google.android.gms.internal.ads.C5323m3) r0
            boolean r4 = r13.f20482e
            if (r4 != 0) goto L_0x0188
            if (r0 != 0) goto L_0x0169
            r4 = 189(0xbd, float:2.65E-43)
            r5 = 0
            if (r15 != r4) goto L_0x0125
            com.google.android.gms.internal.ads.g2 r4 = new com.google.android.gms.internal.ads.g2
            r4.<init>(r5)
            r13.f20483f = r11
            long r5 = r14.zze()
            r13.f20485h = r5
        L_0x0123:
            r5 = r4
            goto L_0x014d
        L_0x0125:
            r4 = r15 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r4 != r6) goto L_0x0139
            com.google.android.gms.internal.ads.d3 r4 = new com.google.android.gms.internal.ads.d3
            r4.<init>(r5)
            r13.f20483f = r11
            long r5 = r14.zze()
            r13.f20485h = r5
            goto L_0x0123
        L_0x0139:
            r4 = r15 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r4 != r6) goto L_0x014d
            com.google.android.gms.internal.ads.s2 r4 = new com.google.android.gms.internal.ads.s2
            r4.<init>(r5)
            r13.f20484g = r11
            long r5 = r14.zze()
            r13.f20485h = r5
            goto L_0x0123
        L_0x014d:
            if (r5 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.c4 r0 = new com.google.android.gms.internal.ads.c4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r4, r15, r6)
            com.google.android.gms.internal.ads.b94 r4 = r13.f20487j
            r5.mo15670c(r4, r0)
            com.google.android.gms.internal.ads.m3 r0 = new com.google.android.gms.internal.ads.m3
            com.google.android.gms.internal.ads.tv2 r4 = r13.f20478a
            r0.<init>(r5, r4)
            android.util.SparseArray<com.google.android.gms.internal.ads.m3> r4 = r13.f20479b
            r4.put(r15, r0)
        L_0x0169:
            boolean r15 = r13.f20483f
            r4 = 1048576(0x100000, double:5.180654E-318)
            if (r15 == 0) goto L_0x0179
            boolean r15 = r13.f20484g
            if (r15 == 0) goto L_0x0179
            long r4 = r13.f20485h
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r6
        L_0x0179:
            long r6 = r14.zze()
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x0188
            r13.f20482e = r11
            com.google.android.gms.internal.ads.b94 r15 = r13.f20487j
            r15.mo15722I()
        L_0x0188:
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            byte[] r15 = r15.mo19781h()
            com.google.android.gms.internal.ads.t84 r14 = (com.google.android.gms.internal.ads.t84) r14
            r14.mo19929i(r15, r2, r1, r2)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            r15.mo19779f(r2)
            com.google.android.gms.internal.ads.no2 r15 = r13.f20480c
            int r15 = r15.mo19796w()
            int r15 = r15 + r3
            if (r0 != 0) goto L_0x01a5
            r14.mo21042o(r15, r2)
            goto L_0x01c6
        L_0x01a5:
            com.google.android.gms.internal.ads.no2 r1 = r13.f20480c
            r1.mo19776c(r15)
            com.google.android.gms.internal.ads.no2 r1 = r13.f20480c
            byte[] r1 = r1.mo19781h()
            r14.mo19927e(r1, r2, r15, r2)
            com.google.android.gms.internal.ads.no2 r14 = r13.f20480c
            r14.mo19779f(r3)
            com.google.android.gms.internal.ads.no2 r14 = r13.f20480c
            r0.mo19332a(r14)
            com.google.android.gms.internal.ads.no2 r14 = r13.f20480c
            int r15 = r14.mo19783j()
            r14.mo19778e(r15)
        L_0x01c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5360n3.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f20487j = b94;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r4 != r6) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:12:0x0030->B:14:0x0038, LOOP_END] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16804h(long r4, long r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.tv2 r4 = r3.f20478a
            long r4 = r4.mo21175e()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.tv2 r4 = r3.f20478a
            long r4 = r4.mo21173c()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.tv2 r4 = r3.f20478a
            r4.mo21176f(r6)
        L_0x0028:
            com.google.android.gms.internal.ads.j3 r4 = r3.f20486i
            r5 = 0
            if (r4 == 0) goto L_0x0030
            r4.mo20240d(r6)
        L_0x0030:
            android.util.SparseArray<com.google.android.gms.internal.ads.m3> r4 = r3.f20479b
            int r4 = r4.size()
            if (r5 >= r4) goto L_0x0046
            android.util.SparseArray<com.google.android.gms.internal.ads.m3> r4 = r3.f20479b
            java.lang.Object r4 = r4.valueAt(r5)
            com.google.android.gms.internal.ads.m3 r4 = (com.google.android.gms.internal.ads.C5323m3) r4
            r4.mo19333b()
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5360n3.mo16804h(long, long):void");
    }
}
