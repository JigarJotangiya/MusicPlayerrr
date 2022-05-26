package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class nk0 extends C5481qd implements ok0 {
    public nk0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: e7 */
    public static ok0 m27906e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof ok0 ? (ok0) queryLocalInterface : new mk0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        lk0 lk0 = null;
        switch (i) {
            case 1:
                C4863a C0 = C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                zzchx zzchx = (zzchx) C5518rd.m30059a(parcel, zzchx.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    lk0 = queryLocalInterface instanceof lk0 ? (lk0) queryLocalInterface : new jk0(readStrongBinder);
                }
                mo10683T1(C0, zzchx, lk0);
                parcel2.writeNoException();
                return true;
            case 2:
                mo10682P(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 4:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 5:
                mo10686o4(parcel.createTypedArrayList(Uri.CREATOR), C4863a.C4864a.m20501C0(parcel.readStrongBinder()), mf0.m27251e7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                mo10684Y6(parcel.createTypedArrayList(Uri.CREATOR), C4863a.C4864a.m20501C0(parcel.readStrongBinder()), mf0.m27251e7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                mo10687s4((zzcco) C5518rd.m30059a(parcel, zzcco.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo10685m0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
