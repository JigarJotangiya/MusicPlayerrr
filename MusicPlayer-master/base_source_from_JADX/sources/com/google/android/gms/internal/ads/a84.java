package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a84 {

    /* renamed from: a */
    private static final int[] f13821a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f13822b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final /* synthetic */ int f13823c = 0;

    /* renamed from: a */
    public static z74 m20625a(byte[] bArr) throws C5464px {
        return m20626b(new mn2(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if (r12 != 3) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.z74 m20626b(com.google.android.gms.internal.ads.mn2 r12, boolean r13) throws com.google.android.gms.internal.ads.C5464px {
        /*
            int r0 = m20627c(r12)
            int r1 = m20628d(r12)
            r2 = 4
            int r3 = r12.mo19469c(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 19
            r4.<init>(r5)
            java.lang.String r6 = "mp4a.40."
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 22
            r7 = 5
            if (r0 == r7) goto L_0x0029
            r7 = 29
            if (r0 != r7) goto L_0x0037
        L_0x0029:
            int r1 = m20628d(r12)
            int r0 = m20627c(r12)
            if (r0 != r6) goto L_0x0037
            int r3 = r12.mo19469c(r2)
        L_0x0037:
            if (r13 == 0) goto L_0x00df
            r13 = 17
            r7 = 6
            r8 = 1
            r9 = 2
            r10 = 3
            if (r0 == r8) goto L_0x0069
            if (r0 == r9) goto L_0x0069
            if (r0 == r10) goto L_0x0069
            if (r0 == r2) goto L_0x0069
            if (r0 == r7) goto L_0x0069
            r2 = 7
            if (r0 == r2) goto L_0x0069
            if (r0 == r13) goto L_0x0069
            switch(r0) {
                case 19: goto L_0x0069;
                case 20: goto L_0x0069;
                case 21: goto L_0x0069;
                case 22: goto L_0x0069;
                case 23: goto L_0x0069;
                default: goto L_0x0051;
            }
        L_0x0051:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 42
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported audio object type: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.px r12 = com.google.android.gms.internal.ads.C5464px.zzc(r12)
            throw r12
        L_0x0069:
            boolean r2 = r12.mo19478l()
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r2, r11)
        L_0x0076:
            boolean r2 = r12.mo19478l()
            if (r2 == 0) goto L_0x0081
            r2 = 14
            r12.mo19476j(r2)
        L_0x0081:
            boolean r2 = r12.mo19478l()
            if (r3 == 0) goto L_0x00d9
            r11 = 20
            if (r0 == r7) goto L_0x0094
            if (r0 != r11) goto L_0x0092
            r0 = 20
            r7 = 20
            goto L_0x0095
        L_0x0092:
            r7 = r0
            goto L_0x0098
        L_0x0094:
            r7 = r0
        L_0x0095:
            r12.mo19476j(r10)
        L_0x0098:
            if (r2 == 0) goto L_0x00b3
            if (r0 != r6) goto L_0x00a2
            r0 = 16
            r12.mo19476j(r0)
            goto L_0x00a3
        L_0x00a2:
            r6 = r0
        L_0x00a3:
            if (r6 == r13) goto L_0x00ad
            if (r6 == r5) goto L_0x00ad
            if (r6 == r11) goto L_0x00ad
            r13 = 23
            if (r6 != r13) goto L_0x00b0
        L_0x00ad:
            r12.mo19476j(r10)
        L_0x00b0:
            r12.mo19476j(r8)
        L_0x00b3:
            switch(r7) {
                case 17: goto L_0x00b7;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b7;
                case 20: goto L_0x00b7;
                case 21: goto L_0x00b7;
                case 22: goto L_0x00b7;
                case 23: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00df
        L_0x00b7:
            int r12 = r12.mo19469c(r9)
            if (r12 == r9) goto L_0x00c0
            if (r12 == r10) goto L_0x00c1
            goto L_0x00df
        L_0x00c0:
            r10 = r12
        L_0x00c1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 33
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported epConfig: "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.px r12 = com.google.android.gms.internal.ads.C5464px.zzc(r12)
            throw r12
        L_0x00d9:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x00df:
            int[] r12 = f13822b
            r12 = r12[r3]
            r13 = -1
            r0 = 0
            if (r12 == r13) goto L_0x00ed
            com.google.android.gms.internal.ads.z74 r13 = new com.google.android.gms.internal.ads.z74
            r13.<init>(r1, r12, r4, r0)
            return r13
        L_0x00ed:
            com.google.android.gms.internal.ads.px r12 = com.google.android.gms.internal.ads.C5464px.zza(r0, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a84.m20626b(com.google.android.gms.internal.ads.mn2, boolean):com.google.android.gms.internal.ads.z74");
    }

    /* renamed from: c */
    private static int m20627c(mn2 mn2) {
        int c = mn2.mo19469c(5);
        return c == 31 ? mn2.mo19469c(6) + 32 : c;
    }

    /* renamed from: d */
    private static int m20628d(mn2 mn2) throws C5464px {
        int c = mn2.mo19469c(4);
        if (c == 15) {
            return mn2.mo19469c(24);
        }
        if (c < 13) {
            return f13821a[c];
        }
        throw C5464px.zza((String) null, (Throwable) null);
    }
}
