package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0534a;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3763k;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3746f;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7495g;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0447b {

    /* renamed from: x */
    private static final int f27599x = C7499k.Widget_Design_AppBarLayout;

    /* renamed from: g */
    private int f27600g;

    /* renamed from: h */
    private int f27601h;

    /* renamed from: i */
    private int f27602i;

    /* renamed from: j */
    private int f27603j;

    /* renamed from: k */
    private boolean f27604k;

    /* renamed from: l */
    private int f27605l;

    /* renamed from: m */
    private C3718d0 f27606m;

    /* renamed from: n */
    private List<C5898c> f27607n;

    /* renamed from: o */
    private boolean f27608o;

    /* renamed from: p */
    private boolean f27609p;

    /* renamed from: q */
    private boolean f27610q;

    /* renamed from: r */
    private boolean f27611r;

    /* renamed from: s */
    private int f27612s;

    /* renamed from: t */
    private WeakReference<View> f27613t;

    /* renamed from: u */
    private ValueAnimator f27614u;

    /* renamed from: v */
    private int[] f27615v;

    /* renamed from: w */
    private Drawable f27616w;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m35217R(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0450e) appBarLayout.getLayoutParams()).mo3092f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo22793M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m35218S(View view, View view2) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0450e) view2.getLayoutParams()).mo3092f();
            if (f instanceof BaseBehavior) {
                C3774v.m16187Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f27617k) + mo22909M()) - mo22907I(view2));
            }
        }

        /* renamed from: T */
        private void m35219T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo22765l()) {
                    appBarLayout.mo22787u(appBarLayout.mo22789w(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo22821J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m35217R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo22822L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo22822L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo22820H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo3055e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo3058h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m35218S(view, view2);
            m35219T(view, view2);
            return false;
        }

        /* renamed from: i */
        public void mo3059i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C3774v.m16205i0(coordinatorLayout, C3736c.C3737a.f11795h.mo13156b());
                C3774v.m16205i0(coordinatorLayout, C3736c.C3737a.f11796i.mo13156b());
            }
        }

        /* renamed from: w */
        public boolean mo3073w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo22820H(coordinatorLayout.mo3042v(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f27687d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo22776r(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ScrollingViewBehavior_Layout);
            mo22910O(obtainStyledAttributes.getDimensionPixelSize(C7500l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C5896a implements C3769q {
        C5896a() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            AppBarLayout.this.mo22767n(d0Var);
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C5897b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C7541h f27641a;

        C5897b(AppBarLayout appBarLayout, C7541h hVar) {
            this.f27641a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f27641a.mo28462Z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C5898c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo22825a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public interface C5899d extends C5898c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m35140c() {
        WeakReference<View> weakReference = this.f27613t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f27613t = null;
    }

    /* renamed from: d */
    private View m35141d(View view) {
        int i;
        if (this.f27613t == null && (i = this.f27612s) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f27612s);
            }
            if (findViewById != null) {
                this.f27613t = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f27613t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    private boolean m35142i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo22819c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m35143k() {
        this.f27601h = -1;
        this.f27602i = -1;
        this.f27603j = -1;
    }

    /* renamed from: s */
    private void m35144s(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f27605l = i2 | i;
        requestLayout();
    }

    /* renamed from: t */
    private boolean m35145t(boolean z) {
        if (this.f27609p == z) {
            return false;
        }
        this.f27609p = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: v */
    private boolean m35146v() {
        return this.f27616w != null && getTopInset() > 0;
    }

    /* renamed from: x */
    private boolean m35147x() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C3774v.m16236y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m35148y(C7541h hVar, boolean z) {
        float dimension = getResources().getDimension(C7492d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f27614u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f27614u = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C7495g.app_bar_elevation_anim_duration));
        this.f27614u.setInterpolator(C7501a.f32699a);
        this.f27614u.addUpdateListener(new C5897b(this, hVar));
        this.f27614u.start();
    }

    /* renamed from: z */
    private void m35149z() {
        setWillNotDraw(!m35146v());
    }

    /* renamed from: a */
    public void mo22742a(C5898c cVar) {
        if (this.f27607n == null) {
            this.f27607n = new ArrayList();
        }
        if (cVar != null && !this.f27607n.contains(cVar)) {
            this.f27607n.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo22743b(C5899d dVar) {
        mo22742a(dVar);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m35146v()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f27600g));
            this.f27616w.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f27616w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f27602i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f27638a;
            if ((i4 & 5) == 5) {
                int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    C = C3774v.m16153C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - C3774v.m16153C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C3774v.m16236y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f27602i = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f27603j;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f27638a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C3774v.m16153C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f27603j = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f27612s;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = C3774v.m16153C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? C3774v.m16153C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f27605l;
    }

    public Drawable getStatusBarForeground() {
        return this.f27616w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C3718d0 d0Var = this.f27606m;
        if (d0Var != null) {
            return d0Var.mo13038l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f27601h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f27638a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i2 == 0 && C3774v.m16236y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C3774v.m16153C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f27601h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo22763h() {
        return this.f27604k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo22764j() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: l */
    public boolean mo22765l() {
        return this.f27611r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo22766m(int i) {
        this.f27600g = i;
        if (!willNotDraw()) {
            C3774v.m16197e0(this);
        }
        List<C5898c> list = this.f27607n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5898c cVar = this.f27607n.get(i2);
                if (cVar != null) {
                    cVar.mo22825a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C3718d0 mo22767n(C3718d0 d0Var) {
        C3718d0 d0Var2 = C3774v.m16236y(this) ? d0Var : null;
        if (!C3698d.m15814a(this.f27606m, d0Var2)) {
            this.f27606m = d0Var2;
            m35149z();
            requestLayout();
        }
        return d0Var;
    }

    /* renamed from: o */
    public void mo22768o(C5898c cVar) {
        List<C5898c> list = this.f27607n;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42139e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f27615v == null) {
            this.f27615v = new int[4];
        }
        int[] iArr = this.f27615v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f27609p;
        int i2 = C7490b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f27610q) ? -C7490b.state_lifted : C7490b.state_lifted;
        int i3 = C7490b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f27610q) ? -C7490b.state_collapsed : C7490b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m35140c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C3774v.m16236y(this) && m35147x()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C3774v.m16187Z(getChildAt(childCount), topInset);
            }
        }
        m35143k();
        this.f27604k = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo22818b() != null) {
                this.f27604k = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f27616w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f27608o) {
            if (!this.f27611r && !m35142i()) {
                z2 = false;
            }
            m35145t(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C3774v.m16236y(this) && m35147x()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C3641a.m15694b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m35143k();
    }

    /* renamed from: p */
    public void mo22774p(C5899d dVar) {
        mo22768o(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo22775q() {
        this.f27605l = 0;
    }

    /* renamed from: r */
    public void mo22776r(boolean z, boolean z2) {
        m35144s(z, z2, true);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7545i.m42138d(this, f);
    }

    public void setExpanded(boolean z) {
        mo22776r(z, C3774v.m16181T(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f27611r = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f27612s = i;
        m35140c();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f27616w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f27616w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f27616w.setState(getDrawableState());
                }
                C0534a.m3287m(this.f27616w, C3774v.m16151B(this));
                this.f27616w.setVisible(getVisibility() == 0, false);
                this.f27616w.setCallback(this);
            }
            m35149z();
            C3774v.m16197e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C3410a.m14543d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C5905b.m35295b(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f27616w;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo22787u(boolean z) {
        if (this.f27610q == z) {
            return false;
        }
        this.f27610q = z;
        refreshDrawableState();
        if (!this.f27611r || !(getBackground() instanceof C7541h)) {
            return true;
        }
        m35148y((C7541h) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27616w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo22789w(View view) {
        View d = m35141d(view);
        if (d != null) {
            view = d;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f27617k;

        /* renamed from: l */
        private int f27618l;

        /* renamed from: m */
        private ValueAnimator f27619m;

        /* renamed from: n */
        private int f27620n = -1;

        /* renamed from: o */
        private boolean f27621o;

        /* renamed from: p */
        private float f27622p;

        /* renamed from: q */
        private WeakReference<View> f27623q;

        /* renamed from: r */
        private C5895d f27624r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C5892a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f27628a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f27629b;

            C5892a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f27628a = coordinatorLayout;
                this.f27629b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo22904P(this.f27628a, this.f27629b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C5893b implements C3746f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f27631a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f27632b;

            /* renamed from: c */
            final /* synthetic */ View f27633c;

            /* renamed from: d */
            final /* synthetic */ int f27634d;

            C5893b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f27631a = coordinatorLayout;
                this.f27632b = appBarLayout;
                this.f27633c = view;
                this.f27634d = i;
            }

            /* renamed from: a */
            public boolean mo6390a(View view, C3746f.C3747a aVar) {
                BaseBehavior.this.mo3067q(this.f27631a, this.f27632b, this.f27633c, 0, this.f27634d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C5894c implements C3746f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f27636a;

            /* renamed from: b */
            final /* synthetic */ boolean f27637b;

            C5894c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.f27636a = appBarLayout;
                this.f27637b = z;
            }

            /* renamed from: a */
            public boolean mo6390a(View view, C3746f.C3747a aVar) {
                this.f27636a.setExpanded(this.f27637b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class C5895d<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo22816a(T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: S */
        private void m35167S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo22793M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m35168T(coordinatorLayout, t, C3736c.C3737a.f11795h, false);
            }
            if (mo22793M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C3774v.m16209k0(coordinatorLayout, C3736c.C3737a.f11796i, (CharSequence) null, new C5893b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            m35168T(coordinatorLayout, t, C3736c.C3737a.f11796i, true);
        }

        /* renamed from: T */
        private void m35168T(CoordinatorLayout coordinatorLayout, T t, C3736c.C3737a aVar, boolean z) {
            C3774v.m16209k0(coordinatorLayout, aVar, (CharSequence) null, new C5894c(this, t, z));
        }

        /* renamed from: U */
        private void m35169U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo22793M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m35170V(coordinatorLayout, t, i, i2);
        }

        /* renamed from: V */
        private void m35170V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo22793M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f27619m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f27619m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f27619m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f27619m = valueAnimator3;
                valueAnimator3.setInterpolator(C7501a.f32703e);
                this.f27619m.addUpdateListener(new C5892a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f27619m.setDuration((long) Math.min(i2, 600));
            this.f27619m.setIntValues(new int[]{M, i});
            this.f27619m.start();
        }

        /* renamed from: X */
        private boolean m35171X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo22764j() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Y */
        private static boolean m35172Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: Z */
        private View m35173Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C3763k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m35174a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m35175b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m35172Y(layoutParams.mo22817a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m35176e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.mo22818b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = layoutParams.mo22817a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C3774v.m16153C(childAt);
                        }
                    }
                    if (C3774v.m16236y(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: p0 */
        private boolean m35177p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> w = coordinatorLayout.mo3044w(t);
            int size = w.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0450e) w.get(i).getLayoutParams()).mo3092f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).mo22908K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m35178q0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo22793M();
            int b0 = m35175b0(t, M);
            if (b0 >= 0) {
                View childAt = t.getChildAt(b0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a = layoutParams.mo22817a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m35172Y(a, 2)) {
                        i2 += C3774v.m16153C(childAt);
                    } else if (m35172Y(a, 5)) {
                        int C = C3774v.m16153C(childAt) + i2;
                        if (M < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m35172Y(a, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m35169U(coordinatorLayout, t, C3641a.m15694b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m35179r0(CoordinatorLayout coordinatorLayout, T t) {
            C3774v.m16205i0(coordinatorLayout, C3736c.C3737a.f11795h.mo13156b());
            C3774v.m16205i0(coordinatorLayout, C3736c.C3737a.f11796i.mo13156b());
            View Z = m35173Z(coordinatorLayout);
            if (Z != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0450e) Z.getLayoutParams()).mo3092f() instanceof ScrollingViewBehavior)) {
                m35167S(coordinatorLayout, t, Z);
            }
        }

        /* renamed from: s0 */
        private void m35180s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a0 = m35174a0(t, i);
            if (a0 != null) {
                int a = ((LayoutParams) a0.getLayoutParams()).mo22817a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int C = C3774v.m16153C(a0);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (a0.getBottom() - C) - t.getTopInset()) : (-i) >= (a0.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo22765l()) {
                    z2 = t.mo22789w(m35173Z(coordinatorLayout));
                }
                boolean u = t.mo22787u(z2);
                if (z || (u && m35177p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo22793M() {
            return mo22917E() + this.f27617k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public boolean mo22790H(T t) {
            C5895d dVar = this.f27624r;
            if (dVar != null) {
                return dVar.mo22816a(t);
            }
            WeakReference<View> weakReference = this.f27623q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int mo22791K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int mo22792L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public void mo22794N(CoordinatorLayout coordinatorLayout, T t) {
            m35178q0(coordinatorLayout, t);
            if (t.mo22765l()) {
                t.mo22787u(t.mo22789w(m35173Z(coordinatorLayout)));
            }
        }

        /* renamed from: g0 */
        public boolean mo3062l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l = super.mo3062l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f27620n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f27621o) {
                    i2 = C3774v.m16153C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f27622p);
                }
                mo22904P(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m35169U(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo22904P(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m35169U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo22904P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo22775q();
            this.f27620n = -1;
            mo22918G(C3641a.m15694b(mo22917E(), -t.getTotalScrollRange(), 0));
            m35180s0(coordinatorLayout, t, mo22917E(), 0, true);
            t.mo22766m(mo22917E());
            m35179r0(coordinatorLayout, t);
            return l;
        }

        /* renamed from: h0 */
        public boolean mo3063m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0450e) t.getLayoutParams()).height != -2) {
                return super.mo3063m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo3002N(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: i0 */
        public void mo3067q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo22903O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo22765l()) {
                t.mo22787u(t.mo22789w(view));
            }
        }

        /* renamed from: j0 */
        public void mo3070t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo22903O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m35179r0(coordinatorLayout, t);
            }
        }

        /* renamed from: k0 */
        public void mo3074x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo3074x(coordinatorLayout, t, savedState.mo3471a());
                this.f27620n = savedState.f27625i;
                this.f27622p = savedState.f27626j;
                this.f27621o = savedState.f27627k;
                return;
            }
            super.mo3074x(coordinatorLayout, t, parcelable);
            this.f27620n = -1;
        }

        /* renamed from: l0 */
        public Parcelable mo3075y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo3075y(coordinatorLayout, t);
            int E = mo22917E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(y);
                    savedState.f27625i = i;
                    if (bottom == C3774v.m16153C(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f27627k = z;
                    savedState.f27626j = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return y;
        }

        /* renamed from: m0 */
        public boolean mo3047A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo22765l() || m35171X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f27619m) != null) {
                valueAnimator.cancel();
            }
            this.f27623q = null;
            this.f27618l = i2;
            return z;
        }

        /* renamed from: n0 */
        public void mo3049C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f27618l == 0 || i == 1) {
                m35178q0(coordinatorLayout, t);
                if (t.mo22765l()) {
                    t.mo22787u(t.mo22789w(view));
                }
            }
            this.f27623q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o0 */
        public int mo22795Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo22793M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f27617k = 0;
            } else {
                int b = C3641a.m15694b(i, i2, i3);
                if (M != b) {
                    int e0 = t.mo22763h() ? m35176e0(t, b) : b;
                    boolean G = mo22918G(e0);
                    i4 = M - b;
                    this.f27617k = b - e0;
                    if (!G && t.mo22763h()) {
                        coordinatorLayout.mo3028p(t);
                    }
                    t.mo22766m(mo22917E());
                    m35180s0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            m35179r0(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C5891a();

            /* renamed from: i */
            int f27625i;

            /* renamed from: j */
            float f27626j;

            /* renamed from: k */
            boolean f27627k;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C5891a implements Parcelable.ClassLoaderCreator<SavedState> {
                C5891a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f27625i = parcel.readInt();
                this.f27626j = parcel.readFloat();
                this.f27627k = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f27625i);
                parcel.writeFloat(this.f27626j);
                parcel.writeByte(this.f27627k ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.appBarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f27599x
            android.content.Context r11 = com.google.android.material.theme.p249a.C6260a.m37386c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f27601h = r11
            r10.f27602i = r11
            r10.f27603j = r11
            r6 = 0
            r10.f27605l = r6
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x0027
            com.google.android.material.appbar.C5905b.m35294a(r10)
            com.google.android.material.appbar.C5905b.m35296c(r10, r12, r13, r4)
        L_0x0027:
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_android_background
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            p082e.p109h.p119p.C3774v.m16223r0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            f.f.b.b.w.h r0 = new f.f.b.b.w.h
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.mo28463a0(r13)
            r0.mo28456P(r7)
            p082e.p109h.p119p.C3774v.m16223r0(r10, r0)
        L_0x005f:
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_expanded
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x006e
            boolean r13 = r12.getBoolean(r13, r6)
            r10.m35144s(r13, r6, r6)
        L_0x006e:
            if (r8 < r9) goto L_0x0080
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_elevation
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0080
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.C5905b.m35295b(r10, r13)
        L_0x0080:
            r13 = 26
            if (r8 < r13) goto L_0x00a2
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0093
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        L_0x0093:
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00a2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        L_0x00a2:
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_liftOnScroll
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f27611r = r13
            int r13 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_liftOnScrollTargetViewId
            int r11 = r12.getResourceId(r13, r11)
            r10.f27612s = r11
            int r11 = p159f.p243f.p245b.p304b.C7500l.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            p082e.p109h.p119p.C3774v.m16154C0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f27638a = 1;

        /* renamed from: b */
        Interpolator f27639b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.AppBarLayout_Layout);
            this.f27638a = obtainStyledAttributes.getInt(C7500l.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = C7500l.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f27639b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo22817a() {
            return this.f27638a;
        }

        /* renamed from: b */
        public Interpolator mo22818b() {
            return this.f27639b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo22819c() {
            int i = this.f27638a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
