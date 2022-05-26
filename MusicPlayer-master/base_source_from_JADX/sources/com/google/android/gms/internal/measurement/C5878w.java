package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5878w extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27562k;

    /* renamed from: l */
    final /* synthetic */ String f27563l;

    /* renamed from: m */
    final /* synthetic */ Object f27564m;

    /* renamed from: n */
    final /* synthetic */ boolean f27565n;

    /* renamed from: o */
    final /* synthetic */ C5851g0 f27566o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5878w(C5851g0 g0Var, String str, String str2, Object obj, boolean z) {
        super(g0Var, true);
        this.f27566o = g0Var;
        this.f27562k = str;
        this.f27563l = str2;
        this.f27564m = obj;
        this.f27565n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27566o.f27516h;
        C3292l.m14240h(l);
        l.mo22704Q2(this.f27562k, this.f27563l, C4865b.m20503f2(this.f27564m), this.f27565n, this.f27567g);
    }
}
