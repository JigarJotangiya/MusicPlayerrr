package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5093fw extends C5481qd implements C5130gw {
    public C5093fw() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: e7 */
    public static C5130gw m23991e7(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof C5130gw ? (C5130gw) queryLocalInterface : new C5055ew(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo17361H0(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
