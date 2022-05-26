package p159f.p243f.p245b.p246a.p293c.p295b;

import android.content.Context;
import com.google.android.gms.appset.C3133b;
import com.google.android.gms.appset.C3134c;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.api.C3158b;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7473k;

/* renamed from: f.f.b.a.c.b.r */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7438r implements C3133b {

    /* renamed from: a */
    private final C3133b f32612a;

    /* renamed from: b */
    private final C3133b f32613b;

    public C7438r(Context context) {
        this.f32612a = new C7436p(context, C3237c.m14031f());
        this.f32613b = C7432l.m41813d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ C7470h m41824b(C7438r rVar, C7470h hVar) {
        if (hVar.mo28343m() || hVar.mo28341k()) {
            return hVar;
        }
        Exception i = hVar.mo28339i();
        if (!(i instanceof C3158b)) {
            return hVar;
        }
        int statusCode = ((C3158b) i).getStatusCode();
        if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
            return rVar.f32613b.mo11391a();
        }
        if (statusCode == 43000) {
            return C7473k.m41914b(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        if (statusCode != 15) {
            return hVar;
        }
        return C7473k.m41914b(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    /* renamed from: a */
    public final C7470h<C3134c> mo11391a() {
        return this.f32612a.mo11391a().mo28337g(new C7437q(this));
    }
}
