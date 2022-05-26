package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bn2 implements o83<rg1> {

    /* renamed from: a */
    final /* synthetic */ la2 f14570a;

    /* renamed from: b */
    final /* synthetic */ xu2 f14571b;

    /* renamed from: c */
    final /* synthetic */ ph1 f14572c;

    /* renamed from: d */
    final /* synthetic */ cn2 f14573d;

    bn2(cn2 cn2, la2 la2, xu2 xu2, ph1 ph1) {
        this.f14573d = cn2;
        this.f14570a = la2;
        this.f14571b = xu2;
        this.f14572c = ph1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        rg1 rg1 = (rg1) obj;
        synchronized (this.f14573d) {
            this.f14573d.f15049i = null;
            C5207iz izVar = C5503qz.f22598p5;
            if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                qc1 e = rg1.mo17841e();
                e.mo20424a(this.f14573d.f15044d);
                e.mo20427d(this.f14573d.f15045e);
            }
            this.f14570a.mo16152a(rg1);
            if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                this.f14573d.f15042b.execute(new xm2(this));
                this.f14573d.f15042b.execute(new ym2(this));
            }
            if (this.f14571b != null) {
                zu2 d = this.f14573d.f15047g;
                xu2 xu2 = this.f14571b;
                xu2.mo22073d(rg1.mo17843g().f20683b);
                xu2.mo22074e(rg1.mo17839c().zze());
                xu2.mo22076g(true);
                d.mo22435a(xu2.mo22078i());
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        zzbew a = this.f14572c.mo20272a().mo18841a(th);
        synchronized (this.f14573d) {
            this.f14573d.f15049i = null;
            this.f14572c.mo20273b().mo16370c(a);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22598p5)).booleanValue()) {
                this.f14573d.f15042b.execute(new zm2(this, a));
                this.f14573d.f15042b.execute(new an2(this, a));
            }
            jq2.m25821b(a.f27186g, th, "InterstitialAdLoader.onFailure");
            if (this.f14571b != null) {
                zu2 d = this.f14573d.f15047g;
                xu2 xu2 = this.f14571b;
                xu2.mo22072c(a);
                xu2.mo22076g(false);
                d.mo22435a(xu2.mo22078i());
            }
            this.f14570a.zza();
        }
    }
}
