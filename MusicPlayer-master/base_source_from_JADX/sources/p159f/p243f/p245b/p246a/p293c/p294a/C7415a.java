package p159f.p243f.p245b.p246a.p293c.p294a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.a.a */
public class C7415a implements IInterface {

    /* renamed from: g */
    private final IBinder f32592g;

    /* renamed from: h */
    private final String f32593h;

    protected C7415a(IBinder iBinder, String str) {
        this.f32592g = iBinder;
        this.f32593h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final Parcel mo28277C0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f32592g.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f32592g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo28279z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32593h);
        return obtain;
    }
}
