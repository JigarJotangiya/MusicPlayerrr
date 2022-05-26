package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class yn1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ ao1 f26427g;

    public /* synthetic */ yn1(ao1 ao1) {
        this.f26427g = ao1;
    }

    public final void run() {
        try {
            this.f26427g.mo15907f();
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
