package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jh0 extends C5444pd implements lh0 {
    jh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: c */
    public final void mo18631c() throws RemoteException {
        mo20256K0(4, mo20259z());
    }

    /* renamed from: e */
    public final void mo18632e() throws RemoteException {
        mo20256K0(6, mo20259z());
    }

    /* renamed from: g */
    public final void mo18633g() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: h */
    public final void mo18634h() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: i */
    public final void mo18635i() throws RemoteException {
        mo20256K0(8, mo20259z());
    }

    /* renamed from: j */
    public final void mo18636j() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: o2 */
    public final void mo18637o2(fh0 fh0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, fh0);
        mo20256K0(5, z);
    }

    /* renamed from: w */
    public final void mo18638w(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(7, z);
    }
}
