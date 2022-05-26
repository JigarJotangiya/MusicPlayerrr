package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kg0 extends C5444pd implements mg0 {
    kg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: E3 */
    public final void mo17045E3(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, parcelFileDescriptor);
        mo20256K0(1, z);
    }

    /* renamed from: b7 */
    public final void mo17046b7(zzbd zzbd) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30062d(z, zzbd);
        mo20256K0(2, z);
    }
}
