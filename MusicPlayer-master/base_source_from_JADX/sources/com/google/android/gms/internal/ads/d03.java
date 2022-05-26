package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d03 extends C5444pd implements f03 {
    d03(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* renamed from: B0 */
    public final void mo16808B0(int[] iArr) throws RemoteException {
        Parcel z = mo20259z();
        z.writeIntArray((int[]) null);
        mo20256K0(4, z);
    }

    /* renamed from: H */
    public final void mo16809H(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(6, z);
    }

    /* renamed from: c */
    public final void mo16810c() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: i6 */
    public final void mo16811i6(C4863a aVar, String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        z.writeString((String) null);
        mo20256K0(8, z);
    }

    /* renamed from: j0 */
    public final void mo16812j0(byte[] bArr) throws RemoteException {
        Parcel z = mo20259z();
        z.writeByteArray(bArr);
        mo20256K0(5, z);
    }

    /* renamed from: w */
    public final void mo16813w(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(7, z);
    }
}
