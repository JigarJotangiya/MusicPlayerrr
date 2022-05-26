package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class db0 extends C5444pd implements fb0 {
    db0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: C */
    public final void mo16167C() throws RemoteException {
        mo20256K0(4, mo20259z());
    }

    /* renamed from: E */
    public final boolean mo16168E() throws RemoteException {
        Parcel C0 = mo20255C0(13, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: F */
    public final void mo16169F() throws RemoteException {
        mo20256K0(9, mo20259z());
    }

    /* renamed from: J */
    public final boolean mo16170J() throws RemoteException {
        Parcel C0 = mo20255C0(22, mo20259z());
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: J6 */
    public final void mo16171J6(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfi);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30064f(z, ib0);
        mo20256K0(6, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ob0 mo16172M() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 16
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.ob0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.ob0 r1 = (com.google.android.gms.internal.ads.ob0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.ob0 r2 = new com.google.android.gms.internal.ads.ob0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo16172M():com.google.android.gms.internal.ads.ob0");
    }

    /* renamed from: M3 */
    public final void mo16173M3(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(37, z);
    }

    /* renamed from: M4 */
    public final void mo16174M4(C4863a aVar, l70 l70, List<zzbtx> list) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, l70);
        z.writeTypedList(list);
        mo20256K0(31, z);
    }

    /* renamed from: N3 */
    public final void mo16175N3(C4863a aVar, ph0 ph0, List<String> list) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, ph0);
        z.writeStringList(list);
        mo20256K0(23, z);
    }

    /* renamed from: Q4 */
    public final void mo16176Q4(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0, zzbnw zzbnw, List<String> list) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30064f(z, ib0);
        C5518rd.m30062d(z, zzbnw);
        z.writeStringList(list);
        mo20256K0(14, z);
    }

    /* renamed from: T */
    public final void mo16177T() throws RemoteException {
        mo20256K0(8, mo20259z());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.nb0 mo16178U() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 15
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.nb0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.nb0 r1 = (com.google.android.gms.internal.ads.nb0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.nb0 r2 = new com.google.android.gms.internal.ads.nb0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo16178U():com.google.android.gms.internal.ads.nb0");
    }

    /* renamed from: U3 */
    public final void mo16179U3(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(25, z2);
    }

    /* renamed from: e */
    public final C5427ox mo16183e() throws RemoteException {
        Parcel C0 = mo20255C0(26, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: e4 */
    public final void mo16185e4(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(30, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.lb0 mo16187h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 36
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.lb0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.lb0 r1 = (com.google.android.gms.internal.ads.lb0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.jb0 r2 = new com.google.android.gms.internal.ads.jb0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo16187h():com.google.android.gms.internal.ads.lb0");
    }

    /* renamed from: h4 */
    public final void mo16188h4(C4863a aVar, zzbfi zzbfi, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfi);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30064f(z, ib0);
        mo20256K0(35, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.rb0 mo16189i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 27
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.rb0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.rb0 r1 = (com.google.android.gms.internal.ads.rb0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.pb0 r2 = new com.google.android.gms.internal.ads.pb0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.mo16189i():com.google.android.gms.internal.ads.rb0");
    }

    /* renamed from: j */
    public final zzcab mo16190j() throws RemoteException {
        Parcel C0 = mo20255C0(33, mo20259z());
        zzcab zzcab = (zzcab) C5518rd.m30059a(C0, zzcab.CREATOR);
        C0.recycle();
        return zzcab;
    }

    /* renamed from: k */
    public final C4863a mo16191k() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: l */
    public final void mo16192l() throws RemoteException {
        mo20256K0(5, mo20259z());
    }

    /* renamed from: m */
    public final zzcab mo16193m() throws RemoteException {
        Parcel C0 = mo20255C0(34, mo20259z());
        zzcab zzcab = (zzcab) C5518rd.m30059a(C0, zzcab.CREATOR);
        C0.recycle();
        return zzcab;
    }

    /* renamed from: m3 */
    public final void mo16194m3(C4863a aVar, zzbfd zzbfd, String str, String str2, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        z.writeString(str2);
        C5518rd.m30064f(z, ib0);
        mo20256K0(7, z);
    }

    /* renamed from: q2 */
    public final void mo16195q2(C4863a aVar, zzbfd zzbfd, String str, ph0 ph0, String str2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfd);
        z.writeString((String) null);
        C5518rd.m30064f(z, ph0);
        z.writeString(str2);
        mo20256K0(10, z);
    }

    /* renamed from: r3 */
    public final void mo16196r3(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        C5518rd.m30064f(z, ib0);
        mo20256K0(32, z);
    }

    /* renamed from: s */
    public final void mo16197s() throws RemoteException {
        mo20256K0(12, mo20259z());
    }

    /* renamed from: s1 */
    public final void mo16198s1(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(21, z);
    }

    /* renamed from: t5 */
    public final void mo16199t5(C4863a aVar, zzbfd zzbfd, String str, ib0 ib0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        C5518rd.m30064f(z, ib0);
        mo20256K0(28, z);
    }

    /* renamed from: x4 */
    public final void mo16200x4(zzbfd zzbfd, String str) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbfd);
        z.writeString(str);
        mo20256K0(11, z);
    }
}
