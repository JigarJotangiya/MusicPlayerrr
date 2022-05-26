package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5242jx extends C5444pd implements C5316lx {
    C5242jx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: c */
    public final String mo18760c() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: d */
    public final List<zzbfm> mo18761d() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList<zzbfm> createTypedArrayList = C0.createTypedArrayList(zzbfm.CREATOR);
        C0.recycle();
        return createTypedArrayList;
    }

    public final String zze() throws RemoteException {
        Parcel C0 = mo20255C0(1, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
