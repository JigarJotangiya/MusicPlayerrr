package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class ht0 extends C5481qd implements it0 {
    public ht0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo18484N((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle l0 = mo18495l0((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C5518rd.m30063e(parcel2, l0);
                return true;
            case 3:
                mo18481I4(parcel.readString(), parcel.readString(), (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo18485V0(parcel.readString(), parcel.readString(), C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map V5 = mo18486V5(parcel.readString(), parcel.readString(), C5518rd.m30065g(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(V5);
                return true;
            case 6:
                int p = mo18496p(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(p);
                return true;
            case 7:
                mo18482K((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo18497p6(parcel.readString(), parcel.readString(), (Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List i4 = mo18493i4(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(i4);
                return true;
            case 10:
                String c = mo18488c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 11:
                String g = mo18492g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 12:
                long b = mo18487b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            case 13:
                mo18490d0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                mo18483M2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo18494k4(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String e = mo18491e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 17:
                String d = mo18489d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                mo18480G0((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
