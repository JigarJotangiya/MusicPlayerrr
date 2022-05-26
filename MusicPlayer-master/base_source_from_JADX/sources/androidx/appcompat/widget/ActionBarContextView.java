package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0171g;
import p082e.p083a.C3400a;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3409j;
import p082e.p083a.p090o.C3432b;
import p082e.p109h.p119p.C3774v;

public class ActionBarContextView extends C0263a {

    /* renamed from: o */
    private CharSequence f800o;

    /* renamed from: p */
    private CharSequence f801p;

    /* renamed from: q */
    private View f802q;

    /* renamed from: r */
    private View f803r;

    /* renamed from: s */
    private LinearLayout f804s;

    /* renamed from: t */
    private TextView f805t;

    /* renamed from: u */
    private TextView f806u;

    /* renamed from: v */
    private int f807v;

    /* renamed from: w */
    private int f808w;

    /* renamed from: x */
    private boolean f809x;

    /* renamed from: y */
    private int f810y;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0197a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C3432b f811g;

        C0197a(ActionBarContextView actionBarContextView, C3432b bVar) {
            this.f811g = bVar;
        }

        public void onClick(View view) {
            this.f811g.mo703c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private void m1179i() {
        if (this.f804s == null) {
            LayoutInflater.from(getContext()).inflate(C3406g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f804s = linearLayout;
            this.f805t = (TextView) linearLayout.findViewById(C3405f.action_bar_title);
            this.f806u = (TextView) this.f804s.findViewById(C3405f.action_bar_subtitle);
            if (this.f807v != 0) {
                this.f805t.setTextAppearance(getContext(), this.f807v);
            }
            if (this.f808w != 0) {
                this.f806u.setTextAppearance(getContext(), this.f808w);
            }
        }
        this.f805t.setText(this.f800o);
        this.f806u.setText(this.f801p);
        boolean z = !TextUtils.isEmpty(this.f800o);
        boolean z2 = !TextUtils.isEmpty(this.f801p);
        int i = 0;
        this.f806u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f804s;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f804s.getParent() == null) {
            addView(this.f804s);
        }
    }

    /* renamed from: g */
    public void mo1173g() {
        if (this.f802q == null) {
            mo1182k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f801p;
    }

    public CharSequence getTitle() {
        return this.f800o;
    }

    /* renamed from: h */
    public void mo1180h(C3432b bVar) {
        View view = this.f802q;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f810y, this, false);
            this.f802q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f802q);
        }
        this.f802q.findViewById(C3405f.action_mode_close_button).setOnClickListener(new C0197a(this, bVar));
        C0171g gVar = (C0171g) bVar.mo705e();
        ActionMenuPresenter actionMenuPresenter = this.f1228j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1262s();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1228j = actionMenuPresenter2;
        actionMenuPresenter2.mo1259N(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.mo918c(this.f1228j, this.f1226h);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1228j.mo828i(this);
        this.f1227i = actionMenuView;
        C3774v.m16223r0(actionMenuView, (Drawable) null);
        addView(this.f1227i, layoutParams);
    }

    /* renamed from: j */
    public boolean mo1181j() {
        return this.f809x;
    }

    /* renamed from: k */
    public void mo1182k() {
        removeAllViews();
        this.f803r = null;
        this.f1227i = null;
    }

    /* renamed from: l */
    public boolean mo1183l() {
        ActionMenuPresenter actionMenuPresenter = this.f1228j;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1260O();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1228j;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1264v();
            this.f1228j.mo1265w();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f800o);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0299m0.m1793b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f802q;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f802q.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0263a.m1539d(paddingRight, i5, b);
            paddingRight = C0263a.m1539d(d + mo1911e(this.f802q, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f804s;
        if (!(linearLayout == null || this.f803r != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1911e(this.f804s, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f803r;
        if (view2 != null) {
            mo1911e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1227i;
        if (actionMenuView != null) {
            mo1911e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1229k;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f802q;
            if (view != null) {
                int c = mo1910c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f802q.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1227i;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1910c(this.f1227i, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f804s;
            if (linearLayout != null && this.f803r == null) {
                if (this.f809x) {
                    this.f804s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f804s.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f804s.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1910c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f803r;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f803r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1229k <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f1229k = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f803r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f803r = view;
        if (!(view == null || (linearLayout = this.f804s) == null)) {
            removeView(linearLayout);
            this.f804s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f801p = charSequence;
        m1179i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f800o = charSequence;
        m1179i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f809x) {
            requestLayout();
        }
        this.f809x = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0279g0 v = C0279g0.m1627v(context, attributeSet, C3409j.ActionMode, i, 0);
        C3774v.m16223r0(this, v.mo1982g(C3409j.ActionMode_background));
        this.f807v = v.mo1989n(C3409j.ActionMode_titleTextStyle, 0);
        this.f808w = v.mo1989n(C3409j.ActionMode_subtitleTextStyle, 0);
        this.f1229k = v.mo1988m(C3409j.ActionMode_height, 0);
        this.f810y = v.mo1989n(C3409j.ActionMode_closeItemLayout, C3406g.abc_action_mode_close_item_material);
        v.mo1995w();
    }
}
