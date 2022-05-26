package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.wv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5721wv extends C5444pd implements IInterface {
    C5721wv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: l3 */
    public final IBinder mo21923l3(C4863a aVar, String str, cb0 cb0, int i) throws RemoteException {
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
