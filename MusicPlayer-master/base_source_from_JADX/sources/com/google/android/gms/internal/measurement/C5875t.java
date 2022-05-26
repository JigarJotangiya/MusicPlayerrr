package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5875t extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27552k;

    /* renamed from: l */
    final /* synthetic */ C5863m0 f27553l;

    /* renamed from: m */
    final /* synthetic */ C5851g0 f27554m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5875t(C5851g0 g0Var, String str, C5863m0 m0Var) {
        super(g0Var, true);
        this.f27554m = g0Var;
        this.f27552k = str;
        this.f27553l = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27554m.f27516h;
        C3292l.m14240h(l);
        l.mo22715v2(this.f27552k, this.f27553l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22659b() {
        this.f27553l.mo22691z0((Bundle) null);
    }
}
