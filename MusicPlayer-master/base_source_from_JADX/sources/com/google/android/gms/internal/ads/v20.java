package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class v20 extends C5444pd implements x20 {
    v20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: P5 */
    public final IBinder mo21412P5(C4863a aVar, C4863a aVar2, C4863a aVar3, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        C5518rd.m30064f(z, aVar3);
        z.writeInt(214106000);
        Parcel C0 = mo20255C0(1, z);
        IBinder readStrongBinder = C0.readStrongBinder();
        C0.recycle();
        return readStrongBinder;
    }
}
