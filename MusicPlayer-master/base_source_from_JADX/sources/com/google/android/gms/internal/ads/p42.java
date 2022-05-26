package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p42 implements k22<rg1> {

    /* renamed from: a */
    private final Context f21331a;

    /* renamed from: b */
    private final oq1 f21332b;

    /* renamed from: c */
    private final ph1 f21333c;

    /* renamed from: d */
    private final up2 f21334d;

    /* renamed from: e */
    private final Executor f21335e;

    /* renamed from: f */
    private final zzcjf f21336f;

    /* renamed from: g */
    private final b60 f21337g;

    /* renamed from: h */
    private final boolean f21338h = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22415R5)).booleanValue();

    public p42(Context context, zzcjf zzcjf, up2 up2, Executor executor, ph1 ph1, oq1 oq1, b60 b60) {
        this.f21331a = context;
        this.f21334d = up2;
        this.f21333c = ph1;
        this.f21335e = executor;
        this.f21336f = zzcjf;
        this.f21332b = oq1;
        this.f21337g = b60;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17223a == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<rg1> mo15701b(np2 np2, bp2 bp2) {
        sq1 sq1 = new sq1();
        d93<rg1> n = s83.m30612n(s83.m30607i(null), new m42(this, bp2, np2, sq1), this.f21335e);
        n.mo15945h(new n42(sq1), this.f21335e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo20222c(bp2 bp2, np2 np2, sq1 sq1, Object obj) throws Exception {
        bp2 bp22 = bp2;
        np2 np22 = np2;
        pr0 a = this.f21332b.mo20090a(this.f21334d.f24396e, bp22, np22.f20683b.f20121b);
        a.mo17706r0(bp22.f14628T);
        sq1.mo20950a(this.f21331a, (View) a);
        mm0 mm0 = new mm0();
        ph1 ph1 = this.f21333c;
        w41 w41 = new w41(np22, bp22, (String) null);
        o42 o42 = r1;
        o42 o422 = new o42(this.f21331a, this.f21336f, mm0, bp2, a, this.f21334d, this.f21338h, this.f21337g);
        sg1 c = ph1.mo20274c(w41, new wg1(o42, a));
        mm0.mo19449c(c);
        c.mo18070b().mo21251D0(new k42(a), hm0.f17713f);
        c.mo19290k().mo19818i(a, true, this.f21338h ? this.f21337g : null);
        c.mo19290k();
        bp2 bp23 = bp2;
        gp2 gp2 = bp23.f14665t;
        return s83.m30611m(nq1.m28037j(a, gp2.f17224b, gp2.f17223a), new l42(this, a, bp23, c), this.f21335e);
    }
}
