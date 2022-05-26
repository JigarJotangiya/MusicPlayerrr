package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;

/* renamed from: com.google.android.gms.internal.ads.tp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5604tp implements C3261d.C3263b {

    /* renamed from: a */
    final /* synthetic */ mm0 f23962a;

    /* renamed from: b */
    final /* synthetic */ C5641up f23963b;

    C5604tp(C5641up upVar, mm0 mm0) {
        this.f23963b = upVar;
        this.f23962a = mm0;
    }

    /* renamed from: C0 */
    public final void mo11815C0(ConnectionResult connectionResult) {
        synchronized (this.f23963b.f24390d) {
            this.f23962a.mo19451e(new RuntimeException("Connection failed."));
        }
    }
}
