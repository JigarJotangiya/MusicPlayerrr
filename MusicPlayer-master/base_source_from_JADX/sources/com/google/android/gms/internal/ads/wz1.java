package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.C2971s;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wz1 extends hg0 {

    /* renamed from: g */
    private final Context f25594g;

    /* renamed from: h */
    private final Executor f25595h;

    /* renamed from: i */
    private final ah0 f25596i;

    /* renamed from: j */
    private final ty0 f25597j;

    /* renamed from: k */
    private final ArrayDeque<tz1> f25598k;

    /* renamed from: l */
    private final bh0 f25599l;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.concurrent.Executor] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.Executor, com.google.android.gms.internal.ads.bh0] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.bh0, com.google.android.gms.internal.ads.ty0] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.ah0, com.google.android.gms.internal.ads.ty0] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.ah0, java.util.ArrayDeque<com.google.android.gms.internal.ads.tz1>] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wz1(android.content.Context r1, android.content.Context r2, java.util.concurrent.Executor r3, com.google.android.gms.internal.ads.bh0 r4, com.google.android.gms.internal.ads.ty0 r5, com.google.android.gms.internal.ads.ah0 r6, java.util.ArrayDeque<com.google.android.gms.internal.ads.tz1> r7, com.google.android.gms.internal.ads.b02 r8) {
        /*
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.C5503qz.m29790c(r1)
            r0.f25594g = r1
            r0.f25595h = r2
            r0.f25599l = r3
            r0.f25596i = r5
            r0.f25597j = r4
            r0.f25598k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wz1.<init>(android.content.Context, java.util.concurrent.Executor, com.google.android.gms.internal.ads.bh0, com.google.android.gms.internal.ads.ty0, com.google.android.gms.internal.ads.ah0, java.util.ArrayDeque, com.google.android.gms.internal.ads.b02, byte[]):void");
    }

    /* renamed from: j7 */
    private final synchronized tz1 m33468j7(String str) {
        Iterator<tz1> it = this.f25598k.iterator();
        while (it.hasNext()) {
            tz1 next = it.next();
            if (next.f24071d.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: k7 */
    private final synchronized tz1 m33469k7(String str) {
        Iterator<tz1> it = this.f25598k.iterator();
        while (it.hasNext()) {
            tz1 next = it.next();
            if (next.f24070c.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* renamed from: l7 */
    private static d93<rg0> m33470l7(d93<JSONObject> d93, wt2 wt2, ba0 ba0) {
        return wt2.mo19824b(pt2.BUILD_URL, d93).mo19539f(ba0.mo16162a("AFMA_getAdDictionary", y90.f26304b, gz1.f17463a)).mo19534a();
    }

    /* renamed from: m7 */
    private static d93<JSONObject> m33471m7(zzcdq zzcdq, wt2 wt2, lh2 lh2) {
        kz1 kz1 = new kz1(lh2);
        return wt2.mo19824b(pt2.GMS_SIGNALS, s83.m30607i(zzcdq.f27348g)).mo19539f(kz1).mo19538e(hz1.f17825a).mo19534a();
    }

    /* renamed from: n7 */
    private final synchronized void m33472n7(tz1 tz1) {
        m33473o();
        this.f25598k.addLast(tz1);
    }

    /* renamed from: o */
    private final synchronized void m33473o() {
        int intValue = l10.f19144b.mo20989e().intValue();
        while (this.f25598k.size() >= intValue) {
            this.f25598k.removeFirst();
        }
    }

    /* renamed from: o7 */
    private final void m33474o7(d93<InputStream> d93, mg0 mg0) {
        s83.m30616r(s83.m30612n(d93, new iz1(this), hm0.f17708a), new sz1(this, mg0), hm0.f17713f);
    }

    /* renamed from: L0 */
    public final void mo17906L0(zzcdq zzcdq, mg0 mg0) {
        m33474o7(mo21939g7(zzcdq, Binder.getCallingUid()), mg0);
    }

    /* renamed from: O0 */
    public final void mo17907O0(String str, mg0 mg0) {
        m33474o7(mo21940h7(str), mg0);
    }

    /* renamed from: c3 */
    public final void mo17908c3(zzcdq zzcdq, mg0 mg0) {
        d93<InputStream> f7 = mo21938f7(zzcdq, Binder.getCallingUid());
        m33474o7(f7, mg0);
        f7.mo15945h(new lz1(this), this.f25595h);
    }

    /* renamed from: e7 */
    public final d93<InputStream> mo21937e7(zzcdq zzcdq, int i) {
        if (!l10.f19143a.mo20989e().booleanValue()) {
            return s83.m30606h(new Exception("Split request is disabled."));
        }
        zzffu zzffu = zzcdq.f27356o;
        if (zzffu == null) {
            return s83.m30606h(new Exception("Pool configuration missing from request."));
        }
        if (zzffu.f27386k == 0 || zzffu.f27387l == 0) {
            return s83.m30606h(new Exception("Caching is disabled."));
        }
        ba0 b = C2971s.m13204g().mo20616b(this.f25594g, zzcjf.m34965Y());
        lh2 a = this.f25597j.mo19510a(zzcdq, i);
        wt2 c = a.mo19169c();
        d93<JSONObject> m7 = m33471m7(zzcdq, c, a);
        d93<rg0> l7 = m33470l7(m7, c, b);
        return c.mo19823a(pt2.GET_URL_AND_CACHE_KEY, m7, l7).mo17015a(new mz1(this, l7, m7, zzcdq)).mo19534a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* renamed from: f7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.d93<java.io.InputStream> mo21938f7(com.google.android.gms.internal.ads.zzcdq r12, int r13) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.r90 r0 = com.google.android.gms.ads.internal.C2971s.m13204g()
            android.content.Context r1 = r11.f25594g
            com.google.android.gms.internal.ads.zzcjf r2 = com.google.android.gms.internal.ads.zzcjf.m34965Y()
            com.google.android.gms.internal.ads.ba0 r0 = r0.mo20616b(r1, r2)
            com.google.android.gms.internal.ads.ty0 r1 = r11.f25597j
            com.google.android.gms.internal.ads.lh2 r1 = r1.mo19510a(r12, r13)
            com.google.android.gms.internal.ads.u90<com.google.android.gms.internal.ads.vz1> r2 = com.google.android.gms.internal.ads.vz1.f25110d
            com.google.android.gms.internal.ads.s90<java.io.InputStream> r3 = com.google.android.gms.internal.ads.y90.f26305c
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.q90 r2 = r0.mo16162a(r4, r2, r3)
            com.google.android.gms.internal.ads.d02 r3 = new com.google.android.gms.internal.ads.d02
            java.lang.String r4 = r12.f27354m
            r3.<init>(r4)
            android.content.Context r6 = r11.f25594g
            com.google.android.gms.internal.ads.zzcjf r4 = r12.f27349h
            java.lang.String r7 = r4.f27376g
            com.google.android.gms.internal.ads.bh0 r8 = r11.f25599l
            com.google.android.gms.internal.ads.a02 r4 = new com.google.android.gms.internal.ads.a02
            r10 = 0
            r5 = r4
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.gms.internal.ads.wt2 r13 = r1.mo19169c()
            com.google.android.gms.internal.ads.t00<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.l10.f19143a
            java.lang.Object r5 = r5.mo20989e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 != 0) goto L_0x0058
            java.lang.String r5 = r12.f27357p
            if (r5 == 0) goto L_0x0084
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0084
            java.lang.String r5 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r5)
            goto L_0x0084
        L_0x0058:
            com.google.android.gms.internal.ads.t00<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.l10.f19145c
            java.lang.Object r5 = r5.mo20989e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r12.f27355n
            com.google.android.gms.internal.ads.tz1 r5 = r11.m33469k7(r5)
        L_0x006c:
            r6 = r5
            goto L_0x007d
        L_0x006e:
            java.lang.String r5 = r12.f27357p
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = r12.f27357p
            com.google.android.gms.internal.ads.tz1 r5 = r11.m33468j7(r5)
            goto L_0x006c
        L_0x007d:
            if (r6 != 0) goto L_0x0084
            java.lang.String r5 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r5)
        L_0x0084:
            r5 = 1
            r7 = 0
            r8 = 2
            if (r6 != 0) goto L_0x00d3
            com.google.android.gms.internal.ads.d93 r12 = m33471m7(r12, r13, r1)
            com.google.android.gms.internal.ads.d93 r0 = m33470l7(r12, r13, r0)
            com.google.android.gms.internal.ads.pt2 r1 = com.google.android.gms.internal.ads.pt2.HTTP
            com.google.android.gms.internal.ads.d93[] r6 = new com.google.android.gms.internal.ads.d93[r8]
            r6[r7] = r0
            r6[r5] = r12
            com.google.android.gms.internal.ads.dt2 r1 = r13.mo19823a(r1, r6)
            com.google.android.gms.internal.ads.nz1 r6 = new com.google.android.gms.internal.ads.nz1
            r6.<init>(r12, r0)
            com.google.android.gms.internal.ads.mt2 r1 = r1.mo17015a(r6)
            com.google.android.gms.internal.ads.mt2 r1 = r1.mo19538e(r3)
            com.google.android.gms.internal.ads.mt2 r1 = r1.mo19538e(r4)
            com.google.android.gms.internal.ads.at2 r1 = r1.mo19534a()
            com.google.android.gms.internal.ads.pt2 r3 = com.google.android.gms.internal.ads.pt2.PRE_PROCESS
            r4 = 3
            com.google.android.gms.internal.ads.d93[] r4 = new com.google.android.gms.internal.ads.d93[r4]
            r4[r7] = r12
            r4[r5] = r0
            r4[r8] = r1
            com.google.android.gms.internal.ads.dt2 r13 = r13.mo19823a(r3, r4)
            com.google.android.gms.internal.ads.qz1 r3 = new com.google.android.gms.internal.ads.qz1
            r3.<init>(r1, r12, r0)
            com.google.android.gms.internal.ads.mt2 r12 = r13.mo17015a(r3)
            com.google.android.gms.internal.ads.mt2 r12 = r12.mo19539f(r2)
            com.google.android.gms.internal.ads.at2 r12 = r12.mo19534a()
            return r12
        L_0x00d3:
            com.google.android.gms.internal.ads.c02 r12 = new com.google.android.gms.internal.ads.c02
            org.json.JSONObject r0 = r6.f24069b
            com.google.android.gms.internal.ads.rg0 r1 = r6.f24068a
            r12.<init>(r0, r1)
            com.google.android.gms.internal.ads.pt2 r0 = com.google.android.gms.internal.ads.pt2.HTTP
            com.google.android.gms.internal.ads.d93 r12 = com.google.android.gms.internal.ads.s83.m30607i(r12)
            com.google.android.gms.internal.ads.mt2 r12 = r13.mo19824b(r0, r12)
            com.google.android.gms.internal.ads.mt2 r12 = r12.mo19538e(r3)
            com.google.android.gms.internal.ads.mt2 r12 = r12.mo19538e(r4)
            com.google.android.gms.internal.ads.at2 r12 = r12.mo19534a()
            com.google.android.gms.internal.ads.d93 r0 = com.google.android.gms.internal.ads.s83.m30607i(r6)
            com.google.android.gms.internal.ads.pt2 r1 = com.google.android.gms.internal.ads.pt2.PRE_PROCESS
            com.google.android.gms.internal.ads.d93[] r3 = new com.google.android.gms.internal.ads.d93[r8]
            r3[r7] = r12
            r3[r5] = r0
            com.google.android.gms.internal.ads.dt2 r13 = r13.mo19823a(r1, r3)
            com.google.android.gms.internal.ads.pz1 r1 = new com.google.android.gms.internal.ads.pz1
            r1.<init>(r12, r0)
            com.google.android.gms.internal.ads.mt2 r12 = r13.mo17015a(r1)
            com.google.android.gms.internal.ads.mt2 r12 = r12.mo19539f(r2)
            com.google.android.gms.internal.ads.at2 r12 = r12.mo19534a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wz1.mo21938f7(com.google.android.gms.internal.ads.zzcdq, int):com.google.android.gms.internal.ads.d93");
    }

    /* renamed from: g7 */
    public final d93<InputStream> mo21939g7(zzcdq zzcdq, int i) {
        ba0 b = C2971s.m13204g().mo20616b(this.f25594g, zzcjf.m34965Y());
        if (!q10.f21790a.mo20989e().booleanValue()) {
            return s83.m30606h(new Exception("Signal collection disabled."));
        }
        lh2 a = this.f25597j.mo19510a(zzcdq, i);
        vg2<JSONObject> a2 = a.mo19167a();
        return a.mo19169c().mo19824b(pt2.GET_SIGNALS, s83.m30607i(zzcdq.f27348g)).mo19539f(new jz1(a2)).mo19535b(pt2.JS_SIGNALS).mo19539f(b.mo16162a("google.afma.request.getSignals", y90.f26304b, y90.f26305c)).mo19534a();
    }

    /* renamed from: h7 */
    public final d93<InputStream> mo21940h7(String str) {
        tz1 tz1;
        if (!l10.f19143a.mo20989e().booleanValue()) {
            return s83.m30606h(new Exception("Split request is disabled."));
        }
        rz1 rz1 = new rz1(this);
        if (l10.f19145c.mo20989e().booleanValue()) {
            tz1 = m33469k7(str);
        } else {
            tz1 = m33468j7(str);
        }
        if (tz1 != null) {
            return s83.m30607i(rz1);
        }
        String valueOf = String.valueOf(str);
        return s83.m30606h(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo21941i() {
        km0.m26271a(this.f25596i.mo15785a(), "persistFlags");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i7 */
    public final /* synthetic */ InputStream mo21942i7(d93 d93, d93 d932, zzcdq zzcdq) throws Exception {
        String c = ((rg0) d93.get()).mo20651c();
        String str = zzcdq.f27355n;
        m33472n7(new tz1((rg0) d93.get(), (JSONObject) d932.get(), str, c));
        return new ByteArrayInputStream(c.getBytes(g13.f16857b));
    }

    /* renamed from: v1 */
    public final void mo17909v1(zzcdq zzcdq, mg0 mg0) {
        m33474o7(mo21937e7(zzcdq, Binder.getCallingUid()), mg0);
    }
}
