package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5353mx extends C5444pd implements C5427ox {
    C5353mx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: b2 */
    public final void mo15828b2(boolean z) throws RemoteException {
        Parcel z2 = mo20259z();
        C5518rd.m30061c(z2, z);
        mo20256K0(3, z2);
    }

    /* renamed from: c */
    public final float mo15829c() throws RemoteException {
        throw null;
    }

    /* renamed from: d */
    public final float mo15830d() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5575sx mo15832g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo20259z()
            r1 = 11
            android.os.Parcel r0 = r4.mo20255C0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C5575sx
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.sx r1 = (com.google.android.gms.internal.ads.C5575sx) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.qx r2 = new com.google.android.gms.internal.ads.qx
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5353mx.mo15832g():com.google.android.gms.internal.ads.sx");
    }

    /* renamed from: o3 */
    public final void mo15838o3(C5575sx sxVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, sxVar);
        mo20256K0(8, z);
    }

    public final float zze() throws RemoteException {
        throw null;
    }
}
