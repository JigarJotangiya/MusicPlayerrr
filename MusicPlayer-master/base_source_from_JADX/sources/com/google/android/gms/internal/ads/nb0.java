package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class nb0 extends C5444pd implements IInterface {
    nb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: F5 */
    public final C4863a mo19676F5() throws RemoteException {
        Parcel C0 = mo20255C0(18, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: a1 */
    public final void mo19677a1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(16, z);
    }

    /* renamed from: c */
    public final Bundle mo19678c() throws RemoteException {
        Parcel C0 = mo20255C0(15, mo20259z());
        Bundle bundle = (Bundle) C5518rd.m30059a(C0, Bundle.CREATOR);
        C0.recycle();
        return bundle;
    }

    /* renamed from: d7 */
    public final C4863a mo19679d7() throws RemoteException {
        Parcel C0 = mo20255C0(20, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: e7 */
    public final List mo19680e7() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }

    /* renamed from: f7 */
    public final void mo19681f7(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(11, z);
    }

    /* renamed from: g7 */
    public final void mo19682g7(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(12, z);
    }

    /* renamed from: h7 */
    public final void mo19683h7(C4863a aVar, C4863a aVar2, C4863a aVar3) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        C5518rd.m30064f(z, aVar3);
        mo20256K0(22, z);
    }

    /* renamed from: i7 */
    public final boolean mo19684i7() throws RemoteException {
        Parcel C0 = mo20255C0(14, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: j */
    public final C4863a mo19685j() throws RemoteException {
        Parcel C0 = mo20255C0(21, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: j7 */
    public final boolean mo19686j7() throws RemoteException {
        Parcel C0 = mo20255C0(13, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: k */
    public final String mo19687k() throws RemoteException {
        Parcel C0 = mo20255C0(6, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo19688l() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: l3 */
    public final C5427ox mo19689l3() throws RemoteException {
        Parcel C0 = mo20255C0(17, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: m */
    public final String mo19690m() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: n */
    public final void mo19691n() throws RemoteException {
        mo20256K0(10, mo20259z());
    }

    /* renamed from: o */
    public final String mo19692o() throws RemoteException {
        Parcel C0 = mo20255C0(8, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: o5 */
    public final q20 mo19693o5() throws RemoteException {
        Parcel C0 = mo20255C0(5, mo20259z());
        q20 e7 = p20.m28834e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: y3 */
    public final j20 mo19694y3() throws RemoteException {
        Parcel C0 = mo20255C0(19, mo20259z());
        j20 e7 = h20.m24627e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    public final double zze() throws RemoteException {
        Parcel C0 = mo20255C0(7, mo20259z());
        double readDouble = C0.readDouble();
        C0.recycle();
        return readDouble;
    }

    public final String zzp() throws RemoteException {
        Parcel C0 = mo20255C0(9, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
