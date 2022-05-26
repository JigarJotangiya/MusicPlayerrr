package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yj2 implements o83 {

    /* renamed from: a */
    final /* synthetic */ la2 f26371a;

    /* renamed from: b */
    final /* synthetic */ xu2 f26372b;

    /* renamed from: c */
    final /* synthetic */ ak2 f26373c;

    /* renamed from: d */
    final /* synthetic */ bk2 f26374d;

    yj2(bk2 bk2, la2 la2, xu2 xu2, ak2 ak2) {
        this.f26374d = bk2;
        this.f26371a = la2;
        this.f26372b = xu2;
        this.f26373c = ak2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        g41 g41 = (g41) obj;
        synchronized (this.f26374d) {
            this.f26374d.f14535i = null;
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22590o5)).booleanValue()) {
                g41.mo17841e().mo20425b(this.f26374d.f14530d);
            }
            this.f26371a.mo16152a(g41);
            if (this.f26372b != null) {
                zu2 g = this.f26374d.f14533g;
                xu2 xu2 = this.f26372b;
                xu2.mo22073d(g41.mo17843g().f20683b);
                xu2.mo22074e(g41.mo17839c().zze());
                xu2.mo22076g(true);
                g.mo22435a(xu2.mo22078i());
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        zzbew zzbew;
        m11 m11 = (m11) this.f26374d.f14531e.mo16684f();
        if (m11 == null) {
            zzbew = nq2.m28046b(th, (p22) null);
        } else {
            zzbew = m11.mo16754a().mo18841a(th);
        }
        synchronized (this.f26374d) {
            this.f26374d.f14535i = null;
            if (m11 != null) {
                m11.mo16755b().mo16370c(zzbew);
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22590o5)).booleanValue()) {
                    this.f26374d.f14528b.execute(new xj2(this, zzbew));
                }
            } else {
                this.f26374d.f14530d.mo16370c(zzbew);
                ((m11) this.f26374d.m21416l(this.f26373c).mo16419e()).mo16754a().mo18842c().mo16369a();
            }
            jq2.m25821b(zzbew.f27186g, th, "AppOpenAdLoader.onFailure");
            this.f26371a.zza();
            if (this.f26372b != null) {
                zu2 g = this.f26374d.f14533g;
                xu2 xu2 = this.f26372b;
                xu2.mo22072c(zzbew);
                xu2.mo22076g(false);
                g.mo22435a(xu2.mo22078i());
            }
        }
    }
}
