package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.hb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5146hb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f17600a;

    C5146hb(C5368nb nbVar, Activity activity) {
        this.f17600a = activity;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f17600a);
    }
}
