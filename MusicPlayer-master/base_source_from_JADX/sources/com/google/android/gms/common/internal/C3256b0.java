package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p293c.p296c.C7439a;
import p159f.p243f.p245b.p246a.p293c.p296c.C7441c;

/* renamed from: com.google.android.gms.common.internal.b0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3256b0 extends C7439a implements IInterface {
    C3256b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: l3 */
    public final C4863a mo11764l3(C4863a aVar, zax zax) throws RemoteException {
        Parcel z = mo28299z();
        C7441c.m41833c(z, aVar);
        C7441c.m41832b(z, zax);
        Parcel C0 = mo28295C0(2, z);
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }
}
