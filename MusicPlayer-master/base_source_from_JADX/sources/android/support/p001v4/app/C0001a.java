package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.a */
/* compiled from: INotificationSideChannel */
public interface C0001a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0002a extends Binder implements C0001a {

        /* renamed from: android.support.v4.app.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C0003a implements C0001a {

            /* renamed from: h */
            public static C0001a f0h;

            /* renamed from: g */
            private IBinder f1g;

            C0003a(IBinder iBinder) {
                this.f1g = iBinder;
            }

            /* renamed from: W3 */
            public void mo1W3(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f1g.transact(2, obtain, (Parcel) null, 1) || C0002a.m5C0() == null) {
                        obtain.recycle();
                    } else {
                        C0002a.m5C0().mo1W3(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1g;
            }

            /* renamed from: c2 */
            public void mo2c2(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f1g.transact(3, obtain, (Parcel) null, 1) || C0002a.m5C0() == null) {
                        obtain.recycle();
                    } else {
                        C0002a.m5C0().mo2c2(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: r6 */
            public void mo3r6(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1g.transact(1, obtain, (Parcel) null, 1) || C0002a.m5C0() == null) {
                        obtain.recycle();
                    } else {
                        C0002a.m5C0().mo3r6(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0002a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: C0 */
        public static C0001a m5C0() {
            return C0003a.f0h;
        }

        /* renamed from: z */
        public static C0001a m6z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0001a)) {
                return new C0003a(iBinder);
            }
            return (C0001a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo3r6(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo1W3(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                mo2c2(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    /* renamed from: W3 */
    void mo1W3(String str, int i, String str2) throws RemoteException;

    /* renamed from: c2 */
    void mo2c2(String str) throws RemoteException;

    /* renamed from: r6 */
    void mo3r6(String str, int i, String str2, Notification notification) throws RemoteException;
}
