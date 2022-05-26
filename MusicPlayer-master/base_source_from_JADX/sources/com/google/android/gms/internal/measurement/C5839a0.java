package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5839a0 extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Activity f27480k;

    /* renamed from: l */
    final /* synthetic */ C5849f0 f27481l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5839a0(C5849f0 f0Var, Activity activity) {
        super(f0Var.f27505g, true);
        this.f27481l = f0Var;
        this.f27480k = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27481l.f27505g.f27516h;
        C3292l.m14240h(l);
        l.mo22700L1(C4865b.m20503f2(this.f27480k), this.f27568h);
    }
}
