package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class qk0 extends C5481qd implements rk0 {
    /* renamed from: e7 */
    public static rk0 m29551e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof rk0 ? (rk0) queryLocalInterface : new pk0(iBinder);
    }
}
