package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class xc0 extends C5481qd implements yc0 {
    public xc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo19345d();
        } else if (i == 3) {
            mo19346q(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo19347r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
