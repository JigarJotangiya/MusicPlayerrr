package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class z10 extends C5444pd implements IInterface {
    z10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    /* renamed from: l3 */
    public final void mo22319l3(cg0 cg0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, cg0);
        mo20256K0(1, z);
    }
}
