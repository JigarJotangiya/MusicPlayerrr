package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5166hv extends C5481qd implements C5203iv {
    public C5166hv() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18032a();
        parcel2.writeNoException();
        return true;
    }
}
