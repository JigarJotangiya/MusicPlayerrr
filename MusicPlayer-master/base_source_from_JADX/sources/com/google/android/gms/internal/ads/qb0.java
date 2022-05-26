package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class qb0 extends C5481qd implements rb0 {
    public qb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: e7 */
    public static rb0 m29444e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof rb0 ? (rb0) queryLocalInterface : new pb0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List t = mo19134t();
                parcel2.writeNoException();
                parcel2.writeList(t);
                return true;
            case 4:
                String o = mo19132o();
                parcel2.writeNoException();
                parcel2.writeString(o);
                return true;
            case 5:
                q20 j = mo19127j();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, j);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String u = mo19135u();
                parcel2.writeNoException();
                parcel2.writeString(u);
                return true;
            case 10:
                String n = mo19131n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                return true;
            case 11:
                C5427ox h = mo19125h();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, h);
                return true;
            case 12:
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 13:
                C4863a m = mo19130m();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, m);
                return true;
            case 14:
                C4863a k = mo19128k();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, k);
                return true;
            case 15:
                C4863a l = mo19129l();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, l);
                return true;
            case 16:
                Bundle g = mo19124g();
                parcel2.writeNoException();
                C5518rd.m30063e(parcel2, g);
                return true;
            case 17:
                boolean I = mo19118I();
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, I);
                return true;
            case 18:
                boolean B = mo19116B();
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, B);
                return true;
            case 19:
                mo19117G();
                parcel2.writeNoException();
                return true;
            case 20:
                mo19120a1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                mo19133p5(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), C4863a.C4864a.m20501C0(parcel.readStrongBinder()), C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                mo19119I2(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float c = mo19121c();
                parcel2.writeNoException();
                parcel2.writeFloat(c);
                return true;
            case 24:
                float e = mo19123e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 25:
                float d = mo19122d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            default:
                return false;
        }
    }
}
