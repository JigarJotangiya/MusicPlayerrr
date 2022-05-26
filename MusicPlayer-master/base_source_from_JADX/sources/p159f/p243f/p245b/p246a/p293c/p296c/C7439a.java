package p159f.p243f.p245b.p246a.p293c.p296c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.c.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C7439a implements IInterface {

    /* renamed from: g */
    private final IBinder f32614g;

    /* renamed from: h */
    private final String f32615h;

    protected C7439a(IBinder iBinder, String str) {
        this.f32614g = iBinder;
        this.f32615h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final Parcel mo28295C0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f32614g.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public final void mo28296K0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f32614g.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f32614g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public final void mo28298f2(int i, Parcel parcel) throws RemoteException {
        try {
            this.f32614g.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo28299z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32615h);
        return obtain;
    }
}
