package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.my */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5354my implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C5391ny f20406g;

    C5354my(C5391ny nyVar) {
        this.f20406g = nyVar;
    }

    public final void run() {
        if (this.f20406g.f20768g != null) {
            try {
                this.f20406g.f20768g.mo18751y(1);
            } catch (RemoteException e) {
                ul0.m31863h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
