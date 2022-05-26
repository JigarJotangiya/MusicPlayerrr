package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ia2 implements h81 {

    /* renamed from: g */
    public final /* synthetic */ v92 f17931g;

    /* renamed from: h */
    public final /* synthetic */ b80 f17932h;

    public /* synthetic */ ia2(v92 v92, b80 b80) {
        this.f17931g = v92;
        this.f17932h = b80;
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        v92 v92 = this.f17931g;
        b80 b80 = this.f17932h;
        v92.mo16370c(zzbew);
        if (b80 != null) {
            try {
                b80.mo16146r(zzbew);
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
        if (b80 != null) {
            try {
                b80.mo16147y(zzbew.f27186g);
            } catch (RemoteException e2) {
                ul0.m31864i("#007 Could not call remote method.", e2);
            }
        }
    }
}
