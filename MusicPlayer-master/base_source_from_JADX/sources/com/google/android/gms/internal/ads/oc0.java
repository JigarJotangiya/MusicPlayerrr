package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class oc0 extends C5481qd implements pc0 {
    public oc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo20250m0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo20251q(parcel.readString());
        } else if (i == 3) {
            mo19701r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mo20252u3(kb0.m26182e7(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
