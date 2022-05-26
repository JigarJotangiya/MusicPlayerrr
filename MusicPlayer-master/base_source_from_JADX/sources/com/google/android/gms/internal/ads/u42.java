package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u42 implements t22<rg1, kq2, i42> {

    /* renamed from: a */
    private final Context f24178a;

    /* renamed from: b */
    private final ph1 f24179b;

    /* renamed from: c */
    private final zzcjf f24180c;

    /* renamed from: d */
    private final Executor f24181d;

    public u42(Context context, zzcjf zzcjf, ph1 ph1, Executor executor) {
        this.f24178a = context;
        this.f24180c = zzcjf;
        this.f24179b = ph1;
        this.f24181d = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        sg1 c = this.f24179b.mo20274c(new w41(np2, bp2, n22.f20466a), new wg1(new s42(this, n22), (pr0) null));
        c.mo15975c().mo21251D0(new rz0((kq2) n22.f20467b), this.f24181d);
        ((i42) n22.f20468c).mo18292f7(c.mo15977g());
        return c.mo19288i();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<kq2, i42> n22) throws zp2 {
        ((kq2) n22.f20467b).mo18979q(this.f24178a, np2.f20682a.f18953a.f24395d, bp2.f14668w.toString(), C3044v0.m13485l(bp2.f14665t), (ib0) n22.f20468c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21218c(n22 n22, boolean z, Context context, s81 s81) throws xh1 {
        try {
            ((kq2) n22.f20467b).mo18986x(z);
            if (this.f24180c.f27378i < ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22609r0)).intValue()) {
                ((kq2) n22.f20467b).mo18987y();
            } else {
                ((kq2) n22.f20467b).mo18988z(context);
            }
        } catch (zp2 e) {
            ul0.m31861f("Cannot show interstitial.");
            throw new xh1(e.getCause());
        }
    }
}
