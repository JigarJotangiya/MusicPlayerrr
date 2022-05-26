package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.lb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5294lb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f19292a;

    C5294lb(C5368nb nbVar, Activity activity) {
        this.f19292a = activity;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f19292a);
    }
}
