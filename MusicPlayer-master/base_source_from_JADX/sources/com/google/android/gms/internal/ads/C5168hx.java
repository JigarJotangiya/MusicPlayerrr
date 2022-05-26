package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5168hx extends C5481qd implements C5205ix {
    public C5168hx() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: e7 */
    public static C5205ix m24955e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof C5205ix ? (C5205ix) queryLocalInterface : new C5131gx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18034o6((zzbfk) C5518rd.m30059a(parcel, zzbfk.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
