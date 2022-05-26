package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gg0 extends C5444pd implements ig0 {
    gg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: L0 */
    public final void mo17906L0(zzcdq zzcdq, mg0 mg0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzcdq);
        C5518rd.m30064f(z, mg0);
        mo20256K0(5, z);
    }

    /* renamed from: O0 */
    public final void mo17907O0(String str, mg0 mg0) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        C5518rd.m30064f(z, mg0);
        mo20256K0(7, z);
    }

    /* renamed from: c3 */
    public final void mo17908c3(zzcdq zzcdq, mg0 mg0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzcdq);
        C5518rd.m30064f(z, mg0);
        mo20256K0(4, z);
    }

    /* renamed from: v1 */
    public final void mo17909v1(zzcdq zzcdq, mg0 mg0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzcdq);
        C5518rd.m30064f(z, mg0);
        mo20256K0(6, z);
    }
}
