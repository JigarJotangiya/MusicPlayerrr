package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.td */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5592td extends C5481qd implements C5629ud {
    /* renamed from: e7 */
    public static C5629ud m31220e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C5629ud ? (C5629ud) queryLocalInterface : new C5555sd(iBinder);
    }
}
