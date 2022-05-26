package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5842c extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Bundle f27484k;

    /* renamed from: l */
    final /* synthetic */ C5851g0 f27485l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5842c(C5851g0 g0Var, Bundle bundle) {
        super(g0Var, true);
        this.f27485l = g0Var;
        this.f27484k = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27485l.f27516h;
        C3292l.m14240h(l);
        l.mo22701N0(this.f27484k, this.f27567g);
    }
}
