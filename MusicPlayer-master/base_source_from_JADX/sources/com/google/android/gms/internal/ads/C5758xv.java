package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.xv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5758xv extends C5444pd implements C5833zv {
    C5758xv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: B1 */
    public final void mo10924B1(C5389nw nwVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, nwVar);
        mo20256K0(45, z);
    }

    /* renamed from: G */
    public final void mo10926G() throws RemoteException {
        mo20256K0(2, mo20259z());
    }

    /* renamed from: I */
    public final void mo10927I() throws RemoteException {
        mo20256K0(6, mo20259z());
    }

    /* renamed from: O */
    public final void mo10933O() throws RemoteException {
        mo20256K0(5, mo20259z());
    }

    /* renamed from: O5 */
    public final boolean mo10934O5(zzbfd zzbfd) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        Parcel C0 = mo20255C0(4, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, ivVar);
        mo20256K0(20, z);
    }

    /* renamed from: R6 */
    public final void mo10936R6(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(22, z2);
    }

    /* renamed from: S6 */
    public final void mo10937S6(zzbkq zzbkq) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbkq);
        mo20256K0(29, z);
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfo);
        mo20256K0(39, z);
    }

    /* renamed from: d */
    public final zzbfi mo10940d() throws RemoteException {
        Parcel C0 = mo20255C0(12, mo20259z());
        zzbfi zzbfi = (zzbfi) C5518rd.m30059a(C0, zzbfi.CREATOR);
        C0.recycle();
        return zzbfi;
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, ixVar);
        mo20256K0(42, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5316lx mo10947i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 41
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C5316lx
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.lx r1 = (com.google.android.gms.internal.ads.C5316lx) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.jx r2 = new com.google.android.gms.internal.ads.jx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5758xv.mo10947i():com.google.android.gms.internal.ads.lx");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5427ox mo10948j() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 26
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C5427ox
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ox r1 = (com.google.android.gms.internal.ads.C5427ox) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.mx r2 = new com.google.android.gms.internal.ads.mx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5758xv.mo10948j():com.google.android.gms.internal.ads.ox");
    }

    /* renamed from: k */
    public final C4863a mo10950k() throws RemoteException {
        Parcel C0 = mo20255C0(1, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, gwVar);
        mo20256K0(8, z);
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, lvVar);
        mo20256K0(7, z);
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, woVar);
        mo20256K0(40, z);
    }

    /* renamed from: s5 */
    public final void mo10958s5(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(34, z2);
    }

    /* renamed from: v5 */
    public final void mo10960v5(zzbfi zzbfi) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfi);
        mo20256K0(13, z);
    }

    /* renamed from: x1 */
    public final void mo10961x1(zzbfd zzbfd, C5462pv pvVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        C5518rd.m30064f(z, pvVar);
        mo20256K0(43, z);
    }

    /* renamed from: x2 */
    public final void mo10962x2(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(44, z);
    }

    public final String zzr() throws RemoteException {
        Parcel C0 = mo20255C0(31, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
