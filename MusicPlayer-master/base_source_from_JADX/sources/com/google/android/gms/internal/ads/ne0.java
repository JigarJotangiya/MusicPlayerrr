package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ne0 extends C5481qd implements oe0 {
    /* renamed from: e7 */
    public static oe0 m27833e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof oe0 ? (oe0) queryLocalInterface : new me0(iBinder);
    }
}
