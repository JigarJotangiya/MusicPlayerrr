package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ab0 extends C5444pd implements cb0 {
    ab0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: b0 */
    public final bd0 mo15736b0(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        Parcel C0 = mo20255C0(3, z);
        bd0 e7 = ad0.m20673e7(C0.readStrongBinder());
        C0.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.fb0 mo15737p(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo20259z()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo20255C0(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.fb0
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.fb0 r0 = (com.google.android.gms.internal.ads.fb0) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.db0 r1 = new com.google.android.gms.internal.ads.db0
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ab0.mo15737p(java.lang.String):com.google.android.gms.internal.ads.fb0");
    }

    /* renamed from: q */
    public final boolean mo15738q(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        Parcel C0 = mo20255C0(4, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }

    /* renamed from: v */
    public final boolean mo15739v(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        Parcel C0 = mo20255C0(2, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }
}
