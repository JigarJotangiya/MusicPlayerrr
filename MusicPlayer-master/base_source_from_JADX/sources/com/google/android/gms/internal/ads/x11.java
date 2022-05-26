package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x11 extends g41 {

    /* renamed from: i */
    private final pr0 f25618i;

    /* renamed from: j */
    private final int f25619j;

    /* renamed from: k */
    private final Context f25620k;

    /* renamed from: l */
    private final e11 f25621l;

    /* renamed from: m */
    private final yh1 f25622m;

    /* renamed from: n */
    private final s81 f25623n;

    /* renamed from: o */
    private boolean f25624o = false;

    x11(f41 f41, Context context, pr0 pr0, int i, e11 e11, yh1 yh1, s81 s81) {
        super(f41);
        this.f25618i = pr0;
        this.f25620k = context;
        this.f25619j = i;
        this.f25621l = e11;
        this.f25622m = yh1;
        this.f25623n = s81;
    }

    /* renamed from: a */
    public final void mo17837a() {
        super.mo17837a();
        pr0 pr0 = this.f25618i;
        if (pr0 != null) {
            pr0.destroy();
        }
    }

    /* renamed from: h */
    public final int mo21951h() {
        return this.f25619j;
    }

    /* renamed from: i */
    public final void mo21952i(C5381no noVar) {
        pr0 pr0 = this.f25618i;
        if (pr0 != null) {
            pr0.mo17659G(noVar);
        }
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21953j(android.app.Activity r4, com.google.android.gms.internal.ads.C4974cp r5, boolean r6) throws android.os.RemoteException {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0004
            android.content.Context r4 = r3.f25620k
        L_0x0004:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22585o0
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0058
            com.google.android.gms.ads.internal.C2971s.m13214q()
            boolean r0 = com.google.android.gms.ads.internal.util.C2979b2.m13263k(r4)
            if (r0 == 0) goto L_0x0058
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.ul0.m31862g(r5)
            com.google.android.gms.internal.ads.s81 r5 = r3.f25623n
            r5.mo17074a()
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C5503qz.f22593p0
            com.google.android.gms.internal.ads.oz r6 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r5 = r6.mo20153b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.oy2 r5 = new com.google.android.gms.internal.ads.oy2
            android.content.Context r4 = r4.getApplicationContext()
            com.google.android.gms.ads.internal.util.w0 r6 = com.google.android.gms.ads.internal.C2971s.m13218u()
            android.os.Looper r6 = r6.mo11123b()
            r5.<init>(r4, r6)
            com.google.android.gms.internal.ads.np2 r4 = r3.f16934a
            com.google.android.gms.internal.ads.mp2 r4 = r4.f20683b
            com.google.android.gms.internal.ads.ep2 r4 = r4.f20121b
            java.lang.String r4 = r4.f16050b
            r5.mo20152a(r4)
            return
        L_0x0058:
            boolean r0 = r3.f25624o
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.ul0.m31862g(r0)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22671y6
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.s81 r0 = r3.f25623n
            r1 = 10
            r2 = 0
            com.google.android.gms.internal.ads.zzbew r1 = com.google.android.gms.internal.ads.nq2.m28048d(r1, r2, r2)
            r0.mo17075c(r1)
        L_0x007f:
            boolean r0 = r3.f25624o
            if (r0 != 0) goto L_0x00ae
            com.google.android.gms.internal.ads.yh1 r0 = r3.f25622m     // Catch:{ xh1 -> 0x008e }
            com.google.android.gms.internal.ads.s81 r1 = r3.f25623n     // Catch:{ xh1 -> 0x008e }
            r0.mo15674a(r6, r4, r1)     // Catch:{ xh1 -> 0x008e }
            r4 = 1
            r3.f25624o = r4
            return
        L_0x008e:
            r4 = move-exception
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C5503qz.f22671y6
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r6 = r0.mo20153b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.s81 r5 = r3.f25623n
            r5.mo17073A0(r4)
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.zzbew r4 = com.google.android.gms.internal.ads.nq2.m28045a(r4)
            r5.mo16715i0(r4)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x11.mo21953j(android.app.Activity, com.google.android.gms.internal.ads.cp, boolean):void");
    }

    /* renamed from: k */
    public final void mo21954k(long j, int i) {
        this.f25621l.mo17078a(j, i);
    }
}
