package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n52 implements t22<vj1, bd0, i42> {

    /* renamed from: a */
    private final Context f20512a;

    /* renamed from: b */
    private final mi1 f20513b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public rb0 f20514c;

    /* renamed from: d */
    private final zzcjf f20515d;

    public n52(Context context, mi1 mi1, zzcjf zzcjf) {
        this.f20512a = context;
        this.f20513b = mi1;
        this.f20515d = zzcjf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        if (np2.f20682a.f18953a.f24398g.contains(Integer.toString(6))) {
            bk1 a0 = bk1.m21356a0(this.f20514c);
            if (np2.f20682a.f18953a.f24398g.contains(Integer.toString(a0.mo16259K()))) {
                dk1 d = this.f20513b.mo19389d(new w41(np2, bp2, n22.f20466a), new nk1(a0), new cm1((ob0) null, (nb0) null, this.f20514c, (byte[]) null));
                ((i42) n22.f20468c).mo18292f7(d.mo15976f());
                return d.mo15978h();
            }
            throw new e62(1, "No corresponding native ad listener");
        }
        throw new e62(2, "Unified must be used for RTB.");
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<bd0, i42> n22) throws zp2 {
        try {
            ((bd0) n22.f20467b).mo16213p0(bp2.f14631W);
            if (this.f20515d.f27378i < ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22482b1)).intValue()) {
                ((bd0) n22.f20467b).mo16214z1(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f20512a), new m52(this, n22, (l52) null), (ib0) n22.f20468c);
            } else {
                ((bd0) n22.f20467b).mo16205S3(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f20512a), new m52(this, n22, (l52) null), (ib0) n22.f20468c, np2.f20682a.f18953a.f24400i);
            }
        } catch (RemoteException e) {
            throw new zp2(e);
        }
    }
}
