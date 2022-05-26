package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class q60 extends C5444pd implements s60 {
    q60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: p */
    public final void mo20399p(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(1, z);
    }
}
