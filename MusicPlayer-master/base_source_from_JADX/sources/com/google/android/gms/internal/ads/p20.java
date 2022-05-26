package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class p20 extends C5481qd implements q20 {
    public p20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: e7 */
    public static q20 m28834e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof q20 ? (q20) queryLocalInterface : new o20(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4863a c = mo16823c();
            parcel2.writeNoException();
            C5518rd.m30064f(parcel2, c);
        } else if (i == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            C5518rd.m30063e(parcel2, zze);
        } else if (i == 3) {
            double a = mo16821a();
            parcel2.writeNoException();
            parcel2.writeDouble(a);
        } else if (i == 4) {
            int f = mo16824f();
            parcel2.writeNoException();
            parcel2.writeInt(f);
        } else if (i != 5) {
            return false;
        } else {
            int b = mo16822b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
