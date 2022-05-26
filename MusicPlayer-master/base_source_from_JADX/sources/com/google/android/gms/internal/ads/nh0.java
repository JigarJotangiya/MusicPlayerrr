package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class nh0 extends C5444pd implements ph0 {
    nh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: X */
    public final void mo17497X(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(3, z);
    }

    /* renamed from: Y */
    public final void mo17498Y(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(4, z);
    }

    /* renamed from: Z1 */
    public final void mo17499Z1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(11, z);
    }

    /* renamed from: a0 */
    public final void mo17500a0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(1, z);
    }

    /* renamed from: c0 */
    public final void mo17501c0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(6, z);
    }

    /* renamed from: e0 */
    public final void mo17502e0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(5, z);
    }

    /* renamed from: p2 */
    public final void mo17504p2(C4863a aVar, zzces zzces) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzces);
        mo20256K0(7, z);
    }

    /* renamed from: q0 */
    public final void mo17505q0(C4863a aVar, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeInt(i);
        mo20256K0(9, z);
    }

    public final void zze(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(8, z);
    }
}
