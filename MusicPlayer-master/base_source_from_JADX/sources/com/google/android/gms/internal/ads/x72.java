package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x72 implements k22<e21> {

    /* renamed from: a */
    private final Context f25704a;

    /* renamed from: b */
    private final c31 f25705b;

    /* renamed from: c */
    private final m00 f25706c;

    /* renamed from: d */
    private final e93 f25707d;

    /* renamed from: e */
    private final wt2 f25708e;

    public x72(Context context, c31 c31, wt2 wt2, e93 e93, m00 m00) {
        this.f25704a = context;
        this.f25705b = c31;
        this.f25708e = wt2;
        this.f25707d = e93;
        this.f25706c = m00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f14665t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15700a(com.google.android.gms.internal.ads.np2 r1, com.google.android.gms.internal.ads.bp2 r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.m00 r1 = r0.f25706c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.gp2 r1 = r2.f14665t
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f17223a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x72.mo15700a(com.google.android.gms.internal.ads.np2, com.google.android.gms.internal.ads.bp2):boolean");
    }

    /* renamed from: b */
    public final d93<e21> mo15701b(np2 np2, bp2 bp2) {
        f21 a = this.f25705b.mo16463a(new w41(np2, bp2, (String) null), new u72(this, new View(this.f25704a), (pr0) null, s72.f23361a, bp2.f14667v.get(0)));
        v72 k = a.mo17461k();
        gp2 gp2 = bp2.f14665t;
        g00 g00 = new g00(k, gp2.f17224b, gp2.f17223a);
        wt2 wt2 = this.f25708e;
        return ft2.m23963d(new t72(this, g00), this.f25707d, pt2.CUSTOM_RENDER_SYN, wt2).mo19535b(pt2.CUSTOM_RENDER_ACK).mo19537d(s83.m30607i(a.mo17458h())).mo19534a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21985c(g00 g00) throws Exception {
        this.f25706c.mo18776p4(g00);
    }
}
