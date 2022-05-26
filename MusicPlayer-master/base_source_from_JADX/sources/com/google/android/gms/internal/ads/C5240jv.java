package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5240jv extends C5444pd implements C5314lv {
    C5240jv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: b */
    public final void mo18744b() throws RemoteException {
        mo20256K0(6, mo20259z());
    }

    /* renamed from: d */
    public final void mo18745d() throws RemoteException {
        mo20256K0(7, mo20259z());
    }

    /* renamed from: e */
    public final void mo18746e() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: f */
    public final void mo18747f() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: g */
    public final void mo18748g() throws RemoteException {
        mo20256K0(4, mo20259z());
    }

    /* renamed from: h */
    public final void mo18749h() throws RemoteException {
        mo20256K0(5, mo20259z());
    }

    /* renamed from: r */
    public final void mo18750r(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(8, z);
    }

    /* renamed from: y */
    public final void mo18751y(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(2, z);
    }
}
