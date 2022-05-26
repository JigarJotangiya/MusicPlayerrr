package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5169hy implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C5243jy f17786g;

    C5169hy(C5243jy jyVar) {
        this.f17786g = jyVar;
    }

    public final void run() {
        if (this.f17786g.f18676g.f19103g != null) {
            try {
                this.f17786g.f18676g.f19103g.mo18751y(1);
            } catch (RemoteException e) {
                ul0.m31863h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
