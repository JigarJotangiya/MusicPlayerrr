package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.hw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5167hw extends C5444pd implements C5241jw {
    C5167hw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5833zv mo10814C6(p159f.p243f.p245b.p246a.p248b.C4863a r1, com.google.android.gms.internal.ads.zzbfi r2, java.lang.String r3, com.google.android.gms.internal.ads.cb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r1)
            com.google.android.gms.internal.ads.C5518rd.m30062d(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r4)
            r1 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r5.writeInt(r1)
            r1 = 13
            android.os.Parcel r1 = r0.mo20255C0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0038
        L_0x0024:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C5833zv
            if (r4 == 0) goto L_0x0032
            r2 = r3
            com.google.android.gms.internal.ads.zv r2 = (com.google.android.gms.internal.ads.C5833zv) r2
            goto L_0x0038
        L_0x0032:
            com.google.android.gms.internal.ads.xv r3 = new com.google.android.gms.internal.ads.xv
            r3.<init>(r2)
            r2 = r3
        L_0x0038:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10814C6(f.f.b.a.b.a, com.google.android.gms.internal.ads.zzbfi, java.lang.String, com.google.android.gms.internal.ads.cb0, int):com.google.android.gms.internal.ads.zv");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5833zv mo10816E5(p159f.p243f.p245b.p246a.p248b.C4863a r1, com.google.android.gms.internal.ads.zzbfi r2, java.lang.String r3, com.google.android.gms.internal.ads.cb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r1)
            com.google.android.gms.internal.ads.C5518rd.m30062d(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r4)
            r1 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r5.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.mo20255C0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C5833zv
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.internal.ads.zv r2 = (com.google.android.gms.internal.ads.C5833zv) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.internal.ads.xv r3 = new com.google.android.gms.internal.ads.xv
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10816E5(f.f.b.a.b.a, com.google.android.gms.internal.ads.zzbfi, java.lang.String, com.google.android.gms.internal.ads.cb0, int):com.google.android.gms.internal.ads.zv");
    }

    /* renamed from: L4 */
    public final ok0 mo10817L4(C4863a aVar, cb0 cb0, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, cb0);
        z.writeInt(214106000);
        Parcel C0 = mo20255C0(14, z);
        ok0 e7 = nk0.m27906e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: U1 */
    public final le0 mo10818U1(C4863a aVar, cb0 cb0, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, cb0);
        z.writeInt(214106000);
        Parcel C0 = mo20255C0(15, z);
        le0 e7 = ke0.m26200e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* renamed from: V6 */
    public final wh0 mo10819V6(C4863a aVar, String str, cb0 cb0, int i) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        C5518rd.m30064f(z, cb0);
        z.writeInt(214106000);
        Parcel C0 = mo20255C0(12, z);
        wh0 e7 = vh0.m32385e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5833zv mo10820Y1(p159f.p243f.p245b.p246a.p248b.C4863a r1, com.google.android.gms.internal.ads.zzbfi r2, java.lang.String r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r1)
            com.google.android.gms.internal.ads.C5518rd.m30062d(r4, r2)
            r4.writeString(r3)
            r1 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r4.writeInt(r1)
            r1 = 10
            android.os.Parcel r1 = r0.mo20255C0(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C5833zv
            if (r4 == 0) goto L_0x002f
            r2 = r3
            com.google.android.gms.internal.ads.zv r2 = (com.google.android.gms.internal.ads.C5833zv) r2
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.internal.ads.xv r3 = new com.google.android.gms.internal.ads.xv
            r3.<init>(r2)
            r2 = r3
        L_0x0035:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10820Y1(f.f.b.a.b.a, com.google.android.gms.internal.ads.zzbfi, java.lang.String, int):com.google.android.gms.internal.ads.zv");
    }

    /* renamed from: a0 */
    public final xe0 mo10821a0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(8, z);
        xe0 e7 = we0.m33106e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5833zv mo10822a5(p159f.p243f.p245b.p246a.p248b.C4863a r1, com.google.android.gms.internal.ads.zzbfi r2, java.lang.String r3, com.google.android.gms.internal.ads.cb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r1)
            com.google.android.gms.internal.ads.C5518rd.m30062d(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C5518rd.m30064f(r5, r4)
            r1 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r5.writeInt(r1)
            r1 = 2
            android.os.Parcel r1 = r0.mo20255C0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C5833zv
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.internal.ads.zv r2 = (com.google.android.gms.internal.ads.C5833zv) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.internal.ads.xv r3 = new com.google.android.gms.internal.ads.xv
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10822a5(f.f.b.a.b.a, com.google.android.gms.internal.ads.zzbfi, java.lang.String, com.google.android.gms.internal.ads.cb0, int):com.google.android.gms.internal.ads.zv");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5684vv mo10823i2(p159f.p243f.p245b.p246a.p248b.C4863a r1, java.lang.String r2, com.google.android.gms.internal.ads.cb0 r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r3)
            r1 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r4.writeInt(r1)
            r1 = 3
            android.os.Parcel r1 = r0.mo20255C0(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C5684vv
            if (r4 == 0) goto L_0x002e
            r2 = r3
            com.google.android.gms.internal.ads.vv r2 = (com.google.android.gms.internal.ads.C5684vv) r2
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.tv r3 = new com.google.android.gms.internal.ads.tv
            r3.<init>(r2)
            r2 = r3
        L_0x0034:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10823i2(f.f.b.a.b.a, java.lang.String, com.google.android.gms.internal.ads.cb0, int):com.google.android.gms.internal.ads.vv");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5537rw mo10824q0(p159f.p243f.p245b.p246a.p248b.C4863a r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r4 = r2.mo20259z()
            com.google.android.gms.internal.ads.C5518rd.m30064f(r4, r3)
            r3 = 214106000(0xcc2ff90, float:3.0044244E-31)
            r4.writeInt(r3)
            r3 = 9
            android.os.Parcel r3 = r2.mo20255C0(r3, r4)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x001b
            r4 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C5537rw
            if (r1 == 0) goto L_0x0029
            r4 = r0
            com.google.android.gms.internal.ads.rw r4 = (com.google.android.gms.internal.ads.C5537rw) r4
            goto L_0x002f
        L_0x0029:
            com.google.android.gms.internal.ads.ow r0 = new com.google.android.gms.internal.ads.ow
            r0.<init>(r4)
            r4 = r0
        L_0x002f:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5167hw.mo10824q0(f.f.b.a.b.a, int):com.google.android.gms.internal.ads.rw");
    }

    /* renamed from: x0 */
    public final u20 mo10826x0(C4863a aVar, C4863a aVar2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        C5518rd.m30064f(z, aVar2);
        Parcel C0 = mo20255C0(5, z);
        u20 e7 = t20.m31028e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }
}
