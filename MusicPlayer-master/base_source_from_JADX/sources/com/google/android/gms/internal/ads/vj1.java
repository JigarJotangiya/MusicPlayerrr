package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p082e.p098e.C3465a;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vj1 extends g41 {

    /* renamed from: A */
    private final Context f24796A;

    /* renamed from: B */
    private final xj1 f24797B;

    /* renamed from: C */
    private final z92 f24798C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Map<String, Boolean> f24799D = new HashMap();

    /* renamed from: E */
    private final List<C4898an> f24800E = new ArrayList();

    /* renamed from: i */
    private final Executor f24801i;

    /* renamed from: j */
    private final bk1 f24802j;

    /* renamed from: k */
    private final jk1 f24803k;

    /* renamed from: l */
    private final bl1 f24804l;

    /* renamed from: m */
    private final gk1 f24805m;

    /* renamed from: n */
    private final mk1 f24806n;

    /* renamed from: o */
    private final sr3<fo1> f24807o;

    /* renamed from: p */
    private final sr3<do1> f24808p;

    /* renamed from: q */
    private final sr3<ko1> f24809q;

    /* renamed from: r */
    private final sr3<ao1> f24810r;

    /* renamed from: s */
    private final sr3<io1> f24811s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public wl1 f24812t;

    /* renamed from: u */
    private boolean f24813u;

    /* renamed from: v */
    private boolean f24814v;

    /* renamed from: w */
    private boolean f24815w;

    /* renamed from: x */
    private final kj0 f24816x;

    /* renamed from: y */
    private final C5737xa f24817y;

    /* renamed from: z */
    private final zzcjf f24818z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vj1(f41 f41, Executor executor, bk1 bk1, jk1 jk1, bl1 bl1, gk1 gk1, mk1 mk1, sr3<fo1> sr3, sr3<do1> sr32, sr3<ko1> sr33, sr3<ao1> sr34, sr3<io1> sr35, kj0 kj0, C5737xa xaVar, zzcjf zzcjf, Context context, xj1 xj1, z92 z92, C4935bn bnVar) {
        super(f41);
        this.f24801i = executor;
        this.f24802j = bk1;
        this.f24803k = jk1;
        this.f24804l = bl1;
        this.f24805m = gk1;
        this.f24806n = mk1;
        this.f24807o = sr3;
        this.f24808p = sr32;
        this.f24809q = sr33;
        this.f24810r = sr34;
        this.f24811s = sr35;
        this.f24816x = kj0;
        this.f24817y = xaVar;
        this.f24818z = zzcjf;
        this.f24796A = context;
        this.f24797B = xj1;
        this.f24798C = z92;
    }

    /* renamed from: G */
    public static /* synthetic */ void m32417G(vj1 vj1) {
        try {
            int K = vj1.f24802j.mo16259K();
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 6) {
                            if (K != 7) {
                                ul0.m31859d("Wrong native template id!");
                            } else if (vj1.f24806n.mo19407g() != null) {
                                vj1.f24806n.mo19407g().mo16145Z0(vj1.f24810r.mo10679a());
                            }
                        } else if (vj1.f24806n.mo19406f() != null) {
                            vj1.mo21532J("Google", true);
                            vj1.f24806n.mo19406f().mo16044Y3(vj1.f24809q.mo10679a());
                        }
                    } else if (vj1.f24806n.mo19404d(vj1.f24802j.mo16287g0()) != null) {
                        if (vj1.f24802j.mo16274Z() != null) {
                            vj1.mo21532J("Google", true);
                        }
                        vj1.f24806n.mo19404d(vj1.f24802j.mo16287g0()).mo21028b4(vj1.f24811s.mo10679a());
                    }
                } else if (vj1.f24806n.mo19401a() != null) {
                    vj1.mo21532J("Google", true);
                    vj1.f24806n.mo19401a().mo19061A4(vj1.f24808p.mo10679a());
                }
            } else if (vj1.f24806n.mo19402b() != null) {
                vj1.mo21532J("Google", true);
                vj1.f24806n.mo19402b().mo19891X2(vj1.f24807o.mo10679a());
            }
        } catch (RemoteException e) {
            ul0.m31860e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* renamed from: w */
    public static boolean m32418w(View view) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22631t6)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
        }
        C2971s.m13214q();
        long a = C2979b2.m13246a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (a >= ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22639u6)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final synchronized void mo21535M(wl1 wl1) {
        View view;
        C5589ta c;
        if (!this.f24813u) {
            this.f24812t = wl1;
            this.f24804l.mo16318e(wl1);
            this.f24803k.mo15808i(wl1.mo21283c(), wl1.mo21294m(), wl1.mo21292k(), wl1, wl1);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22332G1)).booleanValue() && (c = this.f24817y.mo21999c()) != null) {
                c.mo10839a(wl1.mo21283c());
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22506e1)).booleanValue()) {
                bp2 bp2 = this.f16935b;
                if (bp2.f14652i0) {
                    Iterator<String> keys = bp2.f14650h0.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            WeakReference weakReference = this.f24812t.mo21290j().get(next);
                            this.f24799D.put(next, Boolean.FALSE);
                            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                                C4898an anVar = new C4898an(this.f24796A, view);
                                this.f24800E.add(anVar);
                                anVar.mo15880c(new uj1(this, next));
                            }
                        }
                    }
                }
            }
            if (wl1.mo21287g() != null) {
                wl1.mo21287g().mo15880c(this.f24816x);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void mo21536N(wl1 wl1) {
        this.f24803k.mo15817r(wl1.mo21283c(), wl1.mo21290j());
        if (wl1.mo21284e() != null) {
            wl1.mo21284e().setClickable(false);
            wl1.mo21284e().removeAllViews();
        }
        if (wl1.mo21287g() != null) {
            wl1.mo21287g().mo15882e(this.f24816x);
        }
        this.f24812t = null;
    }

    /* renamed from: A */
    public final xj1 mo21526A() {
        return this.f24797B;
    }

    /* renamed from: C */
    public final String mo21527C() {
        return this.f24805m.mo17547a();
    }

    /* renamed from: E */
    public final synchronized JSONObject mo21528E(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f24803k.mo15800a(view, map, map2);
    }

    /* renamed from: F */
    public final synchronized JSONObject mo21529F(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f24803k.mo15819t(view, map, map2);
    }

    /* renamed from: H */
    public final void mo21530H(View view) {
        C4863a c0 = this.f24802j.mo16279c0();
        if (this.f24805m.mo17549c() && c0 != null && view != null) {
            C2971s.m13206i().mo18277R(c0, view);
        }
    }

    /* renamed from: I */
    public final synchronized void mo21531I() {
        this.f24803k.mo15803d();
    }

    /* renamed from: J */
    public final void mo21532J(String str, boolean z) {
        String str2;
        se0 se0;
        te0 te0;
        if (this.f24805m.mo17549c() && !TextUtils.isEmpty(str)) {
            pr0 Y = this.f24802j.mo16273Y();
            pr0 Z = this.f24802j.mo16274Z();
            if (Y != null || Z != null) {
                if (Y != null) {
                    str2 = null;
                } else {
                    str2 = "javascript";
                    Y = Z;
                }
                String str3 = str2;
                if (!C2971s.m13206i().mo18281V(this.f24796A)) {
                    ul0.m31862g("Failed to initialize omid in InternalNativeAd");
                    return;
                }
                zzcjf zzcjf = this.f24818z;
                int i = zzcjf.f27377h;
                int i2 = zzcjf.f27378i;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                if (Z != null) {
                    se0 = se0.VIDEO;
                    te0 = te0.DEFINED_BY_JAVASCRIPT;
                } else {
                    se0 = se0.NATIVE_DISPLAY;
                    if (this.f24802j.mo16259K() == 3) {
                        te0 = te0.UNSPECIFIED;
                    } else {
                        te0 = te0.ONE_PIXEL;
                    }
                }
                C4863a U = C2971s.m13206i().mo18280U(sb2, Y.mo17664K(), BuildConfig.FLAVOR, "javascript", str3, str, te0, se0, this.f16935b.f14654j0);
                if (U == null) {
                    ul0.m31862g("Failed to create omid session in InternalNativeAd");
                    return;
                }
                this.f24802j.mo16257B(U);
                Y.mo17680V0(U);
                if (Z != null) {
                    C2971s.m13206i().mo18279T(U, Z.mo15939Z());
                    this.f24815w = true;
                }
                if (z) {
                    C2971s.m13206i().mo18275P(U);
                    Y.mo16880n0("onSdkLoaded", new C3465a());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo21533K() {
        this.f24803k.mo15804e();
        this.f24802j.mo16286g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo21534L(boolean z) {
        this.f24803k.mo15818s(this.f24812t.mo21283c(), this.f24812t.mo21290j(), this.f24812t.mo21294m(), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        return;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21537O(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f24814v     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22506e1     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.bp2 r0 = r3.f16935b     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.f14652i0     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r3.f24799D     // Catch:{ all -> 0x00a6 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00a6 }
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r3.f24799D     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0029
            monitor-exit(r3)
            return
        L_0x0045:
            r0 = 1
            if (r7 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.bl1 r7 = r3.f24804l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.wl1 r1 = r3.f24812t     // Catch:{ all -> 0x00a6 }
            r7.mo16317d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.jk1 r7 = r3.f24803k     // Catch:{ all -> 0x00a6 }
            r7.mo15812m(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f24814v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x0058:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.C5503qz.f22547j2     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r7 = r1.mo20153b(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00a6 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00a6 }
            if (r7 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0074:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00a6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00a6 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00a6 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            boolean r1 = m32418w(r1)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.bl1 r7 = r3.f24804l     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.wl1 r1 = r3.f24812t     // Catch:{ all -> 0x00a6 }
            r7.mo16317d(r1)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.jk1 r7 = r3.f24803k     // Catch:{ all -> 0x00a6 }
            r7.mo15812m(r4, r5, r6)     // Catch:{ all -> 0x00a6 }
            r3.f24814v = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)
            return
        L_0x00a4:
            monitor-exit(r3)
            return
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vj1.mo21537O(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: P */
    public final synchronized void mo21538P(C5797yw ywVar) {
        this.f24803k.mo15815p(ywVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21539Q(android.view.View r9, android.view.View r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.bl1 r0 = r8.f24804l     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.wl1 r1 = r8.f24812t     // Catch:{ all -> 0x0033 }
            r0.mo16316c(r1)     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.jk1 r2 = r8.f24803k     // Catch:{ all -> 0x0033 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.mo15806g(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0033 }
            boolean r9 = r8.f24815w     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.bk1 r9 = r8.f24802j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.pr0 r9 = r9.mo16274Z()     // Catch:{ all -> 0x0033 }
            if (r9 != 0) goto L_0x001f
            goto L_0x0031
        L_0x001f:
            com.google.android.gms.internal.ads.bk1 r9 = r8.f24802j     // Catch:{ all -> 0x0033 }
            com.google.android.gms.internal.ads.pr0 r9 = r9.mo16274Z()     // Catch:{ all -> 0x0033 }
            e.e.a r10 = new e.e.a     // Catch:{ all -> 0x0033 }
            r10.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r11 = "onSdkAdUserInteractionClick"
            r9.mo16880n0(r11, r10)     // Catch:{ all -> 0x0033 }
            monitor-exit(r8)
            return
        L_0x0031:
            monitor-exit(r8)
            return
        L_0x0033:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vj1.mo21539Q(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* renamed from: R */
    public final synchronized void mo21540R(String str) {
        this.f24803k.mo15805f(str);
    }

    /* renamed from: S */
    public final synchronized void mo21541S(Bundle bundle) {
        this.f24803k.mo15810k(bundle);
    }

    /* renamed from: a */
    public final synchronized void mo17837a() {
        this.f24813u = true;
        this.f24801i.execute(new oj1(this));
        super.mo17837a();
    }

    /* renamed from: b */
    public final void mo17838b() {
        this.f24801i.execute(new pj1(this));
        if (this.f24802j.mo16259K() != 7) {
            Executor executor = this.f24801i;
            jk1 jk1 = this.f24803k;
            jk1.getClass();
            executor.execute(new tj1(jk1));
        }
        super.mo17838b();
    }

    /* renamed from: h */
    public final synchronized void mo21542h() {
        wl1 wl1 = this.f24812t;
        if (wl1 == null) {
            ul0.m31857b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f24801i.execute(new sj1(this, wl1 instanceof uk1));
        }
    }

    /* renamed from: i */
    public final synchronized void mo21543i() {
        if (!this.f24814v) {
            this.f24803k.mo15814o();
        }
    }

    /* renamed from: j */
    public final void mo21544j(View view) {
        C4863a c0 = this.f24802j.mo16279c0();
        pr0 Y = this.f24802j.mo16273Y();
        if (this.f24805m.mo17549c() && c0 != null && Y != null && view != null) {
            C2971s.m13206i().mo18279T(c0, view);
        }
    }

    /* renamed from: k */
    public final synchronized void mo21545k(View view, MotionEvent motionEvent, View view2) {
        this.f24803k.mo15801b(view, motionEvent, view2);
    }

    /* renamed from: l */
    public final synchronized void mo21546l(Bundle bundle) {
        this.f24803k.mo15821y0(bundle);
    }

    /* renamed from: m */
    public final synchronized void mo21547m(View view) {
        this.f24803k.mo15807h(view);
    }

    /* renamed from: n */
    public final synchronized void mo21548n() {
        this.f24803k.mo15820u();
    }

    /* renamed from: o */
    public final synchronized void mo21549o(C5685vw vwVar) {
        this.f24803k.mo15813n(vwVar);
    }

    /* renamed from: p */
    public final synchronized void mo21550p(C5205ix ixVar) {
        this.f24798C.mo22349a(ixVar);
    }

    /* renamed from: q */
    public final synchronized void mo21551q(j40 j40) {
        this.f24803k.mo15816q(j40);
    }

    /* renamed from: r */
    public final synchronized void mo21552r(wl1 wl1) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22490c1)).booleanValue()) {
            C2979b2.f9980i.post(new qj1(this, wl1));
        } else {
            mo21535M(wl1);
        }
    }

    /* renamed from: s */
    public final synchronized void mo21553s(wl1 wl1) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22490c1)).booleanValue()) {
            C2979b2.f9980i.post(new rj1(this, wl1));
        } else {
            mo21536N(wl1);
        }
    }

    /* renamed from: t */
    public final boolean mo21554t() {
        return this.f24805m.mo17550d();
    }

    /* renamed from: u */
    public final synchronized boolean mo21555u() {
        return this.f24803k.mo15799O();
    }

    /* renamed from: v */
    public final boolean mo21556v() {
        return this.f24805m.mo17549c();
    }

    /* renamed from: x */
    public final synchronized boolean mo21557x(Bundle bundle) {
        if (this.f24814v) {
            return true;
        }
        boolean j = this.f24803k.mo15809j(bundle);
        this.f24814v = j;
        return j;
    }
}
