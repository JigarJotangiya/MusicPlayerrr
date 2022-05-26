package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oo2 implements ma2<rp1> {

    /* renamed from: a */
    private final Context f21096a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f21097b;

    /* renamed from: c */
    private final mt0 f21098c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final do2 f21099d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final om2<wp1, rp1> f21100e;

    /* renamed from: f */
    private final pp2 f21101f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zu2 f21102g;

    /* renamed from: h */
    private final sp2 f21103h;

    /* renamed from: i */
    private d93<rp1> f21104i;

    public oo2(Context context, Executor executor, mt0 mt0, om2<wp1, rp1> om2, do2 do2, sp2 sp2, pp2 pp2) {
        this.f21096a = context;
        this.f21097b = executor;
        this.f21098c = mt0;
        this.f21100e = om2;
        this.f21099d = do2;
        this.f21103h = sp2;
        this.f21101f = pp2;
        this.f21102g = mt0.mo19511b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final vp1 m28629j(mm2 mm2) {
        mo2 mo2 = (mo2) mm2;
        vp1 p = this.f21098c.mo19522p();
        o71 o71 = new o71();
        o71.mo19907c(this.f21096a);
        o71.mo19910f(mo2.f20109a);
        String str = mo2.f20110b;
        o71.mo19909e(this.f21101f);
        p.mo16417a(o71.mo19911g());
        p.mo16418b(new vd1().mo21477q());
        return p;
    }

    /* renamed from: a */
    public final boolean mo16308a(zzbfd zzbfd, String str, ka2 ka2, la2<? super rp1> la2) throws RemoteException {
        zzcen zzcen = new zzcen(zzbfd, str);
        xu2 p = xu2.m33823p(this.f21096a, 7, 5, zzcen.f27358g);
        if (zzcen.f27359h == null) {
            ul0.m31859d("Ad unit ID should not be null for rewarded video ad.");
            this.f21097b.execute(new ho2(this));
            if (p != null) {
                zu2 zu2 = this.f21102g;
                p.mo22076g(false);
                zu2.mo22435a(p.mo22078i());
                return false;
            }
        } else {
            d93<rp1> d93 = this.f21104i;
            if (d93 == null || d93.isDone()) {
                jq2.m25820a(this.f21096a, zzcen.f27358g.f27200l);
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue() && zzcen.f27358g.f27200l) {
                    this.f21098c.mo19525s().mo17373l(true);
                }
                sp2 sp2 = this.f21103h;
                sp2.mo20915H(zzcen.f27359h);
                sp2.mo20914G(zzbfi.m34951o0());
                sp2.mo20926d(zzcen.f27358g);
                up2 f = sp2.mo20928f();
                mo2 mo2 = new mo2((lo2) null);
                mo2.f20109a = f;
                mo2.f20110b = null;
                d93<rp1> a = this.f21100e.mo16681a(new pm2(mo2, (zzcdq) null), new go2(this), null);
                this.f21104i = a;
                s83.m30616r(a, new ko2(this, la2, p, mo2), this.f21097b);
                return true;
            } else if (p != null) {
                zu2 zu22 = this.f21102g;
                p.mo22076g(false);
                zu22.mo22435a(p.mo22078i());
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo20065h() {
        this.f21099d.mo16370c(nq2.m28048d(6, (String) null, (zzbew) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo20066i(int i) {
        this.f21103h.mo20911D().mo18181a(i);
    }

    public final boolean zza() {
        throw null;
    }
}
