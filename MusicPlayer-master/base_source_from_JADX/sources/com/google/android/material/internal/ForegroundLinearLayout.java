package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p159f.p243f.p245b.p304b.C7500l;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: A */
    boolean f28380A;

    /* renamed from: v */
    private Drawable f28381v;

    /* renamed from: w */
    private final Rect f28382w;

    /* renamed from: x */
    private final Rect f28383x;

    /* renamed from: y */
    private int f28384y;

    /* renamed from: z */
    protected boolean f28385z;

    public ForegroundLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f28381v;
        if (drawable != null) {
            if (this.f28380A) {
                this.f28380A = false;
                Rect rect = this.f28382w;
                Rect rect2 = this.f28383x;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f28385z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f28384y, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f28381v;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f28381v;
        if (drawable != null && drawable.isStateful()) {
            this.f28381v.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f28381v;
    }

    public int getForegroundGravity() {
        return this.f28384y;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f28381v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f28380A = z | this.f28380A;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f28380A = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f28381v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f28381v);
            }
            this.f28381v = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f28384y == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f28384y != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f28384y = i;
            if (i == 119 && this.f28381v != null) {
                this.f28381v.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28381v;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28382w = new Rect();
        this.f28383x = new Rect();
        this.f28384y = 119;
        this.f28385z = true;
        this.f28380A = false;
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f28384y = h.getInt(C7500l.ForegroundLinearLayout_android_foregroundGravity, this.f28384y);
        Drawable drawable = h.getDrawable(C7500l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f28385z = h.getBoolean(C7500l.ForegroundLinearLayout_foregroundInsidePadding, true);
        h.recycle();
    }
}
