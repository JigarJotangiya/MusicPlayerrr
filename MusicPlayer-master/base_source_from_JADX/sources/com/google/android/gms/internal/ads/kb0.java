package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class kb0 extends C5481qd implements lb0 {
    public kb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: e7 */
    public static lb0 m26182e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof lb0 ? (lb0) queryLocalInterface : new jb0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4863a zze = zze();
            parcel2.writeNoException();
            C5518rd.m30064f(parcel2, zze);
        } else if (i != 2) {
            return false;
        } else {
            boolean c = mo16588c();
            parcel2.writeNoException();
            C5518rd.m30061c(parcel2, c);
        }
        return true;
    }
}
