package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class lg0 extends C5481qd implements mg0 {
    public lg0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo17045E3((ParcelFileDescriptor) C5518rd.m30059a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo17046b7((zzbd) C5518rd.m30059a(parcel, zzbd.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
