package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class k70 extends C5481qd implements l70 {
    public k70() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: e7 */
    public static l70 m26145e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof l70 ? (l70) queryLocalInterface : new j70(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo19088c();
        } else if (i != 3) {
            return false;
        } else {
            mo18553q(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
