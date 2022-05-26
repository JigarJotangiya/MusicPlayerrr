package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0186m;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p109h.p110h.C3622b;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3765m;
import p082e.p109h.p119p.C3766n;
import p082e.p109h.p119p.C3767o;
import p082e.p109h.p119p.C3768p;
import p082e.p109h.p119p.C3774v;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0300n, C3767o, C3765m, C3766n {

    /* renamed from: L */
    static final int[] f812L = {C3400a.actionBarSize, 16842841};

    /* renamed from: A */
    private C3718d0 f813A;

    /* renamed from: B */
    private C3718d0 f814B;

    /* renamed from: C */
    private C3718d0 f815C;

    /* renamed from: D */
    private C3718d0 f816D;

    /* renamed from: E */
    private C0201d f817E;

    /* renamed from: F */
    private OverScroller f818F;

    /* renamed from: G */
    ViewPropertyAnimator f819G;

    /* renamed from: H */
    final AnimatorListenerAdapter f820H;

    /* renamed from: I */
    private final Runnable f821I;

    /* renamed from: J */
    private final Runnable f822J;

    /* renamed from: K */
    private final C3768p f823K;

    /* renamed from: g */
    private int f824g;

    /* renamed from: h */
    private int f825h;

    /* renamed from: i */
    private ContentFrameLayout f826i;

    /* renamed from: j */
    ActionBarContainer f827j;

    /* renamed from: k */
    private C0302o f828k;

    /* renamed from: l */
    private Drawable f829l;

    /* renamed from: m */
    private boolean f830m;

    /* renamed from: n */
    private boolean f831n;

    /* renamed from: o */
    private boolean f832o;

    /* renamed from: p */
    private boolean f833p;

    /* renamed from: q */
    boolean f834q;

    /* renamed from: r */
    private int f835r;

    /* renamed from: s */
    private int f836s;

    /* renamed from: t */
    private final Rect f837t;

    /* renamed from: u */
    private final Rect f838u;

    /* renamed from: v */
    private final Rect f839v;

    /* renamed from: w */
    private final Rect f840w;

    /* renamed from: x */
    private final Rect f841x;

    /* renamed from: y */
    private final Rect f842y;

    /* renamed from: z */
    private final Rect f843z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0198a extends AnimatorListenerAdapter {
        C0198a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f819G = null;
            actionBarOverlayLayout.f834q = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f819G = null;
            actionBarOverlayLayout.f834q = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0199b implements Runnable {
        C0199b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1249u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f819G = actionBarOverlayLayout.f827j.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f820H);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0200c implements Runnable {
        C0200c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1249u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f819G = actionBarOverlayLayout.f827j.animate().translationY((float) (-ActionBarOverlayLayout.this.f827j.getHeight())).setListener(ActionBarOverlayLayout.this.f820H);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0201d {
        /* renamed from: a */
        void mo696a();

        /* renamed from: b */
        void mo697b();

        /* renamed from: c */
        void mo698c(boolean z);

        /* renamed from: d */
        void mo699d();

        /* renamed from: e */
        void mo700e();

        void onWindowVisibilityChanged(int i);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private void m1185A() {
        mo1249u();
        this.f821I.run();
    }

    /* renamed from: B */
    private boolean m1186B(float f) {
        this.f818F.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f818F.getFinalY() > this.f827j.getHeight();
    }

    /* renamed from: p */
    private void m1187p() {
        mo1249u();
        this.f822J.run();
    }

    /* renamed from: q */
    private boolean m1188q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* renamed from: t */
    private C0302o m1189t(View view) {
        if (view instanceof C0302o) {
            return (C0302o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m1190v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f812L);
        boolean z = false;
        this.f824g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f829l = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f830m = z;
        this.f818F = new OverScroller(context);
    }

    /* renamed from: x */
    private void m1191x() {
        mo1249u();
        postDelayed(this.f822J, 600);
    }

    /* renamed from: y */
    private void m1192y() {
        mo1249u();
        postDelayed(this.f821I, 600);
    }

    /* renamed from: a */
    public void mo1196a(Menu menu, C0186m.C0187a aVar) {
        mo1251z();
        this.f828k.mo2008a(menu, aVar);
    }

    /* renamed from: b */
    public boolean mo1197b() {
        mo1251z();
        return this.f828k.mo2009b();
    }

    /* renamed from: c */
    public void mo1198c() {
        mo1251z();
        this.f828k.mo2010c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo1200d() {
        mo1251z();
        return this.f828k.mo2012d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f829l != null && !this.f830m) {
            int bottom = this.f827j.getVisibility() == 0 ? (int) (((float) this.f827j.getBottom()) + this.f827j.getTranslationY() + 0.5f) : 0;
            this.f829l.setBounds(0, bottom, getWidth(), this.f829l.getIntrinsicHeight() + bottom);
            this.f829l.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1202e() {
        mo1251z();
        return this.f828k.mo2013e();
    }

    /* renamed from: f */
    public boolean mo1203f() {
        mo1251z();
        return this.f828k.mo2014f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1251z();
        boolean q = m1188q(this.f827j, rect, true, true, false, true);
        this.f840w.set(rect);
        C0299m0.m1792a(this, this.f840w, this.f837t);
        if (!this.f841x.equals(this.f840w)) {
            this.f841x.set(this.f840w);
            q = true;
        }
        if (!this.f838u.equals(this.f837t)) {
            this.f838u.set(this.f837t);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1205g() {
        mo1251z();
        return this.f828k.mo2015g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f827j;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f823K.mo13188a();
    }

    public CharSequence getTitle() {
        mo1251z();
        return this.f828k.getTitle();
    }

    /* renamed from: h */
    public void mo1212h(int i) {
        mo1251z();
        if (i == 2) {
            this.f828k.mo2037u();
        } else if (i == 5) {
            this.f828k.mo2038v();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: i */
    public void mo1213i() {
        mo1251z();
        this.f828k.mo2018h();
    }

    /* renamed from: j */
    public void mo1214j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1215k(view, i, i2, i3, i4, i5);
    }

    /* renamed from: k */
    public void mo1215k(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public boolean mo1216l(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: m */
    public void mo1217m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo1218n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo1219o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1251z();
        C3718d0 w = C3718d0.m15878w(windowInsets);
        boolean q = m1188q(this.f827j, new Rect(w.mo13036j(), w.mo13038l(), w.mo13037k(), w.mo13035i()), true, true, false, true);
        C3774v.m16200g(this, w, this.f837t);
        Rect rect = this.f837t;
        C3718d0 n = w.mo13040n(rect.left, rect.top, rect.right, rect.bottom);
        this.f813A = n;
        boolean z = true;
        if (!this.f814B.equals(n)) {
            this.f814B = this.f813A;
            q = true;
        }
        if (!this.f838u.equals(this.f837t)) {
            this.f838u.set(this.f837t);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return w.mo13025a().mo13027c().mo13026b().mo13047v();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1190v(getContext());
        C3774v.m16211l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1249u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1251z();
        measureChildWithMargins(this.f827j, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f827j.getLayoutParams();
        int max = Math.max(0, this.f827j.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f827j.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f827j.getMeasuredState());
        boolean z = (C3774v.m16173M(this) & 256) != 0;
        if (z) {
            i3 = this.f824g;
            if (this.f832o && this.f827j.getTabContainer() != null) {
                i3 += this.f824g;
            }
        } else {
            i3 = this.f827j.getVisibility() != 8 ? this.f827j.getMeasuredHeight() : 0;
        }
        this.f839v.set(this.f837t);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.f815C = this.f813A;
        } else {
            this.f842y.set(this.f840w);
        }
        if (!this.f831n && !z) {
            Rect rect = this.f839v;
            rect.top += i3;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.f815C = this.f815C.mo13040n(0, i3, 0, 0);
            }
        } else if (i4 >= 21) {
            C3622b b = C3622b.m15597b(this.f815C.mo13036j(), this.f815C.mo13038l() + i3, this.f815C.mo13037k(), this.f815C.mo13035i() + 0);
            C3718d0.C3720b bVar = new C3718d0.C3720b(this.f815C);
            bVar.mo13050c(b);
            this.f815C = bVar.mo13048a();
        } else {
            Rect rect2 = this.f842y;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m1188q(this.f826i, this.f839v, true, true, true, true);
        if (i4 >= 21 && !this.f816D.equals(this.f815C)) {
            C3718d0 d0Var = this.f815C;
            this.f816D = d0Var;
            C3774v.m16202h(this.f826i, d0Var);
        } else if (i4 < 21 && !this.f843z.equals(this.f842y)) {
            this.f843z.set(this.f842y);
            this.f826i.mo1557a(this.f842y);
        }
        measureChildWithMargins(this.f826i, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f826i.getLayoutParams();
        int max3 = Math.max(max, this.f826i.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f826i.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f826i.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f833p || !z) {
            return false;
        }
        if (m1186B(f2)) {
            m1187p();
        } else {
            m1185A();
        }
        this.f834q = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f835r + i2;
        this.f835r = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f823K.mo13189b(view, view2, i);
        this.f835r = getActionBarHideOffset();
        mo1249u();
        C0201d dVar = this.f817E;
        if (dVar != null) {
            dVar.mo700e();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f827j.getVisibility() != 0) {
            return false;
        }
        return this.f833p;
    }

    public void onStopNestedScroll(View view) {
        if (this.f833p && !this.f834q) {
            if (this.f835r <= this.f827j.getHeight()) {
                m1192y();
            } else {
                m1191x();
            }
        }
        C0201d dVar = this.f817E;
        if (dVar != null) {
            dVar.mo697b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1251z();
        int i2 = this.f836s ^ i;
        this.f836s = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0201d dVar = this.f817E;
        if (dVar != null) {
            dVar.mo698c(!z);
            if (z2 || !z) {
                this.f817E.mo696a();
            } else {
                this.f817E.mo699d();
            }
        }
        if ((i2 & 256) != 0 && this.f817E != null) {
            C3774v.m16211l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f825h = i;
        C0201d dVar = this.f817E;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: s */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        mo1249u();
        this.f827j.setTranslationY((float) (-Math.max(0, Math.min(i, this.f827j.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0201d dVar) {
        this.f817E = dVar;
        if (getWindowToken() != null) {
            this.f817E.onWindowVisibilityChanged(this.f825h);
            int i = this.f836s;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C3774v.m16211l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f832o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f833p) {
            this.f833p = z;
            if (!z) {
                mo1249u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1251z();
        this.f828k.setIcon(i);
    }

    public void setLogo(int i) {
        mo1251z();
        this.f828k.mo2023m(i);
    }

    public void setOverlayMode(boolean z) {
        this.f831n = z;
        this.f830m = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1251z();
        this.f828k.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1251z();
        this.f828k.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1249u() {
        removeCallbacks(this.f821I);
        removeCallbacks(this.f822J);
        ViewPropertyAnimator viewPropertyAnimator = this.f819G;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean mo1250w() {
        return this.f831n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1251z() {
        if (this.f826i == null) {
            this.f826i = (ContentFrameLayout) findViewById(C3405f.action_bar_activity_content);
            this.f827j = (ActionBarContainer) findViewById(C3405f.action_bar_container);
            this.f828k = m1189t(findViewById(C3405f.action_bar));
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f825h = 0;
        this.f837t = new Rect();
        this.f838u = new Rect();
        this.f839v = new Rect();
        this.f840w = new Rect();
        this.f841x = new Rect();
        this.f842y = new Rect();
        this.f843z = new Rect();
        C3718d0 d0Var = C3718d0.f11751b;
        this.f813A = d0Var;
        this.f814B = d0Var;
        this.f815C = d0Var;
        this.f816D = d0Var;
        this.f820H = new C0198a();
        this.f821I = new C0199b();
        this.f822J = new C0200c();
        m1190v(context);
        this.f823K = new C3768p(this);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1251z();
        this.f828k.setIcon(drawable);
    }
}
