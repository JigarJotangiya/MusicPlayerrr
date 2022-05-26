package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z62 implements yh1 {

    /* renamed from: a */
    private final Context f26679a;

    /* renamed from: b */
    private final oq1 f26680b;

    /* renamed from: c */
    private final up2 f26681c;

    /* renamed from: d */
    private final zzcjf f26682d;

    /* renamed from: e */
    private final bp2 f26683e;

    /* renamed from: f */
    private final d93<sp1> f26684f;

    /* renamed from: g */
    private final pr0 f26685g;

    /* renamed from: h */
    private final b60 f26686h;

    /* renamed from: i */
    private final boolean f26687i;

    z62(Context context, oq1 oq1, up2 up2, zzcjf zzcjf, bp2 bp2, d93<sp1> d93, pr0 pr0, b60 b60, boolean z) {
        this.f26679a = context;
        this.f26680b = oq1;
        this.f26681c = up2;
        this.f26682d = zzcjf;
        this.f26683e = bp2;
        this.f26684f = d93;
        this.f26685g = pr0;
        this.f26686h = b60;
        this.f26687i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15674a(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.s81 r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.d93<com.google.android.gms.internal.ads.sp1> r0 = r1.f26684f
            java.lang.Object r0 = com.google.android.gms.internal.ads.s83.m30615q(r0)
            com.google.android.gms.internal.ads.sp1 r0 = (com.google.android.gms.internal.ads.sp1) r0
            com.google.android.gms.internal.ads.bp2 r2 = r1.f26683e     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.pr0 r3 = r1.f26685g     // Catch:{ bs0 -> 0x00fe }
            boolean r3 = r3.mo17705q0()     // Catch:{ bs0 -> 0x00fe }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.pr0 r2 = r1.f26685g     // Catch:{ bs0 -> 0x00fe }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22641v0     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.oz r5 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ bs0 -> 0x00fe }
            java.lang.Object r3 = r5.mo20153b(r3)     // Catch:{ bs0 -> 0x00fe }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ bs0 -> 0x00fe }
            boolean r3 = r3.booleanValue()     // Catch:{ bs0 -> 0x00fe }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.pr0 r2 = r1.f26685g     // Catch:{ bs0 -> 0x00fe }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.oq1 r3 = r1.f26680b     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.up2 r5 = r1.f26681c     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.zzbfi r5 = r5.f24396e     // Catch:{ bs0 -> 0x00fe }
            r6 = 0
            com.google.android.gms.internal.ads.pr0 r3 = r3.mo20090a(r5, r6, r6)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.hg1 r5 = r0.mo20905i()     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.p60.m28910b(r3, r5)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.sq1 r5 = new com.google.android.gms.internal.ads.sq1     // Catch:{ bs0 -> 0x00fe }
            r5.<init>()     // Catch:{ bs0 -> 0x00fe }
            android.content.Context r7 = r1.f26679a     // Catch:{ bs0 -> 0x00fe }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ bs0 -> 0x00fe }
            r5.mo20950a(r7, r8)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.nq1 r7 = r0.mo20908l()     // Catch:{ bs0 -> 0x00fe }
            boolean r8 = r1.f26687i     // Catch:{ bs0 -> 0x00fe }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.b60 r8 = r1.f26686h     // Catch:{ bs0 -> 0x00fe }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.mo19818i(r3, r4, r8)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.et0 r7 = r3.mo17673Q0()     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.x62 r8 = new com.google.android.gms.internal.ads.x62     // Catch:{ bs0 -> 0x00fe }
            r8.<init>(r5, r3)     // Catch:{ bs0 -> 0x00fe }
            r7.mo17300d1(r8)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.et0 r5 = r3.mo17673Q0()     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.y62 r7 = new com.google.android.gms.internal.ads.y62     // Catch:{ bs0 -> 0x00fe }
            r7.<init>(r3)     // Catch:{ bs0 -> 0x00fe }
            r5.mo17299a1(r7)     // Catch:{ bs0 -> 0x00fe }
            com.google.android.gms.internal.ads.gp2 r2 = r2.f14665t     // Catch:{ bs0 -> 0x00fe }
            java.lang.String r5 = r2.f17224b     // Catch:{ bs0 -> 0x00fe }
            java.lang.String r2 = r2.f17223a     // Catch:{ bs0 -> 0x00fe }
            r3.mo17715w0(r5, r2, r6)     // Catch:{ bs0 -> 0x00fe }
            r11 = r3
        L_0x007e:
            r11.mo17719z0(r4)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r3 = r1.f26687i
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.b60 r3 = r1.f26686h
            boolean r3 = r3.mo16082e(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            android.content.Context r3 = r1.f26679a
            boolean r14 = com.google.android.gms.ads.internal.util.C2979b2.m13265m(r3)
            boolean r3 = r1.f26687i
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.b60 r3 = r1.f26686h
            boolean r3 = r3.mo16081d()
            r15 = r3
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            boolean r3 = r1.f26687i
            if (r3 == 0) goto L_0x00b4
            com.google.android.gms.internal.ads.b60 r3 = r1.f26686h
            float r3 = r3.mo16078a()
            r16 = r3
            goto L_0x00b7
        L_0x00b4:
            r3 = 0
            r16 = 0
        L_0x00b7:
            com.google.android.gms.internal.ads.bp2 r3 = r1.f26683e
            r17 = -1
            boolean r5 = r3.f14620L
            boolean r3 = r3.f14621M
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00ce
            r24.mo20807N0()
        L_0x00ce:
            com.google.android.gms.ads.internal.C2971s.m13208k()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.mh1 r9 = r0.mo20906j()
            com.google.android.gms.internal.ads.bp2 r0 = r1.f26683e
            int r12 = r0.f14622N
            com.google.android.gms.internal.ads.zzcjf r13 = r1.f26682d
            java.lang.String r14 = r0.f14611C
            com.google.android.gms.internal.ads.gp2 r0 = r0.f14665t
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.f17224b
            java.lang.String r0 = r0.f17223a
            com.google.android.gms.internal.ads.up2 r6 = r1.f26681c
            java.lang.String r6 = r6.f24397f
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.internal.ads.C5497qt) r8, (com.google.android.gms.ads.internal.overlay.C2958q) r9, (com.google.android.gms.ads.internal.overlay.C2966y) r10, (com.google.android.gms.internal.ads.pr0) r11, (int) r12, (com.google.android.gms.internal.ads.zzcjf) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.s81) r19)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.C2956o.m13114a(r0, r3, r4)
            return
        L_0x00fe:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.ul0.m31860e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z62.mo15674a(boolean, android.content.Context, com.google.android.gms.internal.ads.s81):void");
    }
}
