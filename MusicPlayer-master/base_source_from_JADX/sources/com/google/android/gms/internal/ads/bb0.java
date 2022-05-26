package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class bb0 extends C5481qd implements cb0 {
    public bb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: e7 */
    public static cb0 m21200e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof cb0 ? (cb0) queryLocalInterface : new ab0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            fb0 p = mo15737p(parcel.readString());
            parcel2.writeNoException();
            C5518rd.m30064f(parcel2, p);
        } else if (i == 2) {
            boolean v = mo15739v(parcel.readString());
            parcel2.writeNoException();
            C5518rd.m30061c(parcel2, v);
        } else if (i == 3) {
            bd0 b0 = mo15736b0(parcel.readString());
            parcel2.writeNoException();
            C5518rd.m30064f(parcel2, b0);
        } else if (i != 4) {
            return false;
        } else {
            boolean q = mo15738q(parcel.readString());
            parcel2.writeNoException();
            C5518rd.m30061c(parcel2, q);
        }
        return true;
    }
}
