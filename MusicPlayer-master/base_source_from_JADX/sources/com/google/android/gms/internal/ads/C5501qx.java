package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5501qx extends C5444pd implements C5575sx {
    C5501qx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: d */
    public final void mo20521d() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    /* renamed from: e */
    public final void mo20522e() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: g */
    public final void mo20523g() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: w5 */
    public final void mo20524w5(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(5, z2);
    }

    public final void zze() throws RemoteException {
        mo20256K0(4, mo20259z());
    }
}
