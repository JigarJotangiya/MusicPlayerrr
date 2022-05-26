package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5279kx extends C5481qd implements C5316lx {
    public C5279kx() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i == 2) {
            String c = mo18760c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 3) {
            return false;
        } else {
            List<zzbfm> d = mo18761d();
            parcel2.writeNoException();
            parcel2.writeTypedList(d);
        }
        return true;
    }
}
