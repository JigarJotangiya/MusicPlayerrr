package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class nv2 extends C5444pd implements pv2 {
    nv2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: H5 */
    public final C4863a mo19846H5(String str, C4863a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        C5518rd.m30064f(z, aVar);
        z.writeString(BuildConfig.FLAVOR);
        z.writeString("javascript");
        z.writeString(str4);
        z.writeString("Google");
        z.writeString(str6);
        z.writeString(str7);
        z.writeString(str8);
        Parcel C0 = mo20255C0(11, z);
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: P4 */
    public final C4863a mo19847P4(String str, C4863a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        C5518rd.m30064f(z, aVar);
        z.writeString(BuildConfig.FLAVOR);
        z.writeString("javascript");
        z.writeString(str4);
        z.writeString(str5);
        z.writeString(str6);
        z.writeString(str7);
        z.writeString(str8);
        Parcel C0 = mo20255C0(10, z);
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: X */
    public final void mo19848X(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(7, z);
    }

    /* renamed from: a0 */
    public final boolean mo19849a0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(2, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: d */
    public final String mo19850d() throws RemoteException {
        Parcel C0 = mo20255C0(6, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: k3 */
    public final void mo19851k3(C4863a aVar, C4863a aVar2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        mo20256K0(5, z);
    }

    /* renamed from: u0 */
    public final void mo19852u0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(4, z);
    }

    /* renamed from: x0 */
    public final void mo19853x0(C4863a aVar, C4863a aVar2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        mo20256K0(8, z);
    }
}
