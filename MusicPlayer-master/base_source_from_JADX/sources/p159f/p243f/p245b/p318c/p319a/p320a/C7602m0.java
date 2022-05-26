package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f.f.b.c.a.a.m0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7602m0 extends C7586e0 implements C7604n0 {
    /* renamed from: C0 */
    public static C7604n0 m42385C0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        if (queryLocalInterface instanceof C7604n0) {
            return (C7604n0) queryLocalInterface;
        }
        return new C7600l0(iBinder);
    }
}
