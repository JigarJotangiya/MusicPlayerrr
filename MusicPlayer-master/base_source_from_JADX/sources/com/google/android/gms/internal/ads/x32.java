package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x32 implements t22<e21, bd0, i42> {

    /* renamed from: a */
    private final Context f25652a;

    /* renamed from: b */
    private final c31 f25653b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f25654c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public lb0 f25655d;

    public x32(Context context, c31 c31) {
        this.f25652a = context;
        this.f25653b = c31;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17870a(np2 np2, bp2 bp2, n22 n22) throws zp2, e62 {
        View view;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() || !bp2.f14644e0) {
            view = this.f25654c;
        } else {
            try {
                view = (View) C4865b.m20502K0(this.f25655d.zze());
                boolean c = this.f25655d.mo16588c();
                if (view == null) {
                    throw new zp2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (c) {
                    try {
                        view = (View) s83.m30612n(s83.m30607i(null), new u32(this, view, bp2), hm0.f17712e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zp2(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zp2(e2);
            }
        }
        f21 a = this.f25653b.mo16463a(new w41(np2, bp2, n22.f20466a), new m21(view, (pr0) null, new t32(n22), bp2.f14667v.get(0)));
        a.mo17459i().mo20839N0(view);
        ((i42) n22.f20468c).mo18292f7(a.mo15976f());
        return a.mo17458h();
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<bd0, i42> n22) throws zp2 {
        try {
            ((bd0) n22.f20467b).mo16213p0(bp2.f14631W);
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() || !bp2.f14644e0) {
                ((bd0) n22.f20467b).mo16203E1(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f25652a), new w32(this, n22, (v32) null), (ib0) n22.f20468c, np2.f20682a.f18953a.f24396e);
            } else {
                ((bd0) n22.f20467b).mo16207b1(bp2.f14626R, bp2.f14668w.toString(), np2.f20682a.f18953a.f24395d, C4865b.m20503f2(this.f25652a), new w32(this, n22, (v32) null), (ib0) n22.f20468c, np2.f20682a.f18953a.f24396e);
            }
        } catch (RemoteException e) {
            throw new zp2(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo21964c(View view, bp2 bp2, Object obj) throws Exception {
        return s83.m30607i(v31.m32132a(this.f25652a, view, bp2));
    }
}
