package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zl1 implements jk1 {

    /* renamed from: a */
    private final rb0 f26811a;

    /* renamed from: b */
    private final x81 f26812b;

    /* renamed from: c */
    private final c81 f26813c;

    /* renamed from: d */
    private final wf1 f26814d;

    /* renamed from: e */
    private final Context f26815e;

    /* renamed from: f */
    private final bp2 f26816f;

    /* renamed from: g */
    private final zzcjf f26817g;

    /* renamed from: h */
    private final up2 f26818h;

    /* renamed from: i */
    private boolean f26819i = false;

    /* renamed from: j */
    private boolean f26820j = false;

    /* renamed from: k */
    private boolean f26821k = true;

    /* renamed from: l */
    private final nb0 f26822l;

    /* renamed from: m */
    private final ob0 f26823m;

    public zl1(nb0 nb0, ob0 ob0, rb0 rb0, x81 x81, c81 c81, wf1 wf1, Context context, bp2 bp2, zzcjf zzcjf, up2 up2, byte[] bArr) {
        this.f26822l = nb0;
        this.f26823m = ob0;
        this.f26811a = rb0;
        this.f26812b = x81;
        this.f26813c = c81;
        this.f26814d = wf1;
        this.f26815e = context;
        this.f26816f = bp2;
        this.f26817g = zzcjf;
        this.f26818h = up2;
    }

    /* renamed from: v */
    private final void m34661v(View view) {
        try {
            rb0 rb0 = this.f26811a;
            if (rb0 == null || rb0.mo19116B()) {
                nb0 nb0 = this.f26822l;
                if (nb0 == null || nb0.mo19684i7()) {
                    ob0 ob0 = this.f26823m;
                    if (ob0 != null && !ob0.mo19946j7()) {
                        this.f26823m.mo19940f7(C4865b.m20503f2(view));
                        this.f26813c.mo10632u0();
                        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
                            this.f26814d.mo15729o();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f26822l.mo19681f7(C4865b.m20503f2(view));
                this.f26813c.mo10632u0();
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
                    this.f26814d.mo15729o();
                    return;
                }
                return;
            }
            this.f26811a.mo19120a1(C4865b.m20503f2(view));
            this.f26813c.mo10632u0();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22305C6)).booleanValue()) {
                this.f26814d.mo15729o();
            }
        } catch (RemoteException e) {
            ul0.m31863h("Failed to call handleClick", e);
        }
    }

    /* renamed from: w */
    private static final HashMap<String, View> m34662w(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: O */
    public final boolean mo15799O() {
        return this.f26816f.f14617I;
    }

    /* renamed from: a */
    public final JSONObject mo15800a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    /* renamed from: b */
    public final void mo15801b(View view, MotionEvent motionEvent, View view2) {
    }

    /* renamed from: c */
    public final void mo15802c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo15803d() {
    }

    /* renamed from: e */
    public final void mo15804e() {
    }

    /* renamed from: f */
    public final void mo15805f(String str) {
    }

    /* renamed from: g */
    public final void mo15806g(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f26820j || !this.f26816f.f14617I) {
            m34661v(view);
        }
    }

    /* renamed from: h */
    public final void mo15807h(View view) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15808i(android.view.View r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            f.f.b.a.b.a r9 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.bp2 r12 = r8.f26816f     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.f14650h0     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r13 = com.google.android.gms.internal.ads.C5503qz.f22466Z0     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.mo20153b(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0124 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C5503qz.f22474a1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.mo20153b(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.rb0 r2 = r8.f26811a     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r2 == 0) goto L_0x0093
            f.f.b.a.b.a r2 = r2.mo19128k()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.nb0 r2 = r8.f26822l     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x009c
            f.f.b.a.b.a r2 = r2.mo19679d7()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.ob0 r2 = r8.f26823m     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00a5
            f.f.b.a.b.a r2 = r2.mo19937F5()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r5 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r2)     // Catch:{  }
        L_0x00ac:
            if (r5 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.util.C3044v0.m13476c(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.C2971s.m13214q()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.f26815e     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c8:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0045
        L_0x00e0:
            r8.f26821k = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = m34662w(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = m34662w(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.rb0 r12 = r8.f26811a     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            f.f.b.a.b.a r10 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r10)     // Catch:{ RemoteException -> 0x0124 }
            f.f.b.a.b.a r11 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo19133p5(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.nb0 r12 = r8.f26822l     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            f.f.b.a.b.a r10 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r10)     // Catch:{ RemoteException -> 0x0124 }
            f.f.b.a.b.a r11 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo19683h7(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.nb0 r10 = r8.f26822l     // Catch:{ RemoteException -> 0x0124 }
            r10.mo19682g7(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.ob0 r12 = r8.f26823m     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            f.f.b.a.b.a r10 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r10)     // Catch:{ RemoteException -> 0x0124 }
            f.f.b.a.b.a r11 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo19943h7(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.ob0 r10 = r8.f26823m     // Catch:{ RemoteException -> 0x0124 }
            r10.mo19942g7(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.internal.ads.ul0.m31863h(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zl1.mo15808i(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    /* renamed from: j */
    public final boolean mo15809j(Bundle bundle) {
        return false;
    }

    /* renamed from: k */
    public final void mo15810k(Bundle bundle) {
    }

    /* renamed from: l */
    public final void mo15811l() {
    }

    /* renamed from: m */
    public final void mo15812m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f26819i) {
                this.f26819i = C2971s.m13217t().mo11003n(this.f26815e, this.f26817g.f27376g, this.f26816f.f14612D.toString(), this.f26818h.f24397f);
            }
            if (this.f26821k) {
                rb0 rb0 = this.f26811a;
                if (rb0 != null) {
                    if (!rb0.mo19118I()) {
                        this.f26811a.mo19117G();
                        this.f26812b.zza();
                        return;
                    }
                }
                nb0 nb0 = this.f26822l;
                if (nb0 != null) {
                    if (!nb0.mo19686j7()) {
                        this.f26822l.mo19691n();
                        this.f26812b.zza();
                        return;
                    }
                }
                ob0 ob0 = this.f26823m;
                if (ob0 != null && !ob0.mo19948k7()) {
                    this.f26823m.zzr();
                    this.f26812b.zza();
                }
            }
        } catch (RemoteException e) {
            ul0.m31863h("Failed to call recordImpression", e);
        }
    }

    /* renamed from: n */
    public final void mo15813n(C5685vw vwVar) {
        ul0.m31862g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: o */
    public final void mo15814o() {
    }

    /* renamed from: p */
    public final void mo15815p(C5797yw ywVar) {
        ul0.m31862g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: q */
    public final void mo15816q(j40 j40) {
    }

    /* renamed from: r */
    public final void mo15817r(View view, Map<String, WeakReference<View>> map) {
        try {
            C4863a f2 = C4865b.m20503f2(view);
            rb0 rb0 = this.f26811a;
            if (rb0 != null) {
                rb0.mo19119I2(f2);
                return;
            }
            nb0 nb0 = this.f26822l;
            if (nb0 != null) {
                nb0.mo19677a1(f2);
                return;
            }
            ob0 ob0 = this.f26823m;
            if (ob0 != null) {
                ob0.mo19944i7(f2);
            }
        } catch (RemoteException e) {
            ul0.m31863h("Failed to call untrackView", e);
        }
    }

    /* renamed from: s */
    public final void mo15818s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f26820j) {
            ul0.m31862g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f26816f.f14617I) {
            ul0.m31862g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            m34661v(view);
        }
    }

    /* renamed from: t */
    public final JSONObject mo15819t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    /* renamed from: u */
    public final void mo15820u() {
        this.f26820j = true;
    }

    /* renamed from: y0 */
    public final void mo15821y0(Bundle bundle) {
    }
}
