package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ew */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5055ew extends C5444pd implements C5130gw {
    C5055ew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: H0 */
    public final void mo17361H0(String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        mo20256K0(1, z);
    }
}
