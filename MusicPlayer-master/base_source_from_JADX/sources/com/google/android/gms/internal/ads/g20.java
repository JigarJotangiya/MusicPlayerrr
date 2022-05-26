package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class g20 extends C5444pd implements j20 {
    g20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: d */
    public final String mo15649d() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: e */
    public final List<q20> mo15650e() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }
}
