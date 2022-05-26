package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2978b1;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.lang.ref.WeakReference;
import java.util.HashSet;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.an */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4898an implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: v */
    private static final long f13978v = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22403Q0)).longValue();

    /* renamed from: g */
    private final Context f13979g;

    /* renamed from: h */
    private Application f13980h;

    /* renamed from: i */
    private final WindowManager f13981i;

    /* renamed from: j */
    private final PowerManager f13982j;

    /* renamed from: k */
    private final KeyguardManager f13983k;

    /* renamed from: l */
    BroadcastReceiver f13984l;

    /* renamed from: m */
    private WeakReference<ViewTreeObserver> f13985m;

    /* renamed from: n */
    final WeakReference<View> f13986n;

    /* renamed from: o */
    private C5343mn f13987o;

    /* renamed from: p */
    private final C2978b1 f13988p = new C2978b1(f13978v);

    /* renamed from: q */
    private boolean f13989q = false;

    /* renamed from: r */
    private int f13990r = -1;

    /* renamed from: s */
    private final HashSet<C5824zm> f13991s = new HashSet<>();

    /* renamed from: t */
    private final DisplayMetrics f13992t;

    /* renamed from: u */
    private final Rect f13993u;

    public C4898an(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f13979g = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f13981i = windowManager;
        this.f13982j = (PowerManager) applicationContext.getSystemService("power");
        this.f13983k = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f13980h = application;
            this.f13987o = new C5343mn(application, this);
        }
        this.f13992t = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f13993u = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f13986n;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m20867m(view2);
        }
        this.f13986n = new WeakReference<>(view);
        if (view != null) {
            if (C2971s.m13215r().mo11019i(view)) {
                m20866l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m20862h(int i) {
        return (int) (((float) i) / this.f13992t.density);
    }

    /* renamed from: i */
    private final void m20863i(Activity activity, int i) {
        Window window;
        if (this.f13986n != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f13986n.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f13990r = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012b, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m20864j(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet<com.google.android.gms.internal.ads.zm> r0 = r1.f13991s
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f13986n
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r9 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0069
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0049 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.ul0.m31860e(r14, r0)
        L_0x004f:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006c
        L_0x0069:
            r8 = r9
            r12 = 0
            r13 = 0
        L_0x006c:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22424T0
            com.google.android.gms.internal.ads.oz r14 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r14.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r0.<init>()     // Catch:{ Exception -> 0x00ae }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ae }
        L_0x0089:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00c1
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ae }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ae }
            r11.<init>()     // Catch:{ Exception -> 0x00ae }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ae }
            if (r17 == 0) goto L_0x00a8
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00a8
            android.graphics.Rect r11 = r1.mo15879a(r11)     // Catch:{ Exception -> 0x00ae }
            r0.add(r11)     // Catch:{ Exception -> 0x00ae }
        L_0x00a8:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ae }
            r11 = 0
            goto L_0x0089
        L_0x00ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.fl0 r11 = com.google.android.gms.ads.internal.C2971s.m13213p()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.mo17571s(r0, r14)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00c1
        L_0x00bd:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00c1:
            r31 = r0
            r0 = 8
            if (r8 == 0) goto L_0x00cc
            int r11 = r8.getWindowVisibility()
            goto L_0x00ce
        L_0x00cc:
            r11 = 8
        L_0x00ce:
            int r14 = r1.f13990r
            r15 = -1
            if (r14 == r15) goto L_0x00d4
            r11 = r14
        L_0x00d4:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            long r26 = com.google.android.gms.ads.internal.util.C2979b2.m13246a(r8)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C5503qz.f22615r6
            com.google.android.gms.internal.ads.oz r15 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r14 = r15.mo20153b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0118
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.C2971s.m13214q()
            android.os.PowerManager r3 = r1.f13982j
            android.app.KeyguardManager r14 = r1.f13983k
            boolean r3 = com.google.android.gms.ads.internal.util.C2979b2.m13276x(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r3 = com.google.android.gms.internal.ads.C5503qz.f22639u6
            com.google.android.gms.internal.ads.oz r14 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r14.mo20153b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
            goto L_0x012d
        L_0x0118:
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.C2971s.m13214q()
            android.os.PowerManager r3 = r1.f13982j
            android.app.KeyguardManager r14 = r1.f13983k
            boolean r3 = com.google.android.gms.ads.internal.util.C2979b2.m13276x(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
        L_0x012d:
            r3 = 1
            r11 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C5503qz.f22655w6
            com.google.android.gms.internal.ads.oz r15 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r14 = r15.mo20153b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x018a
            com.google.android.gms.ads.internal.C2971s.m13214q()
            android.os.PowerManager r14 = r1.f13982j
            android.app.KeyguardManager r15 = r1.f13983k
            boolean r14 = com.google.android.gms.ads.internal.util.C2979b2.m13276x(r8, r14, r15)
            if (r10 == r14) goto L_0x0152
            r14 = 0
            goto L_0x0154
        L_0x0152:
            r14 = 64
        L_0x0154:
            if (r10 == r12) goto L_0x0158
            r15 = 0
            goto L_0x015a
        L_0x0158:
            r15 = 8
        L_0x015a:
            r14 = r14 | r15
            if (r10 == r13) goto L_0x015f
            r15 = 0
            goto L_0x0161
        L_0x015f:
            r15 = 16
        L_0x0161:
            r14 = r14 | r15
            if (r11 != 0) goto L_0x0167
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0168
        L_0x0167:
            r11 = 0
        L_0x0168:
            r11 = r11 | r14
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r14 = com.google.android.gms.internal.ads.C5503qz.f22639u6
            com.google.android.gms.internal.ads.oz r15 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r14 = r15.mo20153b(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            long r14 = (long) r14
            int r17 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0181
            r14 = 32
            goto L_0x0182
        L_0x0181:
            r14 = 0
        L_0x0182:
            com.google.android.gms.ads.internal.C2971s.m13214q()
            r11 = r11 | r14
            r11 = r11 | r3
            com.google.android.gms.ads.internal.util.C2979b2.m13266n(r8, r11, r9)
        L_0x018a:
            if (r2 != r10) goto L_0x019a
            com.google.android.gms.ads.internal.util.b1 r9 = r1.f13988p
            boolean r9 = r9.mo10975b()
            if (r9 != 0) goto L_0x019a
            boolean r9 = r1.f13989q
            if (r3 == r9) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            return
        L_0x019a:
            if (r3 != 0) goto L_0x01a4
            boolean r9 = r1.f13989q
            if (r9 != 0) goto L_0x01a4
            if (r2 == r10) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            return
        L_0x01a4:
            com.google.android.gms.internal.ads.xm r2 = new com.google.android.gms.internal.ads.xm
            com.google.android.gms.common.util.d r9 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r17 = r9.mo11989b()
            android.os.PowerManager r9 = r1.f13982j
            boolean r9 = r9.isScreenOn()
            if (r8 == 0) goto L_0x01c1
            com.google.android.gms.ads.internal.util.f r11 = com.google.android.gms.ads.internal.C2971s.m13215r()
            boolean r11 = r11.mo11019i(r8)
            if (r11 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r10 = 0
        L_0x01c2:
            if (r8 == 0) goto L_0x01cb
            int r0 = r8.getWindowVisibility()
            r19 = r0
            goto L_0x01cd
        L_0x01cb:
            r19 = 8
        L_0x01cd:
            android.graphics.Rect r0 = r1.f13993u
            android.graphics.Rect r20 = r1.mo15879a(r0)
            android.graphics.Rect r21 = r1.mo15879a(r4)
            android.graphics.Rect r22 = r1.mo15879a(r5)
            android.graphics.Rect r24 = r1.mo15879a(r6)
            android.graphics.Rect r28 = r1.mo15879a(r7)
            android.util.DisplayMetrics r0 = r1.f13992t
            float r0 = r0.density
            r29 = r0
            r14 = r2
            r15 = r17
            r17 = r9
            r18 = r10
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet<com.google.android.gms.internal.ads.zm> r0 = r1.f13991s
            java.util.Iterator r0 = r0.iterator()
        L_0x01ff:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020f
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.zm r4 = (com.google.android.gms.internal.ads.C5824zm) r4
            r4.mo16484H0(r2)
            goto L_0x01ff
        L_0x020f:
            r1.f13989q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4898an.m20864j(int):void");
    }

    /* renamed from: k */
    private final void m20865k() {
        C2979b2.f9980i.post(new C5675vm(this));
    }

    /* renamed from: l */
    private final void m20866l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f13985m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f13984l == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f13984l = new C5712wm(this);
            C2971s.m13220w().mo11042c(this.f13979g, this.f13984l, intentFilter);
        }
        Application application = this.f13980h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f13987o);
            } catch (Exception e) {
                ul0.m31860e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    private final void m20867m(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f13985m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f13985m = null;
            }
        } catch (Exception e) {
            ul0.m31860e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            ul0.m31860e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f13984l != null) {
            try {
                C2971s.m13220w().mo11043d(this.f13979g, this.f13984l);
            } catch (IllegalStateException e3) {
                ul0.m31860e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C2971s.m13213p().mo17571s(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f13984l = null;
        }
        Application application = this.f13980h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f13987o);
            } catch (Exception e5) {
                ul0.m31860e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Rect mo15879a(Rect rect) {
        return new Rect(m20862h(rect.left), m20862h(rect.top), m20862h(rect.right), m20862h(rect.bottom));
    }

    /* renamed from: c */
    public final void mo15880c(C5824zm zmVar) {
        this.f13991s.add(zmVar);
        m20864j(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo15881d() {
        m20864j(3);
    }

    /* renamed from: e */
    public final void mo15882e(C5824zm zmVar) {
        this.f13991s.remove(zmVar);
    }

    /* renamed from: f */
    public final void mo15883f() {
        this.f13988p.mo10974a(f13978v);
    }

    /* renamed from: g */
    public final void mo15884g(long j) {
        this.f13988p.mo10974a(j);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20863i(activity, 0);
        m20864j(3);
        m20865k();
    }

    public final void onActivityDestroyed(Activity activity) {
        m20864j(3);
        m20865k();
    }

    public final void onActivityPaused(Activity activity) {
        m20863i(activity, 4);
        m20864j(3);
        m20865k();
    }

    public final void onActivityResumed(Activity activity) {
        m20863i(activity, 0);
        m20864j(3);
        m20865k();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m20864j(3);
        m20865k();
    }

    public final void onActivityStarted(Activity activity) {
        m20863i(activity, 0);
        m20864j(3);
        m20865k();
    }

    public final void onActivityStopped(Activity activity) {
        m20864j(3);
        m20865k();
    }

    public final void onGlobalLayout() {
        m20864j(2);
        m20865k();
    }

    public final void onScrollChanged() {
        m20864j(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f13990r = -1;
        m20866l(view);
        m20864j(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f13990r = -1;
        m20864j(3);
        m20865k();
        m20867m(view);
    }
}
