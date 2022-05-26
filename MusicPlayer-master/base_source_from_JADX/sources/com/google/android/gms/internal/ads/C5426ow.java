package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.ow */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5426ow extends C5444pd implements C5537rw {
    C5426ow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: D5 */
    public final void mo20132D5(cb0 cb0) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, cb0);
        mo20256K0(11, z);
    }

    /* renamed from: I0 */
    public final void mo20133I0(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(4, z2);
    }

    /* renamed from: T0 */
    public final void mo20134T0(zzbkk zzbkk) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbkk);
        mo20256K0(14, z);
    }

    /* renamed from: c */
    public final String mo20135c() throws RemoteException {
        Parcel C0 = mo20255C0(9, mo20259z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: d */
    public final List<zzbtn> mo20136d() throws RemoteException {
        Parcel C0 = mo20255C0(13, mo20259z());
        ArrayList<zzbtn> createTypedArrayList = C0.createTypedArrayList(zzbtn.CREATOR);
        C0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: g2 */
    public final void mo20137g2(o70 o70) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, o70);
        mo20256K0(12, z);
    }

    /* renamed from: h */
    public final void mo20138h() throws RemoteException {
        mo20256K0(1, mo20259z());
    }

    /* renamed from: t4 */
    public final void mo20139t4(String str, C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString((String) null);
        C5518rd.m30064f(z, aVar);
        mo20256K0(6, z);
    }
}
