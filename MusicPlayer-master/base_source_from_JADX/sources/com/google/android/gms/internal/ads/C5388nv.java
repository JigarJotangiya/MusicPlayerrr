package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.nv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5388nv extends C5481qd implements C5462pv {
    public C5388nv() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo19550b();
        } else if (i != 2) {
            return false;
        } else {
            mo19551w0((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
