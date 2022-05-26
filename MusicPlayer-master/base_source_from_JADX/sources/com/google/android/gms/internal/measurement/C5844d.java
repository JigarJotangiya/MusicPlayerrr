package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5844d extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27488k;

    /* renamed from: l */
    final /* synthetic */ String f27489l;

    /* renamed from: m */
    final /* synthetic */ Bundle f27490m;

    /* renamed from: n */
    final /* synthetic */ C5851g0 f27491n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5844d(C5851g0 g0Var, String str, String str2, Bundle bundle) {
        super(g0Var, true);
        this.f27491n = g0Var;
        this.f27488k = str;
        this.f27489l = str2;
        this.f27490m = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27491n.f27516h;
        C3292l.m14240h(l);
        l.mo22714u4(this.f27488k, this.f27489l, this.f27490m);
    }
}
