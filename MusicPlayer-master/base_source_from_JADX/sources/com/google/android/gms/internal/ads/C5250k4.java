package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.k4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5250k4 implements y84 {

    /* renamed from: f */
    public static final f94 f18753f = C5102g4.f16933b;

    /* renamed from: a */
    private b94 f18754a;

    /* renamed from: b */
    private da4 f18755b;

    /* renamed from: c */
    private C5176i4 f18756c;

    /* renamed from: d */
    private int f18757d = -1;

    /* renamed from: e */
    private long f18758e = -1;

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return C5361n4.m27684a(z84) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r15 != 65534) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r14, com.google.android.gms.internal.ads.w94 r15) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.da4 r15 = r13.f18755b
            com.google.android.gms.internal.ads.gs1.m24484b(r15)
            int r15 = com.google.android.gms.internal.ads.wy2.f25579a
            com.google.android.gms.internal.ads.i4 r15 = r13.f18756c
            r0 = 1
            r1 = 0
            if (r15 != 0) goto L_0x0099
            com.google.android.gms.internal.ads.l4 r5 = com.google.android.gms.internal.ads.C5361n4.m27684a(r14)
            if (r5 == 0) goto L_0x0091
            int r15 = r5.f19191a
            r2 = 17
            if (r15 != r2) goto L_0x0026
            com.google.android.gms.internal.ads.h4 r15 = new com.google.android.gms.internal.ads.h4
            com.google.android.gms.internal.ads.b94 r2 = r13.f18754a
            com.google.android.gms.internal.ads.da4 r3 = r13.f18755b
            r15.<init>(r2, r3, r5)
            r13.f18756c = r15
            goto L_0x0099
        L_0x0026:
            r2 = 6
            if (r15 != r2) goto L_0x0039
            com.google.android.gms.internal.ads.j4 r15 = new com.google.android.gms.internal.ads.j4
            com.google.android.gms.internal.ads.b94 r3 = r13.f18754a
            com.google.android.gms.internal.ads.da4 r4 = r13.f18755b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f18756c = r15
            goto L_0x0099
        L_0x0039:
            r2 = 7
            if (r15 != r2) goto L_0x004c
            com.google.android.gms.internal.ads.j4 r15 = new com.google.android.gms.internal.ads.j4
            com.google.android.gms.internal.ads.b94 r3 = r13.f18754a
            com.google.android.gms.internal.ads.da4 r4 = r13.f18755b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f18756c = r15
            goto L_0x0099
        L_0x004c:
            int r2 = r5.f19195e
            if (r15 == r0) goto L_0x0061
            r3 = 3
            if (r15 == r3) goto L_0x005a
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x0061
        L_0x0058:
            r7 = 0
            goto L_0x0066
        L_0x005a:
            r15 = 32
            if (r2 != r15) goto L_0x0058
            r15 = 4
            r7 = 4
            goto L_0x0066
        L_0x0061:
            int r15 = com.google.android.gms.internal.ads.wy2.m33423R(r2)
            r7 = r15
        L_0x0066:
            if (r7 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.j4 r15 = new com.google.android.gms.internal.ads.j4
            com.google.android.gms.internal.ads.b94 r3 = r13.f18754a
            com.google.android.gms.internal.ads.da4 r4 = r13.f18755b
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f18756c = r15
            goto L_0x0099
        L_0x0077:
            int r14 = r5.f19191a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 40
            r15.<init>(r0)
            java.lang.String r0 = "Unsupported WAV format type: "
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            com.google.android.gms.internal.ads.px r14 = com.google.android.gms.internal.ads.C5464px.zzc(r14)
            throw r14
        L_0x0091:
            r14 = 0
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            com.google.android.gms.internal.ads.px r14 = com.google.android.gms.internal.ads.C5464px.zza(r15, r14)
            throw r14
        L_0x0099:
            int r15 = r13.f18757d
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x016d
            r14.mo19928h()
            com.google.android.gms.internal.ads.no2 r15 = new com.google.android.gms.internal.ads.no2
            r5 = 8
            r15.<init>((int) r5)
            com.google.android.gms.internal.ads.m4 r6 = com.google.android.gms.internal.ads.C5324m4.m27117a(r14, r15)
        L_0x00ae:
            int r7 = r6.f19759a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r8) goto L_0x010d
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r8) goto L_0x00d7
            r10 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r10) goto L_0x00d7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 39
            r10.<init>(r11)
            java.lang.String r11 = "Ignoring unknown WAV chunk: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00d7:
            long r9 = r6.f19760b
            r11 = 8
            long r9 = r9 + r11
            int r6 = r6.f19759a
            if (r6 != r8) goto L_0x00e2
            r9 = 12
        L_0x00e2:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00f5
            r6 = r14
            com.google.android.gms.internal.ads.t84 r6 = (com.google.android.gms.internal.ads.t84) r6
            int r7 = (int) r9
            r6.mo21042o(r7, r1)
            com.google.android.gms.internal.ads.m4 r6 = com.google.android.gms.internal.ads.C5324m4.m27117a(r14, r15)
            goto L_0x00ae
        L_0x00f5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = 51
            r14.<init>(r15)
            java.lang.String r15 = "Chunk is too large (~2GB+) to skip; id: "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.px r14 = com.google.android.gms.internal.ads.C5464px.zzc(r14)
            throw r14
        L_0x010d:
            r15 = r14
            com.google.android.gms.internal.ads.t84 r15 = (com.google.android.gms.internal.ads.t84) r15
            r15.mo21042o(r5, r1)
            long r7 = r14.zze()
            long r5 = r6.f19760b
            long r5 = r5 + r7
            long r10 = r14.mo16584b()
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0145
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0145
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r12 = 69
            r15.<init>(r12)
            java.lang.String r12 = "Data exceeds input length: "
            r15.append(r12)
            r15.append(r5)
            java.lang.String r5 = ", "
            r15.append(r5)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r9, r15)
            r5 = r10
        L_0x0145:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            android.util.Pair r15 = android.util.Pair.create(r15, r5)
            java.lang.Object r5 = r15.first
            java.lang.Long r5 = (java.lang.Long) r5
            int r5 = r5.intValue()
            r13.f18757d = r5
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r5 = r15.longValue()
            r13.f18758e = r5
            com.google.android.gms.internal.ads.i4 r15 = r13.f18756c
            int r7 = r13.f18757d
            r15.mo18067b(r7, r5)
            goto L_0x017f
        L_0x016d:
            long r5 = r14.zze()
            r7 = 0
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x017f
            int r15 = r13.f18757d
            r5 = r14
            com.google.android.gms.internal.ads.t84 r5 = (com.google.android.gms.internal.ads.t84) r5
            r5.mo21042o(r15, r1)
        L_0x017f:
            long r5 = r13.f18758e
            int r15 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            com.google.android.gms.internal.ads.gs1.m24488f(r0)
            long r2 = r13.f18758e
            long r5 = r14.zze()
            com.google.android.gms.internal.ads.i4 r15 = r13.f18756c
            long r2 = r2 - r5
            boolean r14 = r15.mo18068c(r14, r2)
            if (r14 == 0) goto L_0x019a
            return r4
        L_0x019a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5250k4.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f18754a = b94;
        this.f18755b = b94.mo15724s(0, 1);
        b94.mo15722I();
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        C5176i4 i4Var = this.f18756c;
        if (i4Var != null) {
            i4Var.mo18066a(j2);
        }
    }
}
