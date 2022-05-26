package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g62<AdT> implements y73<np2, AdT> {

    /* renamed from: a */
    private final wt2 f16971a;

    /* renamed from: b */
    private final g81 f16972b;

    /* renamed from: c */
    private final iv2 f16973c;

    /* renamed from: d */
    private final lv2 f16974d;

    /* renamed from: e */
    private final Executor f16975e;

    /* renamed from: f */
    private final ScheduledExecutorService f16976f;

    /* renamed from: g */
    private final j41<AdT> f16977g;

    /* renamed from: h */
    private final b62 f16978h;

    /* renamed from: i */
    private final p22 f16979i;

    public g62(wt2 wt2, b62 b62, g81 g81, iv2 iv2, lv2 lv2, j41<AdT> j41, Executor executor, ScheduledExecutorService scheduledExecutorService, p22 p22) {
        this.f16971a = wt2;
        this.f16978h = b62;
        this.f16972b = g81;
        this.f16973c = iv2;
        this.f16974d = lv2;
        this.f16977g = j41;
        this.f16975e = executor;
        this.f16976f = scheduledExecutorService;
        this.f16979i = p22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.d93 mo10692b(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.np2 r9 = (com.google.android.gms.internal.ads.np2) r9
            com.google.android.gms.internal.ads.mp2 r0 = r9.f20683b
            com.google.android.gms.internal.ads.ep2 r0 = r0.f20121b
            int r0 = r0.f16053e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0044
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22620s3
            com.google.android.gms.internal.ads.oz r3 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r3.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "No fill."
            goto L_0x0046
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0046
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 46
            r3.<init>(r4)
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "No ad config."
        L_0x0046:
            com.google.android.gms.internal.ads.mp2 r3 = r9.f20683b
            com.google.android.gms.internal.ads.ep2 r3 = r3.f20121b
            com.google.android.gms.internal.ads.dp2 r3 = r3.f16057i
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = r3.mo16984a()
        L_0x0052:
            com.google.android.gms.internal.ads.p22 r3 = r8.f16979i
            com.google.android.gms.internal.ads.mp2 r4 = r9.f20683b
            com.google.android.gms.internal.ads.ep2 r4 = r4.f20121b
            r3.mo20184e(r4)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22646v5
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r4.mo20153b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.mp2 r3 = r9.f20683b
            com.google.android.gms.internal.ads.ep2 r3 = r3.f20121b
            int r3 = r3.f16053e
            if (r3 == 0) goto L_0x0085
            if (r3 < r1) goto L_0x007a
            if (r3 < r2) goto L_0x0085
        L_0x007a:
            com.google.android.gms.internal.ads.e62 r9 = new com.google.android.gms.internal.ads.e62
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.d93 r9 = com.google.android.gms.internal.ads.s83.m30606h(r9)
            goto L_0x017f
        L_0x0085:
            com.google.android.gms.internal.ads.wt2 r1 = r8.f16971a
            com.google.android.gms.internal.ads.pt2 r2 = com.google.android.gms.internal.ads.pt2.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.e62 r3 = new com.google.android.gms.internal.ads.e62
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.d93 r0 = com.google.android.gms.internal.ads.s83.m30606h(r3)
            com.google.android.gms.internal.ads.mt2 r0 = com.google.android.gms.internal.ads.ft2.m23962c(r0, r2, r1)
            com.google.android.gms.internal.ads.at2 r0 = r0.mo19534a()
            com.google.android.gms.internal.ads.g81 r1 = r8.f16972b
            com.google.android.gms.internal.ads.sz0 r2 = new com.google.android.gms.internal.ads.sz0
            com.google.android.gms.internal.ads.lv2 r3 = r8.f16974d
            com.google.android.gms.internal.ads.iv2 r4 = r8.f16973c
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.f16975e
            r1.mo21251D0(r2, r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C5503qz.f22654w5
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r1 = r2.mo20153b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.mp2 r1 = r9.f20683b
            java.util.List<com.google.android.gms.internal.ads.bp2> r1 = r1.f20120a
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0106
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.bp2 r2 = (com.google.android.gms.internal.ads.bp2) r2
            com.google.android.gms.internal.ads.p22 r3 = r8.f16979i
            r3.mo20182c(r2)
            java.util.List<java.lang.String> r3 = r2.f14635a
            java.util.Iterator r3 = r3.iterator()
        L_0x00db:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.j41<AdT> r5 = r8.f16977g
            int r6 = r2.f14637b
            com.google.android.gms.internal.ads.k22 r4 = r5.mo17537a(r6, r4)
            if (r4 == 0) goto L_0x00db
            boolean r4 = r4.mo15700a(r9, r2)
            if (r4 == 0) goto L_0x00db
            goto L_0x00c4
        L_0x00f8:
            com.google.android.gms.internal.ads.p22 r3 = r8.f16979i
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.internal.ads.zzbew r6 = com.google.android.gms.internal.ads.nq2.m28048d(r6, r7, r7)
            r3.mo20183d(r2, r4, r6)
            goto L_0x00c4
        L_0x0106:
            com.google.android.gms.internal.ads.mp2 r1 = r9.f20683b
            java.util.List<com.google.android.gms.internal.ads.bp2> r1 = r1.f20120a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x010f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.bp2 r3 = (com.google.android.gms.internal.ads.bp2) r3
            java.util.List<java.lang.String> r4 = r3.f14635a
            java.util.Iterator r4 = r4.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.j41<AdT> r6 = r8.f16977g
            int r7 = r3.f14637b
            com.google.android.gms.internal.ads.k22 r6 = r6.mo17537a(r7, r5)
            if (r6 == 0) goto L_0x0121
            boolean r7 = r6.mo15700a(r9, r3)
            if (r7 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.wt2 r4 = r8.f16971a
            com.google.android.gms.internal.ads.pt2 r7 = com.google.android.gms.internal.ads.pt2.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.mt2 r0 = r4.mo19824b(r7, r0)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r7.<init>(r4)
            java.lang.String r4 = "render-config-"
            r7.append(r4)
            r7.append(r2)
            java.lang.String r4 = "-"
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.ads.mt2 r0 = r0.mo19541h(r4)
            com.google.android.gms.internal.ads.f62 r4 = new com.google.android.gms.internal.ads.f62
            r4.<init>(r8, r9, r3, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.mt2 r0 = r0.mo19536c(r3, r4)
            com.google.android.gms.internal.ads.at2 r0 = r0.mo19534a()
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x017e:
            r9 = r0
        L_0x017f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g62.mo10692b(java.lang.Object):com.google.android.gms.internal.ads.d93");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo17867c(np2 np2, bp2 bp2, k22 k22, Throwable th) throws Exception {
        b62 b62 = this.f16978h;
        d93 o = s83.m30613o(k22.mo15701b(np2, bp2), (long) bp2.f14623O, TimeUnit.MILLISECONDS, this.f16976f);
        b62.mo16083e(np2, bp2, o, this.f16973c);
        return o;
    }
}
