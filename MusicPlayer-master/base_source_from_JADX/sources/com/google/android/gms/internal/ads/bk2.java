package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.l71;
import com.google.android.gms.internal.ads.m11;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class bk2<AppOpenAd extends g41, AppOpenRequestComponent extends m11<AppOpenAd>, AppOpenRequestComponentBuilder extends l71<AppOpenRequestComponent>> implements ma2<AppOpenAd> {

    /* renamed from: a */
    private final Context f14527a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f14528b;

    /* renamed from: c */
    protected final mt0 f14529c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final sk2 f14530d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final om2<AppOpenRequestComponent, AppOpenAd> f14531e;

    /* renamed from: f */
    private final ViewGroup f14532f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zu2 f14533g;

    /* renamed from: h */
    private final sp2 f14534h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public d93<AppOpenAd> f14535i;

    protected bk2(Context context, Executor executor, mt0 mt0, om2<AppOpenRequestComponent, AppOpenAd> om2, sk2 sk2, sp2 sp2) {
        this.f14527a = context;
        this.f14528b = executor;
        this.f14529c = mt0;
        this.f14531e = om2;
        this.f14530d = sk2;
        this.f14534h = sp2;
        this.f14532f = new FrameLayout(context);
        this.f14533g = mt0.mo19511b();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized AppOpenRequestComponentBuilder m21416l(mm2 mm2) {
        ak2 ak2 = (ak2) mm2;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22590o5)).booleanValue()) {
            b21 b21 = new b21(this.f14532f);
            o71 o71 = new o71();
            o71.mo19907c(this.f14527a);
            o71.mo19910f(ak2.f13936a);
            q71 g = o71.mo19911g();
            vd1 vd1 = new vd1();
            vd1.mo21466f(this.f14530d, this.f14528b);
            vd1.mo21475o(this.f14530d, this.f14528b);
            return mo16309b(b21, g, vd1.mo21477q());
        }
        sk2 d = sk2.m30749d(this.f14530d);
        vd1 vd12 = new vd1();
        vd12.mo21465e(d, this.f14528b);
        vd12.mo21470j(d, this.f14528b);
        vd12.mo21471k(d, this.f14528b);
        vd12.mo21472l(d, this.f14528b);
        vd12.mo21466f(d, this.f14528b);
        vd12.mo21475o(d, this.f14528b);
        vd12.mo21476p(d);
        b21 b212 = new b21(this.f14532f);
        o71 o712 = new o71();
        o712.mo19907c(this.f14527a);
        o712.mo19910f(ak2.f13936a);
        return mo16309b(b212, o712.mo19911g(), vd12.mo21477q());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo16308a(com.google.android.gms.internal.ads.zzbfd r5, java.lang.String r6, com.google.android.gms.internal.ads.ka2 r7, com.google.android.gms.internal.ads.la2<? super AppOpenAd> r8) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r7 = r4.f14527a     // Catch:{ all -> 0x00a3 }
            r0 = 7
            com.google.android.gms.internal.ads.xu2 r7 = com.google.android.gms.internal.ads.xu2.m33823p(r7, r0, r0, r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C3292l.m14236d(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 0
            if (r6 != 0) goto L_0x002f
            java.lang.String r5 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.internal.ads.ul0.m31859d(r5)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r5 = r4.f14528b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.wj2 r6 = new com.google.android.gms.internal.ads.wj2     // Catch:{ all -> 0x00a3 }
            r6.<init>(r4)     // Catch:{ all -> 0x00a3 }
            r5.execute(r6)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zu2 r5 = r4.f14533g     // Catch:{ all -> 0x00a3 }
            r7.mo22076g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.yu2 r6 = r7.mo22078i()     // Catch:{ all -> 0x00a3 }
            r5.mo22435a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x002d:
            monitor-exit(r4)
            return r0
        L_0x002f:
            com.google.android.gms.internal.ads.d93<AppOpenAd> r1 = r4.f14535i     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0043
            if (r7 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zu2 r5 = r4.f14533g     // Catch:{ all -> 0x00a3 }
            r7.mo22076g(r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.yu2 r6 = r7.mo22078i()     // Catch:{ all -> 0x00a3 }
            r5.mo22435a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0041:
            monitor-exit(r4)
            return r0
        L_0x0043:
            android.content.Context r0 = r4.f14527a     // Catch:{ all -> 0x00a3 }
            boolean r1 = r5.f27200l     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.jq2.m25820a(r0, r1)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22422S5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            r1 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r5.f27200l     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.mt0 r0 = r4.f14529c     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ew1 r0 = r0.mo19525s()     // Catch:{ all -> 0x00a3 }
            r0.mo17373l(r1)     // Catch:{ all -> 0x00a3 }
        L_0x006a:
            com.google.android.gms.internal.ads.sp2 r0 = r4.f14534h     // Catch:{ all -> 0x00a3 }
            r0.mo20915H(r6)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbfi r6 = com.google.android.gms.internal.ads.zzbfi.m34949m0()     // Catch:{ all -> 0x00a3 }
            r0.mo20914G(r6)     // Catch:{ all -> 0x00a3 }
            r0.mo20926d(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.up2 r5 = r0.mo20928f()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ak2 r6 = new com.google.android.gms.internal.ads.ak2     // Catch:{ all -> 0x00a3 }
            r0 = 0
            r6.<init>(r0)     // Catch:{ all -> 0x00a3 }
            r6.f13936a = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.om2<AppOpenRequestComponent, AppOpenAd> r5 = r4.f14531e     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.pm2 r2 = new com.google.android.gms.internal.ads.pm2     // Catch:{ all -> 0x00a3 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.vj2 r3 = new com.google.android.gms.internal.ads.vj2     // Catch:{ all -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.d93 r5 = r5.mo16681a(r2, r3, r0)     // Catch:{ all -> 0x00a3 }
            r4.f14535i = r5     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.yj2 r0 = new com.google.android.gms.internal.ads.yj2     // Catch:{ all -> 0x00a3 }
            r0.<init>(r4, r8, r7, r6)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.Executor r6 = r4.f14528b     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.s83.m30616r(r5, r0, r6)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r4)
            return r1
        L_0x00a3:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bk2.mo16308a(com.google.android.gms.internal.ads.zzbfd, java.lang.String, com.google.android.gms.internal.ads.ka2, com.google.android.gms.internal.ads.la2):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AppOpenRequestComponentBuilder mo16309b(b21 b21, q71 q71, xd1 xd1);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo16310j() {
        this.f14530d.mo16370c(nq2.m28048d(6, (String) null, (zzbew) null));
    }

    /* renamed from: k */
    public final void mo16311k(zzbfo zzbfo) {
        this.f14534h.mo20916I(zzbfo);
    }

    public final boolean zza() {
        d93<AppOpenAd> d93 = this.f14535i;
        return d93 != null && !d93.isDone();
    }
}
