package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class kt0 extends C5481qd implements lt0 {
    /* renamed from: e7 */
    public static lt0 m26417e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof lt0 ? (lt0) queryLocalInterface : new jt0(iBinder);
    }
}
