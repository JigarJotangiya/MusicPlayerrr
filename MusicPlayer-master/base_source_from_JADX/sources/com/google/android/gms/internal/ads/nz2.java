package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nz2 extends C5444pd implements IInterface {
    nz2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: l3 */
    public final zzfnr mo19870l3(zzfnp zzfnp) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzfnp);
        Parcel C0 = mo20255C0(1, z);
        zzfnr zzfnr = (zzfnr) C5518rd.m30059a(C0, zzfnr.CREATOR);
        C0.recycle();
        return zzfnr;
    }

    /* renamed from: o5 */
    public final void mo19871o5(zzfnm zzfnm) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzfnm);
        mo20256K0(2, z);
    }

    /* renamed from: y3 */
    public final zzfoa mo19872y3(zzfny zzfny) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzfny);
        Parcel C0 = mo20255C0(3, z);
        zzfoa zzfoa = (zzfoa) C5518rd.m30059a(C0, zzfoa.CREATOR);
        C0.recycle();
        return zzfoa;
    }
}
