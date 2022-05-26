package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5759xw extends C5481qd implements C5797yw {
    public C5759xw() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: e7 */
    public static C5797yw m33857e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof C5797yw ? (C5797yw) queryLocalInterface : new C5722ww(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i != 2) {
            return false;
        } else {
            String c = mo17043c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        }
        return true;
    }
}
