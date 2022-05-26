package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C3018m1;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n62 implements t22<rp1, bd0, i42> {

    /* renamed from: a */
    private final Context f20521a;

    /* renamed from: b */
    private final wp1 f20522b;

    public n62(Context context, wp1 wp1) {
        this.f20521a = context;
        this.f20522b = wp1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        r42 r42 = new r42(bp2, (bd0) n22.f20467b, true);
        sp1 f = this.f20522b.mo17377f(new w41(np2, bp2, n22.f20466a), new tp1(r42));
        r42.mo20584b(f.mo18070b());
        ((i42) n22.f20468c).mo18292f7(f.mo20910n());
        return f.mo20907k();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<bd0, i42> n22) throws zp2 {
        try {
            ((bd0) n22.f20467b).mo16213p0(bp2.f14631W);
            if (np2.f20682a.f18953a.f24406o.f18564a == 3) {
                ((bd0) n22.f20467b).mo16212l2(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f20521a), new m62(this, n22, (l62) null), (ib0) n22.f20468c);
            } else {
                ((bd0) n22.f20467b).mo16206Z2(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f20521a), new m62(this, n22, (l62) null), (ib0) n22.f20468c);
            }
        } catch (RemoteException e) {
            C3018m1.m13389l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
