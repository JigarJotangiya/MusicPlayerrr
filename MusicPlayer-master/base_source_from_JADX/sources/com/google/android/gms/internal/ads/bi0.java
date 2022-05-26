package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class bi0 extends C5444pd implements IInterface {
    bi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: l3 */
    public final IBinder mo16246l3(C4863a aVar, String str, cb0 cb0, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        C5518rd.m30064f(z, cb0);
        z.writeInt(214106000);
        Parcel C0 = mo20255C0(1, z);
        IBinder readStrongBinder = C0.readStrongBinder();
        C0.recycle();
        return readStrongBinder;
    }
}
