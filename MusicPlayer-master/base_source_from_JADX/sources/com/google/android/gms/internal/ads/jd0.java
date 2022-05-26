package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3093v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class jd0 implements C3073d<C3093v, Object> {

    /* renamed from: a */
    final /* synthetic */ vc0 f18458a;

    /* renamed from: b */
    final /* synthetic */ ib0 f18459b;

    jd0(md0 md0, vc0 vc0, ib0 ib0) {
        this.f18458a = vc0;
        this.f18459b = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            this.f18458a.mo19343r(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
