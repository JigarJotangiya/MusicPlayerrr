package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5872r extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Bundle f27548k;

    /* renamed from: l */
    final /* synthetic */ C5863m0 f27549l;

    /* renamed from: m */
    final /* synthetic */ C5851g0 f27550m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5872r(C5851g0 g0Var, Bundle bundle, C5863m0 m0Var) {
        super(g0Var, true);
        this.f27550m = g0Var;
        this.f27548k = bundle;
        this.f27549l = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27550m.f27516h;
        C3292l.m14240h(l);
        l.mo22692A6(this.f27548k, this.f27549l, this.f27567g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22659b() {
        this.f27549l.mo22691z0((Bundle) null);
    }
}
