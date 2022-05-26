package p079d.p080a.p081a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d.a.a.a */
/* compiled from: ICustomTabsCallback */
public interface C3392a extends IInterface {

    /* renamed from: d.a.a.a$a */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C3393a extends Binder implements C3392a {

        /* renamed from: d.a.a.a$a$a */
        /* compiled from: ICustomTabsCallback */
        private static class C3394a implements C3392a {

            /* renamed from: g */
            private IBinder f10808g;

            C3394a(IBinder iBinder) {
                this.f10808g = iBinder;
            }

            public IBinder asBinder() {
                return this.f10808g;
            }

            /* renamed from: e6 */
            public void mo2265e6(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10808g.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h5 */
            public void mo2266h5(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10808g.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m6 */
            public void mo2267m6(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10808g.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t6 */
            public void mo2268t6(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10808g.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: y4 */
            public void mo2269y4(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10808g.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3393a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: z */
        public static C3392a m14521z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3392a)) {
                return new C3394a(iBinder);
            }
            return (C3392a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                r3 = 1
                if (r5 == r0) goto L_0x00aa
                r0 = 3
                if (r5 == r0) goto L_0x008d
                r0 = 4
                if (r5 == r0) goto L_0x0074
                r0 = 5
                if (r5 == r0) goto L_0x0057
                r0 = 6
                if (r5 == r0) goto L_0x0021
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x001d
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x001d:
                r7.writeString(r2)
                return r3
            L_0x0021:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0037
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0038
            L_0x0037:
                r8 = r1
            L_0x0038:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0040
                r0 = 1
                goto L_0x0041
            L_0x0040:
                r0 = 0
            L_0x0041:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0050
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r1.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0050:
                r4.mo2268t6(r5, r8, r0, r1)
                r7.writeNoException()
                return r3
            L_0x0057:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x006d
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x006d:
                r4.mo2265e6(r5, r1)
                r7.writeNoException()
                return r3
            L_0x0074:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0086
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0086:
                r4.mo2267m6(r1)
                r7.writeNoException()
                return r3
            L_0x008d:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00a3
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00a3:
                r4.mo2269y4(r5, r1)
                r7.writeNoException()
                return r3
            L_0x00aa:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00c0
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00c0:
                r4.mo2266h5(r5, r1)
                r7.writeNoException()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p079d.p080a.p081a.C3392a.C3393a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: e6 */
    void mo2265e6(String str, Bundle bundle) throws RemoteException;

    /* renamed from: h5 */
    void mo2266h5(int i, Bundle bundle) throws RemoteException;

    /* renamed from: m6 */
    void mo2267m6(Bundle bundle) throws RemoteException;

    /* renamed from: t6 */
    void mo2268t6(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: y4 */
    void mo2269y4(String str, Bundle bundle) throws RemoteException;
}
