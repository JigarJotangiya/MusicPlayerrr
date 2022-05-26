package p079d.p080a.p081a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: d.a.a.b */
/* compiled from: ICustomTabsService */
public interface C3395b extends IInterface {

    /* renamed from: d.a.a.b$a */
    /* compiled from: ICustomTabsService */
    public static abstract class C3396a extends Binder implements C3395b {

        /* renamed from: d.a.a.b$a$a */
        /* compiled from: ICustomTabsService */
        private static class C3397a implements C3395b {

            /* renamed from: g */
            private IBinder f10809g;

            C3397a(IBinder iBinder) {
                this.f10809g = iBinder;
            }

            public IBinder asBinder() {
                return this.f10809g;
            }

            /* renamed from: i3 */
            public boolean mo2248i3(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f10809g.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l4 */
            public boolean mo2250l4(C3392a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = false;
                    this.f10809g.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3396a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: z */
        public static C3395b m14535z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3395b)) {
                return new C3397a(iBinder);
            }
            return (C3395b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "android.support.customtabs.ICustomTabsService"
                r2 = 1
                if (r5 == r0) goto L_0x014a
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x0138;
                    case 3: goto L_0x0122;
                    case 4: goto L_0x00e8;
                    case 5: goto L_0x00bd;
                    case 6: goto L_0x0098;
                    case 7: goto L_0x0073;
                    case 8: goto L_0x004a;
                    case 9: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                int r8 = r6.readInt()
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x002f
                android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                android.net.Uri r1 = (android.net.Uri) r1
                goto L_0x0030
            L_0x002f:
                r1 = r0
            L_0x0030:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.mo2251n1(r5, r8, r1, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x004a:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                java.lang.String r8 = r6.readString()
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0068
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0068:
                int r5 = r4.mo2246X3(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0073:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x008d
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x008d:
                boolean r5 = r4.mo2253u5(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0098:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00b2:
                boolean r5 = r4.mo2247Z4(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x00bd:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d3
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00d3:
                android.os.Bundle r5 = r4.mo2252s2(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00e3
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x00e7
            L_0x00e3:
                r5 = 0
                r7.writeInt(r5)
            L_0x00e7:
                return r2
            L_0x00e8:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0102
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0103
            L_0x0102:
                r8 = r0
            L_0x0103:
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0111
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0111:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r1)
                boolean r5 = r4.mo2249j1(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0122:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                d.a.a.a r5 = p079d.p080a.p081a.C3392a.C3393a.m14521z(r5)
                boolean r5 = r4.mo2250l4(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0138:
                r6.enforceInterface(r1)
                long r5 = r6.readLong()
                boolean r5 = r4.mo2248i3(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x014a:
                r7.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p079d.p080a.p081a.C3395b.C3396a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: X3 */
    int mo2246X3(C3392a aVar, String str, Bundle bundle) throws RemoteException;

    /* renamed from: Z4 */
    boolean mo2247Z4(C3392a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: i3 */
    boolean mo2248i3(long j) throws RemoteException;

    /* renamed from: j1 */
    boolean mo2249j1(C3392a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: l4 */
    boolean mo2250l4(C3392a aVar) throws RemoteException;

    /* renamed from: n1 */
    boolean mo2251n1(C3392a aVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: s2 */
    Bundle mo2252s2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: u5 */
    boolean mo2253u5(C3392a aVar, Uri uri) throws RemoteException;
}
