package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C6061a;
import com.google.android.material.internal.C6065c;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p309q.C7515a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: J */
    private static final int f27642J = C7499k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    private int f27643A;

    /* renamed from: B */
    private AppBarLayout.C5899d f27644B;

    /* renamed from: C */
    int f27645C;

    /* renamed from: D */
    private int f27646D;

    /* renamed from: E */
    C3718d0 f27647E;

    /* renamed from: F */
    private int f27648F;

    /* renamed from: G */
    private boolean f27649G;

    /* renamed from: H */
    private int f27650H;

    /* renamed from: I */
    private boolean f27651I;

    /* renamed from: g */
    private boolean f27652g;

    /* renamed from: h */
    private int f27653h;

    /* renamed from: i */
    private ViewGroup f27654i;

    /* renamed from: j */
    private View f27655j;

    /* renamed from: k */
    private View f27656k;

    /* renamed from: l */
    private int f27657l;

    /* renamed from: m */
    private int f27658m;

    /* renamed from: n */
    private int f27659n;

    /* renamed from: o */
    private int f27660o;

    /* renamed from: p */
    private final Rect f27661p;

    /* renamed from: q */
    final C6061a f27662q;

    /* renamed from: r */
    final C7515a f27663r;

    /* renamed from: s */
    private boolean f27664s;

    /* renamed from: t */
    private boolean f27665t;

    /* renamed from: u */
    private Drawable f27666u;

    /* renamed from: v */
    Drawable f27667v;

    /* renamed from: w */
    private int f27668w;

    /* renamed from: x */
    private boolean f27669x;

    /* renamed from: y */
    private ValueAnimator f27670y;

    /* renamed from: z */
    private long f27671z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    class C5900a implements C3769q {
        C5900a() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            return CollapsingToolbarLayout.this.mo22856n(d0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C5901b implements ValueAnimator.AnimatorUpdateListener {
        C5901b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    private class C5902c implements AppBarLayout.C5899d {
        C5902c() {
        }

        /* renamed from: a */
        public void mo22825a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f27645C = i;
            C3718d0 d0Var = collapsingToolbarLayout.f27647E;
            int l = d0Var != null ? d0Var.mo13038l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C5904a j = CollapsingToolbarLayout.m35236j(childAt);
                int i3 = layoutParams.f27672a;
                if (i3 == 1) {
                    j.mo22924f(C3641a.m15694b(-i, 0, CollapsingToolbarLayout.this.mo22855h(childAt)));
                } else if (i3 == 2) {
                    j.mo22924f(Math.round(((float) (-i)) * layoutParams.f27673b));
                }
            }
            CollapsingToolbarLayout.this.mo22898u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f27667v != null && l > 0) {
                C3774v.m16197e0(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int C = (height - C3774v.m16153C(CollapsingToolbarLayout.this)) - l;
            float f = (float) C;
            CollapsingToolbarLayout.this.f27662q.mo24150r0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f27662q.mo24136f0(collapsingToolbarLayout3.f27645C + C);
            CollapsingToolbarLayout.this.f27662q.mo24146p0(((float) Math.abs(i)) / f);
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m35230a(int i) {
        m35232c();
        ValueAnimator valueAnimator = this.f27670y;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f27670y = valueAnimator2;
            valueAnimator2.setDuration(this.f27671z);
            this.f27670y.setInterpolator(i > this.f27668w ? C7501a.f32701c : C7501a.f32702d);
            this.f27670y.addUpdateListener(new C5901b());
        } else if (valueAnimator.isRunning()) {
            this.f27670y.cancel();
        }
        this.f27670y.setIntValues(new int[]{this.f27668w, i});
        this.f27670y.start();
    }

    /* renamed from: b */
    private void m35231b(AppBarLayout appBarLayout) {
        if (m35237k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35232c() {
        /*
            r6 = this;
            boolean r0 = r6.f27652g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f27654i = r0
            r6.f27655j = r0
            int r1 = r6.f27653h
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f27654i = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.m35233d(r1)
            r6.f27655j = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f27654i
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m35238l(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f27654i = r0
        L_0x003e:
            r6.m35244t()
            r6.f27652g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m35232c():void");
    }

    /* renamed from: d */
    private View m35233d(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: g */
    private static int m35234g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    private static CharSequence m35235i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (Build.VERSION.SDK_INT < 21 || !(view instanceof android.widget.Toolbar)) {
            return null;
        }
        return ((android.widget.Toolbar) view).getTitle();
    }

    /* renamed from: j */
    static C5904a m35236j(View view) {
        int i = C7494f.view_offset_helper;
        C5904a aVar = (C5904a) view.getTag(i);
        if (aVar != null) {
            return aVar;
        }
        C5904a aVar2 = new C5904a(view);
        view.setTag(i, aVar2);
        return aVar2;
    }

    /* renamed from: k */
    private boolean m35237k() {
        return this.f27646D == 1;
    }

    /* renamed from: l */
    private static boolean m35238l(View view) {
        return (view instanceof Toolbar) || (Build.VERSION.SDK_INT >= 21 && (view instanceof android.widget.Toolbar));
    }

    /* renamed from: m */
    private boolean m35239m(View view) {
        View view2 = this.f27655j;
        if (view2 == null || view2 == this) {
            if (view == this.f27654i) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m35240p(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f27655j;
        if (view == null) {
            view = this.f27654i;
        }
        int h = mo22855h(view);
        C6065c.m36465a(this, this.f27656k, this.f27661p);
        ViewGroup viewGroup = this.f27654i;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i3 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i3 = toolbar2.getTitleMarginBottom();
        }
        C6061a aVar = this.f27662q;
        Rect rect = this.f27661p;
        int i5 = rect.left + (z ? i2 : i4);
        int i6 = rect.top + h + i;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        aVar.mo24129X(i5, i6, i7 - i4, (rect.bottom + h) - i3);
    }

    /* renamed from: q */
    private void m35241q() {
        setContentDescription(getTitle());
    }

    /* renamed from: r */
    private void m35242r(Drawable drawable, int i, int i2) {
        m35243s(drawable, this.f27654i, i, i2);
    }

    /* renamed from: s */
    private void m35243s(Drawable drawable, View view, int i, int i2) {
        if (m35237k() && view != null && this.f27664s) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: t */
    private void m35244t() {
        View view;
        if (!this.f27664s && (view = this.f27656k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f27656k);
            }
        }
        if (this.f27664s && this.f27654i != null) {
            if (this.f27656k == null) {
                this.f27656k = new View(getContext());
            }
            if (this.f27656k.getParent() == null) {
                this.f27654i.addView(this.f27656k, -1, -1);
            }
        }
    }

    /* renamed from: v */
    private void m35245v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (this.f27664s && (view = this.f27656k) != null) {
            boolean z2 = false;
            boolean z3 = C3774v.m16180S(view) && this.f27656k.getVisibility() == 0;
            this.f27665t = z3;
            if (z3 || z) {
                if (C3774v.m16151B(this) == 1) {
                    z2 = true;
                }
                m35240p(z2);
                this.f27662q.mo24137g0(z2 ? this.f27659n : this.f27657l, this.f27661p.top + this.f27658m, (i3 - i) - (z2 ? this.f27657l : this.f27659n), (i4 - i2) - this.f27660o);
                this.f27662q.mo24128V(z);
            }
        }
    }

    /* renamed from: w */
    private void m35246w() {
        if (this.f27654i != null && this.f27664s && TextUtils.isEmpty(this.f27662q.mo24124K())) {
            setTitle(m35235i(this.f27654i));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m35232c();
        if (this.f27654i == null && (drawable = this.f27666u) != null && this.f27668w > 0) {
            drawable.mutate().setAlpha(this.f27668w);
            this.f27666u.draw(canvas);
        }
        if (this.f27664s && this.f27665t) {
            if (this.f27654i == null || this.f27666u == null || this.f27668w <= 0 || !m35237k() || this.f27662q.mo24117D() >= this.f27662q.mo24118E()) {
                this.f27662q.mo24142m(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f27666u.getBounds(), Region.Op.DIFFERENCE);
                this.f27662q.mo24142m(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f27667v != null && this.f27668w > 0) {
            C3718d0 d0Var = this.f27647E;
            int l = d0Var != null ? d0Var.mo13038l() : 0;
            if (l > 0) {
                this.f27667v.setBounds(0, -this.f27645C, getWidth(), l - this.f27645C);
                this.f27667v.mutate().setAlpha(this.f27668w);
                this.f27667v.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f27666u == null || this.f27668w <= 0 || !m35239m(view)) {
            z = false;
        } else {
            m35243s(this.f27666u, view, getWidth(), getHeight());
            this.f27666u.mutate().setAlpha(this.f27668w);
            this.f27666u.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27667v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f27666u;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C6061a aVar = this.f27662q;
        if (aVar != null) {
            z |= aVar.mo24161z0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f27662q.mo24149r();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f27662q.mo24154v();
    }

    public Drawable getContentScrim() {
        return this.f27666u;
    }

    public int getExpandedTitleGravity() {
        return this.f27662q.mo24111A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f27660o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f27659n;
    }

    public int getExpandedTitleMarginStart() {
        return this.f27657l;
    }

    public int getExpandedTitleMarginTop() {
        return this.f27658m;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f27662q.mo24115C();
    }

    public int getHyphenationFrequency() {
        return this.f27662q.mo24119F();
    }

    public int getLineCount() {
        return this.f27662q.mo24120G();
    }

    public float getLineSpacingAdd() {
        return this.f27662q.mo24121H();
    }

    public float getLineSpacingMultiplier() {
        return this.f27662q.mo24122I();
    }

    public int getMaxLines() {
        return this.f27662q.mo24123J();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f27668w;
    }

    public long getScrimAnimationDuration() {
        return this.f27671z;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f27643A;
        if (i >= 0) {
            return i + this.f27648F + this.f27650H;
        }
        C3718d0 d0Var = this.f27647E;
        int l = d0Var != null ? d0Var.mo13038l() : 0;
        int C = C3774v.m16153C(this);
        if (C > 0) {
            return Math.min((C * 2) + l, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f27667v;
    }

    public CharSequence getTitle() {
        if (this.f27664s) {
            return this.f27662q.mo24124K();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f27646D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo22855h(View view) {
        return ((getHeight() - m35236j(view).mo22920b()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C3718d0 mo22856n(C3718d0 d0Var) {
        C3718d0 d0Var2 = C3774v.m16236y(this) ? d0Var : null;
        if (!C3698d.m15814a(this.f27647E, d0Var2)) {
            this.f27647E = d0Var2;
            requestLayout();
        }
        return d0Var.mo13027c();
    }

    /* renamed from: o */
    public void mo22857o(boolean z, boolean z2) {
        if (this.f27669x != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m35230a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f27669x = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m35231b(appBarLayout);
            C3774v.m16233w0(this, C3774v.m16236y(appBarLayout));
            if (this.f27644B == null) {
                this.f27644B = new C5902c();
            }
            appBarLayout.mo22743b(this.f27644B);
            C3774v.m16211l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C5899d dVar = this.f27644B;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo22774p(dVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3718d0 d0Var = this.f27647E;
        if (d0Var != null) {
            int l = d0Var.mo13038l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C3774v.m16236y(childAt) && childAt.getTop() < l) {
                    C3774v.m16187Z(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m35236j(getChildAt(i6)).mo22922d();
        }
        m35245v(i, i2, i3, i4, false);
        m35246w();
        mo22898u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m35236j(getChildAt(i7)).mo22919a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m35232c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C3718d0 d0Var = this.f27647E;
        int l = d0Var != null ? d0Var.mo13038l() : 0;
        if ((mode == 0 || this.f27649G) && l > 0) {
            this.f27648F = l;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + l, 1073741824));
        }
        if (this.f27651I && this.f27662q.mo24123J() > 1) {
            m35246w();
            m35245v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int G = this.f27662q.mo24120G();
            if (G > 1) {
                this.f27650H = Math.round(this.f27662q.mo24160z()) * (G - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f27650H, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f27654i;
        if (viewGroup != null) {
            View view = this.f27655j;
            if (view == null || view == this) {
                setMinimumHeight(m35234g(viewGroup));
            } else {
                setMinimumHeight(m35234g(view));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f27666u;
        if (drawable != null) {
            m35242r(drawable, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f27662q.mo24134c0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f27662q.mo24131Z(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f27662q.mo24135d0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f27666u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f27666u = drawable3;
            if (drawable3 != null) {
                m35242r(drawable3, getWidth(), getHeight());
                this.f27666u.setCallback(this);
                this.f27666u.setAlpha(this.f27668w);
            }
            C3774v.m16197e0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0506a.m3152d(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f27662q.mo24141l0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f27660o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f27659n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f27657l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f27658m = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f27662q.mo24139i0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f27662q.mo24140k0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f27662q.mo24144n0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f27651I = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f27649G = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f27662q.mo24152s0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f27662q.mo24153u0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f27662q.mo24155v0(f);
    }

    public void setMaxLines(int i) {
        this.f27662q.mo24157w0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f27662q.mo24159y0(z);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f27668w) {
            if (!(this.f27666u == null || (viewGroup = this.f27654i) == null)) {
                C3774v.m16197e0(viewGroup);
            }
            this.f27668w = i;
            C3774v.m16197e0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f27671z = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f27643A != i) {
            this.f27643A = i;
            mo22898u();
        }
    }

    public void setScrimsShown(boolean z) {
        mo22857o(z, C3774v.m16181T(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f27667v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f27667v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f27667v.setState(getDrawableState());
                }
                C0534a.m3287m(this.f27667v, C3774v.m16151B(this));
                this.f27667v.setVisible(getVisibility() == 0, false);
                this.f27667v.setCallback(this);
                this.f27667v.setAlpha(this.f27668w);
            }
            C3774v.m16197e0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0506a.m3152d(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f27662q.mo24112A0(charSequence);
        m35241q();
    }

    public void setTitleCollapseMode(int i) {
        this.f27646D = i;
        boolean k = m35237k();
        this.f27662q.mo24148q0(k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m35231b((AppBarLayout) parent);
        }
        if (k && this.f27666u == null) {
            setContentScrimColor(this.f27663r.mo28405d(getResources().getDimension(C7492d.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f27664s) {
            this.f27664s = z;
            m35241q();
            m35244t();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f27667v;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f27667v.setVisible(z, false);
        }
        Drawable drawable2 = this.f27666u;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f27666u.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo22898u() {
        if (this.f27666u != null || this.f27667v != null) {
            setScrimsShown(getHeight() + this.f27645C < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27666u || drawable == this.f27667v;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f27662q.mo24132b0(colorStateList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f27642J
            android.content.Context r10 = com.google.android.material.theme.p249a.C6260a.m37386c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = 1
            r9.f27652g = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f27661p = r0
            r6 = -1
            r9.f27643A = r6
            r7 = 0
            r9.f27648F = r7
            r9.f27650H = r7
            android.content.Context r0 = r9.getContext()
            com.google.android.material.internal.a r8 = new com.google.android.material.internal.a
            r8.<init>(r9)
            r9.f27662q = r8
            android.animation.TimeInterpolator r1 = p159f.p243f.p245b.p304b.p305m.C7501a.f32703e
            r8.mo24114B0(r1)
            r8.mo24159y0(r7)
            f.f.b.b.q.a r1 = new f.f.b.b.q.a
            r1.<init>(r0)
            r9.f27663r = r1
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo24141l0(r12)
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r12 = r11.getInt(r12, r0)
            r8.mo24134c0(r12)
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleMargin
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f27660o = r12
            r9.f27659n = r12
            r9.f27658m = r12
            r9.f27657l = r12
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0073
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f27657l = r12
        L_0x0073:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0081
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f27659n = r12
        L_0x0081:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008f
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f27658m = r12
        L_0x008f:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009d
            int r12 = r11.getDimensionPixelSize(r12, r7)
            r9.f27660o = r12
        L_0x009d:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_titleEnabled
            boolean r12 = r11.getBoolean(r12, r10)
            r9.f27664s = r12
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_title
            java.lang.CharSequence r12 = r11.getText(r12)
            r9.setTitle(r12)
            int r12 = p159f.p243f.p245b.p304b.C7499k.TextAppearance_Design_CollapsingToolbar_Expanded
            r8.mo24139i0(r12)
            int r12 = p082e.p083a.C3408i.TextAppearance_AppCompat_Widget_ActionBar_Title
            r8.mo24131Z(r12)
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00c7
            int r12 = r11.getResourceId(r12, r7)
            r8.mo24139i0(r12)
        L_0x00c7:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00d6
            int r12 = r11.getResourceId(r12, r7)
            r8.mo24131Z(r12)
        L_0x00d6:
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.f27643A = r12
            int r12 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_maxLines
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ed
            int r10 = r11.getInt(r12, r10)
            r8.mo24157w0(r10)
        L_0x00ed:
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_scrimAnimationDuration
            r12 = 600(0x258, float:8.41E-43)
            int r10 = r11.getInt(r10, r12)
            long r0 = (long) r10
            r9.f27671z = r0
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setContentScrim(r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarScrim(r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_titleCollapseMode
            int r10 = r11.getInt(r10, r7)
            r9.setTitleCollapseMode(r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_toolbarId
            int r10 = r11.getResourceId(r10, r6)
            r9.f27653h = r10
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f27649G = r10
            int r10 = p159f.p243f.p245b.p304b.C7500l.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r10 = r11.getBoolean(r10, r7)
            r9.f27651I = r10
            r11.recycle()
            r9.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r10 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r10.<init>()
            p082e.p109h.p119p.C3774v.m16154C0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f27672a = 0;

        /* renamed from: b */
        float f27673b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.CollapsingToolbarLayout_Layout);
            this.f27672a = obtainStyledAttributes.getInt(C7500l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo22900a(obtainStyledAttributes.getFloat(C7500l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo22900a(float f) {
            this.f27673b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
