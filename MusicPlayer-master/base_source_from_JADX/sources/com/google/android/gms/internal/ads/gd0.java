package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3076g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class gd0 implements C3073d<C3076g, Object> {

    /* renamed from: a */
    final /* synthetic */ pc0 f17023a;

    /* renamed from: b */
    final /* synthetic */ ib0 f17024b;

    gd0(md0 md0, pc0 pc0, ib0 ib0) {
        this.f17023a = pc0;
        this.f17024b = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            this.f17023a.mo19701r(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
