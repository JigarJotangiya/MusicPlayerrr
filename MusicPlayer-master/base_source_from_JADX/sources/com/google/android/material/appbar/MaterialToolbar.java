package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.internal.C6094n;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;

public class MaterialToolbar extends Toolbar {

    /* renamed from: b0 */
    private static final int f27691b0 = C7499k.Widget_MaterialComponents_Toolbar;

    /* renamed from: V */
    private Integer f27692V;

    /* renamed from: W */
    private boolean f27693W;

    /* renamed from: a0 */
    private boolean f27694a0;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: Q */
    private Pair<Integer, Integer> m35279Q(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: R */
    private void m35280R(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C7541h hVar = new C7541h();
            hVar.mo28463a0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            hVar.mo28456P(context);
            hVar.mo28462Z(C3774v.m16232w(this));
            C3774v.m16223r0(this, hVar);
        }
    }

    /* renamed from: S */
    private void m35281S(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: T */
    private void m35282T() {
        if (this.f27693W || this.f27694a0) {
            TextView c = C6094n.m36567c(this);
            TextView a = C6094n.m36565a(this);
            if (c != null || a != null) {
                Pair<Integer, Integer> Q = m35279Q(c, a);
                if (this.f27693W && c != null) {
                    m35281S(c, Q);
                }
                if (this.f27694a0 && a != null) {
                    m35281S(a, Q);
                }
            }
        }
    }

    /* renamed from: U */
    private Drawable m35283U(Drawable drawable) {
        if (drawable == null || this.f27692V == null) {
            return drawable;
        }
        Drawable r = C0534a.m3292r(drawable);
        C0534a.m3288n(r, this.f27692V.intValue());
        return r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42139e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m35282T();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7545i.m42138d(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m35283U(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f27692V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f27694a0 != z) {
            this.f27694a0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f27693W != z) {
            this.f27693W = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f27691b0
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r10 = p159f.p243f.p245b.p304b.C7500l.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0029
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = p159f.p243f.p245b.p304b.C7500l.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f27693W = r10
            int r10 = p159f.p243f.p245b.p304b.C7500l.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f27694a0 = r10
            r9.recycle()
            r7.m35280R(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
