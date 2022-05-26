package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.s0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7614s0 extends C7584d0 implements IInterface {
    C7614s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: R0 */
    public final void mo28607R0(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel z = mo28586z();
        C7588f0.m42344b(z, bundle);
        C7588f0.m42344b(z, bundle2);
        mo28584C0(2, z);
    }

    /* renamed from: l0 */
    public final void mo28608l0(Bundle bundle) throws RemoteException {
        Parcel z = mo28586z();
        C7588f0.m42344b(z, bundle);
        mo28584C0(3, z);
    }

    /* renamed from: r0 */
    public final void mo28609r0(Bundle bundle) throws RemoteException {
        Parcel z = mo28586z();
        C7588f0.m42344b(z, bundle);
        mo28584C0(4, z);
    }
}
