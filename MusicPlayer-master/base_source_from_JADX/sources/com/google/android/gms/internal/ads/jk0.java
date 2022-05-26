package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jk0 extends C5444pd implements lk0 {
    jk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: R1 */
    public final void mo18644R1(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, bundle);
        mo20256K0(3, z);
    }

    /* renamed from: p */
    public final void mo18645p(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(2, z);
    }
}
