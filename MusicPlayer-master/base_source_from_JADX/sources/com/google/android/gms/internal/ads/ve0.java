package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ve0 extends C5444pd implements xe0 {
    ve0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: F */
    public final boolean mo10868F() throws RemoteException {
        Parcel C0 = mo20255C0(11, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: K */
    public final void mo10870K(Bundle bundle) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, bundle);
        Parcel C0 = mo20255C0(6, z);
        if (C0.readInt() != 0) {
            bundle.readFromParcel(C0);
        }
        C0.recycle();
    }

    /* renamed from: U4 */
    public final void mo10872U4(Bundle bundle) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, bundle);
        mo20256K0(1, z);
    }

    /* renamed from: Y */
    public final void mo10873Y(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(13, z);
    }

    /* renamed from: b3 */
    public final void mo10876b3(int i, int i2, Intent intent) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        z.writeInt(i2);
        C5518rd.m30062d(z, intent);
        mo20256K0(12, z);
    }

    /* renamed from: e */
    public final void mo10878e() throws RemoteException {
        mo20256K0(10, mo20259z());
    }

    /* renamed from: j */
    public final void mo10882j() throws RemoteException {
        mo20256K0(8, mo20259z());
    }

    /* renamed from: k */
    public final void mo10885k() throws RemoteException {
        mo20256K0(5, mo20259z());
    }

    /* renamed from: l */
    public final void mo10887l() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: n */
    public final void mo10891n() throws RemoteException {
        mo20256K0(14, mo20259z());
    }

    /* renamed from: t */
    public final void mo10892t() throws RemoteException {
        mo20256K0(9, mo20259z());
    }

    public final void zzp() throws RemoteException {
        mo20256K0(4, mo20259z());
    }

    public final void zzr() throws RemoteException {
        mo20256K0(3, mo20259z());
    }

    public final void zzs() throws RemoteException {
        mo20256K0(7, mo20259z());
    }
}
