package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class hb0 extends C5481qd implements ib0 {
    public hb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: e7 */
    public static ib0 m24753e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof ib0 ? (ib0) queryLocalInterface : new gb0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                mo17160c();
                break;
            case 3:
                mo17171w(parcel.readInt());
                break;
            case 4:
                mo17164k();
                break;
            case 5:
                zzp();
                break;
            case 6:
                mo17165l();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof mb0) {
                        mb0 mb0 = (mb0) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 8:
                mo17166m();
                break;
            case 9:
                mo17162e5(parcel.readString(), parcel.readString());
                break;
            case 10:
                i30.m25064e7(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 11:
                mo17169t();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                mo17172x();
                break;
            case 14:
                mo17156F2((zzces) C5518rd.m30059a(parcel, zzces.CREATOR));
                break;
            case 15:
                mo17158R();
                break;
            case 16:
                mo17163f5(sh0.m30718e7(parcel.readStrongBinder()));
                break;
            case 17:
                mo17159T4(parcel.readInt());
                break;
            case 18:
                mo17170u();
                break;
            case 19:
                Bundle bundle = (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR);
                break;
            case 20:
                mo17157G();
                break;
            case 21:
                mo17161d0(parcel.readString());
                break;
            case 22:
                mo17168o1(parcel.readInt(), parcel.readString());
                break;
            case 23:
                mo17173x5((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
                break;
            case 24:
                mo17167n0((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
