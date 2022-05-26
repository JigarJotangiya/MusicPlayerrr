package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class uh0 extends C5444pd implements wh0 {
    uh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: G5 */
    public final void mo20890G5(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(5, z);
    }

    /* renamed from: Q1 */
    public final void mo20892Q1(zzbfd zzbfd, ei0 ei0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, ei0);
        mo20256K0(1, z);
    }

    /* renamed from: d3 */
    public final void mo20896d3(ai0 ai0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, ai0);
        mo20256K0(2, z);
    }
}
