package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2894c;
import com.google.android.gms.ads.C2899d0;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.C3107o;
import com.google.android.gms.ads.C3112s;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.ads.admanager.C2889b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.xx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5760xx {

    /* renamed from: a */
    private final za0 f26102a;

    /* renamed from: b */
    private final C5016du f26103b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3114t f26104c;

    /* renamed from: d */
    final C5017dv f26105d;

    /* renamed from: e */
    private C5497qt f26106e;

    /* renamed from: f */
    private C2894c f26107f;

    /* renamed from: g */
    private C2921g[] f26108g;

    /* renamed from: h */
    private C2889b f26109h;

    /* renamed from: i */
    private C5833zv f26110i;

    /* renamed from: j */
    private C3116u f26111j;

    /* renamed from: k */
    private String f26112k;

    /* renamed from: l */
    private final ViewGroup f26113l;

    /* renamed from: m */
    private int f26114m;

    /* renamed from: n */
    private boolean f26115n;

    /* renamed from: o */
    private C3107o f26116o;

    public C5760xx(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, C5016du.f15749a, (C5833zv) null, 0);
    }

    /* renamed from: b */
    private static zzbfi m33872b(Context context, C2921g[] gVarArr, int i) {
        for (C2921g equals : gVarArr) {
            if (equals.equals(C2921g.f9801q)) {
                return zzbfi.m34952v0();
            }
        }
        zzbfi zzbfi = new zzbfi(context, gVarArr);
        zzbfi.f27224p = m33873c(i);
        return zzbfi;
    }

    /* renamed from: c */
    private static boolean m33873c(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final C2921g[] mo22091a() {
        return this.f26108g;
    }

    /* renamed from: d */
    public final C2894c mo22092d() {
        return this.f26107f;
    }

    /* renamed from: e */
    public final C2921g mo22093e() {
        zzbfi d;
        try {
            C5833zv zvVar = this.f26110i;
            if (!(zvVar == null || (d = zvVar.mo10940d()) == null)) {
                return C2899d0.m12942c(d.f27219k, d.f27216h, d.f27215g);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        C2921g[] gVarArr = this.f26108g;
        if (gVarArr != null) {
            return gVarArr[0];
        }
        return null;
    }

    /* renamed from: f */
    public final C3107o mo22094f() {
        return this.f26116o;
    }

    /* renamed from: g */
    public final C3112s mo22095g() {
        C5316lx lxVar = null;
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                lxVar = zvVar.mo10947i();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        return C3112s.m13667c(lxVar);
    }

    /* renamed from: i */
    public final C3114t mo22096i() {
        return this.f26104c;
    }

    /* renamed from: j */
    public final C3116u mo22097j() {
        return this.f26111j;
    }

    /* renamed from: k */
    public final C2889b mo22098k() {
        return this.f26109h;
    }

    /* renamed from: l */
    public final C5427ox mo22099l() {
        C5833zv zvVar = this.f26110i;
        if (zvVar != null) {
            try {
                return zvVar.mo10948j();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String mo22100m() {
        C5833zv zvVar;
        if (this.f26112k == null && (zvVar = this.f26110i) != null) {
            try {
                this.f26112k = zvVar.zzr();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
        return this.f26112k;
    }

    /* renamed from: n */
    public final void mo22101n() {
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10926G();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo22102o(C5686vx vxVar) {
        C5833zv zvVar;
        try {
            if (this.f26110i == null) {
                if (this.f26108g == null || this.f26112k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f26113l.getContext();
                zzbfi b = m33872b(context, this.f26108g, this.f26114m);
                if ("search_v2".equals(b.f27215g)) {
                    zvVar = (C5833zv) new C5535ru(C4980cv.m22122a(), context, b, this.f26112k).mo16392d(context, false);
                } else {
                    zvVar = (C5833zv) new C5424ou(C4980cv.m22122a(), context, b, this.f26112k, this.f26102a).mo16392d(context, false);
                }
                this.f26110i = zvVar;
                zvVar.mo10952k5(new C5645ut(this.f26105d));
                C5497qt qtVar = this.f26106e;
                if (qtVar != null) {
                    this.f26110i.mo10935Q0(new C5534rt(qtVar));
                }
                C2889b bVar = this.f26109h;
                if (bVar != null) {
                    this.f26110i.mo10951k2(new C5380nn(bVar));
                }
                C3116u uVar = this.f26111j;
                if (uVar != null) {
                    this.f26110i.mo10937S6(new zzbkq(uVar));
                }
                this.f26110i.mo10946h3(new C5613ty(this.f26116o));
                this.f26110i.mo10936R6(this.f26115n);
                C5833zv zvVar2 = this.f26110i;
                if (zvVar2 != null) {
                    try {
                        C4863a k = zvVar2.mo10950k();
                        if (k != null) {
                            this.f26113l.addView((View) C4865b.m20502K0(k));
                        }
                    } catch (RemoteException e) {
                        ul0.m31864i("#007 Could not call remote method.", e);
                    }
                }
            }
            C5833zv zvVar3 = this.f26110i;
            Objects.requireNonNull(zvVar3);
            if (zvVar3.mo10934O5(this.f26103b.mo17016a(this.f26113l.getContext(), vxVar))) {
                this.f26102a.mo22352f7(vxVar.mo21619p());
            }
        } catch (RemoteException e2) {
            ul0.m31864i("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: p */
    public final void mo22103p() {
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10933O();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo22104q() {
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10927I();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo22105r(C5497qt qtVar) {
        try {
            this.f26106e = qtVar;
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10935Q0(qtVar != null ? new C5534rt(qtVar) : null);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo22106s(C2894c cVar) {
        this.f26107f = cVar;
        this.f26105d.mo17020p(cVar);
    }

    /* renamed from: t */
    public final void mo22107t(C2921g... gVarArr) {
        if (this.f26108g == null) {
            mo22108u(gVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: u */
    public final void mo22108u(C2921g... gVarArr) {
        this.f26108g = gVarArr;
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10960v5(m33872b(this.f26113l.getContext(), this.f26108g, this.f26114m));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        this.f26113l.requestLayout();
    }

    /* renamed from: v */
    public final void mo22109v(String str) {
        if (this.f26112k == null) {
            this.f26112k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: w */
    public final void mo22110w(C2889b bVar) {
        try {
            this.f26109h = bVar;
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10951k2(bVar != null ? new C5380nn(bVar) : null);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: x */
    public final void mo22111x(boolean z) {
        this.f26115n = z;
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10936R6(z);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: y */
    public final void mo22112y(C3107o oVar) {
        try {
            this.f26116o = oVar;
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                zvVar.mo10946h3(new C5613ty(oVar));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: z */
    public final void mo22113z(C3116u uVar) {
        zzbkq zzbkq;
        this.f26111j = uVar;
        try {
            C5833zv zvVar = this.f26110i;
            if (zvVar != null) {
                if (uVar == null) {
                    zzbkq = null;
                } else {
                    zzbkq = new zzbkq(uVar);
                }
                zvVar.mo10937S6(zzbkq);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    public C5760xx(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, C5016du.f15749a, (C5833zv) null, i);
    }

    public C5760xx(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C5016du.f15749a, (C5833zv) null, 0);
    }

    public C5760xx(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, C5016du.f15749a, (C5833zv) null, i);
    }

    C5760xx(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C5016du duVar, C5833zv zvVar, int i) {
        zzbfi zzbfi;
        this.f26102a = new za0();
        this.f26104c = new C3114t();
        this.f26105d = new C5723wx(this);
        this.f26113l = viewGroup;
        this.f26103b = duVar;
        this.f26110i = null;
        new AtomicBoolean(false);
        this.f26114m = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzbfq zzbfq = new zzbfq(context, attributeSet);
                this.f26108g = zzbfq.mo22544b(z);
                this.f26112k = zzbfq.mo22543a();
                if (viewGroup.isInEditMode()) {
                    nl0 b = C4980cv.m22123b();
                    C2921g gVar = this.f26108g[0];
                    int i2 = this.f26114m;
                    if (gVar.equals(C2921g.f9801q)) {
                        zzbfi = zzbfi.m34952v0();
                    } else {
                        zzbfi zzbfi2 = new zzbfi(context, gVar);
                        zzbfi2.f27224p = m33873c(i2);
                        zzbfi = zzbfi2;
                    }
                    b.mo19751h(viewGroup, zzbfi, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C4980cv.m22123b().mo19750g(viewGroup, new zzbfi(context, C2921g.f9793i), e.getMessage(), e.getMessage());
            }
        }
    }
}
