package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class pb0 extends C5444pd implements rb0 {
    pb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: B */
    public final boolean mo19116B() throws RemoteException {
        Parcel C0 = mo20255C0(18, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: G */
    public final void mo19117G() throws RemoteException {
        mo20256K0(19, mo20259z());
    }

    /* renamed from: I */
    public final boolean mo19118I() throws RemoteException {
        Parcel C0 = mo20255C0(17, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: I2 */
    public final void mo19119I2(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(22, z);
    }

    /* renamed from: a1 */
    public final void mo19120a1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(20, z);
    }

    /* renamed from: c */
    public final float mo19121c() throws RemoteException {
        Parcel C0 = mo20255C0(23, mo20259z());
        float readFloat = C0.readFloat();
        C0.recycle();
        return readFloat;
    }

    /* renamed from: d */
    public final float mo19122d() throws RemoteException {
        Parcel C0 = mo20255C0(25, mo20259z());
        float readFloat = C0.readFloat();
        C0.recycle();
        return readFloat;
    }

    /* renamed from: e */
    public final float mo19123e() throws RemoteException {
        Parcel C0 = mo20255C0(24, mo20259z());
        float readFloat = C0.readFloat();
        C0.recycle();
        return readFloat;
    }

    /* renamed from: g */
    public final Bundle mo19124g() throws RemoteException {
        Parcel C0 = mo20255C0(16, mo20259z());
        Bundle bundle = (Bundle) C5518rd.m30059a(C0, Bundle.CREATOR);
        C0.recycle();
        return bundle;
    }

    /* renamed from: h */
    public final C5427ox mo19125h() throws RemoteException {
        Parcel C0 = mo20255C0(11, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: i */
    public final j20 mo19126i() throws RemoteException {
        Parcel C0 = mo20255C0(12, mo20259z());
        j20 e7 = h20.m24627e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: j */
    public final q20 mo19127j() throws RemoteException {
        Parcel C0 = mo20255C0(5, mo20259z());
        q20 e7 = p20.m28834e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: k */
    public final C4863a mo19128k() throws RemoteException {
        Parcel C0 = mo20255C0(14, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: l */
    public final C4863a mo19129l() throws RemoteException {
        Parcel C0 = mo20255C0(15, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: m */
    public final C4863a mo19130m() throws RemoteException {
        Parcel C0 = mo20255C0(13, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: n */
    public final String mo19131n() throws RemoteException {
        Parcel C0 = mo20255C0(10, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo19132o() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: p5 */
    public final void mo19133p5(C4863a aVar, C4863a aVar2, C4863a aVar3) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        C5518rd.m30064f(z, aVar3);
        mo20256K0(21, z);
    }

    /* renamed from: t */
    public final List mo19134t() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }

    /* renamed from: u */
    public final String mo19135u() throws RemoteException {
        Parcel C0 = mo20255C0(9, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final double zze() throws RemoteException {
        Parcel C0 = mo20255C0(8, mo20259z());
        double readDouble = C0.readDouble();
        C0.recycle();
        return readDouble;
    }

    public final String zzp() throws RemoteException {
        Parcel C0 = mo20255C0(7, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel C0 = mo20255C0(6, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
