package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class oh0 extends C5481qd implements ph0 {
    public oh0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: e7 */
    public static ph0 m28495e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof ph0 ? (ph0) queryLocalInterface : new nh0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo17500a0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 2:
                mo17503m1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo17497X(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 4:
                mo17498Y(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 5:
                mo17502e0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 6:
                mo17501c0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 7:
                mo17504p2(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), (zzces) C5518rd.m30059a(parcel, zzces.CREATOR));
                break;
            case 8:
                zze(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 9:
                mo17505q0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo17496P(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 11:
                mo17499Z1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
