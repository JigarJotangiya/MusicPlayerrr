package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.ro */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5529ro extends C5444pd implements C5603to {
    C5529ro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* renamed from: c4 */
    public final void mo15657c4(C4863a aVar, C4974cp cpVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, cpVar);
        mo20256K0(4, z);
    }
}
