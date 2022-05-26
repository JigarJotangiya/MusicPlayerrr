package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.uw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5648uw extends C5481qd implements C5685vw {
    /* renamed from: e7 */
    public static C5685vw m32075e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof C5685vw ? (C5685vw) queryLocalInterface : new C5611tw(iBinder);
    }
}
