package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class e30 extends C5481qd implements f30 {
    public e30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C4863a d = mo17472d();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, d);
                return true;
            case 3:
                String i3 = mo17477i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 4:
                List m = mo17480m();
                parcel2.writeNoException();
                parcel2.writeList(m);
                return true;
            case 5:
                String g = mo17475g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 6:
                q20 zze = zze();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, zze);
                return true;
            case 7:
                String h = mo17476h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                String e = mo17473e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 9:
                Bundle a = mo17469a();
                parcel2.writeNoException();
                C5518rd.m30063e(parcel2, a);
                return true;
            case 10:
                mo17479k();
                parcel2.writeNoException();
                return true;
            case 11:
                C5427ox b = mo17470b();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, b);
                return true;
            case 12:
                mo17468X1((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean K = mo17466K((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C5518rd.m30061c(parcel2, K);
                return true;
            case 14:
                mo17467N((Bundle) C5518rd.m30059a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                j20 f = mo17474f();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, f);
                return true;
            case 16:
                C4863a c = mo17471c();
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, c);
                return true;
            case 17:
                String j = mo17478j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            default:
                return false;
        }
    }
}
