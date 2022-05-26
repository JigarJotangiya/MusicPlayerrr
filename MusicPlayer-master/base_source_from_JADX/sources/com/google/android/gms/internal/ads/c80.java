package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.C2898d;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.C3112s;
import com.google.android.gms.ads.admanager.C2888a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class c80<AdT> extends C2888a {

    /* renamed from: a */
    private final Context f14889a;

    /* renamed from: b */
    private final C5016du f14890b = C5016du.f15749a;

    /* renamed from: c */
    private final C5833zv f14891c;

    /* renamed from: d */
    private final za0 f14892d;

    public c80(Context context, String str) {
        za0 za0 = new za0();
        this.f14892d = za0;
        this.f14889a = context;
        this.f14891c = C4980cv.m22122a().mo15967e(context, new zzbfi(), str, za0);
    }

    /* renamed from: b */
    public final void mo11388b(C3059k kVar) {
        try {
            C5833zv zvVar = this.f14891c;
            if (zvVar != null) {
                zvVar.mo10924B1(new C5092fv(kVar));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo11389c(boolean z) {
        try {
            C5833zv zvVar = this.f14891c;
            if (zvVar != null) {
                zvVar.mo10958s5(z);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo11390d(Activity activity) {
        if (activity == null) {
            ul0.m31862g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            C5833zv zvVar = this.f14891c;
            if (zvVar != null) {
                zvVar.mo10962x2(C4865b.m20503f2(activity));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo16545e(C5686vx vxVar, C2898d<AdT> dVar) {
        try {
            if (this.f14891c != null) {
                this.f14892d.mo22352f7(vxVar.mo21619p());
                this.f14891c.mo10961x1(this.f14890b.mo17016a(this.f14889a, vxVar), new C5682vt(dVar, this));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            dVar.mo10633a(new C3060l(0, "Internal Error.", "com.google.android.gms.ads", (C2851a) null, (C3112s) null));
        }
    }
}
