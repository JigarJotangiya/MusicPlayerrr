package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v92 implements cb1, u91, h81, z81, C5497qt, e81, sa1, C5666vd, v81, yf1 {

    /* renamed from: g */
    private final AtomicReference<C5314lv> f24640g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<C5130gw> f24641h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C5205ix> f24642i = new AtomicReference<>();

    /* renamed from: j */
    private final AtomicReference<C5462pv> f24643j = new AtomicReference<>();

    /* renamed from: k */
    private final AtomicReference<C5389nw> f24644k = new AtomicReference<>();

    /* renamed from: l */
    private final AtomicBoolean f24645l = new AtomicBoolean(true);

    /* renamed from: m */
    private final AtomicBoolean f24646m = new AtomicBoolean(false);

    /* renamed from: n */
    private final AtomicBoolean f24647n = new AtomicBoolean(false);

    /* renamed from: o */
    private final gu2 f24648o;

    /* renamed from: p */
    final BlockingQueue<Pair<String, String>> f24649p = new ArrayBlockingQueue(((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22401P5)).intValue());

    public v92(gu2 gu2) {
        this.f24648o = gu2;
    }

    @TargetApi(5)
    /* renamed from: z */
    private final void m32209z() {
        if (this.f24646m.get() && this.f24647n.get()) {
            for (Pair d92 : this.f24649p) {
                bm2.m21449a(this.f24641h, new d92(d92));
            }
            this.f24649p.clear();
            this.f24645l.set(false);
        }
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
        this.f24645l.set(true);
        this.f24647n.set(false);
    }

    /* renamed from: a */
    public final synchronized C5314lv mo21442a() {
        return this.f24640g.get();
    }

    /* renamed from: b */
    public final synchronized C5130gw mo21443b() {
        return this.f24641h.get();
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        bm2.m21449a(this.f24640g, new m92(zzbew));
        bm2.m21449a(this.f24640g, new n92(zzbew));
        bm2.m21449a(this.f24643j, new o92(zzbew));
        this.f24645l.set(false);
        this.f24649p.clear();
    }

    /* renamed from: d */
    public final void mo15612d(fh0 fh0, String str, String str2) {
    }

    /* renamed from: e */
    public final void mo21444e(C5314lv lvVar) {
        this.f24640g.set(lvVar);
    }

    /* renamed from: g */
    public final void mo16977g(zzbfk zzbfk) {
        bm2.m21449a(this.f24642i, new q92(zzbfk));
    }

    /* renamed from: h */
    public final void mo15613h() {
        bm2.m21449a(this.f24640g, t92.f23797a);
        bm2.m21449a(this.f24644k, j92.f18400a);
    }

    /* renamed from: j */
    public final void mo15614j() {
        bm2.m21449a(this.f24640g, u92.f24236a);
    }

    /* renamed from: k */
    public final synchronized void mo15615k() {
        bm2.m21449a(this.f24640g, f92.f16483a);
        bm2.m21449a(this.f24643j, h92.f17584a);
        this.f24647n.set(true);
        m32209z();
    }

    /* renamed from: l */
    public final void mo15616l() {
        bm2.m21449a(this.f24640g, g92.f17000a);
        bm2.m21449a(this.f24644k, l92.f19266a);
        bm2.m21449a(this.f24644k, k92.f18843a);
    }

    /* renamed from: m */
    public final void mo15617m() {
        bm2.m21449a(this.f24640g, e92.f15893a);
    }

    /* renamed from: n */
    public final void mo15618n() {
    }

    /* renamed from: n0 */
    public final void mo15619n0(zzbew zzbew) {
        bm2.m21449a(this.f24644k, new p92(zzbew));
    }

    /* renamed from: o */
    public final void mo15729o() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
            bm2.m21449a(this.f24640g, s92.f23384a);
        }
        bm2.m21449a(this.f24644k, i92.f17925a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    @android.annotation.TargetApi(5)
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17341p(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f24645l     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>> r0 = r3.f24649p     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.ul0.m31857b(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.gu2 r0 = r3.f24648o     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.fu2 r1 = com.google.android.gms.internal.ads.fu2.m23966b(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.mo17738a(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.mo17738a(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.mo18029a(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.gw> r0 = r3.f24641h     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.r92 r1 = new com.google.android.gms.internal.ads.r92     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.bm2.m21449a(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v92.mo17341p(java.lang.String, java.lang.String):void");
    }

    /* renamed from: r */
    public final void mo21445r(C5462pv pvVar) {
        this.f24643j.set(pvVar);
    }

    /* renamed from: u */
    public final void mo21446u(C5205ix ixVar) {
        this.f24642i.set(ixVar);
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
            bm2.m21449a(this.f24640g, s92.f23384a);
        }
    }

    /* renamed from: v */
    public final void mo21447v(C5130gw gwVar) {
        this.f24641h.set(gwVar);
        this.f24646m.set(true);
        m32209z();
    }

    /* renamed from: x */
    public final void mo21448x(C5389nw nwVar) {
        this.f24644k.set(nwVar);
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
    }

    public final void zzr() {
    }
}
