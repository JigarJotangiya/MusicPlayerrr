package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5848f extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Activity f27501k;

    /* renamed from: l */
    final /* synthetic */ String f27502l;

    /* renamed from: m */
    final /* synthetic */ String f27503m;

    /* renamed from: n */
    final /* synthetic */ C5851g0 f27504n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5848f(C5851g0 g0Var, Activity activity, String str, String str2) {
        super(g0Var, true);
        this.f27504n = g0Var;
        this.f27501k = activity;
        this.f27502l = str;
        this.f27503m = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27504n.f27516h;
        C3292l.m14240h(l);
        l.mo22706U0(C4865b.m20503f2(this.f27501k), this.f27502l, this.f27503m, this.f27567g);
    }
}
