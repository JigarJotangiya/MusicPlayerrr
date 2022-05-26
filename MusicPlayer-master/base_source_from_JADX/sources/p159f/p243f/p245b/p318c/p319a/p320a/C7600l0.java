package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: f.f.b.c.a.a.l0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7600l0 extends C7584d0 implements C7604n0 {
    C7600l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: K3 */
    public final void mo28595K3(String str, List<Bundle> list, Bundle bundle, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        z.writeTypedList(list);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(14, z);
    }

    /* renamed from: L5 */
    public final void mo28596L5(String str, Bundle bundle, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(10, z);
    }

    /* renamed from: S1 */
    public final void mo28597S1(String str, Bundle bundle, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(5, z);
    }

    /* renamed from: S5 */
    public final void mo28598S5(String str, Bundle bundle, Bundle bundle2, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42344b(z, bundle2);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(9, z);
    }

    /* renamed from: T6 */
    public final void mo28599T6(String str, Bundle bundle, Bundle bundle2, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42344b(z, bundle2);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(7, z);
    }

    /* renamed from: n3 */
    public final void mo28600n3(String str, Bundle bundle, Bundle bundle2, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42344b(z, bundle2);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(11, z);
    }

    /* renamed from: n4 */
    public final void mo28601n4(String str, Bundle bundle, Bundle bundle2, C7608p0 p0Var) throws RemoteException {
        Parcel z = mo28586z();
        z.writeString(str);
        C7588f0.m42344b(z, bundle);
        C7588f0.m42344b(z, bundle2);
        C7588f0.m42345c(z, p0Var);
        mo28584C0(6, z);
    }
}
