package p159f.p243f.p245b.p246a.p293c.p295b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appset.C3137f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3179d;
import com.google.android.gms.common.api.internal.C3191j;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3273f;

/* renamed from: f.f.b.a.c.b.d */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7424d extends C3273f<C7427g> {
    protected C7424d(Context context, Looper looper, C3269e eVar, C3179d dVar, C3191j jVar) {
        super(context, looper, 300, eVar, dVar, jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.appset.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo11777H() {
        return true;
    }

    /* renamed from: R */
    public final boolean mo11787R() {
        return true;
    }

    /* renamed from: l */
    public final int mo11799l() {
        return 212800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C7427g ? (C7427g) queryLocalInterface : new C7427g(iBinder);
    }

    /* renamed from: v */
    public final Feature[] mo11808v() {
        return C3137f.f10244b;
    }
}
