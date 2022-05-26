package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class a80 extends C5481qd implements b80 {
    /* renamed from: e7 */
    public static b80 m20623e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof b80 ? (b80) queryLocalInterface : new z70(iBinder);
    }
}
