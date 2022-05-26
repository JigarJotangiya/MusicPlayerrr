package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a72 implements k22<rp1> {

    /* renamed from: a */
    private final Context f13801a;

    /* renamed from: b */
    private final oq1 f13802b;

    /* renamed from: c */
    private final wp1 f13803c;

    /* renamed from: d */
    private final up2 f13804d;

    /* renamed from: e */
    private final Executor f13805e;

    /* renamed from: f */
    private final zzcjf f13806f;

    /* renamed from: g */
    private final b60 f13807g;

    /* renamed from: h */
    private final boolean f13808h = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22415R5)).booleanValue();

    public a72(Context context, zzcjf zzcjf, up2 up2, Executor executor, wp1 wp1, oq1 oq1, b60 b60) {
        this.f13801a = context;
        this.f13804d = up2;
        this.f13803c = wp1;
        this.f13805e = executor;
        this.f13806f = zzcjf;
        this.f13802b = oq1;
        this.f13807g = b60;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17223a == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<rp1> mo15701b(np2 np2, bp2 bp2) {
        sq1 sq1 = new sq1();
        d93<rp1> n = s83.m30612n(s83.m30607i(null), new u62(this, bp2, np2, sq1), this.f13805e);
        n.mo15945h(new w62(sq1), this.f13805e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo15702c(bp2 bp2, np2 np2, sq1 sq1, Object obj) throws Exception {
        bp2 bp22 = bp2;
        np2 np22 = np2;
        pr0 a = this.f13802b.mo20090a(this.f13804d.f24396e, bp22, np22.f20683b.f20121b);
        a.mo17706r0(bp22.f14628T);
        sq1.mo20950a(this.f13801a, (View) a);
        mm0 mm0 = new mm0();
        wp1 wp1 = this.f13803c;
        w41 w41 = new w41(np22, bp22, (String) null);
        z62 z62 = r1;
        z62 z622 = new z62(this.f13801a, this.f13802b, this.f13804d, this.f13806f, bp2, mm0, a, this.f13807g, this.f13808h);
        sp1 f = wp1.mo17377f(w41, new tp1(z62, a));
        mm0.mo19449c(f);
        p60.m28910b(a, f.mo20905i());
        f.mo18070b().mo21251D0(new s62(a), hm0.f17713f);
        f.mo20908l().mo19818i(a, true, this.f13808h ? this.f13807g : null);
        f.mo20908l();
        bp2 bp23 = bp2;
        gp2 gp2 = bp23.f14665t;
        return s83.m30611m(nq1.m28037j(a, gp2.f17224b, gp2.f17223a), new t62(this, a, bp23, f), this.f13805e);
    }
}
