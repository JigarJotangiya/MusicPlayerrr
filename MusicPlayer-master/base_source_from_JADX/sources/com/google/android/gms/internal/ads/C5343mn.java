package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.mn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5343mn implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    private final Application f20093g;

    /* renamed from: h */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f20094h;

    /* renamed from: i */
    private boolean f20095i = false;

    public C5343mn(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20094h = new WeakReference<>(activityLifecycleCallbacks);
        this.f20093g = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19458a(C5306ln lnVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f20094h.get();
            if (activityLifecycleCallbacks != null) {
                lnVar.mo17219a(activityLifecycleCallbacks);
            } else if (!this.f20095i) {
                this.f20093g.unregisterActivityLifecycleCallbacks(this);
                this.f20095i = true;
            }
        } catch (Exception e) {
            ul0.m31860e("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo19458a(new C5046en(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo19458a(new C5269kn(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo19458a(new C5158hn(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo19458a(new C5121gn(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo19458a(new C5232jn(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo19458a(new C5084fn(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo19458a(new C5195in(this, activity));
    }
}
