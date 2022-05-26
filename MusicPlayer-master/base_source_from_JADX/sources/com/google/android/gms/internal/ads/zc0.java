package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zc0 extends C5444pd implements bd0 {
    zc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: A0 */
    public final boolean mo16202A0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(17, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: E1 */
    public final void mo16203E1(String str, String str2, zzbfd zzbfd, C4863a aVar, pc0 pc0, ib0 ib0, zzbfi zzbfi) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, pc0);
        C5518rd.m30064f(z, ib0);
        C5518rd.m30062d(z, zzbfi);
        mo20256K0(13, z);
    }

    /* renamed from: I1 */
    public final void mo16204I1(String str, String str2, zzbfd zzbfd, C4863a aVar, sc0 sc0, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, sc0);
        C5518rd.m30064f(z, ib0);
        mo20256K0(14, z);
    }

    /* renamed from: S3 */
    public final void mo16205S3(String str, String str2, zzbfd zzbfd, C4863a aVar, vc0 vc0, ib0 ib0, zzbnw zzbnw) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, vc0);
        C5518rd.m30064f(z, ib0);
        C5518rd.m30062d(z, zzbnw);
        mo20256K0(22, z);
    }

    /* renamed from: Z2 */
    public final void mo16206Z2(String str, String str2, zzbfd zzbfd, C4863a aVar, yc0 yc0, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, yc0);
        C5518rd.m30064f(z, ib0);
        mo20256K0(16, z);
    }

    /* renamed from: b1 */
    public final void mo16207b1(String str, String str2, zzbfd zzbfd, C4863a aVar, pc0 pc0, ib0 ib0, zzbfi zzbfi) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, pc0);
        C5518rd.m30064f(z, ib0);
        C5518rd.m30062d(z, zzbfi);
        mo20256K0(21, z);
    }

    /* renamed from: c */
    public final zzcab mo16208c() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        zzcab zzcab = (zzcab) C5518rd.m30059a(C0, zzcab.CREATOR);
        C0.recycle();
        return zzcab;
    }

    /* renamed from: d */
    public final zzcab mo16209d() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        zzcab zzcab = (zzcab) C5518rd.m30059a(C0, zzcab.CREATOR);
        C0.recycle();
        return zzcab;
    }

    /* renamed from: g3 */
    public final void mo16210g3(C4863a aVar, String str, Bundle bundle, Bundle bundle2, zzbfi zzbfi, ed0 ed0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        C5518rd.m30062d(z, bundle);
        C5518rd.m30062d(z, bundle2);
        C5518rd.m30062d(z, zzbfi);
        C5518rd.m30064f(z, ed0);
        mo20256K0(1, z);
    }

    /* renamed from: k0 */
    public final boolean mo16211k0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(15, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: l2 */
    public final void mo16212l2(String str, String str2, zzbfd zzbfd, C4863a aVar, yc0 yc0, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, yc0);
        C5518rd.m30064f(z, ib0);
        mo20256K0(20, z);
    }

    /* renamed from: p0 */
    public final void mo16213p0(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(19, z);
    }

    /* renamed from: z1 */
    public final void mo16214z1(String str, String str2, zzbfd zzbfd, C4863a aVar, vc0 vc0, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, vc0);
        C5518rd.m30064f(z, ib0);
        mo20256K0(18, z);
    }

    public final C5427ox zze() throws RemoteException {
        Parcel C0 = mo20255C0(5, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }
}
