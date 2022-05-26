package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7445a;

/* renamed from: com.google.android.gms.common.internal.h1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3282h1 extends C7445a implements C3288j1 {
    C3282h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: f */
    public final C4863a mo11848f() throws RemoteException {
        Parcel z = mo28304z(1, mo28302C0());
        C4863a C0 = C4863a.C4864a.m20501C0(z.readStrongBinder());
        z.recycle();
        return C0;
    }

    public final int zze() throws RemoteException {
        Parcel z = mo28304z(2, mo28302C0());
        int readInt = z.readInt();
        z.recycle();
        return readInt;
    }
}
