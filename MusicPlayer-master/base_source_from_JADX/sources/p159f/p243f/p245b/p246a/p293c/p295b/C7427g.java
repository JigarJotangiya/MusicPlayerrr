package p159f.p243f.p245b.p246a.p293c.p295b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

/* renamed from: f.f.b.a.c.b.g */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7427g extends C7421a implements IInterface {
    C7427g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* renamed from: K0 */
    public final void mo28290K0(zza zza, C7426f fVar) throws RemoteException {
        Parcel z = mo28285z();
        C7423c.m41800b(z, zza);
        C7423c.m41801c(z, fVar);
        mo28283C0(1, z);
    }
}
