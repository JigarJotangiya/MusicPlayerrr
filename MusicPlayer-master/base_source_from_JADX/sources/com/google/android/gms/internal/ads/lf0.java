package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class lf0 extends C5444pd implements nf0 {
    lf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: G1 */
    public final void mo19163G1(List<Uri> list) throws RemoteException {
        Parcel z = mo20259z();
        z.writeTypedList(list);
        mo20256K0(1, z);
    }

    /* renamed from: q */
    public final void mo19164q(String str) throws RemoteException {
        Parcel z = mo20259z();
        z.writeString(str);
        mo20256K0(2, z);
    }
}
