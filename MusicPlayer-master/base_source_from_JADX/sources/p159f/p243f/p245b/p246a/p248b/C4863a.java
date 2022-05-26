package p159f.p243f.p245b.p246a.p248b;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p159f.p243f.p245b.p246a.p293c.p297d.C7446b;

/* renamed from: f.f.b.a.b.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C4863a extends IInterface {

    /* renamed from: f.f.b.a.b.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class C4864a extends C7446b implements C4863a {
        public C4864a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        /* renamed from: C0 */
        public static C4863a m20501C0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C4863a) {
                return (C4863a) queryLocalInterface;
            }
            return new C4868d(iBinder);
        }
    }
}
