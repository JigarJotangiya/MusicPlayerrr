package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2958q;
import p082e.p098e.C3465a;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zh1 implements u91, C2958q {

    /* renamed from: g */
    private final Context f26781g;

    /* renamed from: h */
    private final pr0 f26782h;

    /* renamed from: i */
    private final bp2 f26783i;

    /* renamed from: j */
    private final zzcjf f26784j;

    /* renamed from: k */
    private final C5124gq f26785k;

    /* renamed from: l */
    C4863a f26786l;

    public zh1(Context context, pr0 pr0, bp2 bp2, zzcjf zzcjf, C5124gq gqVar) {
        this.f26781g = context;
        this.f26782h = pr0;
        this.f26783i = bp2;
        this.f26784j = zzcjf;
        this.f26785k = gqVar;
    }

    /* renamed from: F5 */
    public final void mo10899F5() {
    }

    /* renamed from: a */
    public final void mo10900a() {
        pr0 pr0;
        if (this.f26786l != null && (pr0 = this.f26782h) != null) {
            pr0.mo16880n0("onSdkImpression", new C3465a());
        }
    }

    /* renamed from: k */
    public final void mo15615k() {
        se0 se0;
        te0 te0;
        te0 te02;
        C5124gq gqVar = this.f26785k;
        if ((gqVar == C5124gq.REWARD_BASED_VIDEO_AD || gqVar == C5124gq.INTERSTITIAL || gqVar == C5124gq.APP_OPEN) && this.f26783i.f14625Q && this.f26782h != null && C2971s.m13206i().mo18281V(this.f26781g)) {
            zzcjf zzcjf = this.f26784j;
            int i = zzcjf.f27377h;
            int i2 = zzcjf.f27378i;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String a = this.f26783i.f14627S.mo22062a();
            if (this.f26783i.f14627S.mo22063b() == 1) {
                se0 = se0.VIDEO;
                te0 = te0.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.f26783i.f14630V == 2) {
                    te02 = te0.UNSPECIFIED;
                } else {
                    te02 = te0.BEGIN_TO_RENDER;
                }
                te0 = te02;
                se0 = se0.HTML_DISPLAY;
            }
            C4863a S = C2971s.m13206i().mo18278S(sb2, this.f26782h.mo17664K(), BuildConfig.FLAVOR, "javascript", a, te0, se0, this.f26783i.f14654j0);
            this.f26786l = S;
            if (S != null) {
                C2971s.m13206i().mo18279T(this.f26786l, (View) this.f26782h);
                this.f26782h.mo17680V0(this.f26786l);
                C2971s.m13206i().mo18275P(this.f26786l);
                this.f26782h.mo16880n0("onSdkLoaded", new C3465a());
            }
        }
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
    }

    /* renamed from: y3 */
    public final void mo10902y3() {
    }

    /* renamed from: z */
    public final void mo10903z(int i) {
        this.f26786l = null;
    }

    public final void zze() {
    }
}
