package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p159f.p243f.p244a.C4856a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ic0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C4856a f17946g;

    /* renamed from: h */
    final /* synthetic */ jc0 f17947h;

    ic0(jc0 jc0, C4856a aVar) {
        this.f17947h = jc0;
        this.f17946g = aVar;
    }

    public final void run() {
        try {
            this.f17947h.f18449a.mo17171w(kc0.m26189a(this.f17946g));
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
