package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C5444pd;
import com.google.android.gms.internal.ads.C5518rd;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.ads.internal.util.s0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3035s0 extends C5444pd implements C3041u0 {
    C3035s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        mo20256K0(2, z);
    }

    public final boolean zzf(C4863a aVar, String str, String str2) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        z.writeString(str);
        z.writeString(str2);
        Parcel C0 = mo20255C0(1, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }
}
