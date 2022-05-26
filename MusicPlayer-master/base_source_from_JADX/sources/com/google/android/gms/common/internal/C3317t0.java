package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3317t0 extends C3281h0 {

    /* renamed from: g */
    final /* synthetic */ C3261d f10664g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3317t0(C3261d dVar, int i, Bundle bundle) {
        super(dVar, i, (Bundle) null);
        this.f10664g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo11846f() {
        this.f10664g.f10596p.mo11571a(ConnectionResult.f10295k);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11847g(ConnectionResult connectionResult) {
        if (!this.f10664g.mo11806t() || !C3261d.m14118Y(this.f10664g)) {
            this.f10664g.f10596p.mo11571a(connectionResult);
            this.f10664g.mo11780K(connectionResult);
            return;
        }
        C3261d.m14114U(this.f10664g, 16);
    }
}
