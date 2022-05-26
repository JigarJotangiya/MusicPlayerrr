package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.sd */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5555sd extends C5444pd implements C5629ud {
    C5555sd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: B0 */
    public final void mo20823B0(int[] iArr) throws RemoteException {
        Parcel z = mo20259z();
        z.writeIntArray((int[]) null);
        mo20256K0(4, z);
    }

    /* renamed from: H */
    public final void mo20824H(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(0);
        mo20256K0(6, z);
    }

    /* renamed from: K4 */
    public final void mo20825K4(C4863a aVar, String str) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString("GMA_SDK");
        mo20256K0(2, z);
    }

    /* renamed from: c */
    public final void mo20826c() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: j0 */
    public final void mo20827j0(byte[] bArr) throws RemoteException {
        Parcel z = mo20259z();
        z.writeByteArray(bArr);
        mo20256K0(5, z);
    }

    /* renamed from: w */
    public final void mo20828w(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(7, z);
    }
}
