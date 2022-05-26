package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ex */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5056ex extends C5481qd implements C5094fx {
    /* renamed from: e7 */
    public static C5094fx m23259e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof C5094fx ? (C5094fx) queryLocalInterface : new C5019dx(iBinder);
    }
}
