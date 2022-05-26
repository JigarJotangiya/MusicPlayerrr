package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3080k;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class hd0 implements C3073d<C3080k, Object> {

    /* renamed from: a */
    final /* synthetic */ pc0 f17618a;

    /* renamed from: b */
    final /* synthetic */ ib0 f17619b;

    hd0(md0 md0, pc0 pc0, ib0 ib0) {
        this.f17618a = pc0;
        this.f17619b = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            this.f17618a.mo19701r(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
