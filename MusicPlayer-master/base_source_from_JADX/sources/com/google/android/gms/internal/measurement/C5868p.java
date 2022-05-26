package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5868p extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27540k;

    /* renamed from: l */
    final /* synthetic */ String f27541l;

    /* renamed from: m */
    final /* synthetic */ boolean f27542m;

    /* renamed from: n */
    final /* synthetic */ C5863m0 f27543n;

    /* renamed from: o */
    final /* synthetic */ C5851g0 f27544o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5868p(C5851g0 g0Var, String str, String str2, boolean z, C5863m0 m0Var) {
        super(g0Var, true);
        this.f27544o = g0Var;
        this.f27540k = str;
        this.f27541l = str2;
        this.f27542m = z;
        this.f27543n = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27544o.f27516h;
        C3292l.m14240h(l);
        l.mo22694D3(this.f27540k, this.f27541l, this.f27542m, this.f27543n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22659b() {
        this.f27543n.mo22691z0((Bundle) null);
    }
}
