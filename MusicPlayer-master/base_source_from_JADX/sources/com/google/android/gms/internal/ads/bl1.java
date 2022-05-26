package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.C2915f;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.ads.internal.util.C3056z0;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bl1 {

    /* renamed from: a */
    private final C3024o1 f14537a;

    /* renamed from: b */
    private final up2 f14538b;

    /* renamed from: c */
    private final gk1 f14539c;

    /* renamed from: d */
    private final bk1 f14540d;

    /* renamed from: e */
    private final ml1 f14541e;

    /* renamed from: f */
    private final ul1 f14542f;

    /* renamed from: g */
    private final Executor f14543g;

    /* renamed from: h */
    private final Executor f14544h;

    /* renamed from: i */
    private final zzbnw f14545i;

    /* renamed from: j */
    private final xj1 f14546j;

    public bl1(C3024o1 o1Var, up2 up2, gk1 gk1, bk1 bk1, ml1 ml1, ul1 ul1, Executor executor, Executor executor2, xj1 xj1) {
        this.f14537a = o1Var;
        this.f14538b = up2;
        this.f14545i = up2.f24400i;
        this.f14539c = gk1;
        this.f14540d = bk1;
        this.f14541e = ml1;
        this.f14542f = ul1;
        this.f14543g = executor;
        this.f14544h = executor2;
        this.f14546j = xj1;
    }

    /* renamed from: g */
    private static void m21422g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: h */
    private final boolean m21423h(ViewGroup viewGroup, boolean z) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            view = this.f14540d.mo16262N();
        } else {
            view = this.f14540d.mo16263O();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22531h2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo16314a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f14540d.mo16262N() == null) {
            return;
        }
        if (this.f14540d.mo16259K() == 2 || this.f14540d.mo16259K() == 1) {
            this.f14537a.mo11076U(this.f14538b.f24397f, String.valueOf(this.f14540d.mo16259K()), z);
        } else if (this.f14540d.mo16259K() == 6) {
            this.f14537a.mo11076U(this.f14538b.f24397f, "2", z);
            this.f14537a.mo11076U(this.f14538b.f24397f, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo16315b(wl1 wl1) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        n20 a;
        Drawable drawable;
        C4863a aVar = null;
        if (this.f14539c.mo17551e() || this.f14539c.mo17550d()) {
            String[] strArr = {"1098", "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View C0 = wl1.mo21282C0(strArr[i]);
                if (C0 != null && (C0 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) C0;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context = wl1.mo21283c().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f14540d.mo16261M() != null) {
            view = this.f14540d.mo16261M();
            zzbnw zzbnw = this.f14545i;
            if (zzbnw != null && viewGroup == null) {
                m21422g(layoutParams, zzbnw.f27252k);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(this.f14540d.mo16268T() instanceof a20)) {
            view = null;
        } else {
            a20 a20 = (a20) this.f14540d.mo16268T();
            if (viewGroup == null) {
                m21422g(layoutParams, a20.mo15648b());
            }
            b20 b20 = new b20(context, a20, layoutParams);
            b20.setContentDescription((CharSequence) C5054ev.m23225c().mo20153b(C5503qz.f22515f2));
            view = b20;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                C2915f fVar = new C2915f(wl1.mo21283c().getContext());
                fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                fVar.addView(view);
                FrameLayout e = wl1.mo21284e();
                if (e != null) {
                    e.addView(fVar);
                }
            }
            wl1.mo21286f2(wl1.mo21289i(), view, true);
        }
        g43<String> g43 = wk1.f25438t;
        int size = g43.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View C02 = wl1.mo21282C0(g43.get(i2));
            i2++;
            if (C02 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) C02;
                break;
            }
        }
        this.f14544h.execute(new xk1(this, viewGroup2));
        if (viewGroup2 != null) {
            if (!m21423h(viewGroup2, true)) {
                if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22607q6)).booleanValue() || !m21423h(viewGroup2, false)) {
                    viewGroup2.removeAllViews();
                    View c = wl1.mo21283c();
                    Context context2 = c != null ? c.getContext() : null;
                    if (context2 != null && (a = this.f14546j.mo22042a()) != null) {
                        try {
                            C4863a g = a.mo19048g();
                            if (g != null && (drawable = (Drawable) C4865b.m20502K0(g)) != null) {
                                ImageView imageView = new ImageView(context2);
                                imageView.setImageDrawable(drawable);
                                if (wl1 != null) {
                                    aVar = wl1.mo21288h();
                                }
                                if (aVar != null) {
                                    if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22462Y3)).booleanValue()) {
                                        imageView.setScaleType((ImageView.ScaleType) C4865b.m20502K0(aVar));
                                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        viewGroup2.addView(imageView);
                                    }
                                }
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup2.addView(imageView);
                            }
                        } catch (RemoteException unused) {
                            ul0.m31862g("Could not get main image drawable");
                        }
                    }
                } else if (this.f14540d.mo16272X() != null) {
                    this.f14540d.mo16272X().mo17682Z0(new al1(wl1, viewGroup2));
                }
            } else if (this.f14540d.mo16274Z() != null) {
                this.f14540d.mo16274Z().mo17682Z0(new al1(wl1, viewGroup2));
            }
        }
    }

    /* renamed from: c */
    public final void mo16316c(wl1 wl1) {
        if (wl1 != null && this.f14541e != null && wl1.mo21284e() != null && this.f14539c.mo17552f()) {
            try {
                wl1.mo21284e().addView(this.f14541e.mo19411a());
            } catch (bs0 e) {
                C3018m1.m13389l("web view can not be obtained", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo16317d(wl1 wl1) {
        if (wl1 != null) {
            Context context = wl1.mo21283c().getContext();
            if (C3056z0.m13522h(context, this.f14539c.f17163a)) {
                if (!(context instanceof Activity)) {
                    ul0.m31857b("Activity context is needed for policy validator.");
                } else if (this.f14542f != null && wl1.mo21284e() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f14542f.mo21307a(wl1.mo21284e(), windowManager), C3056z0.m13516b());
                    } catch (bs0 e) {
                        C3018m1.m13389l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo16318e(wl1 wl1) {
        this.f14543g.execute(new yk1(this, wl1));
    }

    /* renamed from: f */
    public final boolean mo16319f(ViewGroup viewGroup) {
        return m21423h(viewGroup, true);
    }
}
