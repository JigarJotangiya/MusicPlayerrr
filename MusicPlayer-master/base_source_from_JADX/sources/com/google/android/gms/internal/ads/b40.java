package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class b40 extends C5444pd implements d40 {
    b40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: Y3 */
    public final void mo16044Y3(m40 m40) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, m40);
        mo20256K0(1, z);
    }
}
