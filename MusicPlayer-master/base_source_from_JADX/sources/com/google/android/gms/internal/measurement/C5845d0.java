package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5845d0 extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Activity f27492k;

    /* renamed from: l */
    final /* synthetic */ C5863m0 f27493l;

    /* renamed from: m */
    final /* synthetic */ C5849f0 f27494m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5845d0(C5849f0 f0Var, Activity activity, C5863m0 m0Var) {
        super(f0Var.f27505g, true);
        this.f27494m = f0Var;
        this.f27492k = activity;
        this.f27493l = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27494m.f27505g.f27516h;
        C3292l.m14240h(l);
        l.mo22707Z6(C4865b.m20503f2(this.f27492k), this.f27493l, this.f27568h);
    }
}
