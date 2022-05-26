package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5880y extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Bundle f27571k;

    /* renamed from: l */
    final /* synthetic */ Activity f27572l;

    /* renamed from: m */
    final /* synthetic */ C5849f0 f27573m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5880y(C5849f0 f0Var, Bundle bundle, Activity activity) {
        super(f0Var.f27505g, true);
        this.f27573m = f0Var;
        this.f27571k = bundle;
        this.f27572l = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        Bundle bundle;
        if (this.f27571k != null) {
            bundle = new Bundle();
            if (this.f27571k.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f27571k.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        C5869p0 l = this.f27573m.f27505g.f27516h;
        C3292l.m14240h(l);
        l.mo22698I5(C4865b.m20503f2(this.f27572l), bundle, this.f27568h);
    }
}
