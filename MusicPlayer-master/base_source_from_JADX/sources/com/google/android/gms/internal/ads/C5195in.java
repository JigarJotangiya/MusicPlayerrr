package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.in */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5195in implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f18099a;

    C5195in(C5343mn mnVar, Activity activity) {
        this.f18099a = activity;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f18099a);
    }
}
