package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: g */
    C0430c f2266g;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: c */
    private void m2718c(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C0430c getConstraintSet() {
        if (this.f2266g == null) {
            this.f2266g = new C0430c();
        }
        this.f2266g.mo2963r(this);
        return this.f2266g;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2718c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2718c(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f2267A0;

        /* renamed from: B0 */
        public float f2268B0;

        /* renamed from: C0 */
        public float f2269C0;

        /* renamed from: D0 */
        public float f2270D0;

        /* renamed from: E0 */
        public float f2271E0;

        /* renamed from: F0 */
        public float f2272F0;

        /* renamed from: G0 */
        public float f2273G0;

        /* renamed from: u0 */
        public float f2274u0;

        /* renamed from: v0 */
        public boolean f2275v0;

        /* renamed from: w0 */
        public float f2276w0;

        /* renamed from: x0 */
        public float f2277x0;

        /* renamed from: y0 */
        public float f2278y0;

        /* renamed from: z0 */
        public float f2279z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2274u0 = 1.0f;
            this.f2275v0 = false;
            this.f2276w0 = 0.0f;
            this.f2277x0 = 0.0f;
            this.f2278y0 = 0.0f;
            this.f2279z0 = 0.0f;
            this.f2267A0 = 1.0f;
            this.f2268B0 = 1.0f;
            this.f2269C0 = 0.0f;
            this.f2270D0 = 0.0f;
            this.f2271E0 = 0.0f;
            this.f2272F0 = 0.0f;
            this.f2273G0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2274u0 = 1.0f;
            this.f2275v0 = false;
            this.f2276w0 = 0.0f;
            this.f2277x0 = 0.0f;
            this.f2278y0 = 0.0f;
            this.f2279z0 = 0.0f;
            this.f2267A0 = 1.0f;
            this.f2268B0 = 1.0f;
            this.f2269C0 = 0.0f;
            this.f2270D0 = 0.0f;
            this.f2271E0 = 0.0f;
            this.f2272F0 = 0.0f;
            this.f2273G0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintSet_android_alpha) {
                    this.f2274u0 = obtainStyledAttributes.getFloat(index, this.f2274u0);
                } else if (index == C0439f.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2276w0 = obtainStyledAttributes.getFloat(index, this.f2276w0);
                        this.f2275v0 = true;
                    }
                } else if (index == C0439f.ConstraintSet_android_rotationX) {
                    this.f2278y0 = obtainStyledAttributes.getFloat(index, this.f2278y0);
                } else if (index == C0439f.ConstraintSet_android_rotationY) {
                    this.f2279z0 = obtainStyledAttributes.getFloat(index, this.f2279z0);
                } else if (index == C0439f.ConstraintSet_android_rotation) {
                    this.f2277x0 = obtainStyledAttributes.getFloat(index, this.f2277x0);
                } else if (index == C0439f.ConstraintSet_android_scaleX) {
                    this.f2267A0 = obtainStyledAttributes.getFloat(index, this.f2267A0);
                } else if (index == C0439f.ConstraintSet_android_scaleY) {
                    this.f2268B0 = obtainStyledAttributes.getFloat(index, this.f2268B0);
                } else if (index == C0439f.ConstraintSet_android_transformPivotX) {
                    this.f2269C0 = obtainStyledAttributes.getFloat(index, this.f2269C0);
                } else if (index == C0439f.ConstraintSet_android_transformPivotY) {
                    this.f2270D0 = obtainStyledAttributes.getFloat(index, this.f2270D0);
                } else if (index == C0439f.ConstraintSet_android_translationX) {
                    this.f2271E0 = obtainStyledAttributes.getFloat(index, this.f2271E0);
                } else if (index == C0439f.ConstraintSet_android_translationY) {
                    this.f2272F0 = obtainStyledAttributes.getFloat(index, this.f2272F0);
                } else if (index == C0439f.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.f2273G0 = obtainStyledAttributes.getFloat(index, this.f2273G0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
