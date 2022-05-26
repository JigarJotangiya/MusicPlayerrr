package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.g0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7590g0 extends C7584d0 implements C7594i0 {
    C7590g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: L3 */
    public final void mo28591L3(String str, Bundle bundle, C7598k0 k0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42345c(z, k0Var);
        mo28584C0(2, z);
    }

    /* renamed from: f6 */
    public final void mo28592f6(String str, Bundle bundle, C7598k0 k0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42345c(z, k0Var);
        mo28584C0(3, z);
    }
}
