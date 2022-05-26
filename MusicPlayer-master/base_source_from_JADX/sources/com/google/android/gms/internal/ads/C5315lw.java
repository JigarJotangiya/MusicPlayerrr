package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5315lw extends C5444pd implements C5389nw {
    C5315lw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* renamed from: a */
    public final void mo17753a() throws RemoteException {
        mo20256K0(5, mo20259z());
    }

    /* renamed from: b */
    public final void mo17754b() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: c */
    public final void mo17755c() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: i0 */
    public final void mo17756i0(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(1, z);
    }

    public final void zze() throws RemoteException {
        mo20256K0(4, mo20259z());
    }
}
