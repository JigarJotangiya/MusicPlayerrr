package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ry */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C5539ry implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ ei0 f23222g;

    public /* synthetic */ C5539ry(ei0 ei0) {
        this.f23222g = ei0;
    }

    public final void run() {
        ei0 ei0 = this.f23222g;
        if (ei0 != null) {
            try {
                ei0.mo16638y(1);
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }
}
