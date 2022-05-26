package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3049x;
import com.google.android.gms.common.internal.C3292l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yx0 extends C5500qw {

    /* renamed from: g */
    private final Context f26575g;

    /* renamed from: h */
    private final zzcjf f26576h;

    /* renamed from: i */
    private final br1 f26577i;

    /* renamed from: j */
    private final m22<kq2, j42> f26578j;

    /* renamed from: k */
    private final r82 f26579k;

    /* renamed from: l */
    private final mv1 f26580l;

    /* renamed from: m */
    private final ck0 f26581m;

    /* renamed from: n */
    private final hr1 f26582n;

    /* renamed from: o */
    private final ew1 f26583o;

    /* renamed from: p */
    private final y10 f26584p;

    /* renamed from: q */
    private boolean f26585q = false;

    yx0(Context context, zzcjf zzcjf, br1 br1, m22<kq2, j42> m22, r82 r82, mv1 mv1, ck0 ck0, hr1 hr1, ew1 ew1, y10 y10) {
        this.f26575g = context;
        this.f26576h = zzcjf;
        this.f26577i = br1;
        this.f26578j = m22;
        this.f26579k = r82;
        this.f26580l = mv1;
        this.f26581m = ck0;
        this.f26582n = hr1;
        this.f26583o = ew1;
        this.f26584p = y10;
    }

    /* renamed from: A5 */
    public final void mo20335A5(C4982cx cxVar) throws RemoteException {
        this.f26583o.mo17368g(cxVar, dw1.API);
    }

    /* renamed from: D5 */
    public final void mo20132D5(cb0 cb0) throws RemoteException {
        this.f26577i.mo16362c(cb0);
    }

    /* renamed from: I0 */
    public final synchronized void mo20133I0(boolean z) {
        C2971s.m13216s().mo11030c(z);
    }

    /* renamed from: S4 */
    public final void mo20336S4(C4863a aVar, String str) {
        if (aVar == null) {
            ul0.m31859d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C4865b.m20502K0(aVar);
        if (context == null) {
            ul0.m31859d("Context is null. Failed to open debug menu.");
            return;
        }
        C3049x xVar = new C3049x(context);
        xVar.mo11139n(str);
        xVar.mo11140o(this.f26576h.f27376g);
        xVar.mo11143r();
    }

    /* renamed from: T0 */
    public final void mo20134T0(zzbkk zzbkk) throws RemoteException {
        this.f26581m.mo16669v(this.f26575g, zzbkk);
    }

    /* renamed from: V */
    public final void mo20337V(String str) {
        this.f26579k.mo20612f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22303a() {
        if (C2971s.m13213p().mo17562h().mo11066J()) {
            if (!C2971s.m13217t().mo10999j(this.f26575g, C2971s.m13213p().mo17562h().mo11095i(), this.f26576h.f27376g)) {
                C2971s.m13213p().mo17562h().mo11081Z(false);
                C2971s.m13213p().mo17562h().mo11079X(BuildConfig.FLAVOR);
            }
        }
    }

    /* renamed from: c */
    public final String mo20135c() {
        return this.f26576h.f27376g;
    }

    /* renamed from: d */
    public final List<zzbtn> mo20136d() throws RemoteException {
        return this.f26580l.mo19553f();
    }

    /* renamed from: d6 */
    public final synchronized void mo20339d6(float f) {
        C2971s.m13216s().mo11031d(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e7 */
    public final void mo22304e7(Runnable runnable) {
        C3292l.m14236d("Adapters must be initialized on the main thread.");
        Map<String, xa0> e = C2971s.m13213p().mo17562h().mo11088d().mo15851e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    ul0.m31863h("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f26577i.mo16363d()) {
                HashMap hashMap = new HashMap();
                for (xa0 xa0 : e.values()) {
                    for (wa0 next : xa0.f25730a) {
                        String str = next.f25295g;
                        for (String next2 : next.f25289a) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        n22<kq2, j42> a = this.f26578j.mo15687a(str2, jSONObject);
                        if (a != null) {
                            kq2 kq2 = (kq2) a.f20467b;
                            if (!kq2.mo18963a() && kq2.mo18962C()) {
                                kq2.mo18975m(this.f26575g, (j42) a.f20468c, (List) entry.getValue());
                                String valueOf = String.valueOf(str2);
                                ul0.m31857b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                            }
                        }
                    } catch (zp2 e2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        ul0.m31863h(sb.toString(), e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo22305f() {
        this.f26584p.mo22128a(new zf0());
    }

    /* renamed from: g */
    public final void mo20340g() {
        this.f26580l.mo19554k();
    }

    /* renamed from: g2 */
    public final void mo20137g2(o70 o70) throws RemoteException {
        this.f26580l.mo19561r(o70);
    }

    /* renamed from: h */
    public final synchronized void mo20138h() {
        if (this.f26585q) {
            ul0.m31862g("Mobile ads is initialized already.");
            return;
        }
        C5503qz.m29790c(this.f26575g);
        C2971s.m13213p().mo17569q(this.f26575g, this.f26576h);
        C2971s.m13201d().mo18471i(this.f26575g);
        this.f26585q = true;
        this.f26580l.mo19560q();
        this.f26579k.mo20610d();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22579n2)).booleanValue()) {
            this.f26582n.mo18203c();
        }
        this.f26583o.mo17367f();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
            hm0.f17708a.execute(new ux0(this));
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22345H6)).booleanValue()) {
            hm0.f17708a.execute(new vx0(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* renamed from: k6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20341k6(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.Context r0 = r4.f26575g     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.C5503qz.m29790c(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22571m2     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            com.google.android.gms.ads.internal.e r0 = com.google.android.gms.ads.internal.C2971s.m13199b()     // Catch:{ all -> 0x002e }
            android.content.Context r1 = r4.f26575g     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzcjf r2 = r4.f26576h     // Catch:{ all -> 0x002e }
            r3 = 0
            r0.mo10830a(r1, r2, r5, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r4)
            return
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yx0.mo20341k6(java.lang.String):void");
    }

    /* renamed from: n */
    public final synchronized boolean mo20342n() {
        return C2971s.m13216s().mo11032e();
    }

    /* renamed from: t4 */
    public final void mo20139t4(String str, C4863a aVar) {
        String str2;
        xx0 xx0;
        C5503qz.m29790c(this.f26575g);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22595p2)).booleanValue()) {
            C2971s.m13214q();
            str2 = C2979b2.m13252d0(this.f26575g);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        boolean z = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22571m2)).booleanValue();
            C5207iz izVar = C5503qz.f22657x0;
            boolean booleanValue2 = booleanValue | ((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue();
            if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                xx0 = new xx0(this, (Runnable) C4865b.m20502K0(aVar));
            } else {
                z = booleanValue2;
                xx0 = null;
            }
            if (z) {
                C2971s.m13199b().mo10830a(this.f26575g, this.f26576h, str, xx0);
            }
        }
    }

    public final synchronized float zze() {
        return C2971s.m13216s().mo11029a();
    }
}
