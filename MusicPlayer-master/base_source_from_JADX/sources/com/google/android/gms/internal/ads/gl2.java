package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gl2 implements ma2<e21> {

    /* renamed from: a */
    private final Context f17185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f17186b;

    /* renamed from: c */
    private final mt0 f17187c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final v92 f17188d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final aa2 f17189e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f17190f;

    /* renamed from: g */
    private m00 f17191g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final wa1 f17192h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zu2 f17193i;

    /* renamed from: j */
    private final sp2 f17194j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public d93<e21> f17195k;

    public gl2(Context context, Executor executor, zzbfi zzbfi, mt0 mt0, v92 v92, aa2 aa2, sp2 sp2) {
        this.f17185a = context;
        this.f17186b = executor;
        this.f17187c = mt0;
        this.f17188d = v92;
        this.f17189e = aa2;
        this.f17194j = sp2;
        this.f17192h = mt0.mo19519m();
        this.f17193i = mt0.mo19511b();
        this.f17190f = new FrameLayout(context);
        sp2.mo20914G(zzbfi);
    }

    /* renamed from: a */
    public final boolean mo16308a(zzbfd zzbfd, String str, ka2 ka2, la2<? super e21> la2) throws RemoteException {
        c31 c31;
        xu2 p = xu2.m33823p(this.f17185a, 7, 3, zzbfd);
        if (str == null) {
            ul0.m31859d("Ad unit ID should not be null for banner ad.");
            this.f17186b.execute(new cl2(this));
            if (p != null) {
                zu2 zu2 = this.f17193i;
                p.mo22076g(false);
                zu2.mo22435a(p.mo22078i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                zu2 zu22 = this.f17193i;
                p.mo22076g(false);
                zu22.mo22435a(p.mo22078i());
            }
            return false;
        } else {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue() && zzbfd.f27200l) {
                this.f17187c.mo19525s().mo17373l(true);
            }
            sp2 sp2 = this.f17194j;
            sp2.mo20915H(str);
            sp2.mo20926d(zzbfd);
            up2 f = sp2.mo20928f();
            if (!k10.f18712b.mo20989e().booleanValue() || !this.f17194j.mo20933v().f27225q) {
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22582n5)).booleanValue()) {
                    b31 l = this.f17187c.mo19518l();
                    o71 o71 = new o71();
                    o71.mo19907c(this.f17185a);
                    o71.mo19910f(f);
                    l.mo16032l(o71.mo19911g());
                    vd1 vd1 = new vd1();
                    vd1.mo21473m(this.f17188d, this.f17186b);
                    vd1.mo21474n(this.f17188d, this.f17186b);
                    l.mo16035r(vd1.mo21477q());
                    l.mo16034p(new e82(this.f17191g));
                    l.mo16030g(new hi1(mk1.f20062h, (C5314lv) null));
                    l.mo16033m(new a41(this.f17192h));
                    l.mo16029f(new b21(this.f17190f));
                    c31 = l.mo16031h();
                } else {
                    b31 l2 = this.f17187c.mo19518l();
                    o71 o712 = new o71();
                    o712.mo19907c(this.f17185a);
                    o712.mo19910f(f);
                    l2.mo16032l(o712.mo19911g());
                    vd1 vd12 = new vd1();
                    vd12.mo21473m(this.f17188d, this.f17186b);
                    vd12.mo21464d(this.f17188d, this.f17186b);
                    vd12.mo21464d(this.f17189e, this.f17186b);
                    vd12.mo21475o(this.f17188d, this.f17186b);
                    vd12.mo21467g(this.f17188d, this.f17186b);
                    vd12.mo21468h(this.f17188d, this.f17186b);
                    vd12.mo21469i(this.f17188d, this.f17186b);
                    vd12.mo21465e(this.f17188d, this.f17186b);
                    vd12.mo21474n(this.f17188d, this.f17186b);
                    vd12.mo21472l(this.f17188d, this.f17186b);
                    l2.mo16035r(vd12.mo21477q());
                    l2.mo16034p(new e82(this.f17191g));
                    l2.mo16030g(new hi1(mk1.f20062h, (C5314lv) null));
                    l2.mo16033m(new a41(this.f17192h));
                    l2.mo16029f(new b21(this.f17190f));
                    c31 = l2.mo16031h();
                }
                k51<e21> d = c31.mo16466d();
                d93<e21> h = d.mo18847h(d.mo18848i());
                this.f17195k = h;
                s83.m30616r(h, new fl2(this, la2, p, c31), this.f17186b);
                return true;
            }
            v92 v92 = this.f17188d;
            if (v92 != null) {
                v92.mo16370c(nq2.m28048d(7, (String) null, (zzbew) null));
            }
            if (p != null) {
                zu2 zu23 = this.f17193i;
                p.mo22076g(false);
                zu23.mo22435a(p.mo22078i());
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ViewGroup mo17972c() {
        return this.f17190f;
    }

    /* renamed from: g */
    public final sp2 mo17973g() {
        return this.f17194j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo17974k() {
        this.f17188d.mo16370c(nq2.m28048d(6, (String) null, (zzbew) null));
    }

    /* renamed from: l */
    public final void mo17975l() {
        this.f17192h.mo21773N0(60);
    }

    /* renamed from: m */
    public final void mo17976m(C5203iv ivVar) {
        this.f17189e.mo15728a(ivVar);
    }

    /* renamed from: n */
    public final void mo17977n(xa1 xa1) {
        this.f17192h.mo21251D0(xa1, this.f17186b);
    }

    /* renamed from: o */
    public final void mo17978o(m00 m00) {
        this.f17191g = m00;
    }

    /* renamed from: p */
    public final boolean mo17979p() {
        ViewParent parent = this.f17190f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C2971s.m13214q();
        return C2979b2.m13233B(view, view.getContext());
    }

    public final boolean zza() {
        d93<e21> d93 = this.f17195k;
        return d93 != null && !d93.isDone();
    }
}
