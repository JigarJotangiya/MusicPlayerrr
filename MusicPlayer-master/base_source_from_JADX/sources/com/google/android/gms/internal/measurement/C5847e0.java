package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5847e0 extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Activity f27499k;

    /* renamed from: l */
    final /* synthetic */ C5849f0 f27500l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5847e0(C5849f0 f0Var, Activity activity) {
        super(f0Var.f27505g, true);
        this.f27500l = f0Var;
        this.f27499k = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27500l.f27505g.f27516h;
        C3292l.m14240h(l);
        l.mo22713r5(C4865b.m20503f2(this.f27499k), this.f27568h);
    }
}
