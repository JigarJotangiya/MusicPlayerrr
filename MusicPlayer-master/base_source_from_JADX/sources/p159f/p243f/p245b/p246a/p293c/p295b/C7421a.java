package p159f.p243f.p245b.p246a.p293c.p295b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.a.c.b.a */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class C7421a implements IInterface {

    /* renamed from: g */
    private final IBinder f32594g;

    /* renamed from: h */
    private final String f32595h = "com.google.android.gms.appset.internal.IAppSetService";

    protected C7421a(IBinder iBinder, String str) {
        this.f32594g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo28283C0(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f32594g.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f32594g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo28285z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32595h);
        return obtain;
    }
}
