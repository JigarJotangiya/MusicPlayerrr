package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r30 extends C5444pd implements t30 {
    r30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: b5 */
    public final void mo20577b5(j30 j30, String str) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, j30);
        z.writeString(str);
        mo20256K0(1, z);
    }
}
