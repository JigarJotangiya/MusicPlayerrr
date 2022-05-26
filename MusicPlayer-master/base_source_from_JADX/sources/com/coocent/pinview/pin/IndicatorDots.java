package com.coocent.pinview.pin;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.coocent.pinview.C2490g;
import com.coocent.pinview.C2491h;
import com.coocent.pinview.C2496m;
import p082e.p109h.p119p.C3774v;

public class IndicatorDots extends LinearLayout {

    /* renamed from: g */
    private int f8807g;

    /* renamed from: h */
    private int f8808h;

    /* renamed from: i */
    private int f8809i;

    /* renamed from: j */
    private int f8810j;

    /* renamed from: k */
    private int f8811k;

    /* renamed from: l */
    private int f8812l;

    /* renamed from: m */
    private int f8813m;

    public IndicatorDots(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m11672a(View view) {
        if (view != null) {
            view.setBackgroundResource(this.f8810j);
        }
    }

    /* renamed from: b */
    private void m11673b(View view) {
        view.setBackgroundResource(this.f8809i);
    }

    /* renamed from: c */
    private void m11674c(Context context) {
        C3774v.m16152B0(this, 0);
        int i = this.f8812l;
        if (i == 0) {
            for (int i2 = 0; i2 < this.f8811k; i2++) {
                View view = new View(context);
                m11672a(view);
                int i3 = this.f8807g;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
                int i4 = this.f8808h;
                layoutParams.setMargins(i4, 0, i4, 0);
                view.setLayoutParams(layoutParams);
                addView(view);
            }
        } else if (i == 2) {
            setLayoutTransition(new LayoutTransition());
        }
    }

    /* renamed from: d */
    public void mo9642d(int i) {
        if (this.f8812l == 0) {
            if (i > 0) {
                if (i > this.f8813m) {
                    m11673b(getChildAt(i - 1));
                } else {
                    m11672a(getChildAt(i));
                }
                this.f8813m = i;
                return;
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                m11672a(getChildAt(i2));
            }
            this.f8813m = 0;
        } else if (i > 0) {
            if (i > this.f8813m) {
                View view = new View(getContext());
                m11673b(view);
                int i3 = this.f8807g;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
                int i4 = this.f8808h;
                layoutParams.setMargins(i4, 0, i4, 0);
                view.setLayoutParams(layoutParams);
                addView(view, i - 1);
            } else {
                removeViewAt(i);
            }
            this.f8813m = i;
        } else {
            removeAllViews();
            this.f8813m = 0;
        }
    }

    public int getIndicatorType() {
        return this.f8812l;
    }

    public int getPinLength() {
        return this.f8811k;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8812l != 0) {
            getLayoutParams().height = this.f8807g;
            requestLayout();
        }
    }

    public void setIndicatorType(int i) {
        this.f8812l = i;
        removeAllViews();
        m11674c(getContext());
    }

    public void setPinLength(int i) {
        this.f8811k = i;
        removeAllViews();
        m11674c(getContext());
    }

    public IndicatorDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public IndicatorDots(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2496m.PinLockView);
        try {
            this.f8807g = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_dotDiameter, getResources().getDimension(C2490g.default_dot_diameter));
            this.f8808h = (int) obtainStyledAttributes.getDimension(C2496m.PinLockView_dotSpacing, getResources().getDimension(C2490g.default_dot_spacing));
            this.f8809i = obtainStyledAttributes.getResourceId(C2496m.PinLockView_dotFilledBackground, C2491h.dot_filled);
            this.f8810j = obtainStyledAttributes.getResourceId(C2496m.PinLockView_dotEmptyBackground, C2491h.dot_empty);
            this.f8811k = obtainStyledAttributes.getInt(C2496m.PinLockView_pinLength, 4);
            this.f8812l = obtainStyledAttributes.getInt(C2496m.PinLockView_indicatorType, 0);
            obtainStyledAttributes.recycle();
            m11674c(context);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
