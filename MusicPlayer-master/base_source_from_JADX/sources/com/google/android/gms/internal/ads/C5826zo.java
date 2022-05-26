package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zo */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5826zo extends C5481qd implements C4974cp {
    public C5826zo() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16714c();
        } else if (i == 2) {
            mo16713b();
        } else if (i == 3) {
            mo16715i0((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            mo16712a();
        }
        parcel2.writeNoException();
        return true;
    }
}
