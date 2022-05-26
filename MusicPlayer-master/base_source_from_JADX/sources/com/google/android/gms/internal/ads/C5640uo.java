package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5640uo extends C5444pd implements C5714wo {
    C5640uo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: A */
    public final void mo20061A(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(2, z);
    }

    /* renamed from: B3 */
    public final void mo20062B3(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(3, z);
    }

    /* renamed from: k1 */
    public final void mo20063k1(C5603to toVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, toVar);
        mo20256K0(1, z);
    }
}
