package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5499qv extends C5444pd implements C5573sv {
    C5499qv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: Y0 */
    public final void mo15716Y0(zzbfd zzbfd, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        z.writeInt(i);
        mo20256K0(5, z);
    }

    /* renamed from: g */
    public final boolean mo15718g() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: r4 */
    public final void mo15719r4(zzbfd zzbfd) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        mo20256K0(1, z);
    }
}
