package p159f.p243f.p245b.p246a.p293c.p294a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f.f.b.a.c.a.e */
public abstract class C7419e extends C7416b implements C7418d {
    /* renamed from: z */
    public static C7418d m41792z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C7418d ? (C7418d) queryLocalInterface : new C7420f(iBinder);
    }
}
