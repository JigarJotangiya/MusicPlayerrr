package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class rh0 extends C5444pd implements th0 {
    rh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: c */
    public final String mo19384c() throws RemoteException {
        Parcel C0 = mo20255C0(1, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final int zze() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        int readInt = C0.readInt();
        C0.recycle();
        return readInt;
    }
}
