package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5536rv extends C5481qd implements C5573sv {
    public C5536rv() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo15719r4((zzbfd) C5518rd.m30059a(parcel, zzbfd.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i == 3) {
            boolean g = mo15718g();
            parcel2.writeNoException();
            C5518rd.m30061c(parcel2, g);
        } else if (i == 4) {
            String c = mo15717c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 5) {
            return false;
        } else {
            mo15716Y0((zzbfd) C5518rd.m30059a(parcel, zzbfd.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
