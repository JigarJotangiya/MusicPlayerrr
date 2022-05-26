package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public class C5838a implements IInterface {

    /* renamed from: g */
    private final IBinder f27478g;

    /* renamed from: h */
    private final String f27479h;

    protected C5838a(IBinder iBinder, String str) {
        this.f27478g = iBinder;
        this.f27479h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo22653C0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27478g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f27478g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo22655z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27479h);
        return obtain;
    }
}
