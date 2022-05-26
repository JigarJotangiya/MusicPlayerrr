package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class e03 extends C5481qd implements f03 {
    public e03() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                break;
            case 5:
                parcel.createByteArray();
                break;
            case 6:
                parcel.readInt();
                break;
            case 7:
                parcel.readInt();
                break;
            case 8:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
