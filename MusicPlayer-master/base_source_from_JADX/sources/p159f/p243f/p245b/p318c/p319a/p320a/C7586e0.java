package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.e0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C7586e0 extends Binder implements IInterface {
    protected C7586e0(String str) {
        attachInterface(this, str);
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
        return mo28589z(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo28589z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
