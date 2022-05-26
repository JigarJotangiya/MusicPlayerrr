package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
abstract class C5879x implements Runnable {

    /* renamed from: g */
    final long f27567g;

    /* renamed from: h */
    final long f27568h;

    /* renamed from: i */
    final boolean f27569i;

    /* renamed from: j */
    final /* synthetic */ C5851g0 f27570j;

    C5879x(C5851g0 g0Var, boolean z) {
        this.f27570j = g0Var;
        this.f27567g = g0Var.f27510b.mo11988a();
        this.f27568h = g0Var.f27510b.mo11989b();
        this.f27569i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo22656a() throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22659b() {
    }

    public final void run() {
        if (this.f27570j.f27514f) {
            mo22659b();
            return;
        }
        try {
            mo22656a();
        } catch (Exception e) {
            this.f27570j.m35005p(e, false, this.f27569i);
            mo22659b();
        }
    }
}
