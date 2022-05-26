package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: androidx.room.h0 */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface C0957h0 extends IInterface {

    /* renamed from: androidx.room.h0$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C0958a extends Binder implements C0957h0 {

        /* renamed from: androidx.room.h0$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        private static class C0959a implements C0957h0 {

            /* renamed from: h */
            public static C0957h0 f4141h;

            /* renamed from: g */
            private IBinder f4142g;

            C0959a(IBinder iBinder) {
                this.f4142g = iBinder;
            }

            /* renamed from: C1 */
            public void mo5481C1(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (this.f4142g.transact(1, obtain, (Parcel) null, 1) || C0958a.m5727C0() == null) {
                        obtain.recycle();
                    } else {
                        C0958a.m5727C0().mo5481C1(strArr);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4142g;
            }
        }

        public C0958a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: C0 */
        public static C0957h0 m5727C0() {
            return C0959a.f4141h;
        }

        /* renamed from: z */
        public static C0957h0 m5728z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0957h0)) {
                return new C0959a(iBinder);
            }
            return (C0957h0) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo5481C1(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: C1 */
    void mo5481C1(String[] strArr) throws RemoteException;
}
