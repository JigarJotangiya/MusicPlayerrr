package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e32 implements k22<n11> {

    /* renamed from: a */
    private final g11 f15848a;

    /* renamed from: b */
    private final Context f15849b;

    /* renamed from: c */
    private final oq1 f15850c;

    /* renamed from: d */
    private final Executor f15851d;

    public e32(g11 g11, Context context, Executor executor, oq1 oq1) {
        this.f15849b = context;
        this.f15848a = g11;
        this.f15851d = executor;
        this.f15850c = oq1;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17223a == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<n11> mo15701b(np2 np2, bp2 bp2) {
        return s83.m30612n(s83.m30607i(null), new d32(this, np2, bp2), this.f15851d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo17110c(np2 np2, bp2 bp2, Object obj) throws Exception {
        zzbfi a = yp2.m34266a(this.f15849b, bp2.f14667v);
        pr0 a2 = this.f15850c.mo20090a(a, bp2, np2.f20683b.f20121b);
        z01 e = this.f15848a.mo17793e(new w41(np2, bp2, (String) null), new a11((View) a2, a2, yp2.m34268c(a), bp2.f14632X, bp2.f14638b0, bp2.f14620L));
        e.mo21599i().mo19818i(a2, false, (b60) null);
        x81 b = e.mo18070b();
        b32 b32 = new b32(a2);
        e93 e93 = hm0.f17713f;
        b.mo21251D0(b32, e93);
        e.mo21599i();
        gp2 gp2 = bp2.f14665t;
        return s83.m30611m(nq1.m28037j(a2, gp2.f17224b, gp2.f17223a), new c32(e), e93);
    }
}
