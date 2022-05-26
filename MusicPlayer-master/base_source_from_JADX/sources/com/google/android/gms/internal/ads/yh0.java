package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class yh0 extends C5444pd implements ai0 {
    yh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: E4 */
    public final void mo15787E4(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(5, z);
    }

    /* renamed from: G4 */
    public final void mo15788G4(th0 th0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, th0);
        mo20256K0(3, z);
    }

    /* renamed from: L */
    public final void mo15789L(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(4, z);
    }

    /* renamed from: c */
    public final void mo15790c() throws RemoteException {
        mo20256K0(6, mo20259z());
    }

    /* renamed from: d */
    public final void mo15791d() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: h */
    public final void mo15792h() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    public final void zze() throws RemoteException {
        mo20256K0(7, mo20259z());
    }
}
