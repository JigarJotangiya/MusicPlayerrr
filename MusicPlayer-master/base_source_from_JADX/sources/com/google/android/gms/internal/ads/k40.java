package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k40 extends C5444pd implements m40 {
    k40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: e */
    public final C5427ox mo18803e() throws RemoteException {
        Parcel C0 = mo20255C0(11, mo20259z());
        C5427ox e7 = C5390nx.m28127e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j20 mo18804g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 14
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.j20
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.j20 r1 = (com.google.android.gms.internal.ads.j20) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.g20 r2 = new com.google.android.gms.internal.ads.g20
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo18804g():com.google.android.gms.internal.ads.j20");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.n20 mo18805h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 29
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.n20
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.n20 r1 = (com.google.android.gms.internal.ads.n20) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.l20 r2 = new com.google.android.gms.internal.ads.l20
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo18805h():com.google.android.gms.internal.ads.n20");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.q20 mo18806i() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 5
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.q20
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.q20 r1 = (com.google.android.gms.internal.ads.q20) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.o20 r2 = new com.google.android.gms.internal.ads.o20
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k40.mo18806i():com.google.android.gms.internal.ads.q20");
    }

    /* renamed from: j */
    public final C4863a mo18807j() throws RemoteException {
        Parcel C0 = mo20255C0(19, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: k */
    public final String mo18808k() throws RemoteException {
        Parcel C0 = mo20255C0(7, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo18809l() throws RemoteException {
        Parcel C0 = mo20255C0(4, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: m */
    public final C4863a mo18810m() throws RemoteException {
        Parcel C0 = mo20255C0(18, mo20259z());
        C4863a C02 = C4863a.C4864a.m20501C0(C0.readStrongBinder());
        C0.recycle();
        return C02;
    }

    /* renamed from: n */
    public final String mo18811n() throws RemoteException {
        Parcel C0 = mo20255C0(9, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo18812o() throws RemoteException {
        Parcel C0 = mo20255C0(2, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: t */
    public final List mo18813t() throws RemoteException {
        Parcel C0 = mo20255C0(23, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }

    /* renamed from: u */
    public final List mo18814u() throws RemoteException {
        Parcel C0 = mo20255C0(3, mo20259z());
        ArrayList b = C5518rd.m30060b(C0);
        C0.recycle();
        return b;
    }

    public final double zze() throws RemoteException {
        Parcel C0 = mo20255C0(8, mo20259z());
        double readDouble = C0.readDouble();
        C0.recycle();
        return readDouble;
    }

    public final String zzp() throws RemoteException {
        Parcel C0 = mo20255C0(6, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel C0 = mo20255C0(10, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }
}
