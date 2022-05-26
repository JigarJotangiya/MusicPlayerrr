package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class j70 extends C5444pd implements l70 {
    j70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: q */
    public final void mo18553q(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(3, z);
    }
}
