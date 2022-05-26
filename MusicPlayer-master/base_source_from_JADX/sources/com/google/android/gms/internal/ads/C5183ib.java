package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ib */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5183ib implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f17933a;

    C5183ib(C5368nb nbVar, Activity activity) {
        this.f17933a = activity;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f17933a);
    }
}
