package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5850g extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Bundle f27506k;

    /* renamed from: l */
    final /* synthetic */ C5851g0 f27507l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5850g(C5851g0 g0Var, Bundle bundle) {
        super(g0Var, true);
        this.f27507l = g0Var;
        this.f27506k = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27507l.f27516h;
        C3292l.m14240h(l);
        l.mo22716y5(this.f27506k, this.f27567g);
    }
}
