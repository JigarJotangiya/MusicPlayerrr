package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5351mv extends C5444pd implements C5462pv {
    C5351mv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* renamed from: b */
    public final void mo19550b() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: w0 */
    public final void mo19551w0(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(2, z);
    }
}
