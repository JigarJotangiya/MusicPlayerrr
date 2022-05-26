package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5849f0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    final /* synthetic */ C5851g0 f27505g;

    C5849f0(C5851g0 g0Var) {
        this.f27505g = g0Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f27505g.m35004o(new C5880y(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f27505g.m35004o(new C5847e0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f27505g.m35004o(new C5841b0(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f27505g.m35004o(new C5839a0(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C5863m0 m0Var = new C5863m0();
        this.f27505g.m35004o(new C5845d0(this, activity, m0Var));
        Bundle K0 = m0Var.mo22690K0(50);
        if (K0 != null) {
            bundle.putAll(K0);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f27505g.m35004o(new C5881z(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f27505g.m35004o(new C5843c0(this, activity));
    }
}
