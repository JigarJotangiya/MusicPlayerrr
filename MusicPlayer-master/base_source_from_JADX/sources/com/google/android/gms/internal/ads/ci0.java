package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ci0 extends C5444pd implements ei0 {
    ci0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: d */
    public final void mo16636d() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: r */
    public final void mo16637r(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(3, z);
    }

    /* renamed from: y */
    public final void mo16638y(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(2, z);
    }
}
