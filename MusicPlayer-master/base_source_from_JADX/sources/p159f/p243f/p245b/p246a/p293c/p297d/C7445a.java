package p159f.p243f.p245b.p246a.p293c.p297d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.d.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C7445a implements IInterface {

    /* renamed from: g */
    private final IBinder f32618g;

    /* renamed from: h */
    private final String f32619h;

    protected C7445a(IBinder iBinder, String str) {
        this.f32618g = iBinder;
        this.f32619h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final Parcel mo28302C0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32619h);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f32618g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo28304z(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f32618g.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
