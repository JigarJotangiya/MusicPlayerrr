package p159f.p243f.p245b.p246a.p293c.p296c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.c.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C7440b extends Binder implements IInterface {
    protected C7440b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public boolean mo22728f2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo22728f2(i, parcel, parcel2, i2);
    }
}
