package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.aw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4907aw extends C5444pd implements IInterface {
    C4907aw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: l3 */
    public final IBinder mo15974l3(C4863a aVar, zzbfi zzbfi, String str, cb0 cb0, int i, int i2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfi);
        z.writeString(str);
        C5518rd.m30064f(z, cb0);
        z.writeInt(214106000);
        z.writeInt(i2);
        Parcel C0 = mo20255C0(2, z);
        IBinder readStrongBinder = C0.readStrongBinder();
        C0.recycle();
        return readStrongBinder;
    }
}
