package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ko2 implements o83<rp1> {

    /* renamed from: a */
    final /* synthetic */ la2 f18942a;

    /* renamed from: b */
    final /* synthetic */ xu2 f18943b;

    /* renamed from: c */
    final /* synthetic */ mo2 f18944c;

    /* renamed from: d */
    final /* synthetic */ oo2 f18945d;

    ko2(oo2 oo2, la2 la2, xu2 xu2, mo2 mo2) {
        this.f18945d = oo2;
        this.f18942a = la2;
        this.f18943b = xu2;
        this.f18944c = mo2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        rp1 rp1 = (rp1) obj;
        synchronized (this.f18945d) {
            rp1.mo17841e().mo20427d(this.f18945d.f21099d);
            this.f18942a.mo16152a(rp1);
            Executor g = this.f18945d.f21097b;
            do2 e = this.f18945d.f21099d;
            e.getClass();
            g.execute(new io2(e));
            this.f18945d.f21099d.mo16978r();
            if (this.f18943b != null) {
                zu2 f = this.f18945d.f21102g;
                xu2 xu2 = this.f18943b;
                xu2.mo22073d(rp1.mo17843g().f20683b);
                xu2.mo22074e(rp1.mo17839c().zze());
                xu2.mo22076g(true);
                f.mo22435a(xu2.mo22078i());
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        zzbew zzbew;
        wp1 wp1 = (wp1) this.f18945d.f21100e.mo16684f();
        if (wp1 == null) {
            zzbew = nq2.m28046b(th, (p22) null);
        } else {
            zzbew = wp1.mo16754a().mo18841a(th);
        }
        synchronized (this.f18945d) {
            if (wp1 != null) {
                wp1.mo17376e().mo16370c(zzbew);
                this.f18945d.f21097b.execute(new jo2(this, zzbew));
            } else {
                this.f18945d.f21099d.mo16370c(zzbew);
                this.f18945d.m28629j(this.f18944c).zze().mo16754a().mo18842c().mo16369a();
            }
            jq2.m25821b(zzbew.f27186g, th, "RewardedAdLoader.onFailure");
            if (this.f18943b != null) {
                zu2 f = this.f18945d.f21102g;
                xu2 xu2 = this.f18943b;
                xu2.mo22072c(zzbew);
                xu2.mo22076g(false);
                f.mo22435a(xu2.mo22078i());
            }
            this.f18942a.zza();
        }
    }
}
