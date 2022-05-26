package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b70 extends C5444pd implements IInterface {
    b70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: l3 */
    public final void mo16089l3(zzbta zzbta, a70 a70) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbta);
        C5518rd.m30064f(z, a70);
        mo20258f2(2, z);
    }
}
