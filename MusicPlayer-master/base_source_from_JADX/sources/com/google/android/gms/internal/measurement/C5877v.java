package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5877v extends C5879x {

    /* renamed from: k */
    final /* synthetic */ Long f27555k;

    /* renamed from: l */
    final /* synthetic */ String f27556l;

    /* renamed from: m */
    final /* synthetic */ String f27557m;

    /* renamed from: n */
    final /* synthetic */ Bundle f27558n;

    /* renamed from: o */
    final /* synthetic */ boolean f27559o;

    /* renamed from: p */
    final /* synthetic */ boolean f27560p;

    /* renamed from: q */
    final /* synthetic */ C5851g0 f27561q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5877v(C5851g0 g0Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(g0Var, true);
        this.f27561q = g0Var;
        this.f27555k = l;
        this.f27556l = str;
        this.f27557m = str2;
        this.f27558n = bundle;
        this.f27559o = z;
        this.f27560p = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22656a() throws RemoteException {
        Long l = this.f27555k;
        long longValue = l == null ? this.f27567g : l.longValue();
        C5869p0 l2 = this.f27561q.f27516h;
        C3292l.m14240h(l2);
        l2.mo22699K1(this.f27556l, this.f27557m, this.f27558n, this.f27559o, this.f27560p, longValue);
    }
}
