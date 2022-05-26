package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class mk0 extends C5444pd implements ok0 {
    mk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: T1 */
    public final void mo10683T1(C4863a aVar, zzchx zzchx, lk0 lk0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzchx);
        C5518rd.m30064f(z, lk0);
        mo20256K0(1, z);
    }
}
