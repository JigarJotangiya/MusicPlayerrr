package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3012k1;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3041u0;
import com.google.android.gms.common.util.C3369n;
import com.google.android.gms.common.util.C3370o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@SuppressLint({"ViewConstructor"})
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class js0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, pr0 {

    /* renamed from: g0 */
    public static final /* synthetic */ int f18577g0 = 0;

    /* renamed from: A */
    private boolean f18578A;

    /* renamed from: B */
    private Boolean f18579B;

    /* renamed from: C */
    private boolean f18580C = true;

    /* renamed from: D */
    private final String f18581D = BuildConfig.FLAVOR;

    /* renamed from: E */
    private ms0 f18582E;

    /* renamed from: F */
    private boolean f18583F;

    /* renamed from: G */
    private boolean f18584G;

    /* renamed from: H */
    private e20 f18585H;

    /* renamed from: I */
    private c20 f18586I;

    /* renamed from: J */
    private C5381no f18587J;

    /* renamed from: K */
    private int f18588K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f18589L;

    /* renamed from: M */
    private c00 f18590M;

    /* renamed from: N */
    private final c00 f18591N;

    /* renamed from: O */
    private c00 f18592O;

    /* renamed from: P */
    private final d00 f18593P;

    /* renamed from: Q */
    private int f18594Q;

    /* renamed from: R */
    private int f18595R;

    /* renamed from: S */
    private int f18596S;

    /* renamed from: T */
    private C2955n f18597T;

    /* renamed from: U */
    private boolean f18598U;

    /* renamed from: V */
    private final C3012k1 f18599V;

    /* renamed from: W */
    private int f18600W = -1;

    /* renamed from: a0 */
    private int f18601a0 = -1;

    /* renamed from: b0 */
    private int f18602b0 = -1;

    /* renamed from: c0 */
    private int f18603c0 = -1;

    /* renamed from: d0 */
    private Map<String, eq0> f18604d0;

    /* renamed from: e0 */
    private final WindowManager f18605e0;

    /* renamed from: f0 */
    private final C5790yp f18606f0;

    /* renamed from: g */
    private final ft0 f18607g;

    /* renamed from: h */
    private final C5737xa f18608h;

    /* renamed from: i */
    private final q00 f18609i;

    /* renamed from: j */
    private final zzcjf f18610j;

    /* renamed from: k */
    private C2935k f18611k;

    /* renamed from: l */
    private final C2925a f18612l;

    /* renamed from: m */
    private final DisplayMetrics f18613m;

    /* renamed from: n */
    private final float f18614n;

    /* renamed from: o */
    private bp2 f18615o;

    /* renamed from: p */
    private ep2 f18616p;

    /* renamed from: q */
    private boolean f18617q = false;

    /* renamed from: r */
    private boolean f18618r = false;

    /* renamed from: s */
    private wr0 f18619s;

    /* renamed from: t */
    private C2955n f18620t;

    /* renamed from: u */
    private C4863a f18621u;

    /* renamed from: v */
    private gt0 f18622v;

    /* renamed from: w */
    private final String f18623w;

    /* renamed from: x */
    private boolean f18624x;

    /* renamed from: y */
    private boolean f18625y;

    /* renamed from: z */
    private boolean f18626z;

    protected js0(ft0 ft0, gt0 gt0, String str, boolean z, boolean z2, C5737xa xaVar, q00 q00, zzcjf zzcjf, f00 f00, C2935k kVar, C2925a aVar, C5790yp ypVar, bp2 bp2, ep2 ep2) {
        super(ft0);
        ep2 ep22;
        this.f18607g = ft0;
        this.f18622v = gt0;
        this.f18623w = str;
        this.f18626z = z;
        this.f18608h = xaVar;
        this.f18609i = q00;
        this.f18610j = zzcjf;
        this.f18611k = kVar;
        this.f18612l = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f18605e0 = windowManager;
        C2971s.m13214q();
        DisplayMetrics g0 = C2979b2.m13258g0(windowManager);
        this.f18613m = g0;
        this.f18614n = g0.density;
        this.f18606f0 = ypVar;
        this.f18615o = bp2;
        this.f18616p = ep2;
        this.f18599V = new C3012k1(ft0.mo17725a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            ul0.m31860e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(C2971s.m13214q().mo10977L(ft0, zzcjf.f27376g));
        C2971s.m13215r().mo11014f(getContext(), settings);
        setDownloadListener(this);
        m25836o1();
        if (C3369n.m14471c()) {
            addJavascriptInterface(new qs0(this, new os0(this), (os0) null), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m25844w1();
        d00 d00 = new d00(new f00(true, "make_wv", this.f18623w));
        this.f18593P = d00;
        d00.mo16805a().mo17447c((f00) null);
        if (!(!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() || (ep22 = this.f18616p) == null || ep22.f16050b == null)) {
            d00.mo16805a().mo17448d("gqi", this.f18616p.f16050b);
        }
        d00.mo16805a();
        c00 f = f00.m23398f();
        this.f18591N = f;
        d00.mo16806b("native:view_create", f);
        this.f18592O = null;
        this.f18590M = null;
        C2971s.m13215r().mo11013e(ft0);
        C2971s.m13213p().mo17568p();
    }

    /* renamed from: o1 */
    private final synchronized void m25836o1() {
        bp2 bp2 = this.f18615o;
        if (bp2 != null) {
            if (bp2.f14656k0) {
                ul0.m31857b("Disabling hardware acceleration on an overlay.");
                m25838q1();
                return;
            }
        }
        if (!this.f18626z) {
            if (!this.f18622v.mo18020i()) {
                if (Build.VERSION.SDK_INT < 18) {
                    ul0.m31857b("Disabling hardware acceleration on an AdView.");
                    m25838q1();
                    return;
                }
                ul0.m31857b("Enabling hardware acceleration on an AdView.");
                m25840s1();
                return;
            }
        }
        ul0.m31857b("Enabling hardware acceleration on an overlay.");
        m25840s1();
    }

    /* renamed from: p1 */
    private final synchronized void m25837p1() {
        if (!this.f18598U) {
            this.f18598U = true;
            C2971s.m13213p().mo17567o();
        }
    }

    /* renamed from: q1 */
    private final synchronized void m25838q1() {
        if (!this.f18578A) {
            setLayerType(1, (Paint) null);
        }
        this.f18578A = true;
    }

    /* renamed from: r1 */
    private final void m25839r1(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        mo16880n0("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: s1 */
    private final synchronized void m25840s1() {
        if (this.f18578A) {
            setLayerType(0, (Paint) null);
        }
        this.f18578A = false;
    }

    /* renamed from: t1 */
    private final synchronized void m25841t1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            C2971s.m13213p().mo17571s(th, "AdWebViewImpl.loadUrlUnsafe");
            ul0.m31863h("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* renamed from: u1 */
    private final void m25842u1() {
        C5762xz.m33910a(this.f18593P.mo16805a(), this.f18591N, "aeh2");
    }

    /* renamed from: v1 */
    private final synchronized void m25843v1() {
        Map<String, eq0> map = this.f18604d0;
        if (map != null) {
            for (eq0 a : map.values()) {
                a.mo11667a();
            }
        }
        this.f18604d0 = null;
    }

    /* renamed from: w1 */
    private final void m25844w1() {
        d00 d00 = this.f18593P;
        if (d00 != null) {
            f00 a = d00.mo16805a();
            C5688vz f = C2971s.m13213p().mo17560f();
            if (f != null) {
                f.mo21653f(a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo18719m1(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m25845x1() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.fl0 r0 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.mo17564k()     // Catch:{ all -> 0x0023 }
            r2.f18579B = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.mo18719m1(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.mo18719m1(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js0.m25845x1():void");
    }

    /* renamed from: A */
    public final synchronized void mo17227A(String str, eq0 eq0) {
        if (this.f18604d0 == null) {
            this.f18604d0 = new HashMap();
        }
        this.f18604d0.put(str, eq0);
    }

    /* renamed from: A0 */
    public final synchronized void mo10853A0() {
        C2935k kVar = this.f18611k;
        if (kVar != null) {
            kVar.mo10853A0();
        }
    }

    /* renamed from: B */
    public final ep2 mo17651B() {
        return this.f18616p;
    }

    /* renamed from: B0 */
    public final void mo17652B0(zzc zzc, boolean z) {
        this.f18619s.mo21887l0(zzc, z);
    }

    /* renamed from: C */
    public final Context mo17653C() {
        return this.f18607g.mo17726b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17654D(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f18588K     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.f18588K = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.n r3 = r2.f18620t     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.mo10883j5()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js0.mo17654D(boolean):void");
    }

    /* renamed from: E */
    public final synchronized C5381no mo17655E() {
        return this.f18587J;
    }

    /* renamed from: E0 */
    public final synchronized void mo17656E0(gt0 gt0) {
        this.f18622v = gt0;
        requestLayout();
    }

    /* renamed from: F */
    public final void mo17657F(bp2 bp2, ep2 ep2) {
        this.f18615o = bp2;
        this.f18616p = ep2;
    }

    /* renamed from: F0 */
    public final synchronized C4863a mo17658F0() {
        return this.f18621u;
    }

    /* renamed from: G */
    public final synchronized void mo17659G(C5381no noVar) {
        this.f18587J = noVar;
    }

    /* renamed from: H */
    public final synchronized void mo17660H() {
        C3018m1.m13388k("Destroying WebView!");
        m25837p1();
        C2979b2.f9980i.post(new is0(this));
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        boolean z;
        synchronized (this) {
            z = xmVar.f25884j;
            this.f18583F = z;
        }
        m25839r1(z);
    }

    /* renamed from: I */
    public final synchronized void mo17661I(C2955n nVar) {
        this.f18620t = nVar;
    }

    /* renamed from: I0 */
    public final void mo17228I0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        mo16880n0("onCacheAccessComplete", hashMap);
    }

    /* renamed from: J */
    public final C5737xa mo17662J() {
        return this.f18608h;
    }

    /* renamed from: J0 */
    public final void mo17663J0() {
        if (this.f18590M == null) {
            C5762xz.m33910a(this.f18593P.mo16805a(), this.f18591N, "aes2");
            this.f18593P.mo16805a();
            c00 f = f00.m23398f();
            this.f18590M = f;
            this.f18593P.mo16806b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f18610j.f27376g);
        mo16880n0("onshow", hashMap);
    }

    /* renamed from: K */
    public final WebView mo17664K() {
        return this;
    }

    /* renamed from: K0 */
    public final void mo17665K0(boolean z, int i, boolean z2) {
        this.f18619s.mo21895t0(z, i, z2);
    }

    /* renamed from: L */
    public final void mo17229L(boolean z) {
        this.f18619s.mo21880a(false);
    }

    /* renamed from: L0 */
    public final synchronized boolean mo17666L0() {
        return this.f18625y;
    }

    /* renamed from: M */
    public final synchronized C2955n mo17667M() {
        return this.f18620t;
    }

    /* renamed from: M0 */
    public final void mo17668M0(int i) {
        if (i == 0) {
            C5762xz.m33910a(this.f18593P.mo16805a(), this.f18591N, "aebb2");
        }
        m25842u1();
        this.f18593P.mo16805a();
        this.f18593P.mo16805a().mo17448d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f18610j.f27376g);
        mo16880n0("onhide", hashMap);
    }

    /* renamed from: N */
    public final synchronized boolean mo17669N() {
        return this.f18580C;
    }

    /* renamed from: N0 */
    public final sn0 mo17230N0() {
        return null;
    }

    /* renamed from: O0 */
    public final d93<String> mo17670O0() {
        q00 q00 = this.f18609i;
        if (q00 == null) {
            return s83.m30607i(null);
        }
        return q00.mo20354a();
    }

    /* renamed from: P */
    public final void mo17671P() {
        throw null;
    }

    /* renamed from: P0 */
    public final synchronized eq0 mo17231P0(String str) {
        Map<String, eq0> map = this.f18604d0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: Q */
    public final synchronized boolean mo17672Q() {
        return this.f18588K > 0;
    }

    /* renamed from: Q0 */
    public final /* synthetic */ et0 mo17673Q0() {
        return this.f18619s;
    }

    /* renamed from: R */
    public final void mo17232R() {
        C2955n M = mo17667M();
        if (M != null) {
            M.mo10879f();
        }
    }

    /* renamed from: R0 */
    public final void mo17674R0(Context context) {
        this.f18607g.setBaseContext(context);
        this.f18599V.mo11052e(this.f18607g.mo17725a());
    }

    /* renamed from: S */
    public final synchronized void mo17675S(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        C2955n nVar = this.f18620t;
        if (nVar != null) {
            nVar.mo10890m7(z);
        }
    }

    /* renamed from: S0 */
    public final void mo17676S0() {
        throw null;
    }

    /* renamed from: T0 */
    public final synchronized void mo17677T0(boolean z) {
        C2955n nVar = this.f18620t;
        if (nVar != null) {
            nVar.mo10886k7(this.f18619s.mo17305s(), z);
        } else {
            this.f18624x = z;
        }
    }

    /* renamed from: U */
    public final synchronized e20 mo17678U() {
        return this.f18585H;
    }

    /* renamed from: U0 */
    public final boolean mo17679U0(boolean z, int i) {
        destroy();
        this.f18606f0.mo22272b(new gs0(z, i));
        this.f18606f0.mo22273c(10003);
        return true;
    }

    /* renamed from: V0 */
    public final synchronized void mo17680V0(C4863a aVar) {
        this.f18621u = aVar;
    }

    /* renamed from: W */
    public final synchronized void mo17233W(int i) {
        this.f18594Q = i;
    }

    /* renamed from: W0 */
    public final void mo17681W0(boolean z, int i, String str, String str2, boolean z2) {
        this.f18619s.mo21875B0(z, i, str, str2, z2);
    }

    /* renamed from: Z */
    public final View mo15939Z() {
        return this;
    }

    /* renamed from: Z0 */
    public final synchronized void mo17682Z0(e20 e20) {
        this.f18585H = e20;
    }

    /* renamed from: a */
    public final void mo17508a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        mo18717k1(sb.toString());
    }

    /* renamed from: b0 */
    public final void mo17234b0(int i) {
    }

    /* renamed from: b1 */
    public final synchronized void mo10854b1() {
        C2935k kVar = this.f18611k;
        if (kVar != null) {
            kVar.mo10854b1();
        }
    }

    /* renamed from: c */
    public final int mo17235c() {
        return this.f18596S;
    }

    /* renamed from: c0 */
    public final synchronized boolean mo17683c0() {
        return this.f18624x;
    }

    /* renamed from: c1 */
    public final void mo17684c1(String str, JSONObject jSONObject) {
        mo17508a(str, jSONObject.toString());
    }

    /* renamed from: d */
    public final int mo17236d() {
        return this.f18595R;
    }

    /* renamed from: d0 */
    public final void mo17686d0(String str, y50<? super pr0> y50) {
        wr0 wr0 = this.f18619s;
        if (wr0 != null) {
            wr0.mo21876C0(str, y50);
        }
    }

    public final synchronized void destroy() {
        m25844w1();
        this.f18599V.mo11048a();
        C2955n nVar = this.f18620t;
        if (nVar != null) {
            nVar.mo10874a();
            this.f18620t.mo10882j();
            this.f18620t = null;
        }
        this.f18621u = null;
        this.f18619s.mo21877D0();
        this.f18587J = null;
        this.f18611k = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.f18625y) {
            C2971s.m13223z().mo21872t(this);
            m25843v1();
            this.f18625y = true;
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22313D6)).booleanValue()) {
                C3018m1.m13388k("Initiating WebView self destruct sequence in 3...");
                C3018m1.m13388k("Loading blank page in WebView, 2...");
                m25841t1("about:blank");
                return;
            }
            C3018m1.m13388k("Destroying the WebView immediately...");
            mo17660H();
        }
    }

    /* renamed from: e */
    public final synchronized int mo17237e() {
        return this.f18594Q;
    }

    /* renamed from: e0 */
    public final void mo17688e0(String str, y50<? super pr0> y50) {
        wr0 wr0 = this.f18619s;
        if (wr0 != null) {
            wr0.mo21881b(str, y50);
        }
    }

    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (mo17666L0()) {
            ul0.m31864i("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f0 */
    public final void mo17689f0() {
        m25842u1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f18610j.f27376g);
        mo16880n0("onhide", hashMap);
    }

    /* renamed from: f1 */
    public final wr0 mo18713f1() {
        return this.f18619s;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f18625y) {
                    this.f18619s.mo21877D0();
                    C2971s.m13223z().mo21872t(this);
                    m25843v1();
                    m25837p1();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final int mo17238g() {
        return getMeasuredHeight();
    }

    /* renamed from: g0 */
    public final synchronized void mo17690g0(int i) {
        C2955n nVar = this.f18620t;
        if (nVar != null) {
            nVar.mo10888l7(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public final synchronized Boolean mo18715g1() {
        return this.f18579B;
    }

    /* renamed from: h */
    public final int mo17240h() {
        return getMeasuredWidth();
    }

    /* renamed from: h0 */
    public final synchronized boolean mo17692h0() {
        return this.f18626z;
    }

    /* renamed from: i */
    public final Activity mo17241i() {
        return this.f18607g.mo17725a();
    }

    /* renamed from: i0 */
    public final void mo17693i0() {
        if (this.f18592O == null) {
            this.f18593P.mo16805a();
            c00 f = f00.m23398f();
            this.f18592O = f;
            this.f18593P.mo16806b("native:view_load", f);
        }
    }

    /* renamed from: j0 */
    public final synchronized String mo17694j0() {
        return this.f18623w;
    }

    /* access modifiers changed from: protected */
    @TargetApi(19)
    /* renamed from: j1 */
    public final synchronized void mo18716j1(String str, ValueCallback<String> valueCallback) {
        if (!mo17666L0()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: k */
    public final c00 mo17242k() {
        return this.f18591N;
    }

    /* renamed from: k0 */
    public final void mo17243k0(int i) {
        this.f18595R = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k1 */
    public final void mo18717k1(String str) {
        if (C3369n.m14473e()) {
            if (mo18715g1() == null) {
                m25845x1();
            }
            if (mo18715g1().booleanValue()) {
                mo18716j1(str, (ValueCallback<String>) null);
            } else {
                mo18718l1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            }
        } else {
            mo18718l1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    /* renamed from: l */
    public final d00 mo17244l() {
        return this.f18593P;
    }

    /* renamed from: l0 */
    public final void mo17695l0(boolean z, int i, String str, boolean z2) {
        this.f18619s.mo21874A0(z, i, str, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public final synchronized void mo18718l1(String str) {
        if (!mo17666L0()) {
            loadUrl(str);
        } else {
            ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo17666L0()) {
            super.loadData(str, str2, str3);
        } else {
            ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo17666L0()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo17666L0()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                C2971s.m13213p().mo17571s(th, "AdWebViewImpl.loadUrl");
                ul0.m31863h("Could not call loadUrl. ", th);
            }
        } else {
            ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final C2925a mo17245m() {
        return this.f18612l;
    }

    /* renamed from: m0 */
    public final synchronized void mo17699m0(boolean z) {
        this.f18580C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public final void mo18719m1(Boolean bool) {
        synchronized (this) {
            this.f18579B = bool;
        }
        C2971s.m13213p().mo17572t(bool);
    }

    /* renamed from: n */
    public final synchronized String mo17246n() {
        ep2 ep2 = this.f18616p;
        if (ep2 == null) {
            return null;
        }
        return ep2.f16050b;
    }

    /* renamed from: n0 */
    public final void mo16880n0(String str, Map<String, ?> map) {
        try {
            mo16881r(str, C2971s.m13214q().mo10979N(map));
        } catch (JSONException unused) {
            ul0.m31862g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: n1 */
    public final boolean mo18720n1() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f18619s.mo17305s() && !this.f18619s.mo21885e()) {
            return false;
        }
        C4980cv.m22123b();
        DisplayMetrics displayMetrics = this.f18613m;
        int q = nl0.m27925q(displayMetrics, displayMetrics.widthPixels);
        C4980cv.m22123b();
        DisplayMetrics displayMetrics2 = this.f18613m;
        int q2 = nl0.m27925q(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f18607g.mo17725a();
        if (a == null || a.getWindow() == null) {
            i2 = q;
            i = q2;
        } else {
            C2971s.m13214q();
            int[] u = C2979b2.m13273u(a);
            C4980cv.m22123b();
            int q3 = nl0.m27925q(this.f18613m, u[0]);
            C4980cv.m22123b();
            i = nl0.m27925q(this.f18613m, u[1]);
            i2 = q3;
        }
        int i3 = this.f18601a0;
        if (i3 == q && this.f18600W == q2 && this.f18602b0 == i2 && this.f18603c0 == i) {
            return false;
        }
        if (!(i3 == q && this.f18600W == q2)) {
            z = true;
        }
        this.f18601a0 = q;
        this.f18600W = q2;
        this.f18602b0 = i2;
        this.f18603c0 = i;
        new ce0(this, BuildConfig.FLAVOR).mo16612e(q, q2, i2, i, this.f18613m.density, this.f18605e0.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: o */
    public final void mo15729o() {
        wr0 wr0 = this.f18619s;
        if (wr0 != null) {
            wr0.mo15729o();
        }
    }

    /* renamed from: o0 */
    public final synchronized void mo17700o0(c20 c20) {
        this.f18586I = c20;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo17666L0()) {
            this.f18599V.mo11050c();
        }
        boolean z = this.f18583F;
        wr0 wr0 = this.f18619s;
        if (wr0 != null && wr0.mo21885e()) {
            if (!this.f18584G) {
                this.f18619s.mo21896v();
                this.f18619s.mo21897x();
                this.f18584G = true;
            }
            mo18720n1();
            z = true;
        }
        m25839r1(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        wr0 wr0;
        synchronized (this) {
            if (!mo17666L0()) {
                this.f18599V.mo11051d();
            }
            super.onDetachedFromWindow();
            if (this.f18584G && (wr0 = this.f18619s) != null && wr0.mo21885e() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f18619s.mo21896v();
                this.f18619s.mo21897x();
                this.f18584G = false;
            }
        }
        m25839r1(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C2971s.m13214q();
            C2979b2.m13269q(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            ul0.m31857b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo17666L0()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean n1 = mo18720n1();
        C2955n M = mo17667M();
        if (M != null && n1) {
            M.mo10889m();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c7 A[SYNTHETIC, Splitter:B:116:0x01c7] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:66:0x00e0=Splitter:B:66:0x00e0, B:126:0x01e8=Splitter:B:126:0x01e8} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo17666L0()     // Catch:{ all -> 0x01ed }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r8.f18626z     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x01e8
            com.google.android.gms.internal.ads.gt0 r0 = r8.f18622v     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo18017f()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e8
        L_0x0021:
            com.google.android.gms.internal.ads.gt0 r0 = r8.f18622v     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo18019h()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.gt0 r0 = r8.f18622v     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo18021j()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22531h2     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r2.mo20153b(r0)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.ms0 r0 = r8.zzs()     // Catch:{ all -> 0x01ed }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.zze()     // Catch:{ all -> 0x01ed }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
            float r2 = (float) r10     // Catch:{ all -> 0x01ed }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ed }
            float r3 = (float) r9     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01ed }
            if (r10 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x007d
            float r10 = (float) r3     // Catch:{ all -> 0x01ed }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01ed }
            r1 = r9
            r10 = r3
            goto L_0x0088
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0088
            float r9 = (float) r2     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01ed }
            r1 = r2
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01ed }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.gt0 r0 = r8.f18622v     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo18018g()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22563l2     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x00e0
            boolean r0 = com.google.android.gms.common.util.C3369n.m14471c()     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00e0
        L_0x00b6:
            com.google.android.gms.internal.ads.hs0 r0 = new com.google.android.gms.internal.ads.hs0     // Catch:{ all -> 0x01ed }
            r0.<init>(r8)     // Catch:{ all -> 0x01ed }
            java.lang.String r1 = "/contentHeight"
            r8.mo17686d0(r1, r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.mo18717k1(r0)     // Catch:{ all -> 0x01ed }
            android.util.DisplayMetrics r0 = r8.f18613m     // Catch:{ all -> 0x01ed }
            float r0 = r0.density     // Catch:{ all -> 0x01ed }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r1 = r8.f18589L     // Catch:{ all -> 0x01ed }
            r2 = -1
            if (r1 == r2) goto L_0x00d7
            float r10 = (float) r1     // Catch:{ all -> 0x01ed }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01ed }
            goto L_0x00db
        L_0x00d7:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
        L_0x00db:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00e0:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00e5:
            com.google.android.gms.internal.ads.gt0 r0 = r8.f18622v     // Catch:{ all -> 0x01ed }
            boolean r0 = r0.mo18020i()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r9 = r8.f18613m     // Catch:{ all -> 0x01ed }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01ed }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ed }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ed }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01ed }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01ed }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0118
            if (r0 != r4) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r9
        L_0x0119:
            if (r2 == r5) goto L_0x011d
            if (r2 != r4) goto L_0x011e
        L_0x011d:
            r3 = r10
        L_0x011e:
            com.google.android.gms.internal.ads.gt0 r2 = r8.f18622v     // Catch:{ all -> 0x01ed }
            int r4 = r2.f17247c     // Catch:{ all -> 0x01ed }
            r5 = 1
            if (r4 > r0) goto L_0x012c
            int r2 = r2.f17246b     // Catch:{ all -> 0x01ed }
            if (r2 <= r3) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r2 = 0
            goto L_0x012d
        L_0x012c:
            r2 = 1
        L_0x012d:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C5503qz.f22596p3     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.oz r6 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x01ed }
            java.lang.Object r4 = r6.mo20153b(r4)     // Catch:{ all -> 0x01ed }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ed }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ed }
            if (r4 == 0) goto L_0x015e
            com.google.android.gms.internal.ads.gt0 r4 = r8.f18622v     // Catch:{ all -> 0x01ed }
            int r6 = r4.f17247c     // Catch:{ all -> 0x01ed }
            float r7 = r8.f18614n     // Catch:{ all -> 0x01ed }
            float r6 = (float) r6     // Catch:{ all -> 0x01ed }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01ed }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0159
            int r0 = r4.f17246b     // Catch:{ all -> 0x01ed }
            float r0 = (float) r0     // Catch:{ all -> 0x01ed }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0159
            r0 = 1
            goto L_0x015a
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r5 == r2) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r2 = r0
        L_0x015e:
            r0 = 8
            if (r2 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.gt0 r2 = r8.f18622v     // Catch:{ all -> 0x01ed }
            int r3 = r2.f17247c     // Catch:{ all -> 0x01ed }
            float r4 = r8.f18614n     // Catch:{ all -> 0x01ed }
            int r2 = r2.f17246b     // Catch:{ all -> 0x01ed }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ed }
            r7 = 103(0x67, float:1.44E-43)
            r6.<init>(r7)     // Catch:{ all -> 0x01ed }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01ed }
            float r3 = (float) r3     // Catch:{ all -> 0x01ed }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01ed }
            r6.append(r3)     // Catch:{ all -> 0x01ed }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01ed }
            float r2 = (float) r2     // Catch:{ all -> 0x01ed }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01ed }
            r6.append(r2)     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01ed }
            float r9 = (float) r9     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01ed }
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            float r9 = (float) r10     // Catch:{ all -> 0x01ed }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01ed }
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.ul0.m31862g(r9)     // Catch:{ all -> 0x01ed }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01ed }
            if (r9 == r0) goto L_0x01b3
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01ed }
        L_0x01b3:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ed }
            boolean r9 = r8.f18617q     // Catch:{ all -> 0x01ed }
            if (r9 != 0) goto L_0x01c5
            com.google.android.gms.internal.ads.yp r9 = r8.f18606f0     // Catch:{ all -> 0x01ed }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.mo22273c(r10)     // Catch:{ all -> 0x01ed }
            r8.f18617q = r5     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01c5:
            monitor-exit(r8)
            return
        L_0x01c7:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01ed }
            if (r9 == r0) goto L_0x01d0
            r8.setVisibility(r1)     // Catch:{ all -> 0x01ed }
        L_0x01d0:
            boolean r9 = r8.f18618r     // Catch:{ all -> 0x01ed }
            if (r9 != 0) goto L_0x01dd
            com.google.android.gms.internal.ads.yp r9 = r8.f18606f0     // Catch:{ all -> 0x01ed }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.mo22273c(r10)     // Catch:{ all -> 0x01ed }
            r8.f18618r = r5     // Catch:{ all -> 0x01ed }
        L_0x01dd:
            com.google.android.gms.internal.ads.gt0 r9 = r8.f18622v     // Catch:{ all -> 0x01ed }
            int r10 = r9.f17247c     // Catch:{ all -> 0x01ed }
            int r9 = r9.f17246b     // Catch:{ all -> 0x01ed }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01e8:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01ed }
            monitor-exit(r8)
            return
        L_0x01ed:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js0.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo17666L0()) {
            try {
                super.onPause();
            } catch (Exception e) {
                ul0.m31860e("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo17666L0()) {
            try {
                super.onResume();
            } catch (Exception e) {
                ul0.m31860e("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f18619s.mo21885e() || this.f18619s.mo21884d()) {
            C5737xa xaVar = this.f18608h;
            if (xaVar != null) {
                xaVar.mo22000d(motionEvent);
            }
            q00 q00 = this.f18609i;
            if (q00 != null) {
                q00.mo20355b(motionEvent);
            }
        } else {
            synchronized (this) {
                e20 e20 = this.f18585H;
                if (e20 != null) {
                    e20.mo15858c(motionEvent);
                }
            }
        }
        if (mo17666L0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo17509p(String str) {
        throw null;
    }

    /* renamed from: p0 */
    public final void mo17703p0(String str, C3370o<y50<? super pr0>> oVar) {
        wr0 wr0 = this.f18619s;
        if (wr0 != null) {
            wr0.mo21883c(str, oVar);
        }
    }

    /* renamed from: q */
    public final synchronized C2955n mo17704q() {
        return this.f18597T;
    }

    /* renamed from: q0 */
    public final boolean mo17705q0() {
        return false;
    }

    /* renamed from: r */
    public final void mo16881r(String str, JSONObject jSONObject) {
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        if (sb2.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb2);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        ul0.m31857b(str2);
        mo18717k1(sb.toString());
    }

    /* renamed from: r0 */
    public final void mo17706r0(boolean z) {
        this.f18619s.mo21879W(z);
    }

    /* renamed from: s */
    public final WebViewClient mo17707s() {
        return this.f18619s;
    }

    /* renamed from: s0 */
    public final void mo17708s0() {
        setBackgroundColor(0);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof wr0) {
            this.f18619s = (wr0) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo17666L0()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                ul0.m31860e("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final synchronized void mo17248t(ms0 ms0) {
        if (this.f18582E != null) {
            ul0.m31859d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f18582E = ms0;
        }
    }

    /* renamed from: t0 */
    public final void mo17249t0(int i) {
        this.f18596S = i;
    }

    /* renamed from: u */
    public final synchronized String mo17250u() {
        return this.f18581D;
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        wr0 wr0 = this.f18619s;
        if (wr0 != null) {
            wr0.mo10632u0();
        }
    }

    /* renamed from: v0 */
    public final synchronized void mo17713v0(C2955n nVar) {
        this.f18597T = nVar;
    }

    /* renamed from: w */
    public final bp2 mo17714w() {
        return this.f18615o;
    }

    /* renamed from: w0 */
    public final synchronized void mo17715w0(String str, String str2, String str3) {
        String str4;
        if (!mo17666L0()) {
            String[] strArr = new String[1];
            String str5 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22338H);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                ul0.m31863h("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, ws0.m33324a(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        ul0.m31862g("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: x */
    public final synchronized void mo17251x() {
        c20 c20 = this.f18586I;
        if (c20 != null) {
            C2979b2.f9980i.post(new yn1((ao1) c20));
        }
    }

    /* renamed from: x0 */
    public final void mo17716x0() {
        this.f18599V.mo11049b();
    }

    /* renamed from: y */
    public final synchronized gt0 mo17717y() {
        return this.f18622v;
    }

    /* renamed from: y0 */
    public final void mo17718y0(C3041u0 u0Var, y12 y12, gt1 gt1, gu2 gu2, String str, String str2, int i) {
        this.f18619s.mo21888n0(u0Var, y12, gt1, gu2, str, str2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17719z0(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f18626z     // Catch:{ all -> 0x003a }
            r2.f18626z = r3     // Catch:{ all -> 0x003a }
            r2.m25836o1()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22346I     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.gt0 r0 = r2.f18622v     // Catch:{ all -> 0x003a }
            boolean r0 = r0.mo18020i()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.ce0 r0 = new com.google.android.gms.internal.ads.ce0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.mo16614g(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js0.mo17719z0(boolean):void");
    }

    public final zzcjf zzp() {
        return this.f18610j;
    }

    public final synchronized ms0 zzs() {
        return this.f18582E;
    }
}
