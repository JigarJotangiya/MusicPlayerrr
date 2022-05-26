package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class we0 extends C5481qd implements xe0 {
    public we0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: e7 */
    public static xe0 m33106e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof xe0 ? (xe0) queryLocalInterface : new ve0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo10872U4((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzr();
                parcel2.writeNoException();
                return true;
            case 4:
                zzp();
                parcel2.writeNoException();
                return true;
            case 5:
                mo10885k();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR);
                mo10870K(bundle);
                parcel2.writeNoException();
                C5518rd.m30063e(parcel2, bundle);
                return true;
            case 7:
                zzs();
                parcel2.writeNoException();
                return true;
            case 8:
                mo10882j();
                parcel2.writeNoException();
                return true;
            case 9:
                mo10892t();
                parcel2.writeNoException();
                return true;
            case 10:
                mo10878e();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean F = mo10868F();
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, F);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) C5518rd.m30059a(parcel, Intent.CREATOR);
                parcel2.writeNoException();
                return true;
            case 13:
                mo10873Y(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                mo10891n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
