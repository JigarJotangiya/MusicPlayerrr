package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements MotionLayout.C0376j {

    /* renamed from: p */
    private boolean f1618p = false;

    /* renamed from: q */
    private boolean f1619q = false;

    /* renamed from: r */
    private float f1620r;

    /* renamed from: s */
    protected View[] f1621s;

    public MotionHelper(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo2428A(MotionLayout motionLayout) {
    }

    /* renamed from: B */
    public void mo2429B(Canvas canvas) {
    }

    /* renamed from: C */
    public void mo2430C(Canvas canvas) {
    }

    /* renamed from: D */
    public void mo2424D(MotionLayout motionLayout, HashMap<View, C0396n> hashMap) {
    }

    /* renamed from: E */
    public void mo2431E(View view, float f) {
    }

    /* renamed from: a */
    public void mo2367a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo2432b(MotionLayout motionLayout, int i, int i2) {
    }

    /* renamed from: c */
    public void mo2433c(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    /* renamed from: d */
    public void mo2368d(MotionLayout motionLayout, int i) {
    }

    public float getProgress() {
        return this.f1620r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MotionHelper_onShow) {
                    this.f1618p = obtainStyledAttributes.getBoolean(index, this.f1618p);
                } else if (index == C0439f.MotionHelper_onHide) {
                    this.f1619q = obtainStyledAttributes.getBoolean(index, this.f1619q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f1620r = f;
        int i = 0;
        if (this.f2156h > 0) {
            this.f1621s = mo2850n((ConstraintLayout) getParent());
            while (i < this.f2156h) {
                mo2431E(this.f1621s[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                mo2431E(childAt, f);
            }
            i++;
        }
    }

    /* renamed from: x */
    public boolean mo2425x() {
        return false;
    }

    /* renamed from: y */
    public boolean mo2436y() {
        return this.f1619q;
    }

    /* renamed from: z */
    public boolean mo2437z() {
        return this.f1618p;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2380o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2380o(attributeSet);
    }
}
