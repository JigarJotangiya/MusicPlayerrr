package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class w70 extends C5444pd implements y70 {
    w70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: c */
    public final void mo21735c() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: y */
    public final void mo21736y(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(2, z);
    }
}
