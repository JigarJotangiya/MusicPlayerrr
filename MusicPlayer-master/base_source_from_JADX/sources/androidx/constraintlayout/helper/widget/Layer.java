package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import p082e.p099f.p100a.p104m.C3527e;

public class Layer extends ConstraintHelper {

    /* renamed from: A */
    protected float f1590A = Float.NaN;

    /* renamed from: B */
    boolean f1591B = true;

    /* renamed from: C */
    View[] f1592C = null;

    /* renamed from: D */
    private float f1593D = 0.0f;

    /* renamed from: E */
    private float f1594E = 0.0f;

    /* renamed from: F */
    private boolean f1595F;

    /* renamed from: G */
    private boolean f1596G;

    /* renamed from: p */
    private float f1597p = Float.NaN;

    /* renamed from: q */
    private float f1598q = Float.NaN;

    /* renamed from: r */
    private float f1599r = Float.NaN;

    /* renamed from: s */
    ConstraintLayout f1600s;

    /* renamed from: t */
    private float f1601t = 1.0f;

    /* renamed from: u */
    private float f1602u = 1.0f;

    /* renamed from: v */
    protected float f1603v = Float.NaN;

    /* renamed from: w */
    protected float f1604w = Float.NaN;

    /* renamed from: x */
    protected float f1605x = Float.NaN;

    /* renamed from: y */
    protected float f1606y = Float.NaN;

    /* renamed from: z */
    protected float f1607z = Float.NaN;

    public Layer(Context context) {
        super(context);
    }

    /* renamed from: y */
    private void m2093y() {
        int i;
        if (this.f1600s != null && (i = this.f2156h) != 0) {
            View[] viewArr = this.f1592C;
            if (viewArr == null || viewArr.length != i) {
                this.f1592C = new View[i];
            }
            for (int i2 = 0; i2 < this.f2156h; i2++) {
                this.f1592C[i2] = this.f1600s.mo2873i(this.f2155g[i2]);
            }
        }
    }

    /* renamed from: z */
    private void m2094z() {
        if (this.f1600s != null) {
            if (this.f1592C == null) {
                m2093y();
            }
            mo2423x();
            double radians = Float.isNaN(this.f1599r) ? 0.0d : Math.toRadians((double) this.f1599r);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.f1601t;
            float f2 = f * cos;
            float f3 = this.f1602u;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f2156h; i++) {
                View view = this.f1592C[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f1603v;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f1604w;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f1593D);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f1594E);
                view.setScaleY(this.f1602u);
                view.setScaleX(this.f1601t);
                if (!Float.isNaN(this.f1599r)) {
                    view.setRotation(this.f1599r);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo2411j(ConstraintLayout constraintLayout) {
        mo2849i(constraintLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        this.f2159k = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_android_visibility) {
                    this.f1595F = true;
                } else if (index == C0439f.ConstraintLayout_Layout_android_elevation) {
                    this.f1596G = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1600s = (ConstraintLayout) getParent();
        if (this.f1595F || this.f1596G) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f2156h; i++) {
                View i2 = this.f1600s.mo2873i(this.f2155g[i]);
                if (i2 != null) {
                    if (this.f1595F) {
                        i2.setVisibility(visibility);
                    }
                    if (this.f1596G && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        i2.setTranslationZ(i2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2412r(ConstraintLayout constraintLayout) {
        m2093y();
        this.f1603v = Float.NaN;
        this.f1604w = Float.NaN;
        C3527e b = ((ConstraintLayout.LayoutParams) getLayoutParams()).mo2890b();
        b.mo12683h1(0);
        b.mo12632I0(0);
        mo2423x();
        layout(((int) this.f1607z) - getPaddingLeft(), ((int) this.f1590A) - getPaddingTop(), ((int) this.f1605x) + getPaddingRight(), ((int) this.f1606y) + getPaddingBottom());
        m2094z();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2848h();
    }

    public void setPivotX(float f) {
        this.f1597p = f;
        m2094z();
    }

    public void setPivotY(float f) {
        this.f1598q = f;
        m2094z();
    }

    public void setRotation(float f) {
        this.f1599r = f;
        m2094z();
    }

    public void setScaleX(float f) {
        this.f1601t = f;
        m2094z();
    }

    public void setScaleY(float f) {
        this.f1602u = f;
        m2094z();
    }

    public void setTranslationX(float f) {
        this.f1593D = f;
        m2094z();
    }

    public void setTranslationY(float f) {
        this.f1594E = f;
        m2094z();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2848h();
    }

    /* renamed from: t */
    public void mo2422t(ConstraintLayout constraintLayout) {
        this.f1600s = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f1599r = rotation;
        } else if (!Float.isNaN(this.f1599r)) {
            this.f1599r = rotation;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo2423x() {
        if (this.f1600s != null) {
            if (!this.f1591B && !Float.isNaN(this.f1603v) && !Float.isNaN(this.f1604w)) {
                return;
            }
            if (Float.isNaN(this.f1597p) || Float.isNaN(this.f1598q)) {
                View[] n = mo2850n(this.f1600s);
                int left = n[0].getLeft();
                int top = n[0].getTop();
                int right = n[0].getRight();
                int bottom = n[0].getBottom();
                for (int i = 0; i < this.f2156h; i++) {
                    View view = n[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1605x = (float) right;
                this.f1606y = (float) bottom;
                this.f1607z = (float) left;
                this.f1590A = (float) top;
                if (Float.isNaN(this.f1597p)) {
                    this.f1603v = (float) ((left + right) / 2);
                } else {
                    this.f1603v = this.f1597p;
                }
                if (Float.isNaN(this.f1598q)) {
                    this.f1604w = (float) ((top + bottom) / 2);
                } else {
                    this.f1604w = this.f1598q;
                }
            } else {
                this.f1604w = this.f1598q;
                this.f1603v = this.f1597p;
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
