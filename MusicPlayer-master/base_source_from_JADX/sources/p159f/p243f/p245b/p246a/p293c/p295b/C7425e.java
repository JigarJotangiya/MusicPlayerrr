package p159f.p243f.p245b.p246a.p293c.p295b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* renamed from: f.f.b.a.c.b.e */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public abstract class C7425e extends C7422b implements C7426f {
    public C7425e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo28288z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo28289P3((Status) C7423c.m41799a(parcel, Status.CREATOR), (zzc) C7423c.m41799a(parcel, zzc.CREATOR));
        return true;
    }
}
