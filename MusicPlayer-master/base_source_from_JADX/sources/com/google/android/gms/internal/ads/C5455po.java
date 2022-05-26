package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.p072v.C3118a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.po */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5455po extends C3118a {

    /* renamed from: a */
    private final C5603to f21437a;

    /* renamed from: b */
    private final C5492qo f21438b = new C5492qo();

    public C5455po(C5603to toVar, String str) {
        this.f21437a = toVar;
    }

    /* renamed from: b */
    public final void mo11373b(C3059k kVar) {
        this.f21438b.mo20481e7(kVar);
    }

    /* renamed from: c */
    public final void mo11374c(Activity activity) {
        try {
            this.f21437a.mo15657c4(C4865b.m20503f2(activity), this.f21438b);
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
