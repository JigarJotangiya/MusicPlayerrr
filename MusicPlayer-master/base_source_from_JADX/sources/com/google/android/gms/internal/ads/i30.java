package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class i30 extends C5481qd implements j30 {
    public i30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: e7 */
    public static j30 m25064e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof j30 ? (j30) queryLocalInterface : new h30(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String K6 = mo18455K6(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(K6);
                return true;
            case 2:
                q20 v = mo18462v(parcel.readString());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, v);
                return true;
            case 3:
                List<String> h = mo18457h();
                parcel2.writeNoException();
                parcel2.writeStringList(h);
                return true;
            case 4:
                String e = mo18064e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 5:
                mo18461o0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo18460k();
                parcel2.writeNoException();
                return true;
            case 7:
                C5427ox zze = zze();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, zze);
                return true;
            case 8:
                mo18458i();
                parcel2.writeNoException();
                return true;
            case 9:
                C4863a d = mo18063d();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, d);
                return true;
            case 10:
                boolean k0 = mo18065k0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, k0);
                return true;
            case 11:
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, zzp);
                return true;
            case 13:
                boolean zzr = zzr();
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, zzr);
                return true;
            case 14:
                mo18456e0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                mo18459j();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
