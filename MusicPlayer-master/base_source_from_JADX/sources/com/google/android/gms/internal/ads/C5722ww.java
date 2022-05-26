package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ww */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5722ww extends C5444pd implements C5797yw {
    C5722ww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: c */
    public final String mo17043c() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final String zze() throws RemoteException {
        Parcel C0 = mo20255C0(1, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
