package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j62 implements t22<rp1, kq2, i42> {

    /* renamed from: a */
    private final Context f18373a;

    /* renamed from: b */
    private final Executor f18374b;

    /* renamed from: c */
    private final wp1 f18375c;

    public j62(Context context, Executor executor, wp1 wp1) {
        this.f18373a = context;
        this.f18374b = executor;
        this.f18375c = wp1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        sp1 f = this.f18375c.mo17377f(new w41(np2, bp2, n22.f20466a), new tp1(new i62(n22)));
        f.mo15975c().mo21251D0(new rz0((kq2) n22.f20467b), this.f18374b);
        ((i42) n22.f20468c).mo18292f7(f.mo20909m());
        return f.mo20907k();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<kq2, i42> n22) throws zp2 {
        try {
            up2 up2 = np2.f20682a.f18953a;
            if (up2.f24406o.f18564a == 3) {
                ((kq2) n22.f20467b).mo18982t(this.f18373a, up2.f24395d, bp2.f14668w.toString(), (ib0) n22.f20468c);
            } else {
                ((kq2) n22.f20467b).mo18981s(this.f18373a, up2.f24395d, bp2.f14668w.toString(), (ib0) n22.f20468c);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(n22.f20466a);
            ul0.m31863h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
