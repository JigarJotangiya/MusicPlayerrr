package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.rn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5528rn implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    private Activity f22907g;

    /* renamed from: h */
    private Context f22908h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f22909i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f22910j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f22911k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<C5565sn> f22912l = new ArrayList();

    /* renamed from: m */
    private final List<C5159ho> f22913m = new ArrayList();

    /* renamed from: n */
    private Runnable f22914n;

    /* renamed from: o */
    private boolean f22915o = false;

    /* renamed from: p */
    private long f22916p;

    C5528rn() {
    }

    /* renamed from: k */
    private final void m30232k(Activity activity) {
        synchronized (this.f22909i) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f22907g = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo20687a() {
        return this.f22907g;
    }

    /* renamed from: b */
    public final Context mo20688b() {
        return this.f22908h;
    }

    /* renamed from: f */
    public final void mo20689f(C5565sn snVar) {
        synchronized (this.f22909i) {
            this.f22912l.add(snVar);
        }
    }

    /* renamed from: g */
    public final void mo20690g(Application application, Context context) {
        if (!this.f22915o) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m30232k((Activity) context);
            }
            this.f22908h = application;
            this.f22916p = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22673z0)).longValue();
            this.f22915o = true;
        }
    }

    /* renamed from: h */
    public final void mo20691h(C5565sn snVar) {
        synchronized (this.f22909i) {
            this.f22912l.remove(snVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f22909i) {
            Activity activity2 = this.f22907g;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f22907g = null;
                }
                Iterator<C5159ho> it = this.f22913m.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C2971s.m13213p().mo17571s(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        ul0.m31860e(BuildConfig.FLAVOR, e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m30232k(activity);
        synchronized (this.f22909i) {
            for (C5159ho a : this.f22913m) {
                try {
                    a.mo18175a();
                } catch (Exception e) {
                    C2971s.m13213p().mo17571s(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    ul0.m31860e(BuildConfig.FLAVOR, e);
                }
            }
        }
        this.f22911k = true;
        Runnable runnable = this.f22914n;
        if (runnable != null) {
            C2979b2.f9980i.removeCallbacks(runnable);
        }
        w03 w03 = C2979b2.f9980i;
        C5491qn qnVar = new C5491qn(this);
        this.f22914n = qnVar;
        w03.postDelayed(qnVar, this.f22916p);
    }

    public final void onActivityResumed(Activity activity) {
        m30232k(activity);
        this.f22911k = false;
        boolean z = !this.f22910j;
        this.f22910j = true;
        Runnable runnable = this.f22914n;
        if (runnable != null) {
            C2979b2.f9980i.removeCallbacks(runnable);
        }
        synchronized (this.f22909i) {
            for (C5159ho b : this.f22913m) {
                try {
                    b.mo18176b();
                } catch (Exception e) {
                    C2971s.m13213p().mo17571s(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    ul0.m31860e(BuildConfig.FLAVOR, e);
                }
            }
            if (z) {
                for (C5565sn B : this.f22912l) {
                    try {
                        B.mo17587B(true);
                    } catch (Exception e2) {
                        ul0.m31860e(BuildConfig.FLAVOR, e2);
                    }
                }
            } else {
                ul0.m31857b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m30232k(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
