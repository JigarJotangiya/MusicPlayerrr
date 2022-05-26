package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sa2 implements o83<g41> {

    /* renamed from: a */
    final /* synthetic */ la2 f23396a;

    /* renamed from: b */
    final /* synthetic */ xu2 f23397b;

    /* renamed from: c */
    final /* synthetic */ mi1 f23398c;

    /* renamed from: d */
    final /* synthetic */ ta2 f23399d;

    sa2(ta2 ta2, la2 la2, xu2 xu2, mi1 mi1) {
        this.f23399d = ta2;
        this.f23396a = la2;
        this.f23397b = xu2;
        this.f23398c = mi1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        g41 g41 = (g41) obj;
        synchronized (this.f23399d) {
            g41.mo17841e().mo20424a(this.f23399d.f23811d.mo18573d());
            this.f23396a.mo16152a(g41);
            this.f23399d.f23809b.mo19513d().execute(new qa2(this));
            if (this.f23397b != null) {
                zu2 d = this.f23399d.f23812e;
                xu2 xu2 = this.f23397b;
                xu2.mo22073d(g41.mo17843g().f20683b);
                xu2.mo22074e(g41.mo17839c().zze());
                xu2.mo22076g(true);
                d.mo22435a(xu2.mo22078i());
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        zzbew a = this.f23398c.mo19386a().mo18841a(th);
        this.f23398c.mo19387b().mo16370c(a);
        this.f23399d.f23809b.mo19513d().execute(new ra2(this, a));
        jq2.m25821b(a.f27186g, th, "NativeAdLoader.onFailure");
        this.f23396a.zza();
        if (this.f23397b != null) {
            zu2 d = this.f23399d.f23812e;
            xu2 xu2 = this.f23397b;
            xu2.mo22072c(a);
            xu2.mo22076g(false);
            d.mo22435a(xu2.mo22078i());
        }
    }
}
