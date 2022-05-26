package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
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
public final class wk1 extends t20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wl1 {

    /* renamed from: t */
    public static final g43<String> f25438t = g43.zzr("2011", "1009", "3010");

    /* renamed from: g */
    private final String f25439g;

    /* renamed from: h */
    private Map<String, WeakReference<View>> f25440h = new HashMap();

    /* renamed from: i */
    private FrameLayout f25441i;

    /* renamed from: j */
    private FrameLayout f25442j;

    /* renamed from: k */
    private final e93 f25443k;

    /* renamed from: l */
    private View f25444l;

    /* renamed from: m */
    private final int f25445m;

    /* renamed from: n */
    private vj1 f25446n;

    /* renamed from: o */
    private C4898an f25447o;

    /* renamed from: p */
    private C4863a f25448p = null;

    /* renamed from: q */
    private n20 f25449q;

    /* renamed from: r */
    private boolean f25450r;

    /* renamed from: s */
    private boolean f25451s = false;

    public wk1(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f25441i = frameLayout;
        this.f25442j = frameLayout2;
        this.f25445m = 214106000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            boolean equals = "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f25439g = str;
        C2971s.m13222y();
        um0.m31897a(frameLayout, this);
        C2971s.m13222y();
        um0.m31898b(frameLayout, this);
        this.f25443k = hm0.f17712e;
        this.f25447o = new C4898an(this.f25441i.getContext(), this.f25441i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: f7 */
    private final synchronized void m33193f7(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f25442j.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f25442j.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    ul0.m31863h("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.f25442j.addView(frameLayout);
    }

    /* renamed from: n */
    private final synchronized void m33194n() {
        this.f25443k.execute(new vk1(this));
    }

    /* renamed from: C0 */
    public final synchronized View mo21282C0(String str) {
        if (this.f25451s) {
            return null;
        }
        WeakReference weakReference = this.f25440h.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: C3 */
    public final synchronized void mo20529C3(String str, C4863a aVar) {
        mo21286f2(str, (View) C4865b.m20502K0(aVar), true);
    }

    /* renamed from: E0 */
    public final void mo20530E0(C4863a aVar) {
        onTouch(this.f25441i, (MotionEvent) C4865b.m20502K0(aVar));
    }

    /* renamed from: P2 */
    public final synchronized void mo20531P2(C4863a aVar) {
        this.f25446n.mo21547m((View) C4865b.m20502K0(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* renamed from: V1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20532V1(p159f.p243f.p245b.p246a.p248b.C4863a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f25451s     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.vj1     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.ul0.m31862g(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.vj1 r0 = r1.f25446n     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001d
            r0.mo21553s(r1)     // Catch:{ all -> 0x006f }
        L_0x001d:
            r1.m33194n()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.vj1 r2 = (com.google.android.gms.internal.ads.vj1) r2     // Catch:{ all -> 0x006f }
            r1.f25446n = r2     // Catch:{ all -> 0x006f }
            r2.mo21552r(r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.vj1 r2 = r1.f25446n     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f25441i     // Catch:{ all -> 0x006f }
            r2.mo21544j(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.vj1 r2 = r1.f25446n     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f25442j     // Catch:{ all -> 0x006f }
            r2.mo21530H(r0)     // Catch:{ all -> 0x006f }
            boolean r2 = r1.f25450r     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.vj1 r2 = r1.f25446n     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.xj1 r2 = r2.mo21526A()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.n20 r0 = r1.f25449q     // Catch:{ all -> 0x006f }
            r2.mo22043b(r0)     // Catch:{ all -> 0x006f }
        L_0x0044:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C5503qz.f22555k2     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r0.mo20153b(r2)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x006f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.vj1 r2 = r1.f25446n     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo21527C()     // Catch:{ all -> 0x006f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006d
            com.google.android.gms.internal.ads.vj1 r2 = r1.f25446n     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo21527C()     // Catch:{ all -> 0x006f }
            r1.m33193f7(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x006d:
            monitor-exit(r1)
            return
        L_0x006f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wk1.mo20532V1(f.f.b.a.b.a):void");
    }

    /* renamed from: Y2 */
    public final synchronized void mo20533Y2(n20 n20) {
        if (!this.f25451s) {
            this.f25450r = true;
            this.f25449q = n20;
            vj1 vj1 = this.f25446n;
            if (vj1 != null) {
                vj1.mo21526A().mo22043b(n20);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20534b() {
        if (!this.f25451s) {
            vj1 vj1 = this.f25446n;
            if (vj1 != null) {
                vj1.mo21553s(this);
                this.f25446n = null;
            }
            this.f25440h.clear();
            this.f25441i.removeAllViews();
            this.f25442j.removeAllViews();
            this.f25440h = null;
            this.f25441i = null;
            this.f25442j = null;
            this.f25444l = null;
            this.f25447o = null;
            this.f25451s = true;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ View mo21283c() {
        return this.f25441i;
    }

    /* renamed from: c1 */
    public final synchronized void mo20535c1(C4863a aVar) {
        if (!this.f25451s) {
            this.f25448p = aVar;
        }
    }

    /* renamed from: e */
    public final FrameLayout mo21284e() {
        return this.f25442j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* renamed from: f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21286f2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f25451s     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f25440h     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f25440h     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f25445m     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.ads.internal.util.C3056z0.m13523i(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wk1.mo21286f2(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: g */
    public final C4898an mo21287g() {
        return this.f25447o;
    }

    /* renamed from: h */
    public final C4863a mo21288h() {
        return this.f25448p;
    }

    /* renamed from: i */
    public final synchronized String mo21289i() {
        return this.f25439g;
    }

    /* renamed from: j */
    public final synchronized Map<String, WeakReference<View>> mo21290j() {
        return this.f25440h;
    }

    /* renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo21292k() {
        return null;
    }

    /* renamed from: l */
    public final synchronized JSONObject mo21293l() {
        vj1 vj1 = this.f25446n;
        if (vj1 == null) {
            return null;
        }
        return vj1.mo21528E(this.f25441i, mo21290j(), mo21294m());
    }

    /* renamed from: m */
    public final synchronized Map<String, WeakReference<View>> mo21294m() {
        return this.f25440h;
    }

    /* renamed from: n2 */
    public final synchronized void mo20536n2(C4863a aVar, int i) {
    }

    public final synchronized void onClick(View view) {
        vj1 vj1 = this.f25446n;
        if (vj1 != null) {
            vj1.mo21531I();
            this.f25446n.mo21539Q(view, this.f25441i, mo21290j(), mo21294m(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        vj1 vj1 = this.f25446n;
        if (vj1 != null) {
            vj1.mo21537O(this.f25441i, mo21290j(), mo21294m(), vj1.m32418w(this.f25441i));
        }
    }

    public final synchronized void onScrollChanged() {
        vj1 vj1 = this.f25446n;
        if (vj1 != null) {
            vj1.mo21537O(this.f25441i, mo21290j(), mo21294m(), vj1.m32418w(this.f25441i));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        vj1 vj1 = this.f25446n;
        if (vj1 != null) {
            vj1.mo21545k(view, motionEvent, this.f25441i);
        }
        return false;
    }

    /* renamed from: p */
    public final synchronized C4863a mo20537p(String str) {
        return C4865b.m20503f2(mo21282C0(str));
    }

    public final synchronized JSONObject zzp() {
        vj1 vj1 = this.f25446n;
        if (vj1 == null) {
            return null;
        }
        return vj1.mo21529F(this.f25441i, mo21290j(), mo21294m());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        if (this.f25444l == null) {
            View view = new View(this.f25441i.getContext());
            this.f25444l = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f25441i != this.f25444l.getParent()) {
            this.f25441i.addView(this.f25444l);
        }
    }
}
