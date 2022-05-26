package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.cd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4962cd extends C5111gd {

    /* renamed from: h */
    private final View f14944h;

    public C4962cd(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, View view) {
        super(wbVar, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", b8Var, i, 57);
        this.f14944h = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (this.f14944h != null) {
            Boolean bool = (Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22411R1);
            DisplayMetrics displayMetrics = this.f17016a.mo21778b().getResources().getDisplayMetrics();
            C4887ac acVar = new C4887ac((String) this.f17020e.invoke((Object) null, new Object[]{this.f14944h, displayMetrics, bool}));
            C5439p8 D = C5476q8.m29401D();
            D.mo20231s(acVar.f13841b.longValue());
            D.mo20232t(acVar.f13842c.longValue());
            D.mo20233u(acVar.f13843d.longValue());
            if (bool.booleanValue()) {
                D.mo20230r(acVar.f13844e.longValue());
            }
            this.f17019d.mo16103L((C5476q8) D.mo19761n());
        }
    }
}
