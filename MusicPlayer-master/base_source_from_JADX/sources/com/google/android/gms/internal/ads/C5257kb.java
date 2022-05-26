package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.kb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5257kb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f18848a;

    /* renamed from: b */
    final /* synthetic */ Bundle f18849b;

    C5257kb(C5368nb nbVar, Activity activity, Bundle bundle) {
        this.f18848a = activity;
        this.f18849b = bundle;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f18848a, this.f18849b);
    }
}
