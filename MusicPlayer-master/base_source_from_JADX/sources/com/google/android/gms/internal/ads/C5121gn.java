package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.gn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5121gn implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f17203a;

    C5121gn(C5343mn mnVar, Activity activity) {
        this.f17203a = activity;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f17203a);
    }
}
