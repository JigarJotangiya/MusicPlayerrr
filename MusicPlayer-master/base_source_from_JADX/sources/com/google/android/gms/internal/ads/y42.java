package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y42 implements t22<rg1, bd0, i42> {

    /* renamed from: a */
    private final Context f26258a;

    /* renamed from: b */
    private final ph1 f26259b;

    public y42(Context context, ph1 ph1) {
        this.f26258a = context;
        this.f26259b = ph1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        r42 r42 = new r42(bp2, (bd0) n22.f20467b, false);
        sg1 c = this.f26259b.mo20274c(new w41(np2, bp2, n22.f20466a), new wg1(r42, (pr0) null));
        r42.mo20584b(c.mo18070b());
        ((i42) n22.f20468c).mo18292f7(c.mo15976f());
        return c.mo19288i();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<bd0, i42> n22) throws zp2 {
        try {
            ((bd0) n22.f20467b).mo16213p0(bp2.f14631W);
            ((bd0) n22.f20467b).mo16204I1(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f26258a), new x42(this, n22, (w42) null), (ib0) n22.f20468c);
        } catch (RemoteException e) {
            throw new zp2(e);
        }
    }
}
