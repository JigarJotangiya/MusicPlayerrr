package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.dc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4998dc implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    private static final Handler f15571s = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final Context f15572g;

    /* renamed from: h */
    private Application f15573h;

    /* renamed from: i */
    private final PowerManager f15574i;

    /* renamed from: j */
    private final KeyguardManager f15575j;

    /* renamed from: k */
    private BroadcastReceiver f15576k;

    /* renamed from: l */
    private final zzaml f15577l;

    /* renamed from: m */
    private WeakReference<ViewTreeObserver> f15578m;

    /* renamed from: n */
    private WeakReference<View> f15579n;

    /* renamed from: o */
    private C5368nb f15580o;

    /* renamed from: p */
    private byte f15581p = -1;

    /* renamed from: q */
    private int f15582q = -1;

    /* renamed from: r */
    private long f15583r = -3;

    public C4998dc(Context context, zzaml zzaml) {
        Context applicationContext = context.getApplicationContext();
        this.f15572g = applicationContext;
        this.f15577l = zzaml;
        this.f15574i = (PowerManager) applicationContext.getSystemService("power");
        this.f15575j = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f15573h = application;
            this.f15580o = new C5368nb(application, this);
        }
        mo16893d((View) null);
    }

    /* renamed from: e */
    private final void m22437e(Activity activity, int i) {
        Window window;
        if (this.f15579n != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b = mo16892b();
            if (b != null && peekDecorView != null && b.getRootView() == peekDecorView.getRootView()) {
                this.f15582q = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L_0x0060;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m22438f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f15579n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r7.mo16892b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r7.f15583r = r2
            r7.f15581p = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L_0x0024
            r4 = r4 | 2
        L_0x0024:
            android.os.PowerManager r5 = r7.f15574i
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L_0x0030
            r4 = r4 | 4
        L_0x0030:
            com.google.android.gms.internal.ads.zzaml r5 = r7.f15577l
            boolean r5 = r5.mo22478a()
            if (r5 != 0) goto L_0x0060
            android.app.KeyguardManager r5 = r7.f15575j
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x005e
            android.app.Activity r5 = com.google.android.gms.internal.ads.C5813zb.m34499b(r0)
            if (r5 != 0) goto L_0x0049
            goto L_0x005e
        L_0x0049:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L_0x0051
            r5 = 0
            goto L_0x0055
        L_0x0051:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L_0x0055:
            if (r5 == 0) goto L_0x005e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0060
        L_0x005e:
            r4 = r4 | 8
        L_0x0060:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 16
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x007a
            r4 = r4 | 32
        L_0x007a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f15582q
            if (r5 == r1) goto L_0x0083
            r0 = r5
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r4 = r4 | 64
        L_0x0087:
            byte r0 = r7.f15581p
            if (r0 == r4) goto L_0x009a
            byte r0 = (byte) r4
            r7.f15581p = r0
            if (r4 != 0) goto L_0x0095
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0098
        L_0x0095:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x0098:
            r7.f15583r = r0
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4998dc.m22438f():void");
    }

    /* renamed from: g */
    private final void m22439g() {
        f15571s.post(new C4924bc(this));
    }

    /* renamed from: h */
    private final void m22440h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f15578m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f15576k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C4961cc ccVar = new C4961cc(this);
            this.f15576k = ccVar;
            this.f15572g.registerReceiver(ccVar, intentFilter);
        }
        Application application = this.f15573h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f15580o);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22441i(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f15578m     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001b }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001b }
            if (r2 == 0) goto L_0x0019
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001b }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            r3.f15578m = r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002c }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002c }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f15576k
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f15572g     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f15576k = r0
        L_0x0038:
            android.app.Application r4 = r3.f15573h
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.nb r0 = r3.f15580o     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4998dc.m22441i(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo16891a() {
        if (this.f15583r <= -2 && mo16892b() == null) {
            this.f15583r = -3;
        }
        return this.f15583r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo16892b() {
        WeakReference<View> weakReference = this.f15579n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo16893d(View view) {
        long j;
        View b = mo16892b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            m22441i(b);
        }
        this.f15579n = new WeakReference<>(view);
        if (view != null) {
            if (!(view.getWindowToken() == null && view.getWindowVisibility() == 8)) {
                m22440h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f15583r = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m22437e(activity, 0);
        m22438f();
    }

    public final void onActivityDestroyed(Activity activity) {
        m22438f();
    }

    public final void onActivityPaused(Activity activity) {
        m22437e(activity, 4);
        m22438f();
    }

    public final void onActivityResumed(Activity activity) {
        m22437e(activity, 0);
        m22438f();
        m22439g();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m22438f();
    }

    public final void onActivityStarted(Activity activity) {
        m22437e(activity, 0);
        m22438f();
    }

    public final void onActivityStopped(Activity activity) {
        m22438f();
    }

    public final void onGlobalLayout() {
        m22438f();
    }

    public final void onScrollChanged() {
        m22438f();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f15582q = -1;
        m22440h(view);
        m22438f();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f15582q = -1;
        m22438f();
        m22439g();
        m22441i(view);
    }
}
