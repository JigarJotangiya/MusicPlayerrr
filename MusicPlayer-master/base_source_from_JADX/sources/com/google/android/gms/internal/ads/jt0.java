package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jt0 extends C5444pd implements lt0 {
    jt0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    /* renamed from: W6 */
    public final void mo18733W6(C4863a aVar, it0 it0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, it0);
        mo20256K0(2, z);
    }
}
