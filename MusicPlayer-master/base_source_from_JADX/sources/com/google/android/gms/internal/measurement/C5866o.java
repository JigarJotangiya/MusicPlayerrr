package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.o */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5866o extends C5879x {

    /* renamed from: k */
    final /* synthetic */ C5863m0 f27538k;

    /* renamed from: l */
    final /* synthetic */ C5851g0 f27539l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5866o(C5851g0 g0Var, C5863m0 m0Var) {
        super(g0Var, true);
        this.f27539l = g0Var;
        this.f27538k = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27539l.f27516h;
        C3292l.m14240h(l);
        l.mo22705T3(this.f27538k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22659b() {
        this.f27538k.mo22691z0((Bundle) null);
    }
}
