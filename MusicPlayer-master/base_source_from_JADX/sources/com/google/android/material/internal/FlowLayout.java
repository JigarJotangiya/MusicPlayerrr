package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7500l;

public class FlowLayout extends ViewGroup {

    /* renamed from: g */
    private int f28376g;

    /* renamed from: h */
    private int f28377h;

    /* renamed from: i */
    private boolean f28378i;

    /* renamed from: j */
    private int f28379j;

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m36358a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: d */
    private void m36359d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7500l.FlowLayout, 0, 0);
        this.f28376g = obtainStyledAttributes.getDimensionPixelSize(C7500l.FlowLayout_lineSpacing, 0);
        this.f28377h = obtainStyledAttributes.getDimensionPixelSize(C7500l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int mo24049b(View view) {
        Object tag = view.getTag(C7494f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo23424c() {
        return this.f28378i;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f28377h;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f28376g;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f28379j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f28379j = 0;
            return;
        }
        this.f28379j = 1;
        boolean z2 = C3774v.m16151B(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C7494f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C3760h.m16094b(marginLayoutParams);
                    i6 = C3760h.m16093a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f28378i && measuredWidth > i7) {
                    i9 = this.f28376g + paddingTop;
                    this.f28379j++;
                    i8 = paddingRight;
                }
                childAt.setTag(C7494f.row_index_key, Integer.valueOf(this.f28379j - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f28377h;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo23424c()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f28376g + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f28377h;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m36358a(size, mode, i8 + getPaddingRight()), m36358a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f28377h = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f28376g = i;
    }

    public void setSingleLine(boolean z) {
        this.f28378i = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28378i = false;
        m36359d(context, attributeSet);
    }
}
