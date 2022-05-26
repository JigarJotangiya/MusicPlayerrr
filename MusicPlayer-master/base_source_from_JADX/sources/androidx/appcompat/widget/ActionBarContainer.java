package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p082e.p083a.C3405f;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: g */
    private boolean f790g;

    /* renamed from: h */
    private View f791h;

    /* renamed from: i */
    private View f792i;

    /* renamed from: j */
    private View f793j;

    /* renamed from: k */
    Drawable f794k;

    /* renamed from: l */
    Drawable f795l;

    /* renamed from: m */
    Drawable f796m;

    /* renamed from: n */
    boolean f797n;

    /* renamed from: o */
    boolean f798o;

    /* renamed from: p */
    private int f799p;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private int m1177a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1178b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f794k;
        if (drawable != null && drawable.isStateful()) {
            this.f794k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f795l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f795l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f796m;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f796m.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f791h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f794k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f795l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f796m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f792i = findViewById(C3405f.action_bar);
        this.f793j = findViewById(C3405f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f790g || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f791h;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f797n) {
            Drawable drawable2 = this.f796m;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f794k != null) {
                if (this.f792i.getVisibility() == 0) {
                    this.f794k.setBounds(this.f792i.getLeft(), this.f792i.getTop(), this.f792i.getRight(), this.f792i.getBottom());
                } else {
                    View view2 = this.f793j;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f794k.setBounds(0, 0, 0, 0);
                    } else {
                        this.f794k.setBounds(this.f793j.getLeft(), this.f793j.getTop(), this.f793j.getRight(), this.f793j.getBottom());
                    }
                }
                z3 = true;
            }
            this.f798o = z4;
            if (!z4 || (drawable = this.f795l) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f792i == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f799p) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f792i != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f791h;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1178b(this.f792i)) {
                    i3 = m1177a(this.f792i);
                } else {
                    i3 = !m1178b(this.f793j) ? m1177a(this.f793j) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1177a(this.f791h), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f794k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f794k);
        }
        this.f794k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f792i;
            if (view != null) {
                this.f794k.setBounds(view.getLeft(), this.f792i.getTop(), this.f792i.getRight(), this.f792i.getBottom());
            }
        }
        boolean z = true;
        if (!this.f797n ? !(this.f794k == null && this.f795l == null) : this.f796m != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f796m;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f796m);
        }
        this.f796m = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f797n && (drawable2 = this.f796m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f797n ? this.f794k == null && this.f795l == null : this.f796m == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f795l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f795l);
        }
        this.f795l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f798o && (drawable2 = this.f795l) != null) {
                drawable2.setBounds(this.f791h.getLeft(), this.f791h.getTop(), this.f791h.getRight(), this.f791h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f797n ? !(this.f794k == null && this.f795l == null) : this.f796m != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0329z zVar) {
        View view = this.f791h;
        if (view != null) {
            removeView(view);
        }
        this.f791h = zVar;
        if (zVar != null) {
            addView(zVar);
            ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            zVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f790g = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f794k;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f795l;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f796m;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f794k && !this.f797n) || (drawable == this.f795l && this.f798o) || ((drawable == this.f796m && this.f797n) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3774v.m16223r0(this, new C0267b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.ActionBar);
        this.f794k = obtainStyledAttributes.getDrawable(C3409j.ActionBar_background);
        this.f795l = obtainStyledAttributes.getDrawable(C3409j.ActionBar_backgroundStacked);
        this.f799p = obtainStyledAttributes.getDimensionPixelSize(C3409j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C3405f.split_action_bar) {
            this.f797n = true;
            this.f796m = obtainStyledAttributes.getDrawable(C3409j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f797n ? !(this.f794k == null && this.f795l == null) : this.f796m != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
