package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5846e extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27495k;

    /* renamed from: l */
    final /* synthetic */ String f27496l;

    /* renamed from: m */
    final /* synthetic */ C5863m0 f27497m;

    /* renamed from: n */
    final /* synthetic */ C5851g0 f27498n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5846e(C5851g0 g0Var, String str, String str2, C5863m0 m0Var) {
        super(g0Var, true);
        this.f27498n = g0Var;
        this.f27495k = str;
        this.f27496l = str2;
        this.f27497m = m0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        C5869p0 l = this.f27498n.f27516h;
        C3292l.m14240h(l);
        l.mo22703O4(this.f27495k, this.f27496l, this.f27497m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22659b() {
        this.f27497m.mo22691z0((Bundle) null);
    }
}
