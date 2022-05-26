package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7445a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7447c;

/* renamed from: com.google.android.gms.dynamite.j */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3390j extends C7445a implements IInterface {
    C3390j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: F5 */
    public final C4863a mo12004F5(C4863a aVar, String str, boolean z, long j) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C7447c.m41837a(C0, z);
        C0.writeLong(j);
        Parcel z2 = mo28304z(7, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z2.readStrongBinder());
        z2.recycle();
        return C02;
    }

    /* renamed from: K0 */
    public final C4863a mo12005K0(C4863a aVar, String str, int i) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C0.writeInt(i);
        Parcel z = mo28304z(2, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C02;
    }

    /* renamed from: d7 */
    public final C4863a mo12006d7(C4863a aVar, String str, int i, C4863a aVar2) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C0.writeInt(i);
        C7447c.m41839c(C0, aVar2);
        Parcel z = mo28304z(8, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C02;
    }

    /* renamed from: f2 */
    public final int mo12007f2(C4863a aVar, String str, boolean z) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C7447c.m41837a(C0, z);
        Parcel z2 = mo28304z(3, C0);
        int readInt = z2.readInt();
        z2.recycle();
        return readInt;
    }

    /* renamed from: l3 */
    public final C4863a mo12008l3(C4863a aVar, String str, int i) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C0.writeInt(i);
        Parcel z = mo28304z(4, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C02;
    }

    /* renamed from: o5 */
    public final int mo12009o5() throws RemoteException {
        Parcel z = mo28304z(6, mo28302C0());
        int readInt = z.readInt();
        z.recycle();
        return readInt;
    }

    /* renamed from: y3 */
    public final int mo12010y3(C4863a aVar, String str, boolean z) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C7447c.m41837a(C0, z);
        Parcel z2 = mo28304z(5, C0);
        int readInt = z2.readInt();
        z2.recycle();
        return readInt;
    }
}
