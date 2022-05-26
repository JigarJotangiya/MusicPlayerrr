package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5220jb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f18413a;

    C5220jb(C5368nb nbVar, Activity activity) {
        this.f18413a = activity;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f18413a);
    }
}
