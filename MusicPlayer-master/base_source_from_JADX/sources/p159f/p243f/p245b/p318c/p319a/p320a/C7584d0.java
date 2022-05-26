package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.d0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C7584d0 implements IInterface {

    /* renamed from: g */
    private final IBinder f32952g;

    /* renamed from: h */
    private final String f32953h;

    protected C7584d0(IBinder iBinder, String str) {
        this.f32952g = iBinder;
        this.f32953h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void mo28584C0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f32952g.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f32952g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo28586z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32953h);
        return obtain;
    }
}
