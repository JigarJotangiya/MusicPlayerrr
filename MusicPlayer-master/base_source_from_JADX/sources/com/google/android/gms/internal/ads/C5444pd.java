package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pd */
/* compiled from: com.google.android.gms:play-services-ads-base@@20.6.0 */
public class C5444pd implements IInterface {

    /* renamed from: g */
    private final IBinder f21388g;

    /* renamed from: h */
    private final String f21389h;

    protected C5444pd(IBinder iBinder, String str) {
        this.f21388g = iBinder;
        this.f21389h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final Parcel mo20255C0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f21388g.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public final void mo20256K0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21388g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f21388g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public final void mo20258f2(int i, Parcel parcel) throws RemoteException {
        try {
            this.f21388g.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo20259z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21389h);
        return obtain;
    }
}
