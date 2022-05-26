package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class je0 extends C5444pd implements le0 {
    je0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: M0 */
    public final void mo17810M0(Intent intent) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, intent);
        mo20256K0(1, z);
    }

    /* renamed from: c */
    public final void mo17811c() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: u1 */
    public final void mo17812u1(C4863a aVar, String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        z.writeString(str2);
        mo20256K0(2, z);
    }
}
