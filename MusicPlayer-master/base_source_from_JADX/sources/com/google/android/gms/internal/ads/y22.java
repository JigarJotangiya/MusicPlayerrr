package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y22 implements k22<x11> {

    /* renamed from: a */
    private final s11 f26227a;

    /* renamed from: b */
    private final Context f26228b;

    /* renamed from: c */
    private final oq1 f26229c;

    /* renamed from: d */
    private final up2 f26230d;

    /* renamed from: e */
    private final Executor f26231e;

    /* renamed from: f */
    private final zzcjf f26232f;

    /* renamed from: g */
    private final b60 f26233g;

    /* renamed from: h */
    private final boolean f26234h = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22415R5)).booleanValue();

    public y22(s11 s11, Context context, Executor executor, oq1 oq1, up2 up2, zzcjf zzcjf, b60 b60) {
        this.f26228b = context;
        this.f26227a = s11;
        this.f26231e = executor;
        this.f26229c = oq1;
        this.f26230d = up2;
        this.f26232f = zzcjf;
        this.f26233g = b60;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17223a == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<x11> mo15701b(np2 np2, bp2 bp2) {
        sq1 sq1 = new sq1();
        d93<x11> n = s83.m30612n(s83.m30607i(null), new w22(this, bp2, np2, sq1), this.f26231e);
        n.mo15945h(new x22(sq1), this.f26231e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo22146c(bp2 bp2, np2 np2, sq1 sq1, Object obj) throws Exception {
        bp2 bp22 = bp2;
        np2 np22 = np2;
        pr0 a = this.f26229c.mo20090a(this.f26230d.f24396e, bp22, np22.f20683b.f20121b);
        a.mo17706r0(bp22.f14628T);
        sq1.mo20950a(this.f26228b, (View) a);
        mm0 mm0 = new mm0();
        s11 s11 = this.f26227a;
        w41 w41 = new w41(np22, bp22, (String) null);
        a32 a32 = r1;
        a32 a322 = new a32(this.f26232f, mm0, bp2, a, this.f26230d, this.f26234h, this.f26233g);
        p11 e = s11.mo16758e(w41, new wg1(a32, a), new q11(bp22.f14632X));
        e.mo20176j().mo19818i(a, false, this.f26234h ? this.f26233g : null);
        mm0.mo19449c(e);
        e.mo18070b().mo21251D0(new u22(a), hm0.f17713f);
        e.mo20176j();
        gp2 gp2 = bp22.f14665t;
        return s83.m30611m(nq1.m28037j(a, gp2.f17224b, gp2.f17223a), new v22(this, a, bp22, e), this.f26231e);
    }
}
