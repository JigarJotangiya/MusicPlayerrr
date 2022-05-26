package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5856j extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27524k;

    /* renamed from: l */
    final /* synthetic */ C5851g0 f27525l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5856j(C5851g0 g0Var, String str) {
        super(g0Var, true);
        this.f27525l = g0Var;
        this.f27524k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27525l.f27516h;
        C3292l.m14240h(l);
        l.mo22709b6(this.f27524k, this.f27568h);
    }
}
