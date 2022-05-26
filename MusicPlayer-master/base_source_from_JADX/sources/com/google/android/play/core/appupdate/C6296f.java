package com.google.android.play.core.appupdate;

import android.content.Context;
import p159f.p243f.p245b.p318c.p319a.p320a.C7578a0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;

/* renamed from: com.google.android.play.core.appupdate.f */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6296f {

    /* renamed from: a */
    private final C7582c0<Context> f29282a;

    /* renamed from: b */
    private final C7582c0<C6313w> f29283b;

    /* renamed from: c */
    private final C7582c0<C6311u> f29284c;

    /* renamed from: d */
    private final C7582c0<C6297g> f29285d;

    /* renamed from: e */
    private final C7582c0<C6300j> f29286e;

    /* renamed from: f */
    private final C7582c0<C6288b> f29287f;

    /* synthetic */ C6296f(C6302l lVar, C6294d0 d0Var) {
        C6304n nVar = new C6304n(lVar);
        this.f29282a = nVar;
        C7582c0<C6313w> b = C7578a0.m42331b(new C6314x(nVar));
        this.f29283b = b;
        C7582c0<C6311u> b2 = C7578a0.m42331b(new C6312v(nVar, b));
        this.f29284c = b2;
        C7582c0<C6297g> b3 = C7578a0.m42331b(new C6298h(nVar));
        this.f29285d = b3;
        C7582c0<C6300j> b4 = C7578a0.m42331b(new C6301k(b2, b3, nVar));
        this.f29286e = b4;
        this.f29287f = C7578a0.m42331b(new C6303m(b4));
    }

    /* renamed from: a */
    public final C6288b mo25165a() {
        return this.f29287f.zza();
    }
}
