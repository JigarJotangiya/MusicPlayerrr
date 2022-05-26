package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class h20 extends C5481qd implements j20 {
    public h20() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: e7 */
    public static j20 m24627e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof j20 ? (j20) queryLocalInterface : new g20(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String d = mo15649d();
            parcel2.writeNoException();
            parcel2.writeString(d);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<q20> e = mo15650e();
            parcel2.writeNoException();
            parcel2.writeList(e);
            return true;
        }
    }
}
