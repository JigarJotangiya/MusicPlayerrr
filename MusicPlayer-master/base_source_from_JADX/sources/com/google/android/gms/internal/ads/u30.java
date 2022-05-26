package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class u30 extends C5444pd implements w30 {
    u30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: b4 */
    public final void mo21028b4(j30 j30) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, j30);
        mo20256K0(1, z);
    }
}
