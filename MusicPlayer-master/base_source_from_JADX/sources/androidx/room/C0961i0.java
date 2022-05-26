package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.C0957h0;

/* renamed from: androidx.room.i0 */
/* compiled from: IMultiInstanceInvalidationService */
public interface C0961i0 extends IInterface {

    /* renamed from: androidx.room.i0$a */
    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class C0962a extends Binder implements C0961i0 {

        /* renamed from: androidx.room.i0$a$a */
        /* compiled from: IMultiInstanceInvalidationService */
        private static class C0963a implements C0961i0 {

            /* renamed from: h */
            public static C0961i0 f4144h;

            /* renamed from: g */
            private IBinder f4145g;

            C0963a(IBinder iBinder) {
                this.f4145g = iBinder;
            }

            public IBinder asBinder() {
                return this.f4145g;
            }

            /* renamed from: h2 */
            public int mo5437h2(C0957h0 h0Var, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(h0Var != null ? h0Var.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f4145g.transact(1, obtain, obtain2, 0) && C0962a.m5733C0() != null) {
                        return C0962a.m5733C0().mo5437h2(h0Var, str);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h6 */
            public void mo5438h6(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    if (this.f4145g.transact(3, obtain, (Parcel) null, 1) || C0962a.m5733C0() == null) {
                        obtain.recycle();
                    } else {
                        C0962a.m5733C0().mo5438h6(i, strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0962a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: C0 */
        public static C0961i0 m5733C0() {
            return C0963a.f4144h;
        }

        /* renamed from: z */
        public static C0961i0 m5734z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0961i0)) {
                return new C0963a(iBinder);
            }
            return (C0961i0) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int h2 = mo5437h2(C0957h0.C0958a.m5728z(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(h2);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5436I6(C0957h0.C0958a.m5728z(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo5438h6(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    /* renamed from: I6 */
    void mo5436I6(C0957h0 h0Var, int i) throws RemoteException;

    /* renamed from: h2 */
    int mo5437h2(C0957h0 h0Var, String str) throws RemoteException;

    /* renamed from: h6 */
    void mo5438h6(int i, String[] strArr) throws RemoteException;
}
