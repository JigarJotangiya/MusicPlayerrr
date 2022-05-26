package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ax */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4908ax extends C5444pd implements C4982cx {
    C4908ax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* renamed from: O1 */
    public final void mo11145O1(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(1, z);
    }
}
