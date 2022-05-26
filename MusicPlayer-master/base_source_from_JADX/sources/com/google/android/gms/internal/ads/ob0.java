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
public final class ob0 extends C5444pd implements IInterface {
    ob0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: F5 */
    public final C4863a mo19937F5() throws RemoteException {
        Parcel C0 = mo20255C0(20, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: d7 */
    public final C4863a mo19938d7() throws RemoteException {
        Parcel C0 = mo20255C0(21, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: e7 */
    public final List mo19939e7() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }

    /* renamed from: f7 */
    public final void mo19940f7(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(9, z);
    }

    /* renamed from: g */
    public final C4863a mo19941g() throws RemoteException {
        Parcel C0 = mo20255C0(15, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: g7 */
    public final void mo19942g7(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(10, z);
    }

    /* renamed from: h7 */
    public final void mo19943h7(C4863a aVar, C4863a aVar2, C4863a aVar3) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        C5518rd.m30064f(z, aVar3);
        mo20256K0(22, z);
    }

    /* renamed from: i7 */
    public final void mo19944i7(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(14, z);
    }

    /* renamed from: j */
    public final String mo19945j() throws RemoteException {
        Parcel C0 = mo20255C0(7, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: j7 */
    public final boolean mo19946j7() throws RemoteException {
        Parcel C0 = mo20255C0(12, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: k */
    public final String mo19947k() throws RemoteException {
        Parcel C0 = mo20255C0(6, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: k7 */
    public final boolean mo19948k7() throws RemoteException {
        Parcel C0 = mo20255C0(11, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: l */
    public final String mo19949l() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: l3 */
    public final C5427ox mo19950l3() throws RemoteException {
        Parcel C0 = mo20255C0(16, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: m */
    public final String mo19951m() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: o5 */
    public final q20 mo19952o5() throws RemoteException {
        Parcel C0 = mo20255C0(5, mo20259z());
        q20 e7 = p20.m28834e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: y3 */
    public final j20 mo19953y3() throws RemoteException {
        Parcel C0 = mo20255C0(19, mo20259z());
        j20 e7 = h20.m24627e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    public final Bundle zze() throws RemoteException {
        Parcel C0 = mo20255C0(13, mo20259z());
        Bundle bundle = (Bundle) C5518rd.m30059a(C0, Bundle.CREATOR);
        C0.recycle();
        return bundle;
    }

    public final void zzr() throws RemoteException {
        mo20256K0(8, mo20259z());
    }
}
