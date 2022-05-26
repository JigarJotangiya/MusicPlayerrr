package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.j0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7596j0 extends C7586e0 implements C7598k0 {
    public C7596j0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo28589z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo25174r0((Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo25175z0((Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
