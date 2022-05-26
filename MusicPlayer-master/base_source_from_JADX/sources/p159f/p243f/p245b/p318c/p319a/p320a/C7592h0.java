package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f.f.b.c.a.a.h0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7592h0 extends C7586e0 implements C7594i0 {
    /* renamed from: C0 */
    public static C7594i0 m42349C0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        if (queryLocalInterface instanceof C7594i0) {
            return (C7594i0) queryLocalInterface;
        }
        return new C7590g0(iBinder);
    }
}
