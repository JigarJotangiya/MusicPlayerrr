package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.nb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5368nb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    private final Application f20573g;

    /* renamed from: h */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f20574h;

    /* renamed from: i */
    private boolean f20575i = false;

    public C5368nb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20574h = new WeakReference<>(activityLifecycleCallbacks);
        this.f20573g = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19668a(C5331mb mbVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f20574h.get();
            if (activityLifecycleCallbacks != null) {
                mbVar.mo17516a(activityLifecycleCallbacks);
            } else if (!this.f20575i) {
                this.f20573g.unregisterActivityLifecycleCallbacks(this);
                this.f20575i = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo19668a(new C5072fb(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo19668a(new C5294lb(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo19668a(new C5183ib(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo19668a(new C5146hb(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo19668a(new C5257kb(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo19668a(new C5109gb(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo19668a(new C5220jb(this, activity));
    }
}
