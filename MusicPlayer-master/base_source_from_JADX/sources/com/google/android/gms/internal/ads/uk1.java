package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C2971s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uk1 extends y20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wl1 {

    /* renamed from: g */
    private final WeakReference<View> f24352g;

    /* renamed from: h */
    private final Map<String, WeakReference<View>> f24353h = new HashMap();

    /* renamed from: i */
    private final Map<String, WeakReference<View>> f24354i = new HashMap();

    /* renamed from: j */
    private final Map<String, WeakReference<View>> f24355j = new HashMap();

    /* renamed from: k */
    private vj1 f24356k;

    /* renamed from: l */
    private C4898an f24357l;

    public uk1(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2971s.m13222y();
        um0.m31897a(view, this);
        C2971s.m13222y();
        um0.m31898b(view, this);
        this.f24352g = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f24353h.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f24355j.putAll(this.f24353h);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f24354i.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f24355j.putAll(this.f24354i);
        this.f24357l = new C4898an(view.getContext(), view);
    }

    /* renamed from: C0 */
    public final synchronized View mo21282C0(String str) {
        WeakReference weakReference = this.f24355j.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: c */
    public final View mo21283c() {
        return (View) this.f24352g.get();
    }

    /* renamed from: e */
    public final FrameLayout mo21284e() {
        return null;
    }

    /* renamed from: f */
    public final synchronized void mo21285f() {
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21553s(this);
            this.f24356k = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21286f2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f24355j     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f24353h     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uk1.mo21286f2(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: g */
    public final C4898an mo21287g() {
        return this.f24357l;
    }

    /* renamed from: h */
    public final synchronized C4863a mo21288h() {
        return null;
    }

    /* renamed from: i */
    public final synchronized String mo21289i() {
        return "1007";
    }

    /* renamed from: j */
    public final synchronized Map<String, WeakReference<View>> mo21290j() {
        return this.f24355j;
    }

    /* renamed from: j6 */
    public final synchronized void mo21291j6(C4863a aVar) {
        Object K0 = C4865b.m20502K0(aVar);
        if (!(K0 instanceof vj1)) {
            ul0.m31862g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21553s(this);
        }
        vj1 vj12 = (vj1) K0;
        if (vj12.mo21554t()) {
            this.f24356k = vj12;
            vj12.mo21552r(this);
            this.f24356k.mo21544j(mo21283c());
            return;
        }
        ul0.m31859d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    /* renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo21292k() {
        return this.f24354i;
    }

    /* renamed from: l */
    public final synchronized JSONObject mo21293l() {
        return null;
    }

    /* renamed from: m */
    public final synchronized Map<String, WeakReference<View>> mo21294m() {
        return this.f24353h;
    }

    public final synchronized void onClick(View view) {
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21539Q(view, mo21283c(), mo21290j(), mo21294m(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21537O(mo21283c(), mo21290j(), mo21294m(), vj1.m32418w(mo21283c()));
        }
    }

    public final synchronized void onScrollChanged() {
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21537O(mo21283c(), mo21290j(), mo21294m(), vj1.m32418w(mo21283c()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        vj1 vj1 = this.f24356k;
        if (vj1 != null) {
            vj1.mo21545k(view, motionEvent, mo21283c());
        }
        return false;
    }

    /* renamed from: s0 */
    public final synchronized void mo21299s0(C4863a aVar) {
        if (this.f24356k != null) {
            Object K0 = C4865b.m20502K0(aVar);
            if (!(K0 instanceof View)) {
                ul0.m31862g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f24356k.mo21547m((View) K0);
        }
    }

    public final synchronized JSONObject zzp() {
        vj1 vj1 = this.f24356k;
        if (vj1 == null) {
            return null;
        }
        return vj1.mo21529F(mo21283c(), mo21290j(), mo21294m());
    }
}
