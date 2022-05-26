package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.mediation.C3073d;
import com.google.android.gms.ads.mediation.C3076g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class xb0 implements C3073d<C3076g, Object> {

    /* renamed from: a */
    final /* synthetic */ ib0 f25742a;

    /* renamed from: b */
    final /* synthetic */ bc0 f25743b;

    xb0(bc0 bc0, ib0 ib0) {
        this.f25743b = bc0;
        this.f25742a = ib0;
    }

    /* renamed from: a */
    public final void mo11193a(C2851a aVar) {
        try {
            String canonicalName = this.f25743b.f14394g.getClass().getCanonicalName();
            int a = aVar.mo10665a();
            String c = aVar.mo10667c();
            String b = aVar.mo10666b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(c).length() + String.valueOf(b).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(a);
            sb.append(". ErrorMessage = ");
            sb.append(c);
            sb.append(". ErrorDomain = ");
            sb.append(b);
            ul0.m31857b(sb.toString());
            this.f25742a.mo17173x5(aVar.mo10668d());
            this.f25742a.mo17168o1(aVar.mo10665a(), aVar.mo10667c());
            this.f25742a.mo17171w(aVar.mo10665a());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
