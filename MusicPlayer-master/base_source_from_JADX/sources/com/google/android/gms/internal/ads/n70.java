package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class n70 extends C5481qd implements o70 {
    public n70() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: e7 */
    public static o70 m27720e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof o70 ? (o70) queryLocalInterface : new m70(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo16424d5(parcel.createTypedArrayList(zzbtn.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
