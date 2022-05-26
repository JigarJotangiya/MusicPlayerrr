package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5345mp extends C5444pd implements IInterface {
    C5345mp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: l3 */
    public final long mo19483l3(zzbak zzbak) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbak);
        Parcel C0 = mo20255C0(3, z);
        long readLong = C0.readLong();
        C0.recycle();
        return readLong;
    }

    /* renamed from: o5 */
    public final zzbah mo19484o5(zzbak zzbak) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbak);
        Parcel C0 = mo20255C0(2, z);
        zzbah zzbah = (zzbah) C5518rd.m30059a(C0, zzbah.CREATOR);
        C0.recycle();
        return zzbah;
    }

    /* renamed from: y3 */
    public final zzbah mo19485y3(zzbak zzbak) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbak);
        Parcel C0 = mo20255C0(1, z);
        zzbah zzbah = (zzbah) C5518rd.m30059a(C0, zzbah.CREATOR);
        C0.recycle();
        return zzbah;
    }
}
