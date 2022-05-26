package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class z70 extends C5444pd implements b80 {
    z70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: Z0 */
    public final void mo16145Z0(v70 v70) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, v70);
        mo20256K0(1, z);
    }

    /* renamed from: r */
    public final void mo16146r(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(3, z);
    }

    /* renamed from: y */
    public final void mo16147y(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(2, z);
    }
}
