package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0075a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0076a extends Binder implements C0075a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0077a implements C0075a {

            /* renamed from: h */
            public static C0075a f206h;

            /* renamed from: g */
            private IBinder f207g;

            C0077a(IBinder iBinder) {
                this.f207g = iBinder;
            }

            /* renamed from: X6 */
            public void mo378X6(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f207g.transact(1, obtain, (Parcel) null, 1) || C0076a.m444C0() == null) {
                        obtain.recycle();
                    } else {
                        C0076a.m444C0().mo378X6(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f207g;
            }
        }

        public C0076a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: C0 */
        public static C0075a m444C0() {
            return C0077a.f206h;
        }

        /* renamed from: z */
        public static C0075a m445z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0075a)) {
                return new C0077a(iBinder);
            }
            return (C0075a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo378X6(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: X6 */
    void mo378X6(int i, Bundle bundle) throws RemoteException;
}
