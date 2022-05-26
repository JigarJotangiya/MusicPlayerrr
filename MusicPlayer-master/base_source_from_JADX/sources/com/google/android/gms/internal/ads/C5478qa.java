package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.qa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5478qa implements C5589ta {

    /* renamed from: u */
    private static C5478qa f21872u;

    /* renamed from: g */
    private final Context f21873g;

    /* renamed from: h */
    private final qz2 f21874h;

    /* renamed from: i */
    private final wz2 f21875i;

    /* renamed from: j */
    private final yz2 f21876j;

    /* renamed from: k */
    private final C5479qb f21877k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final dy2 f21878l;

    /* renamed from: m */
    private final Executor f21879m;

    /* renamed from: n */
    private final vz2 f21880n;

    /* renamed from: o */
    private final CountDownLatch f21881o;

    /* renamed from: p */
    volatile long f21882p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Object f21883q = new Object();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile boolean f21884r;

    /* renamed from: s */
    private volatile boolean f21885s = false;

    /* renamed from: t */
    private final int f21886t;

    C5478qa(Context context, dy2 dy2, qz2 qz2, wz2 wz2, yz2 yz2, C5479qb qbVar, Executor executor, yx2 yx2, int i) {
        this.f21873g = context;
        this.f21878l = dy2;
        this.f21874h = qz2;
        this.f21875i = wz2;
        this.f21876j = yz2;
        this.f21877k = qbVar;
        this.f21879m = executor;
        this.f21886t = i;
        this.f21881o = new CountDownLatch(1);
        this.f21880n = new C5404oa(this, yx2);
    }

    /* renamed from: h */
    public static synchronized C5478qa m29416h(String str, Context context, boolean z, boolean z2) {
        C5478qa i;
        synchronized (C5478qa.class) {
            i = m29417i(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return i;
    }

    @Deprecated
    /* renamed from: i */
    public static synchronized C5478qa m29417i(String str, Context context, Executor executor, boolean z, boolean z2) {
        C5478qa qaVar;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (C5478qa.class) {
            if (f21872u == null) {
                ey2 a = fy2.m24003a();
                String str2 = str;
                a.mo17432a(str);
                a.mo17434c(z);
                fy2 d = a.mo17435d();
                dy2 a2 = dy2.m22747a(context2, executor2, z2);
                C4886ab c = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22404Q1)).booleanValue() ? C4886ab.m20651c(context) : null;
                xy2 e = xy2.m33902e(context2, executor2, a2, d);
                zzaml zzaml = new zzaml(context2);
                C5479qb qbVar = new C5479qb(d, e, new C4998dc(context2, zzaml), zzaml, c);
                int b = gz2.m24600b(context2, a2);
                yx2 yx2 = new yx2();
                C5478qa qaVar2 = new C5478qa(context, a2, new qz2(context2, b), new wz2(context2, b, new C5367na(a2), ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22618s1)).booleanValue()), new yz2(context2, qbVar, a2, yx2), qbVar, executor, yx2, b);
                f21872u = qaVar2;
                qaVar2.mo20412n();
                f21872u.mo20413o();
            }
            qaVar = f21872u;
        }
        return qaVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.mo19141F().mo19962L().equals(r5.mo19962L()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.f21878l.mo17049d(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.f21881o;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m29421m(com.google.android.gms.internal.ads.C5478qa r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.pz2 r3 = r12.m29423r(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.od r4 = r3.mo20348a()
            java.lang.String r4 = r4.mo19963M()
            com.google.android.gms.internal.ads.od r3 = r3.mo20348a()
            java.lang.String r3 = r3.mo19962L()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.f21873g     // Catch:{ bn3 -> 0x012a }
            r6 = 1
            int r7 = r12.f21886t     // Catch:{ bn3 -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.dy2 r11 = r12.f21878l     // Catch:{ bn3 -> 0x012a }
            com.google.android.gms.internal.ads.zzfoa r3 = com.google.android.gms.internal.ads.ny2.m28182a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ bn3 -> 0x012a }
            byte[] r4 = r3.f27409h     // Catch:{ bn3 -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.kl3 r4 = com.google.android.gms.internal.ads.kl3.zzv(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.cm3 r5 = com.google.android.gms.internal.ads.cm3.m21985a()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.ld r4 = com.google.android.gms.internal.ads.C5296ld.m26653E(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.od r5 = r4.mo19141F()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r5 = r5.mo19963M()     // Catch:{ bn3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.od r5 = r4.mo19141F()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r5 = r5.mo19962L()     // Catch:{ bn3 -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.kl3 r5 = r4.mo19142G()     // Catch:{ bn3 -> 0x012a }
            byte[] r5 = r5.zzE()     // Catch:{ bn3 -> 0x012a }
            int r5 = r5.length     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.pz2 r5 = r12.m29423r(r2)     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.od r5 = r5.mo20348a()     // Catch:{ bn3 -> 0x012a }
            com.google.android.gms.internal.ads.od r6 = r4.mo19141F()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r6 = r6.mo19963M()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r7 = r5.mo19963M()     // Catch:{ bn3 -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ bn3 -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.od r6 = r4.mo19141F()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r6 = r6.mo19962L()     // Catch:{ bn3 -> 0x012a }
            java.lang.String r5 = r5.mo19962L()     // Catch:{ bn3 -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ bn3 -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.vz2 r5 = r12.f21880n     // Catch:{ bn3 -> 0x012a }
            int r3 = r3.f27410i     // Catch:{ bn3 -> 0x012a }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C5503qz.f22602q1     // Catch:{ bn3 -> 0x012a }
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ bn3 -> 0x012a }
            java.lang.Object r6 = r7.mo20153b(r6)     // Catch:{ bn3 -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ bn3 -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ bn3 -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.wz2 r3 = r12.f21875i     // Catch:{ bn3 -> 0x012a }
            boolean r3 = r3.mo21943a(r4)     // Catch:{ bn3 -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.wz2 r3 = r12.f21875i     // Catch:{ bn3 -> 0x012a }
            boolean r3 = r3.mo21944b(r4, r5)     // Catch:{ bn3 -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.qz2 r3 = r12.f21874h     // Catch:{ bn3 -> 0x012a }
            boolean r3 = r3.mo20540b(r4, r5)     // Catch:{ bn3 -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.dy2 r2 = r12.f21878l     // Catch:{ bn3 -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ bn3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo17049d(r3, r4)     // Catch:{ bn3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.pz2 r3 = r12.m29423r(r2)     // Catch:{ bn3 -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.yz2 r4 = r12.f21876j     // Catch:{ bn3 -> 0x012a }
            boolean r3 = r4.mo22312c(r3)     // Catch:{ bn3 -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.f21885s = r2     // Catch:{ bn3 -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ bn3 -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.f21882p = r2     // Catch:{ bn3 -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.dy2 r2 = r12.f21878l     // Catch:{ bn3 -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ bn3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo17049d(r3, r4)     // Catch:{ bn3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.dy2 r2 = r12.f21878l     // Catch:{ bn3 -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ bn3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo17049d(r3, r4)     // Catch:{ bn3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.dy2 r2 = r12.f21878l     // Catch:{ bn3 -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ bn3 -> 0x012a }
            long r4 = r4 - r0
            r2.mo17049d(r3, r4)     // Catch:{ bn3 -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.dy2 r3 = r12.f21878l     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.mo17048c(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.f21881o
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5478qa.m29421m(com.google.android.gms.internal.ads.qa):void");
    }

    /* renamed from: r */
    private final pz2 m29423r(int i) {
        if (!gz2.m24599a(this.f21886t)) {
            return null;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22602q1)).booleanValue()) {
            return this.f21875i.mo21945c(1);
        }
        return this.f21874h.mo20542d(1);
    }

    /* renamed from: a */
    public final void mo10839a(View view) {
        this.f21877k.mo20419c(view);
    }

    /* renamed from: b */
    public final String mo10840b(Context context) {
        mo20413o();
        gy2 a = this.f21876j.mo22310a();
        if (a == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a.mo18046a(context, (String) null);
        this.f21878l.mo17051f(5001, System.currentTimeMillis() - currentTimeMillis, a2, (Map<String, String>) null);
        return a2;
    }

    /* renamed from: c */
    public final void mo10841c(int i, int i2, int i3) {
    }

    /* renamed from: d */
    public final String mo10842d(Context context, String str, View view, Activity activity) {
        mo20413o();
        gy2 a = this.f21876j.mo22310a();
        if (a == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.mo18048c(context, (String) null, str, view, activity);
        this.f21878l.mo17051f(5000, System.currentTimeMillis() - currentTimeMillis, c, (Map<String, String>) null);
        return c;
    }

    /* renamed from: e */
    public final void mo10843e(MotionEvent motionEvent) {
        gy2 a = this.f21876j.mo22310a();
        if (a != null) {
            try {
                a.mo18047b((String) null, motionEvent);
            } catch (xz2 e) {
                this.f21878l.mo17048c(e.zza(), -1, e);
            }
        }
    }

    /* renamed from: f */
    public final String mo10844f(Context context, View view, Activity activity) {
        mo20413o();
        gy2 a = this.f21876j.mo22310a();
        if (a == null) {
            return BuildConfig.FLAVOR;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d = a.mo18049d(context, (String) null, view, (Activity) null);
        this.f21878l.mo17051f(5002, System.currentTimeMillis() - currentTimeMillis, d, (Map<String, String>) null);
        return d;
    }

    /* renamed from: g */
    public final String mo10845g(Context context, String str, View view) {
        return mo10842d(context, str, view, (Activity) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final synchronized void mo20412n() {
        long currentTimeMillis = System.currentTimeMillis();
        pz2 r = m29423r(1);
        if (r == null) {
            this.f21878l.mo17049d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f21876j.mo22312c(r)) {
            this.f21885s = true;
            this.f21881o.countDown();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20413o() {
        /*
            r6 = this;
            boolean r0 = r6.f21884r
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.f21883q
            monitor-enter(r0)
            boolean r1 = r6.f21884r     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.f21882p     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.yz2 r1 = r6.f21876j     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.pz2 r1 = r1.mo22311b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.mo20351d(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.f21886t     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.gz2.m24599a(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f21879m     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.pa r2 = new com.google.android.gms.internal.ads.pa     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5478qa.mo20413o():void");
    }

    /* renamed from: q */
    public final synchronized boolean mo20414q() {
        return this.f21885s;
    }
}
