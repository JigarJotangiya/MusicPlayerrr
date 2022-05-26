package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qo2 extends xx2 {

    /* renamed from: a */
    final /* synthetic */ C5094fx f21983a;

    /* renamed from: b */
    final /* synthetic */ so2 f21984b;

    qo2(so2 so2, C5094fx fxVar) {
        this.f21984b = so2;
        this.f21983a = fxVar;
    }

    /* renamed from: r */
    public final void mo16978r() {
        if (this.f21984b.f23568l != null) {
            try {
                this.f21983a.zze();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }
}
