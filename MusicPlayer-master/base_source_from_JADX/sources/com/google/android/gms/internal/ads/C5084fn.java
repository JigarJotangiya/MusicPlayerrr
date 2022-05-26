package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.fn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5084fn implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f16684a;

    C5084fn(C5343mn mnVar, Activity activity) {
        this.f16684a = activity;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f16684a);
    }
}
