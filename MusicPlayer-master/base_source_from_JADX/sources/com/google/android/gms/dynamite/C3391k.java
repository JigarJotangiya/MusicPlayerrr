package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7445a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7447c;

/* renamed from: com.google.android.gms.dynamite.k */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3391k extends C7445a implements IInterface {
    C3391k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: K0 */
    public final C4863a mo12011K0(C4863a aVar, String str, int i, C4863a aVar2) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C0.writeInt(i);
        C7447c.m41839c(C0, aVar2);
        Parcel z = mo28304z(2, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C02;
    }

    /* renamed from: f2 */
    public final C4863a mo12012f2(C4863a aVar, String str, int i, C4863a aVar2) throws RemoteException {
        Parcel C0 = mo28302C0();
        C7447c.m41839c(C0, aVar);
        C0.writeString(str);
        C0.writeInt(i);
        C7447c.m41839c(C0, aVar2);
        Parcel z = mo28304z(3, C0);
        C4863a C02 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C02;
    }
}
