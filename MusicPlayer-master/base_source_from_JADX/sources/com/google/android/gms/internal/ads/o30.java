package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o30 extends C5444pd implements q30 {
    o30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: X2 */
    public final void mo19891X2(f30 f30) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, f30);
        mo20256K0(1, z);
    }
}
