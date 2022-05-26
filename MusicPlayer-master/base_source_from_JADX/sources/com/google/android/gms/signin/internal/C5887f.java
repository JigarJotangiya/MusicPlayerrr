package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p293c.p296c.C7439a;
import p159f.p243f.p245b.p246a.p293c.p296c.C7441c;

/* renamed from: com.google.android.gms.signin.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C5887f extends C7439a implements IInterface {
    C5887f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: l3 */
    public final void mo22729l3(zai zai, C5886e eVar) throws RemoteException {
        Parcel z = mo28299z();
        C7441c.m41832b(z, zai);
        C7441c.m41833c(z, eVar);
        mo28296K0(12, z);
    }
}
