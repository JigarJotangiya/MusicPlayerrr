package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class l30 extends C5444pd implements n30 {
    l30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: A4 */
    public final void mo19061A4(d30 d30) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, d30);
        mo20256K0(1, z);
    }
}
