package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C3114t;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mp1 extends C3114t.C3115a {

    /* renamed from: a */
    private final bk1 f20119a;

    public mp1(bk1 bk1) {
        this.f20119a = bk1;
    }

    /* renamed from: f */
    private static C5575sx m27380f(bk1 bk1) {
        C5427ox R = bk1.mo16266R();
        if (R == null) {
            return null;
        }
        try {
            return R.mo15832g();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo11363a() {
        C5575sx f = m27380f(this.f20119a);
        if (f != null) {
            try {
                f.zze();
            } catch (RemoteException e) {
                ul0.m31863h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo11365c() {
        C5575sx f = m27380f(this.f20119a);
        if (f != null) {
            try {
                f.mo20521d();
            } catch (RemoteException e) {
                ul0.m31863h("Unable to call onVideoEnd()", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo11367e() {
        C5575sx f = m27380f(this.f20119a);
        if (f != null) {
            try {
                f.mo20523g();
            } catch (RemoteException e) {
                ul0.m31863h("Unable to call onVideoEnd()", e);
            }
        }
    }
}
