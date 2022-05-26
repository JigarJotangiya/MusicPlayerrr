package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.jn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5232jn implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f18541a;

    /* renamed from: b */
    final /* synthetic */ Bundle f18542b;

    C5232jn(C5343mn mnVar, Activity activity, Bundle bundle) {
        this.f18541a = activity;
        this.f18542b = bundle;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f18541a, this.f18542b);
    }
}
