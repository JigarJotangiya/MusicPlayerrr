package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5352mw extends C5481qd implements C5389nw {
    public C5352mw() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo17756i0((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        } else if (i == 2) {
            mo17755c();
        } else if (i == 3) {
            mo17754b();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            mo17753a();
        }
        parcel2.writeNoException();
        return true;
    }
}
