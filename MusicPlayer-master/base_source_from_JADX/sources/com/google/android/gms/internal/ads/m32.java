package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.C3049x;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m32 implements k22<e21> {

    /* renamed from: a */
    private final c31 f19745a;

    /* renamed from: b */
    private final Context f19746b;

    /* renamed from: c */
    private final oq1 f19747c;

    /* renamed from: d */
    private final up2 f19748d;

    /* renamed from: e */
    private final Executor f19749e;

    /* renamed from: f */
    private final i13<bp2, C3049x> f19750f;

    public m32(c31 c31, Context context, Executor executor, oq1 oq1, up2 up2, i13<bp2, C3049x> i13) {
        this.f19746b = context;
        this.f19745a = c31;
        this.f19749e = executor;
        this.f19747c = oq1;
        this.f19748d = up2;
        this.f19750f = i13;
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        gp2 gp2 = bp2.f14665t;
        return (gp2 == null || gp2.f17223a == null) ? false : true;
    }

    /* renamed from: b */
    public final d93<e21> mo15701b(np2 np2, bp2 bp2) {
        return s83.m30612n(s83.m30607i(null), new j32(this, np2, bp2), this.f19749e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo19335c(np2 np2, bp2 bp2, Object obj) throws Exception {
        View view;
        zzbfi a = yp2.m34266a(this.f19746b, bp2.f14667v);
        pr0 a2 = this.f19747c.mo20090a(a, bp2, np2.f20683b.f20121b);
        a2.mo17706r0(bp2.f14628T);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() || !bp2.f14644e0) {
            view = new rq1(this.f19746b, (View) a2, this.f19750f.apply(bp2));
        } else {
            view = v31.m32132a(this.f19746b, (View) a2, bp2);
        }
        f21 a3 = this.f19745a.mo16463a(new w41(np2, bp2, (String) null), new m21(view, a2, new g32(a2), yp2.m34268c(a)));
        a3.mo17460j().mo19818i(a2, false, (b60) null);
        x81 b = a3.mo18070b();
        h32 h32 = new h32(a2);
        e93 e93 = hm0.f17713f;
        b.mo21251D0(h32, e93);
        a3.mo17460j();
        gp2 gp2 = bp2.f14665t;
        d93<?> j = nq1.m28037j(a2, gp2.f17224b, gp2.f17223a);
        if (bp2.f14618J) {
            j.mo15945h(new k32(a2), this.f19749e);
        }
        j.mo15945h(new l32(this, a2), this.f19749e);
        return s83.m30611m(j, new i32(a3), e93);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo19336d(pr0 pr0) {
        pr0.mo17676S0();
        ms0 zzs = pr0.zzs();
        zzbkq zzbkq = this.f19748d.f24392a;
        if (zzbkq != null && zzs != null) {
            zzs.mo19502i7(zzbkq);
        }
    }
}
