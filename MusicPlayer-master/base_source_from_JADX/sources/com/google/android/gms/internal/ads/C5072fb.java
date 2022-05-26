package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5072fb implements C5331mb {

    /* renamed from: a */
    final /* synthetic */ Activity f16500a;

    /* renamed from: b */
    final /* synthetic */ Bundle f16501b;

    C5072fb(C5368nb nbVar, Activity activity, Bundle bundle) {
        this.f16500a = activity;
        this.f16501b = bundle;
    }

    /* renamed from: a */
    public final void mo17516a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f16500a, this.f16501b);
    }
}
