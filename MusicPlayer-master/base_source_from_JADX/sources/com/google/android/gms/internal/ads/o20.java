package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o20 extends C5444pd implements q20 {
    o20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final double mo16821a() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        double readDouble = C0.readDouble();
        C0.recycle();
        return readDouble;
    }

    /* renamed from: b */
    public final int mo16822b() throws RemoteException {
        Parcel C0 = mo20255C0(5, mo20259z());
        int readInt = C0.readInt();
        C0.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final C4863a mo16823c() throws RemoteException {
        Parcel C0 = mo20255C0(1, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: f */
    public final int mo16824f() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        int readInt = C0.readInt();
        C0.recycle();
        return readInt;
    }

    public final Uri zze() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        Uri uri = (Uri) C5518rd.m30059a(C0, Uri.CREATOR);
        C0.recycle();
        return uri;
    }
}
