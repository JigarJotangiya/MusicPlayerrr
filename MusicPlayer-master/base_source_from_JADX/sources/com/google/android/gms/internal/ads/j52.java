package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j52 implements t22<vj1, kq2, i42> {

    /* renamed from: a */
    private final Context f18367a;

    /* renamed from: b */
    private final mi1 f18368b;

    /* renamed from: c */
    private final Executor f18369c;

    public j52(Context context, mi1 mi1, Executor executor) {
        this.f18367a = context;
        this.f18368b = mi1;
        this.f18369c = executor;
    }

    /* renamed from: c */
    private static final boolean m25539c(np2 np2, int i) {
        return np2.f20682a.f18953a.f24398g.contains(Integer.toString(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        bk1 bk1;
        nb0 b = ((kq2) n22.f20467b).mo18964b();
        ob0 c = ((kq2) n22.f20467b).mo18965c();
        rb0 g = ((kq2) n22.f20467b).mo18969g();
        if (g != null && m25539c(np2, 6)) {
            bk1 = bk1.m21356a0(g);
        } else if (b != null && m25539c(np2, 6)) {
            bk1 = bk1.m21351E(b);
        } else if (b != null && m25539c(np2, 2)) {
            bk1 = bk1.m21349C(b);
        } else if (c != null && m25539c(np2, 6)) {
            bk1 = bk1.m21352F(c);
        } else if (c == null || !m25539c(np2, 1)) {
            throw new e62(1, "No native ad mappers");
        } else {
            bk1 = bk1.m21350D(c);
        }
        if (np2.f20682a.f18953a.f24398g.contains(Integer.toString(bk1.mo16259K()))) {
            dk1 d = this.f18368b.mo19389d(new w41(np2, bp2, n22.f20466a), new nk1(bk1), new cm1(c, b, g, (byte[]) null));
            ((i42) n22.f20468c).mo18292f7(d.mo15977g());
            d.mo15975c().mo21251D0(new rz0((kq2) n22.f20467b), this.f18369c);
            return d.mo15978h();
        }
        throw new e62(1, "No corresponding native ad listener");
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<kq2, i42> n22) throws zp2 {
        up2 up2 = np2.f20682a.f18953a;
        ((kq2) n22.f20467b).mo18980r(this.f18367a, np2.f20682a.f18953a.f24395d, bp2.f14668w.toString(), C3044v0.m13485l(bp2.f14665t), (ib0) n22.f20468c, up2.f24400i, up2.f24398g);
    }
}
