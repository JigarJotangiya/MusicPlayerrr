package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class di0 extends C5481qd implements ei0 {
    public di0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo16636d();
        } else if (i == 2) {
            mo16638y(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            mo16637r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
