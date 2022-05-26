package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5538rx extends C5481qd implements C5575sx {
    public C5538rx() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo20523g();
        } else if (i == 2) {
            mo20522e();
        } else if (i == 3) {
            mo20521d();
        } else if (i == 4) {
            zze();
        } else if (i != 5) {
            return false;
        } else {
            mo20524w5(C5518rd.m30065g(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
