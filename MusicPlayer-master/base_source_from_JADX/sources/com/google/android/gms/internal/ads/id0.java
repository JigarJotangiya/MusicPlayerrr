package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3081l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class id0 implements C3073d<C3081l, Object> {

    /* renamed from: a */
    final /* synthetic */ sc0 f17955a;

    /* renamed from: b */
    final /* synthetic */ ib0 f17956b;

    id0(md0 md0, sc0 sc0, ib0 ib0) {
        this.f17955a = sc0;
        this.f17956b = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            this.f17955a.mo20423r(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
