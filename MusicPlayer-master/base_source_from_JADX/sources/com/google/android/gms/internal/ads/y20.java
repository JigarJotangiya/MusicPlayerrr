package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class y20 extends C5481qd implements z20 {
    public y20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo21291j6(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo21285f();
        } else if (i != 3) {
            return false;
        } else {
            mo21299s0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
