package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class c30 extends C5481qd implements d30 {
    public c30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4863a e = mo16835e();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, e);
                return true;
            case 3:
                String i3 = mo16839i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 4:
                List l = mo16842l();
                parcel2.writeNoException();
                parcel2.writeList(l);
                return true;
            case 5:
                String g = mo16837g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 6:
                q20 c = mo16833c();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, c);
                return true;
            case 7:
                String h = mo16838h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                double a = mo16831a();
                parcel2.writeNoException();
                parcel2.writeDouble(a);
                return true;
            case 9:
                String k = mo16841k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 10:
                String m = mo16843m();
                parcel2.writeNoException();
                parcel2.writeString(m);
                return true;
            case 11:
                Bundle b = mo16832b();
                parcel2.writeNoException();
                C5518rd.m30063e(parcel2, b);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                C5427ox f = mo16836f();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, f);
                return true;
            case 14:
                mo16830K((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean y0 = mo16844y0((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, y0);
                return true;
            case 16:
                mo16829G0((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                j20 zze = zze();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, zze);
                return true;
            case 18:
                C4863a d = mo16834d();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, d);
                return true;
            case 19:
                String j = mo16840j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            default:
                return false;
        }
    }
}
