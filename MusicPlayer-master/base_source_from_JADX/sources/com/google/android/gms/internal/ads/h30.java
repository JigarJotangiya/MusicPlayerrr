package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class h30 extends C5444pd implements j30 {
    h30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: d */
    public final C4863a mo18063d() throws RemoteException {
        Parcel C0 = mo20255C0(9, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: e */
    public final String mo18064e() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: k0 */
    public final boolean mo18065k0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(10, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }
}
