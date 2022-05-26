package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h21 extends e21 {

    /* renamed from: i */
    private final Context f17490i;

    /* renamed from: j */
    private final View f17491j;

    /* renamed from: k */
    private final pr0 f17492k;

    /* renamed from: l */
    private final cp2 f17493l;

    /* renamed from: m */
    private final e41 f17494m;

    /* renamed from: n */
    private final mk1 f17495n;

    /* renamed from: o */
    private final ag1 f17496o;

    /* renamed from: p */
    private final sr3<w82> f17497p;

    /* renamed from: q */
    private final Executor f17498q;

    /* renamed from: r */
    private zzbfi f17499r;

    h21(f41 f41, Context context, cp2 cp2, View view, pr0 pr0, e41 e41, mk1 mk1, ag1 ag1, sr3<w82> sr3, Executor executor) {
        super(f41);
        this.f17490i = context;
        this.f17491j = view;
        this.f17492k = pr0;
        this.f17493l = cp2;
        this.f17494m = e41;
        this.f17495n = mk1;
        this.f17496o = ag1;
        this.f17497p = sr3;
        this.f17498q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m24629o(h21 h21) {
        if (h21.f17495n.mo19405e() != null) {
            try {
                h21.f17495n.mo19405e().mo15682B5(h21.f17497p.mo10679a(), C4865b.m20503f2(h21.f17490i));
            } catch (RemoteException e) {
                ul0.m31860e("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo17838b() {
        this.f17498q.execute(new g21(this));
        super.mo17838b();
    }

    /* renamed from: h */
    public final int mo17083h() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() && this.f16935b.f14644e0) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22502d5)).booleanValue()) {
                return 0;
            }
        }
        return this.f16934a.f20683b.f20121b.f16051c;
    }

    /* renamed from: i */
    public final View mo17084i() {
        return this.f17491j;
    }

    /* renamed from: j */
    public final C5427ox mo17085j() {
        try {
            return this.f17494m.zza();
        } catch (zp2 unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final cp2 mo17086k() {
        zzbfi zzbfi = this.f17499r;
        if (zzbfi != null) {
            return yp2.m34268c(zzbfi);
        }
        bp2 bp2 = this.f16935b;
        if (bp2.f14634Z) {
            for (String next : bp2.f14635a) {
                if (next == null || !next.contains("FirstParty")) {
                }
            }
            return new cp2(this.f17491j.getWidth(), this.f17491j.getHeight(), false);
        }
        return yp2.m34267b(this.f16935b.f14664s, this.f17493l);
    }

    /* renamed from: l */
    public final cp2 mo17087l() {
        return this.f17493l;
    }

    /* renamed from: m */
    public final void mo17088m() {
        this.f17496o.zza();
    }

    /* renamed from: n */
    public final void mo17089n(ViewGroup viewGroup, zzbfi zzbfi) {
        pr0 pr0;
        if (viewGroup != null && (pr0 = this.f17492k) != null) {
            pr0.mo17656E0(gt0.m24494c(zzbfi));
            viewGroup.setMinimumHeight(zzbfi.f27217i);
            viewGroup.setMinimumWidth(zzbfi.f27220l);
            this.f17499r = zzbfi;
        }
    }
}
