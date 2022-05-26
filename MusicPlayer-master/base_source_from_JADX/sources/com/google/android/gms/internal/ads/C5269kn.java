package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.kn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5269kn implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f18927a;

    C5269kn(C5343mn mnVar, Activity activity) {
        this.f18927a = activity;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f18927a);
    }
}
