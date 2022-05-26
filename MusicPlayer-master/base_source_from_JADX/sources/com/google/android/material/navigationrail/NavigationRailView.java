package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0279g0;
import com.google.android.material.internal.C6093m;
import com.google.android.material.navigation.NavigationBarView;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: n */
    private final int f28625n;

    /* renamed from: o */
    private View f28626o;

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    private C6122b getNavigationRailMenuView() {
        return (C6122b) getMenuView();
    }

    /* renamed from: j */
    private boolean m36666j() {
        View view = this.f28626o;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: k */
    private int m36667k(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: g */
    public void mo24382g(int i) {
        mo24385h(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public View getHeaderView() {
        return this.f28626o;
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: h */
    public void mo24385h(View view) {
        mo24387l();
        this.f28626o = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f28625n;
        addView(view, 0, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6122b mo23034e(Context context) {
        return new C6122b(context);
    }

    /* renamed from: l */
    public void mo24387l() {
        View view = this.f28626o;
        if (view != null) {
            removeView(view);
            this.f28626o = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C6122b navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (m36666j()) {
            int bottom = this.f28626o.getBottom() + this.f28625n;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo24393l()) {
            i5 = this.f28625n;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int k = m36667k(i);
        super.onMeasure(k, i2);
        if (m36666j()) {
            measureChild(getNavigationRailMenuView(), k, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f28626o.getMeasuredHeight()) - this.f28625n, Integer.MIN_VALUE));
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C7499k.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f28625n = getResources().getDimensionPixelSize(C7492d.mtrl_navigation_rail_margin);
        C0279g0 i3 = C6093m.m36564i(getContext(), attributeSet, C7500l.NavigationRailView, i, i2, new int[0]);
        int n = i3.mo1989n(C7500l.NavigationRailView_headerLayout, 0);
        if (n != 0) {
            mo24382g(n);
        }
        setMenuGravity(i3.mo1986k(C7500l.NavigationRailView_menuGravity, 49));
        i3.mo1995w();
    }
}
