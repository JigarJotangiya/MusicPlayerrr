package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class uc0 extends C5481qd implements vc0 {
    public uc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo19341m5(qb0.m29444e7(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo19342q(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo19343r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
