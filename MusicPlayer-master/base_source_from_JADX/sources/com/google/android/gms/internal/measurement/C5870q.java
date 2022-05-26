package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.q */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5870q extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27545k;

    /* renamed from: l */
    final /* synthetic */ Object f27546l;

    /* renamed from: m */
    final /* synthetic */ C5851g0 f27547m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5870q(C5851g0 g0Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(g0Var, false);
        this.f27547m = g0Var;
        this.f27545k = str;
        this.f27546l = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27547m.f27516h;
        C3292l.m14240h(l);
        l.mo22711g1(5, this.f27545k, C4865b.m20503f2(this.f27546l), C4865b.m20503f2(null), C4865b.m20503f2(null));
    }
}
