package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gb0 extends C5444pd implements ib0 {
    gb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: F1 */
    public final void mo17155F1(j30 j30, String str) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, j30);
        z.writeString(str);
        mo20256K0(10, z);
    }

    /* renamed from: F2 */
    public final void mo17156F2(zzces zzces) throws RemoteException {
        throw null;
    }

    /* renamed from: G */
    public final void mo17157G() throws RemoteException {
        mo20256K0(20, mo20259z());
    }

    /* renamed from: R */
    public final void mo17158R() throws RemoteException {
        mo20256K0(15, mo20259z());
    }

    /* renamed from: T4 */
    public final void mo17159T4(int i) throws RemoteException {
        throw null;
    }

    /* renamed from: c */
    public final void mo17160c() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: d0 */
    public final void mo17161d0(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(21, z);
    }

    /* renamed from: e5 */
    public final void mo17162e5(String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        mo20256K0(9, z);
    }

    /* renamed from: f5 */
    public final void mo17163f5(th0 th0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, th0);
        mo20256K0(16, z);
    }

    /* renamed from: k */
    public final void mo17164k() throws RemoteException {
        mo20256K0(4, mo20259z());
    }

    /* renamed from: l */
    public final void mo17165l() throws RemoteException {
        mo20256K0(6, mo20259z());
    }

    /* renamed from: m */
    public final void mo17166m() throws RemoteException {
        mo20256K0(8, mo20259z());
    }

    /* renamed from: n0 */
    public final void mo17167n0(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(24, z);
    }

    /* renamed from: o1 */
    public final void mo17168o1(int i, String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        z.writeString(str);
        mo20256K0(22, z);
    }

    /* renamed from: t */
    public final void mo17169t() throws RemoteException {
        mo20256K0(11, mo20259z());
    }

    /* renamed from: u */
    public final void mo17170u() throws RemoteException {
        mo20256K0(18, mo20259z());
    }

    /* renamed from: w */
    public final void mo17171w(int i) throws RemoteException {
        Parcel z = mo20259z();
        z.writeInt(i);
        mo20256K0(3, z);
    }

    /* renamed from: x */
    public final void mo17172x() throws RemoteException {
        mo20256K0(13, mo20259z());
    }

    /* renamed from: x5 */
    public final void mo17173x5(zzbew zzbew) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbew);
        mo20256K0(23, z);
    }

    public final void zze() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    public final void zzp() throws RemoteException {
        mo20256K0(5, mo20259z());
    }
}
