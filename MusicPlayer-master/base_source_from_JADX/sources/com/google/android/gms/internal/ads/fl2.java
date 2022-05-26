package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fl2 implements o83<e21> {

    /* renamed from: a */
    final /* synthetic */ la2 f16677a;

    /* renamed from: b */
    final /* synthetic */ xu2 f16678b;

    /* renamed from: c */
    final /* synthetic */ c31 f16679c;

    /* renamed from: d */
    final /* synthetic */ gl2 f16680d;

    fl2(gl2 gl2, la2 la2, xu2 xu2, c31 c31) {
        this.f16680d = gl2;
        this.f16677a = la2;
        this.f16678b = xu2;
        this.f16679c = c31;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        e21 e21 = (e21) obj;
        synchronized (this.f16680d) {
            this.f16680d.f17195k = null;
            this.f16680d.f17190f.removeAllViews();
            if (e21.mo17084i() != null) {
                ViewParent parent = e21.mo17084i().getParent();
                if (parent instanceof ViewGroup) {
                    String str = BuildConfig.FLAVOR;
                    if (e21.mo17839c() != null) {
                        str = e21.mo17839c().zze();
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    ul0.m31862g(sb.toString());
                    ((ViewGroup) parent).removeView(e21.mo17084i());
                }
            }
            C5207iz izVar = C5503qz.f22582n5;
            if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                qc1 e = e21.mo17841e();
                e.mo20424a(this.f16680d.f17188d);
                e.mo20426c(this.f16680d.f17189e);
            }
            this.f16680d.f17190f.addView(e21.mo17084i());
            this.f16677a.mo16152a(e21);
            if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
                Executor i = this.f16680d.f17186b;
                v92 e2 = this.f16680d.f17188d;
                e2.getClass();
                i.execute(new dl2(e2));
            }
            this.f16680d.f17192h.mo21773N0(e21.mo17083h());
            if (this.f16678b != null) {
                zu2 h = this.f16680d.f17193i;
                xu2 xu2 = this.f16678b;
                xu2.mo22073d(e21.mo17843g().f20683b);
                xu2.mo22074e(e21.mo17839c().zze());
                xu2.mo22076g(true);
                h.mo22435a(xu2.mo22078i());
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        zzbew a = this.f16679c.mo16466d().mo18841a(th);
        synchronized (this.f16680d) {
            this.f16680d.f17195k = null;
            this.f16679c.mo16467e().mo16370c(a);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22582n5)).booleanValue()) {
                this.f16680d.f17186b.execute(new el2(this, a));
            }
            this.f16680d.f17192h.mo21773N0(60);
            jq2.m25821b(a.f27186g, th, "BannerAdLoader.onFailure");
            this.f16677a.zza();
            if (this.f16678b != null) {
                zu2 h = this.f16680d.f17193i;
                xu2 xu2 = this.f16678b;
                xu2.mo22072c(a);
                xu2.mo22076g(false);
                h.mo22435a(xu2.mo22078i());
            }
        }
    }
}
