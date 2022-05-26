package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5131gx extends C5444pd implements C5205ix {
    C5131gx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: o6 */
    public final void mo18034o6(zzbfk zzbfk) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfk);
        mo20256K0(1, z);
    }
}
