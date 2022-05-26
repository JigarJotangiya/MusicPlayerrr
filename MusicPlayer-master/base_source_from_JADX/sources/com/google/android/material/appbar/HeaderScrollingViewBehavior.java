package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3774v;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    final Rect f27687d = new Rect();

    /* renamed from: e */
    final Rect f27688e = new Rect();

    /* renamed from: f */
    private int f27689f = 0;

    /* renamed from: g */
    private int f27690g;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: N */
    private static int m35268N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo22906F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo22820H(coordinatorLayout.mo3042v(view));
        if (H != null) {
            CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) view.getLayoutParams();
            Rect rect = this.f27687d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, H.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C3718d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C3774v.m16236y(coordinatorLayout) && !C3774v.m16236y(view)) {
                rect.left += lastWindowInsets.mo13036j();
                rect.right -= lastWindowInsets.mo13037k();
            }
            Rect rect2 = this.f27688e;
            C3733e.m15971a(m35268N(eVar.f2495c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo22907I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f27689f = rect2.top - H.getBottom();
            return;
        }
        super.mo22906F(coordinatorLayout, view, i);
        this.f27689f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo22820H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo22907I(View view) {
        if (this.f27690g == 0) {
            return 0;
        }
        float J = mo22821J(view);
        int i = this.f27690g;
        return C3641a.m15694b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public float mo22821J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int mo22908K() {
        return this.f27690g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo22822L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo22909M() {
        return this.f27689f;
    }

    /* renamed from: O */
    public final void mo22910O(int i) {
        this.f27690g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo22911P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3063m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C3718d0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo22820H(coordinatorLayout.mo3042v(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C3774v.m16236y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo13038l() + lastWindowInsets.mo13035i();
        }
        int L = size + mo22822L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo22911P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo3002N(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
