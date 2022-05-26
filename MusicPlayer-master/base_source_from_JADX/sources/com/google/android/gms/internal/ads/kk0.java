package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class kk0 extends C5481qd implements lk0 {
    public kk0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i == 2) {
            mo18645p(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo18644R1(parcel.readString(), parcel.readString(), (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
