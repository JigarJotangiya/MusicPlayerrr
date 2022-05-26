package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3086q;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class ld0 implements C3073d<C3086q, Object> {

    /* renamed from: a */
    final /* synthetic */ yc0 f19298a;

    /* renamed from: b */
    final /* synthetic */ ib0 f19299b;

    ld0(md0 md0, yc0 yc0, ib0 ib0) {
        this.f19298a = yc0;
        this.f19299b = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            this.f19298a.mo19347r(aVar.mo10668d());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
