package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k00 extends C5444pd implements m00 {
    k00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: p4 */
    public final void mo18776p4(j00 j00) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, j00);
        mo20256K0(1, z);
    }
}
