package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class rc0 extends C5481qd implements sc0 {
    public rc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo20820d();
        } else if (i == 3) {
            mo20821q(parcel.readString());
        } else if (i != 4) {
            return false;
        } else {
            mo20423r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
