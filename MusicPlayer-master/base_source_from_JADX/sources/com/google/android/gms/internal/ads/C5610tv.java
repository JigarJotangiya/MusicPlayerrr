package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5610tv extends C5444pd implements C5684vv {
    C5610tv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: D2 */
    public final void mo19022D2(zzbnw zzbnw) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbnw);
        mo20256K0(6, z);
    }

    /* renamed from: T2 */
    public final void mo19026T2(d40 d40) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, d40);
        mo20256K0(10, z);
    }

    /* renamed from: v6 */
    public final void mo19032v6(C5314lv lvVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, lvVar);
        mo20256K0(2, z);
    }

    /* renamed from: w2 */
    public final void mo19033w2(String str, w30 w30, t30 t30) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        C5518rd.m30064f(z, w30);
        C5518rd.m30064f(z, t30);
        mo20256K0(5, z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5573sv zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 1
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C5573sv
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.sv r1 = (com.google.android.gms.internal.ads.C5573sv) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.qv r2 = new com.google.android.gms.internal.ads.qv
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5610tv.zze():com.google.android.gms.internal.ads.sv");
    }
}
