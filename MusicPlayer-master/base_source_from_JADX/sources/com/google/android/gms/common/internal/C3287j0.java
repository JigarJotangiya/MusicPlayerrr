package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.j0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3287j0 implements C3286j {

    /* renamed from: g */
    private final IBinder f10636g;

    C3287j0(IBinder iBinder) {
        this.f10636g = iBinder;
    }

    /* renamed from: H1 */
    public final void mo11854H1(C3283i iVar, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C3325x0.m14345a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f10636g.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f10636g;
    }
}
