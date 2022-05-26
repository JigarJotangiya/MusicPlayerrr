package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ov2 extends C5481qd implements pv2 {
    /* renamed from: e7 */
    public static pv2 m28756e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof pv2 ? (pv2) queryLocalInterface : new nv2(iBinder);
    }
}
