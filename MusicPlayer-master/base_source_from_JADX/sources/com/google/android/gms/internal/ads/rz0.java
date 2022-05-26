package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rz0 implements a91 {

    /* renamed from: g */
    private final kq2 f23228g;

    public rz0(kq2 kq2) {
        this.f23228g = kq2;
    }

    /* renamed from: b */
    public final void mo15713b(Context context) {
        try {
            this.f23228g.mo18984v();
        } catch (zp2 e) {
            ul0.m31863h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    /* renamed from: o */
    public final void mo15714o(Context context) {
        try {
            this.f23228g.mo18985w();
            if (context != null) {
                this.f23228g.mo18983u(context);
            }
        } catch (zp2 e) {
            ul0.m31863h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    /* renamed from: u */
    public final void mo15715u(Context context) {
        try {
            this.f23228g.mo18972j();
        } catch (zp2 e) {
            ul0.m31863h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
