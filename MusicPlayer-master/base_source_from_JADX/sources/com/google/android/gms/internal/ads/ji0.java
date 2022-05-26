package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ji0 {
    /* renamed from: a */
    public static final wh0 m25709a(Context context, String str, cb0 cb0) {
        try {
            IBinder l3 = ((bi0) zl0.m34659b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", ii0.f18039a)).mo16246l3(C4865b.m20503f2(context), str, cb0, 214106000);
            if (l3 == null) {
                return null;
            }
            IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof wh0 ? (wh0) queryLocalInterface : new uh0(l3);
        } catch (RemoteException | yl0 e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
