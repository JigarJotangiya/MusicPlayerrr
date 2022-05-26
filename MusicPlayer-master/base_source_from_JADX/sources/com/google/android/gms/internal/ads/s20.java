package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s20 extends C5444pd implements u20 {
    s20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: C3 */
    public final void mo20529C3(String str, C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        C5518rd.m30064f(z, aVar);
        mo20256K0(1, z);
    }

    /* renamed from: E0 */
    public final void mo20530E0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(7, z);
    }

    /* renamed from: P2 */
    public final void mo20531P2(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(6, z);
    }

    /* renamed from: V1 */
    public final void mo20532V1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(3, z);
    }

    /* renamed from: Y2 */
    public final void mo20533Y2(n20 n20) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, n20);
        mo20256K0(8, z);
    }

    /* renamed from: c1 */
    public final void mo20535c1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(9, z);
    }

    /* renamed from: n2 */
    public final void mo20536n2(C4863a aVar, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeInt(i);
        mo20256K0(5, z);
    }

    /* renamed from: p */
    public final C4863a mo20537p(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        Parcel C0 = mo20255C0(2, z);
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }
}
