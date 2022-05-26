package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n04 extends Exception {
    public final String zza;
    public final boolean zzb;
    public final m04 zzc;
    public final String zzd;
    public final n04 zze;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n04(com.google.android.gms.internal.ads.C5689w r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.String r0 = java.lang.String.valueOf(r13)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 36
            r1.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "], "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r5 = r11.f25133l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = 75
            r13.<init>(r14)
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r1.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n04.<init>(com.google.android.gms.internal.ads.w, java.lang.Throwable, boolean, int):void");
    }

    static /* bridge */ /* synthetic */ n04 zza(n04 n04, n04 n042) {
        return new n04(n04.getMessage(), n04.getCause(), n04.zza, false, n04.zzc, n04.zzd, n042);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n04(com.google.android.gms.internal.ads.C5689w r9, java.lang.Throwable r10, boolean r11, com.google.android.gms.internal.ads.m04 r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.f19692a
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "Decoder init failed: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r9.f25133l
            int r0 = com.google.android.gms.internal.ads.wy2.f25579a
            r4 = 0
            r6 = 21
            if (r0 < r6) goto L_0x0048
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0048
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
            r6 = r0
            goto L_0x0049
        L_0x0048:
            r6 = r4
        L_0x0049:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n04.<init>(com.google.android.gms.internal.ads.w, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.m04):void");
    }

    private n04(String str, Throwable th, String str2, boolean z, m04 m04, String str3, n04 n04) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = m04;
        this.zzd = str3;
        this.zze = n04;
    }
}
