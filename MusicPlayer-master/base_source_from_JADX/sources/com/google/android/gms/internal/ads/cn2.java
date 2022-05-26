package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cn2 implements ma2<rg1> {

    /* renamed from: a */
    private final Context f15041a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f15042b;

    /* renamed from: c */
    private final mt0 f15043c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final v92 f15044d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final do2 f15045e;

    /* renamed from: f */
    private m00 f15046f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zu2 f15047g;

    /* renamed from: h */
    private final sp2 f15048h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public d93<rg1> f15049i;

    public cn2(Context context, Executor executor, mt0 mt0, v92 v92, do2 do2, sp2 sp2) {
        this.f15041a = context;
        this.f15042b = executor;
        this.f15043c = mt0;
        this.f15044d = v92;
        this.f15048h = sp2;
        this.f15045e = do2;
        this.f15047g = mt0.mo19511b();
    }

    /* renamed from: a */
    public final boolean mo16308a(zzbfd zzbfd, String str, ka2 ka2, la2<? super rg1> la2) {
        ph1 ph1;
        xu2 p = xu2.m33823p(this.f15041a, 7, 4, zzbfd);
        if (str == null) {
            ul0.m31859d("Ad unit ID should not be null for interstitial ad.");
            this.f15042b.execute(new wm2(this));
            if (p != null) {
                zu2 zu2 = this.f15047g;
                p.mo22076g(false);
                zu2.mo22435a(p.mo22078i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                zu2 zu22 = this.f15047g;
                p.mo22076g(false);
                zu22.mo22435a(p.mo22078i());
            }
            return false;
        } else {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue() && zzbfd.f27200l) {
                this.f15043c.mo19525s().mo17373l(true);
            }
            zzbfi zzbfi = ((vm2) ka2).f24848a;
            sp2 sp2 = this.f15048h;
            sp2.mo20915H(str);
            sp2.mo20914G(zzbfi);
            sp2.mo20926d(zzbfd);
            up2 f = sp2.mo20928f();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22598p5)).booleanValue()) {
                oh1 n = this.f15043c.mo19520n();
                o71 o71 = new o71();
                o71.mo19907c(this.f15041a);
                o71.mo19910f(f);
                n.mo19857s(o71.mo19911g());
                vd1 vd1 = new vd1();
                vd1.mo21473m(this.f15044d, this.f15042b);
                vd1.mo21474n(this.f15044d, this.f15042b);
                n.mo19855i(vd1.mo21477q());
                n.mo19856j(new e82(this.f15046f));
                ph1 = n.mo19854c();
            } else {
                vd1 vd12 = new vd1();
                do2 do2 = this.f15045e;
                if (do2 != null) {
                    vd12.mo21468h(do2, this.f15042b);
                    vd12.mo21469i(this.f15045e, this.f15042b);
                    vd12.mo21465e(this.f15045e, this.f15042b);
                }
                oh1 n2 = this.f15043c.mo19520n();
                o71 o712 = new o71();
                o712.mo19907c(this.f15041a);
                o712.mo19910f(f);
                n2.mo19857s(o712.mo19911g());
                vd12.mo21473m(this.f15044d, this.f15042b);
                vd12.mo21468h(this.f15044d, this.f15042b);
                vd12.mo21469i(this.f15044d, this.f15042b);
                vd12.mo21465e(this.f15044d, this.f15042b);
                vd12.mo21464d(this.f15044d, this.f15042b);
                vd12.mo21475o(this.f15044d, this.f15042b);
                vd12.mo21474n(this.f15044d, this.f15042b);
                vd12.mo21472l(this.f15044d, this.f15042b);
                vd12.mo21466f(this.f15044d, this.f15042b);
                n2.mo19855i(vd12.mo21477q());
                n2.mo19856j(new e82(this.f15046f));
                ph1 = n2.mo19854c();
            }
            k51<rg1> a = ph1.mo20272a();
            d93<rg1> h = a.mo18847h(a.mo18848i());
            this.f15049i = h;
            s83.m30616r(h, new bn2(this, la2, p, ph1), this.f15042b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo16687g() {
        this.f15044d.mo16370c(nq2.m28048d(6, (String) null, (zzbew) null));
    }

    /* renamed from: h */
    public final void mo16688h(m00 m00) {
        this.f15046f = m00;
    }

    public final boolean zza() {
        d93<rg1> d93 = this.f15049i;
        return d93 != null && !d93.isDone();
    }
}
