package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ag0 extends C5481qd implements cg0 {
    public ag0() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo16627a();
        parcel2.writeNoException();
        return true;
    }
}
