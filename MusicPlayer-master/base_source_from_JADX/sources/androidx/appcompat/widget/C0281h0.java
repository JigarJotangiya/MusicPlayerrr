package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0159a;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.widget.Toolbar;
import p082e.p083a.C3400a;
import p082e.p083a.C3404e;
import p082e.p083a.C3405f;
import p082e.p083a.C3407h;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3710b0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;

/* renamed from: androidx.appcompat.widget.h0 */
/* compiled from: ToolbarWidgetWrapper */
public class C0281h0 implements C0302o {

    /* renamed from: a */
    Toolbar f1300a;

    /* renamed from: b */
    private int f1301b;

    /* renamed from: c */
    private View f1302c;

    /* renamed from: d */
    private View f1303d;

    /* renamed from: e */
    private Drawable f1304e;

    /* renamed from: f */
    private Drawable f1305f;

    /* renamed from: g */
    private Drawable f1306g;

    /* renamed from: h */
    private boolean f1307h;

    /* renamed from: i */
    CharSequence f1308i;

    /* renamed from: j */
    private CharSequence f1309j;

    /* renamed from: k */
    private CharSequence f1310k;

    /* renamed from: l */
    Window.Callback f1311l;

    /* renamed from: m */
    boolean f1312m;

    /* renamed from: n */
    private ActionMenuPresenter f1313n;

    /* renamed from: o */
    private int f1314o;

    /* renamed from: p */
    private int f1315p;

    /* renamed from: q */
    private Drawable f1316q;

    /* renamed from: androidx.appcompat.widget.h0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0282a implements View.OnClickListener {

        /* renamed from: g */
        final C0159a f1317g;

        C0282a() {
            this.f1317g = new C0159a(C0281h0.this.f1300a.getContext(), 0, 16908332, 0, 0, C0281h0.this.f1308i);
        }

        public void onClick(View view) {
            C0281h0 h0Var = C0281h0.this;
            Window.Callback callback = h0Var.f1311l;
            if (callback != null && h0Var.f1312m) {
                callback.onMenuItemSelected(0, this.f1317g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0283b extends C3710b0 {

        /* renamed from: a */
        private boolean f1319a = false;

        /* renamed from: b */
        final /* synthetic */ int f1320b;

        C0283b(int i) {
            this.f1320b = i;
        }

        /* renamed from: a */
        public void mo1916a(View view) {
            this.f1319a = true;
        }

        /* renamed from: b */
        public void mo585b(View view) {
            if (!this.f1319a) {
                C0281h0.this.f1300a.setVisibility(this.f1320b);
            }
        }

        /* renamed from: c */
        public void mo586c(View view) {
            C0281h0.this.f1300a.setVisibility(0);
        }
    }

    public C0281h0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C3407h.abc_action_bar_up_description, C3404e.abc_ic_ab_back_material);
    }

    /* renamed from: E */
    private void m1658E(CharSequence charSequence) {
        this.f1308i = charSequence;
        if ((this.f1301b & 8) != 0) {
            this.f1300a.setTitle(charSequence);
        }
    }

    /* renamed from: F */
    private void m1659F() {
        if ((this.f1301b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1310k)) {
            this.f1300a.setNavigationContentDescription(this.f1315p);
        } else {
            this.f1300a.setNavigationContentDescription(this.f1310k);
        }
    }

    /* renamed from: G */
    private void m1660G() {
        if ((this.f1301b & 4) != 0) {
            Toolbar toolbar = this.f1300a;
            Drawable drawable = this.f1306g;
            if (drawable == null) {
                drawable = this.f1316q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1300a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: H */
    private void m1661H() {
        Drawable drawable;
        int i = this.f1301b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1305f;
            if (drawable == null) {
                drawable = this.f1304e;
            }
        } else {
            drawable = this.f1304e;
        }
        this.f1300a.setLogo(drawable);
    }

    /* renamed from: x */
    private int m1662x() {
        if (this.f1300a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1316q = this.f1300a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo2004A(Drawable drawable) {
        this.f1305f = drawable;
        m1661H();
    }

    /* renamed from: B */
    public void mo2005B(CharSequence charSequence) {
        this.f1310k = charSequence;
        m1659F();
    }

    /* renamed from: C */
    public void mo2006C(Drawable drawable) {
        this.f1306g = drawable;
        m1660G();
    }

    /* renamed from: D */
    public void mo2007D(CharSequence charSequence) {
        this.f1309j = charSequence;
        if ((this.f1301b & 8) != 0) {
            this.f1300a.setSubtitle(charSequence);
        }
    }

    /* renamed from: a */
    public void mo2008a(Menu menu, C0186m.C0187a aVar) {
        if (this.f1313n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1300a.getContext());
            this.f1313n = actionMenuPresenter;
            actionMenuPresenter.mo829j(C3405f.action_menu_presenter);
        }
        this.f1313n.mo818I(aVar);
        this.f1300a.mo1799J((C0171g) menu, this.f1313n);
    }

    /* renamed from: b */
    public boolean mo2009b() {
        return this.f1300a.mo1796B();
    }

    /* renamed from: c */
    public void mo2010c() {
        this.f1312m = true;
    }

    public void collapseActionView() {
        this.f1300a.mo1807e();
    }

    /* renamed from: d */
    public boolean mo2012d() {
        return this.f1300a.mo1806d();
    }

    /* renamed from: e */
    public boolean mo2013e() {
        return this.f1300a.mo1795A();
    }

    /* renamed from: f */
    public boolean mo2014f() {
        return this.f1300a.mo1886x();
    }

    /* renamed from: g */
    public boolean mo2015g() {
        return this.f1300a.mo1803P();
    }

    public Context getContext() {
        return this.f1300a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1300a.getTitle();
    }

    /* renamed from: h */
    public void mo2018h() {
        this.f1300a.mo1808g();
    }

    /* renamed from: i */
    public void mo2019i(C0329z zVar) {
        Toolbar toolbar;
        View view = this.f1302c;
        if (view != null && view.getParent() == (toolbar = this.f1300a)) {
            toolbar.removeView(this.f1302c);
        }
        this.f1302c = zVar;
        if (zVar != null && this.f1314o == 2) {
            this.f1300a.addView(zVar, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1302c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f234a = 8388691;
            zVar.setAllowCollapse(true);
        }
    }

    /* renamed from: j */
    public boolean mo2020j() {
        return this.f1300a.mo1885w();
    }

    /* renamed from: k */
    public void mo2021k(int i) {
        View view;
        int i2 = this.f1301b ^ i;
        this.f1301b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1659F();
                }
                m1660G();
            }
            if ((i2 & 3) != 0) {
                m1661H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1300a.setTitle(this.f1308i);
                    this.f1300a.setSubtitle(this.f1309j);
                } else {
                    this.f1300a.setTitle((CharSequence) null);
                    this.f1300a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1303d) != null) {
                if ((i & 16) != 0) {
                    this.f1300a.addView(view);
                } else {
                    this.f1300a.removeView(view);
                }
            }
        }
    }

    /* renamed from: l */
    public Menu mo2022l() {
        return this.f1300a.getMenu();
    }

    /* renamed from: m */
    public void mo2023m(int i) {
        mo2004A(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    /* renamed from: n */
    public int mo2024n() {
        return this.f1314o;
    }

    /* renamed from: o */
    public C3790z mo2025o(int i, long j) {
        C3790z d = C3774v.m16194d(this.f1300a);
        d.mo13223a(i == 0 ? 1.0f : 0.0f);
        d.mo13228f(j);
        d.mo13230h(new C0283b(i));
        return d;
    }

    /* renamed from: p */
    public void mo2026p(C0186m.C0187a aVar, C0171g.C0172a aVar2) {
        this.f1300a.mo1800K(aVar, aVar2);
    }

    /* renamed from: q */
    public ViewGroup mo2027q() {
        return this.f1300a;
    }

    /* renamed from: r */
    public void mo2028r(boolean z) {
    }

    /* renamed from: s */
    public int mo2029s() {
        return this.f1301b;
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1307h = true;
        m1658E(charSequence);
    }

    public void setVisibility(int i) {
        this.f1300a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1311l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1307h) {
            m1658E(charSequence);
        }
    }

    /* renamed from: t */
    public void mo2036t(int i) {
        mo2005B(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: u */
    public void mo2037u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: v */
    public void mo2038v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: w */
    public void mo2039w(boolean z) {
        this.f1300a.setCollapsible(z);
    }

    /* renamed from: y */
    public void mo2040y(View view) {
        View view2 = this.f1303d;
        if (!(view2 == null || (this.f1301b & 16) == 0)) {
            this.f1300a.removeView(view2);
        }
        this.f1303d = view;
        if (view != null && (this.f1301b & 16) != 0) {
            this.f1300a.addView(view);
        }
    }

    /* renamed from: z */
    public void mo2041z(int i) {
        if (i != this.f1315p) {
            this.f1315p = i;
            if (TextUtils.isEmpty(this.f1300a.getNavigationContentDescription())) {
                mo2036t(this.f1315p);
            }
        }
    }

    public C0281h0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1314o = 0;
        this.f1315p = 0;
        this.f1300a = toolbar;
        this.f1308i = toolbar.getTitle();
        this.f1309j = toolbar.getSubtitle();
        this.f1307h = this.f1308i != null;
        this.f1306g = toolbar.getNavigationIcon();
        C0279g0 v = C0279g0.m1627v(toolbar.getContext(), (AttributeSet) null, C3409j.ActionBar, C3400a.actionBarStyle, 0);
        this.f1316q = v.mo1982g(C3409j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p = v.mo1991p(C3409j.ActionBar_title);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo1991p(C3409j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p2)) {
                mo2007D(p2);
            }
            Drawable g = v.mo1982g(C3409j.ActionBar_logo);
            if (g != null) {
                mo2004A(g);
            }
            Drawable g2 = v.mo1982g(C3409j.ActionBar_icon);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1306g == null && (drawable = this.f1316q) != null) {
                mo2006C(drawable);
            }
            mo2021k(v.mo1986k(C3409j.ActionBar_displayOptions, 0));
            int n = v.mo1989n(C3409j.ActionBar_customNavigationLayout, 0);
            if (n != 0) {
                mo2040y(LayoutInflater.from(this.f1300a.getContext()).inflate(n, this.f1300a, false));
                mo2021k(this.f1301b | 16);
            }
            int m = v.mo1988m(C3409j.ActionBar_height, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1300a.getLayoutParams();
                layoutParams.height = m;
                this.f1300a.setLayoutParams(layoutParams);
            }
            int e = v.mo1980e(C3409j.ActionBar_contentInsetStart, -1);
            int e2 = v.mo1980e(C3409j.ActionBar_contentInsetEnd, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1300a.mo1798I(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo1989n(C3409j.ActionBar_titleTextStyle, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1300a;
                toolbar2.mo1802M(toolbar2.getContext(), n2);
            }
            int n3 = v.mo1989n(C3409j.ActionBar_subtitleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1300a;
                toolbar3.mo1801L(toolbar3.getContext(), n3);
            }
            int n4 = v.mo1989n(C3409j.ActionBar_popupTheme, 0);
            if (n4 != 0) {
                this.f1300a.setPopupTheme(n4);
            }
        } else {
            this.f1301b = m1662x();
        }
        v.mo1995w();
        mo2041z(i);
        this.f1310k = this.f1300a.getNavigationContentDescription();
        this.f1300a.setNavigationOnClickListener(new C0282a());
    }

    public void setIcon(Drawable drawable) {
        this.f1304e = drawable;
        m1661H();
    }
}
