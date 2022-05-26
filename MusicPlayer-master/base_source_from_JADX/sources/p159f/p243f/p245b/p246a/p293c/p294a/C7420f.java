package p159f.p243f.p245b.p246a.p293c.p294a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.a.f */
public final class C7420f extends C7415a implements C7418d {
    C7420f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: D */
    public final String mo28280D() throws RemoteException {
        Parcel C0 = mo28277C0(1, mo28279z());
        String readString = C0.readString();
        C0.recycle();
        return readString;
    }

    /* renamed from: S */
    public final boolean mo28281S(boolean z) throws RemoteException {
        Parcel z2 = mo28279z();
        C7417c.m41787a(z2, true);
        Parcel C0 = mo28277C0(2, z2);
        boolean b = C7417c.m41788b(C0);
        C0.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo28282b() throws RemoteException {
        Parcel C0 = mo28277C0(6, mo28279z());
        boolean b = C7417c.m41788b(C0);
        C0.recycle();
        return b;
    }
}
