package p159f.p243f.p245b.p246a.p293c.p297d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.d.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C7446b extends Binder implements IInterface {
    protected C7446b(String str) {
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
        return mo11853z(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo11853z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }
}
