package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ta2 implements ma2<g41> {

    /* renamed from: a */
    private final sp2 f23808a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final mt0 f23809b;

    /* renamed from: c */
    private final Context f23810c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ja2 f23811d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zu2 f23812e;

    /* renamed from: f */
    private v41 f23813f;

    public ta2(mt0 mt0, Context context, ja2 ja2, sp2 sp2) {
        this.f23809b = mt0;
        this.f23810c = context;
        this.f23811d = ja2;
        this.f23808a = sp2;
        this.f23812e = mt0.mo19511b();
        sp2.mo20917J(ja2.mo18573d());
    }

    /* renamed from: a */
    public final boolean mo16308a(zzbfd zzbfd, String str, ka2 ka2, la2<? super g41> la2) throws RemoteException {
        xu2 p = xu2.m33823p(this.f23810c, 7, 8, zzbfd);
        C2971s.m13214q();
        if (C2979b2.m13264l(this.f23810c) && zzbfd.f27213y == null) {
            ul0.m31859d("Failed to load the ad because app ID is missing.");
            this.f23809b.mo19513d().execute(new oa2(this));
            if (p != null) {
                zu2 zu2 = this.f23812e;
                p.mo22076g(false);
                zu2.mo22435a(p.mo22078i());
            }
            return false;
        } else if (str == null) {
            ul0.m31859d("Ad unit ID should not be null for NativeAdLoader.");
            this.f23809b.mo19513d().execute(new pa2(this));
            if (p != null) {
                zu2 zu22 = this.f23812e;
                p.mo22076g(false);
                zu22.mo22435a(p.mo22078i());
            }
            return false;
        } else {
            jq2.m25820a(this.f23810c, zzbfd.f27200l);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue() && zzbfd.f27200l) {
                this.f23809b.mo19525s().mo17373l(true);
            }
            int i = ((na2) ka2).f20571a;
            sp2 sp2 = this.f23808a;
            sp2.mo20926d(zzbfd);
            sp2.mo20921N(i);
            up2 f = sp2.mo20928f();
            if (f.f24405n != null) {
                this.f23811d.mo18573d().mo21447v(f.f24405n);
            }
            li1 o = this.f23809b.mo19521o();
            o71 o71 = new o71();
            o71.mo19907c(this.f23810c);
            o71.mo19910f(f);
            o.mo19179n(o71.mo19911g());
            vd1 vd1 = new vd1();
            vd1.mo21474n(this.f23811d.mo18573d(), this.f23809b.mo19513d());
            o.mo19180q(vd1.mo21477q());
            o.mo19178g(this.f23811d.mo18572c());
            o.mo19177f(new b21((ViewGroup) null));
            mi1 d = o.mo19176d();
            this.f23809b.mo19508C().mo19273c(1);
            e93 e93 = hm0.f17708a;
            gs3.m24490b(e93);
            ScheduledExecutorService e = this.f23809b.mo19514e();
            k51<o41> a = d.mo19386a();
            v41 v41 = new v41(e93, e, a.mo18847h(a.mo18848i()));
            this.f23813f = v41;
            v41.mo21422e(new sa2(this, la2, p, d));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo21045e() {
        this.f23811d.mo18570a().mo16370c(nq2.m28048d(4, (String) null, (zzbew) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo21046f() {
        this.f23811d.mo18570a().mo16370c(nq2.m28048d(6, (String) null, (zzbew) null));
    }

    public final boolean zza() {
        v41 v41 = this.f23813f;
        return v41 != null && v41.mo21423f();
    }
}
