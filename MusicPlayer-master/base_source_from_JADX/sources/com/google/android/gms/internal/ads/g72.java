package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g72 implements t22<rp1, kq2, j42> {

    /* renamed from: a */
    private final Context f16982a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f16983b;

    /* renamed from: c */
    private final wp1 f16984c;

    public g72(Context context, Executor executor, wp1 wp1) {
        this.f16982a = context;
        this.f16983b = executor;
        this.f16984c = wp1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m24196e(np2 np2, bp2 bp2, n22<kq2, j42> n22) {
        try {
            ((kq2) n22.f20467b).mo18976n(np2.f20682a.f18953a.f24395d, bp2.f14668w.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(n22.f20466a);
            ul0.m31863h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        sp1 f = this.f16984c.mo17377f(new w41(np2, bp2, n22.f20466a), new tp1(new c72(n22)));
        f.mo15975c().mo21251D0(new rz0((kq2) n22.f20467b), this.f16983b);
        m91 d = f.mo18071d();
        c81 a = f.mo18069a();
        ((j42) n22.f20468c).mo18539f7(new f72(this, f.mo20904h(), a, d, f.mo20905i()));
        return f.mo20907k();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<kq2, j42> n22) throws zp2 {
        if (!((kq2) n22.f20467b).mo18963a()) {
            ((j42) n22.f20468c).mo18540g7(new e72(this, np2, bp2, n22));
            ((kq2) n22.f20467b).mo18973k(this.f16982a, np2.f20682a.f18953a.f24395d, (String) null, (ph0) n22.f20468c, bp2.f14668w.toString());
            return;
        }
        m24196e(np2, bp2, n22);
    }
}
