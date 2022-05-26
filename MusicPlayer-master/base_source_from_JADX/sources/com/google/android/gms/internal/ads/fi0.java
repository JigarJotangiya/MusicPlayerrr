package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class fi0 extends C5444pd implements IInterface {
    fi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* renamed from: l3 */
    public final void mo17536l3(th0 th0, String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, th0);
        z.writeString(str);
        z.writeString(str2);
        mo20256K0(2, z);
    }
}
