package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class i00 extends C5481qd implements j00 {
    public i00() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String a = mo17786a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i == 2) {
            String b = mo17787b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i == 3) {
            mo17785E0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 4) {
            zze();
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            mo17788c();
            parcel2.writeNoException();
        }
        return true;
    }
}
