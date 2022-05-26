package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qd */
/* compiled from: com.google.android.gms:play-services-ads-base@@20.6.0 */
public class C5481qd extends Binder implements IInterface {
    protected C5481qd(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo11115d7(i, parcel, parcel2, i2);
    }
}
