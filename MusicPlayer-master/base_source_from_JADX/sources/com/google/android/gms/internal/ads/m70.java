package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class m70 extends C5444pd implements o70 {
    m70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: d5 */
    public final void mo16424d5(List<zzbtn> list) throws RemoteException {
        Parcel z = mo20259z();
        z.writeTypedList(list);
        mo20256K0(1, z);
    }
}
