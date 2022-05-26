package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.hn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5158hn implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f17714a;

    C5158hn(C5343mn mnVar, Activity activity) {
        this.f17714a = activity;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f17714a);
    }
}
