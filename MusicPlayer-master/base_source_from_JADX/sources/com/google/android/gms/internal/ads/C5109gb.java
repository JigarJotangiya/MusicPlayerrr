package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.gb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5109gb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f17009a;

    C5109gb(C5368nb nbVar, Activity activity) {
        this.f17009a = activity;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f17009a);
    }
}
