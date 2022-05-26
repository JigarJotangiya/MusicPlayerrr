package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ke0 extends C5481qd implements le0 {
    public ke0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: e7 */
    public static le0 m26200e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof le0 ? (le0) queryLocalInterface : new je0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo17810M0((Intent) C5518rd.m30059a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            mo17812u1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo17811c();
        }
        parcel2.writeNoException();
        return true;
    }
}
