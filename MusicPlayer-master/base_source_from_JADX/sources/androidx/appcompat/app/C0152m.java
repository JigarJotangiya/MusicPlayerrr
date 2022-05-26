package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0302o;
import androidx.appcompat.widget.C0329z;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p083a.C3409j;
import p082e.p083a.p090o.C3431a;
import p082e.p083a.p090o.C3432b;
import p082e.p083a.p090o.C3439g;
import p082e.p083a.p090o.C3442h;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3710b0;
import p082e.p109h.p119p.C3712c0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;

/* renamed from: androidx.appcompat.app.m */
/* compiled from: WindowDecorActionBar */
public class C0152m extends ActionBar implements ActionBarOverlayLayout.C0201d {

    /* renamed from: B */
    private static final Interpolator f521B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f522C = new DecelerateInterpolator();

    /* renamed from: A */
    final C3712c0 f523A = new C0155c();

    /* renamed from: a */
    Context f524a;

    /* renamed from: b */
    private Context f525b;

    /* renamed from: c */
    ActionBarOverlayLayout f526c;

    /* renamed from: d */
    ActionBarContainer f527d;

    /* renamed from: e */
    C0302o f528e;

    /* renamed from: f */
    ActionBarContextView f529f;

    /* renamed from: g */
    View f530g;

    /* renamed from: h */
    C0329z f531h;

    /* renamed from: i */
    private boolean f532i;

    /* renamed from: j */
    C0156d f533j;

    /* renamed from: k */
    C3432b f534k;

    /* renamed from: l */
    C3432b.C3433a f535l;

    /* renamed from: m */
    private boolean f536m;

    /* renamed from: n */
    private ArrayList<ActionBar.C0086a> f537n = new ArrayList<>();

    /* renamed from: o */
    private boolean f538o;

    /* renamed from: p */
    private int f539p = 0;

    /* renamed from: q */
    boolean f540q = true;

    /* renamed from: r */
    boolean f541r;

    /* renamed from: s */
    boolean f542s;

    /* renamed from: t */
    private boolean f543t;

    /* renamed from: u */
    private boolean f544u = true;

    /* renamed from: v */
    C3442h f545v;

    /* renamed from: w */
    private boolean f546w;

    /* renamed from: x */
    boolean f547x;

    /* renamed from: y */
    final C3706a0 f548y = new C0153a();

    /* renamed from: z */
    final C3706a0 f549z = new C0154b();

    /* renamed from: androidx.appcompat.app.m$a */
    /* compiled from: WindowDecorActionBar */
    class C0153a extends C3710b0 {
        C0153a() {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            View view2;
            C0152m mVar = C0152m.this;
            if (mVar.f540q && (view2 = mVar.f530g) != null) {
                view2.setTranslationY(0.0f);
                C0152m.this.f527d.setTranslationY(0.0f);
            }
            C0152m.this.f527d.setVisibility(8);
            C0152m.this.f527d.setTransitioning(false);
            C0152m mVar2 = C0152m.this;
            mVar2.f545v = null;
            mVar2.mo689E();
            ActionBarOverlayLayout actionBarOverlayLayout = C0152m.this.f526c;
            if (actionBarOverlayLayout != null) {
                C3774v.m16211l0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    /* compiled from: WindowDecorActionBar */
    class C0154b extends C3710b0 {
        C0154b() {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            C0152m mVar = C0152m.this;
            mVar.f545v = null;
            mVar.f527d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    /* compiled from: WindowDecorActionBar */
    class C0155c implements C3712c0 {
        C0155c() {
        }

        /* renamed from: a */
        public void mo702a(View view) {
            ((View) C0152m.this.f527d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    /* compiled from: WindowDecorActionBar */
    public class C0156d extends C3432b implements C0171g.C0172a {

        /* renamed from: i */
        private final Context f553i;

        /* renamed from: j */
        private final C0171g f554j;

        /* renamed from: k */
        private C3432b.C3433a f555k;

        /* renamed from: l */
        private WeakReference<View> f556l;

        public C0156d(Context context, C3432b.C3433a aVar) {
            this.f553i = context;
            this.f555k = aVar;
            C0171g gVar = new C0171g(context);
            gVar.mo902W(1);
            this.f554j = gVar;
            gVar.mo901V(this);
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            C3432b.C3433a aVar = this.f555k;
            if (aVar != null) {
                return aVar.mo595d(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
            if (this.f555k != null) {
                mo709k();
                C0152m.this.f529f.mo1183l();
            }
        }

        /* renamed from: c */
        public void mo703c() {
            C0152m mVar = C0152m.this;
            if (mVar.f533j == this) {
                if (!C0152m.m833D(mVar.f541r, mVar.f542s, false)) {
                    C0152m mVar2 = C0152m.this;
                    mVar2.f534k = this;
                    mVar2.f535l = this.f555k;
                } else {
                    this.f555k.mo592a(this);
                }
                this.f555k = null;
                C0152m.this.mo688C(false);
                C0152m.this.f529f.mo1173g();
                C0152m.this.f528e.mo2027q().sendAccessibilityEvent(32);
                C0152m mVar3 = C0152m.this;
                mVar3.f526c.setHideOnContentScrollEnabled(mVar3.f547x);
                C0152m.this.f533j = null;
            }
        }

        /* renamed from: d */
        public View mo704d() {
            WeakReference<View> weakReference = this.f556l;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo705e() {
            return this.f554j;
        }

        /* renamed from: f */
        public MenuInflater mo706f() {
            return new C3439g(this.f553i);
        }

        /* renamed from: g */
        public CharSequence mo707g() {
            return C0152m.this.f529f.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo708i() {
            return C0152m.this.f529f.getTitle();
        }

        /* renamed from: k */
        public void mo709k() {
            if (C0152m.this.f533j == this) {
                this.f554j.mo932h0();
                try {
                    this.f555k.mo594c(this, this.f554j);
                } finally {
                    this.f554j.mo929g0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo710l() {
            return C0152m.this.f529f.mo1181j();
        }

        /* renamed from: m */
        public void mo711m(View view) {
            C0152m.this.f529f.setCustomView(view);
            this.f556l = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo712n(int i) {
            mo713o(C0152m.this.f524a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo713o(CharSequence charSequence) {
            C0152m.this.f529f.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo714q(int i) {
            mo715r(C0152m.this.f524a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo715r(CharSequence charSequence) {
            C0152m.this.f529f.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo716s(boolean z) {
            super.mo716s(z);
            C0152m.this.f529f.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo717t() {
            this.f554j.mo932h0();
            try {
                return this.f555k.mo593b(this, this.f554j);
            } finally {
                this.f554j.mo929g0();
            }
        }
    }

    public C0152m(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m836K(decorView);
        if (!z) {
            this.f530g = decorView.findViewById(16908290);
        }
    }

    /* renamed from: D */
    static boolean m833D(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: H */
    private C0302o m834H(View view) {
        if (view instanceof C0302o) {
            return (C0302o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: J */
    private void m835J() {
        if (this.f543t) {
            this.f543t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f526c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m840R(false);
        }
    }

    /* renamed from: K */
    private void m836K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C3405f.decor_content_parent);
        this.f526c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f528e = m834H(view.findViewById(C3405f.action_bar));
        this.f529f = (ActionBarContextView) view.findViewById(C3405f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C3405f.action_bar_container);
        this.f527d = actionBarContainer;
        C0302o oVar = this.f528e;
        if (oVar == null || this.f529f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0152m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f524a = oVar.getContext();
        boolean z = (this.f528e.mo2029s() & 4) != 0;
        if (z) {
            this.f532i = true;
        }
        C3431a b = C3431a.m14635b(this.f524a);
        mo423v(b.mo12158a() || z);
        m837N(b.mo12163g());
        TypedArray obtainStyledAttributes = this.f524a.obtainStyledAttributes((AttributeSet) null, C3409j.ActionBar, C3400a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C3409j.ActionBar_hideOnContentScroll, false)) {
            mo695O(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3409j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo694M((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N */
    private void m837N(boolean z) {
        this.f538o = z;
        if (!z) {
            this.f528e.mo2019i((C0329z) null);
            this.f527d.setTabContainer(this.f531h);
        } else {
            this.f527d.setTabContainer((C0329z) null);
            this.f528e.mo2019i(this.f531h);
        }
        boolean z2 = true;
        boolean z3 = mo692I() == 2;
        C0329z zVar = this.f531h;
        if (zVar != null) {
            if (z3) {
                zVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f526c;
                if (actionBarOverlayLayout != null) {
                    C3774v.m16211l0(actionBarOverlayLayout);
                }
            } else {
                zVar.setVisibility(8);
            }
        }
        this.f528e.mo2039w(!this.f538o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f526c;
        if (this.f538o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: P */
    private boolean m838P() {
        return C3774v.m16181T(this.f527d);
    }

    /* renamed from: Q */
    private void m839Q() {
        if (!this.f543t) {
            this.f543t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f526c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m840R(false);
        }
    }

    /* renamed from: R */
    private void m840R(boolean z) {
        if (m833D(this.f541r, this.f542s, this.f543t)) {
            if (!this.f544u) {
                this.f544u = true;
                mo691G(z);
            }
        } else if (this.f544u) {
            this.f544u = false;
            mo690F(z);
        }
    }

    /* renamed from: A */
    public void mo405A() {
        if (this.f541r) {
            this.f541r = false;
            m840R(false);
        }
    }

    /* renamed from: B */
    public C3432b mo406B(C3432b.C3433a aVar) {
        C0156d dVar = this.f533j;
        if (dVar != null) {
            dVar.mo703c();
        }
        this.f526c.setHideOnContentScrollEnabled(false);
        this.f529f.mo1182k();
        C0156d dVar2 = new C0156d(this.f529f.getContext(), aVar);
        if (!dVar2.mo717t()) {
            return null;
        }
        this.f533j = dVar2;
        dVar2.mo709k();
        this.f529f.mo1180h(dVar2);
        mo688C(true);
        this.f529f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: C */
    public void mo688C(boolean z) {
        C3790z zVar;
        C3790z zVar2;
        if (z) {
            m839Q();
        } else {
            m835J();
        }
        if (m838P()) {
            if (z) {
                zVar = this.f528e.mo2025o(4, 100);
                zVar2 = this.f529f.mo1912f(0, 200);
            } else {
                zVar2 = this.f528e.mo2025o(0, 200);
                zVar = this.f529f.mo1912f(8, 100);
            }
            C3442h hVar = new C3442h();
            hVar.mo12207d(zVar, zVar2);
            hVar.mo12211h();
        } else if (z) {
            this.f528e.setVisibility(4);
            this.f529f.setVisibility(0);
        } else {
            this.f528e.setVisibility(0);
            this.f529f.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo689E() {
        C3432b.C3433a aVar = this.f535l;
        if (aVar != null) {
            aVar.mo592a(this.f534k);
            this.f534k = null;
            this.f535l = null;
        }
    }

    /* renamed from: F */
    public void mo690F(boolean z) {
        View view;
        C3442h hVar = this.f545v;
        if (hVar != null) {
            hVar.mo12204a();
        }
        if (this.f539p != 0 || (!this.f546w && !z)) {
            this.f548y.mo585b((View) null);
            return;
        }
        this.f527d.setAlpha(1.0f);
        this.f527d.setTransitioning(true);
        C3442h hVar2 = new C3442h();
        float f = (float) (-this.f527d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f527d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C3790z d = C3774v.m16194d(this.f527d);
        d.mo13234m(f);
        d.mo13232k(this.f523A);
        hVar2.mo12206c(d);
        if (this.f540q && (view = this.f530g) != null) {
            C3790z d2 = C3774v.m16194d(view);
            d2.mo13234m(f);
            hVar2.mo12206c(d2);
        }
        hVar2.mo12209f(f521B);
        hVar2.mo12208e(250);
        hVar2.mo12210g(this.f548y);
        this.f545v = hVar2;
        hVar2.mo12211h();
    }

    /* renamed from: G */
    public void mo691G(boolean z) {
        View view;
        View view2;
        C3442h hVar = this.f545v;
        if (hVar != null) {
            hVar.mo12204a();
        }
        this.f527d.setVisibility(0);
        if (this.f539p != 0 || (!this.f546w && !z)) {
            this.f527d.setAlpha(1.0f);
            this.f527d.setTranslationY(0.0f);
            if (this.f540q && (view = this.f530g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f549z.mo585b((View) null);
        } else {
            this.f527d.setTranslationY(0.0f);
            float f = (float) (-this.f527d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f527d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f527d.setTranslationY(f);
            C3442h hVar2 = new C3442h();
            C3790z d = C3774v.m16194d(this.f527d);
            d.mo13234m(0.0f);
            d.mo13232k(this.f523A);
            hVar2.mo12206c(d);
            if (this.f540q && (view2 = this.f530g) != null) {
                view2.setTranslationY(f);
                C3790z d2 = C3774v.m16194d(this.f530g);
                d2.mo13234m(0.0f);
                hVar2.mo12206c(d2);
            }
            hVar2.mo12209f(f522C);
            hVar2.mo12208e(250);
            hVar2.mo12210g(this.f549z);
            this.f545v = hVar2;
            hVar2.mo12211h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f526c;
        if (actionBarOverlayLayout != null) {
            C3774v.m16211l0(actionBarOverlayLayout);
        }
    }

    /* renamed from: I */
    public int mo692I() {
        return this.f528e.mo2024n();
    }

    /* renamed from: L */
    public void mo693L(int i, int i2) {
        int s = this.f528e.mo2029s();
        if ((i2 & 4) != 0) {
            this.f532i = true;
        }
        this.f528e.mo2021k((i & i2) | ((~i2) & s));
    }

    /* renamed from: M */
    public void mo694M(float f) {
        C3774v.m16231v0(this.f527d, f);
    }

    /* renamed from: O */
    public void mo695O(boolean z) {
        if (!z || this.f526c.mo1250w()) {
            this.f547x = z;
            this.f526c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: a */
    public void mo696a() {
        if (this.f542s) {
            this.f542s = false;
            m840R(true);
        }
    }

    /* renamed from: b */
    public void mo697b() {
    }

    /* renamed from: c */
    public void mo698c(boolean z) {
        this.f540q = z;
    }

    /* renamed from: d */
    public void mo699d() {
        if (!this.f542s) {
            this.f542s = true;
            m840R(true);
        }
    }

    /* renamed from: e */
    public void mo700e() {
        C3442h hVar = this.f545v;
        if (hVar != null) {
            hVar.mo12204a();
            this.f545v = null;
        }
    }

    /* renamed from: g */
    public boolean mo408g() {
        C0302o oVar = this.f528e;
        if (oVar == null || !oVar.mo2020j()) {
            return false;
        }
        this.f528e.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo409h(boolean z) {
        if (z != this.f536m) {
            this.f536m = z;
            int size = this.f537n.size();
            for (int i = 0; i < size; i++) {
                this.f537n.get(i).mo428a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo410i() {
        return this.f528e.mo2029s();
    }

    /* renamed from: j */
    public Context mo411j() {
        if (this.f525b == null) {
            TypedValue typedValue = new TypedValue();
            this.f524a.getTheme().resolveAttribute(C3400a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f525b = new ContextThemeWrapper(this.f524a, i);
            } else {
                this.f525b = this.f524a;
            }
        }
        return this.f525b;
    }

    /* renamed from: k */
    public void mo412k() {
        if (!this.f541r) {
            this.f541r = true;
            m840R(false);
        }
    }

    /* renamed from: m */
    public void mo414m(Configuration configuration) {
        m837N(C3431a.m14635b(this.f524a).mo12163g());
    }

    /* renamed from: o */
    public boolean mo416o(int i, KeyEvent keyEvent) {
        Menu e;
        C0156d dVar = this.f533j;
        if (dVar == null || (e = dVar.mo705e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    public void onWindowVisibilityChanged(int i) {
        this.f539p = i;
    }

    /* renamed from: r */
    public void mo419r(boolean z) {
        if (!this.f532i) {
            mo420s(z);
        }
    }

    /* renamed from: s */
    public void mo420s(boolean z) {
        mo693L(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo421t(boolean z) {
        mo693L(z ? 2 : 0, 2);
    }

    /* renamed from: u */
    public void mo422u(int i) {
        this.f528e.mo2036t(i);
    }

    /* renamed from: v */
    public void mo423v(boolean z) {
        this.f528e.mo2028r(z);
    }

    /* renamed from: w */
    public void mo424w(boolean z) {
        C3442h hVar;
        this.f546w = z;
        if (!z && (hVar = this.f545v) != null) {
            hVar.mo12204a();
        }
    }

    /* renamed from: x */
    public void mo425x(int i) {
        mo426y(this.f524a.getString(i));
    }

    /* renamed from: y */
    public void mo426y(CharSequence charSequence) {
        this.f528e.setTitle(charSequence);
    }

    /* renamed from: z */
    public void mo427z(CharSequence charSequence) {
        this.f528e.setWindowTitle(charSequence);
    }

    public C0152m(Dialog dialog) {
        new ArrayList();
        m836K(dialog.getWindow().getDecorView());
    }
}
