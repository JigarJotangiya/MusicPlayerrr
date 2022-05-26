package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.en */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5046en implements C5306ln {

    /* renamed from: a */
    final /* synthetic */ Activity f16007a;

    /* renamed from: b */
    final /* synthetic */ Bundle f16008b;

    C5046en(C5343mn mnVar, Activity activity, Bundle bundle) {
        this.f16007a = activity;
        this.f16008b = bundle;
    }

    /* renamed from: a */
    public final void mo17219a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f16007a, this.f16008b);
    }
}
