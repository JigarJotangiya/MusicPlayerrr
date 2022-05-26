package p159f.p243f.p245b.p246a.p293c.p295b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.b.b */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class C7422b extends Binder implements IInterface {
    protected C7422b(String str) {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo28288z(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo28288z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
