package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p082e.p099f.p100a.p104m.C3539m;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: p */
    private boolean f2287p;

    /* renamed from: q */
    private boolean f2288q;

    public VirtualLayout(Context context) {
        super(context);
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_android_visibility) {
                    this.f2287p = true;
                } else if (index == C0439f.ConstraintLayout_Layout_android_elevation) {
                    this.f2288q = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2287p || this.f2288q) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i = 0; i < this.f2156h; i++) {
                    View i2 = constraintLayout.mo2873i(this.f2155g[i]);
                    if (i2 != null) {
                        if (this.f2287p) {
                            i2.setVisibility(visibility);
                        }
                        if (this.f2288q && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            i2.setTranslationZ(i2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2848h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2848h();
    }

    /* renamed from: x */
    public void mo2410x(C3539m mVar, int i, int i2) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
