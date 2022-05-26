package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3108p;
import com.google.android.gms.ads.p071c0.C2896b;
import com.google.android.gms.ads.p071c0.C2897c;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gi0 extends C2896b {

    /* renamed from: a */
    private final wh0 f17108a;

    /* renamed from: b */
    private final Context f17109b;

    /* renamed from: c */
    private final ni0 f17110c = new ni0();

    public gi0(Context context, String str) {
        this.f17109b = context.getApplicationContext();
        this.f17108a = C4980cv.m22122a().mo15971m(context, str, new za0());
    }

    /* renamed from: b */
    public final void mo10721b(C3059k kVar) {
        this.f17110c.mo19735e7(kVar);
    }

    /* renamed from: c */
    public final void mo10722c(Activity activity, C3108p pVar) {
        this.f17110c.mo19736f7(pVar);
        if (activity == null) {
            ul0.m31862g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            wh0 wh0 = this.f17108a;
            if (wh0 != null) {
                wh0.mo20896d3(this.f17110c);
                this.f17108a.mo20890G5(C4865b.m20503f2(activity));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo17929d(C5686vx vxVar, C2897c cVar) {
        try {
            wh0 wh0 = this.f17108a;
            if (wh0 != null) {
                wh0.mo20892Q1(C5016du.f15749a.mo17016a(this.f17109b, vxVar), new ki0(cVar, this));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
