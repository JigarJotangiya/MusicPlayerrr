package p159f.p243f.p245b.p246a.p293c.p295b;

import android.content.Context;
import com.google.android.gms.appset.C3133b;
import com.google.android.gms.appset.C3134c;
import com.google.android.gms.appset.C3137f;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.C3161e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3199n;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7473k;

/* renamed from: f.f.b.a.c.b.p */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7436p extends C3161e<C3147a.C3151d.C3154c> implements C3133b {

    /* renamed from: k */
    private static final C3147a.C3157g<C7424d> f32606k;

    /* renamed from: l */
    private static final C3147a.C3148a<C7424d, C3147a.C3151d.C3154c> f32607l;

    /* renamed from: m */
    private static final C3147a<C3147a.C3151d.C3154c> f32608m;

    /* renamed from: i */
    private final Context f32609i;

    /* renamed from: j */
    private final C3237c f32610j;

    static {
        C3147a.C3157g<C7424d> gVar = new C3147a.C3157g<>();
        f32606k = gVar;
        C7434n nVar = new C7434n();
        f32607l = nVar;
        f32608m = new C3147a<>("AppSet.API", nVar, gVar);
    }

    C7436p(Context context, C3237c cVar) {
        super(context, f32608m, C3147a.C3151d.f10325b, C3161e.C3162a.f10334c);
        this.f32609i = context;
        this.f32610j = cVar;
    }

    /* renamed from: a */
    public final C7470h<C3134c> mo11391a() {
        if (this.f32610j.mo11680h(this.f32609i, 212800000) != 0) {
            return C7473k.m41914b(new C3158b(new Status(17)));
        }
        C3199n.C3200a a = C3199n.m13912a();
        a.mo11613d(C3137f.f10243a);
        a.mo11611b(new C7433m(this));
        a.mo11612c(false);
        a.mo11614e(27601);
        return mo11526f(a.mo11610a());
    }
}
