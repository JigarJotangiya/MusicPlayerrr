package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class i40 extends C5444pd implements j40 {
    i40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: v */
    public final void mo18290v(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(1, z);
    }

    public final void zze() throws RemoteException {
        mo20256K0(2, mo20259z());
    }
}
