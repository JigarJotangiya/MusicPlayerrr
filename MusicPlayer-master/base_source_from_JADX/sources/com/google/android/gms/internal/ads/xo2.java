package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xo2 extends xx2 {

    /* renamed from: a */
    final /* synthetic */ C5018dw f25915a;

    /* renamed from: b */
    final /* synthetic */ yo2 f25916b;

    xo2(yo2 yo2, C5018dw dwVar) {
        this.f25916b = yo2;
        this.f25915a = dwVar;
    }

    /* renamed from: r */
    public final void mo16978r() {
        if (this.f25916b.f26460j != null) {
            try {
                this.f25915a.zze();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }
}
