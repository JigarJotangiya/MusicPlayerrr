package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
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
        this.f2159k = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2848h();
    }

    /* renamed from: r */
    public void mo2412r(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2247s0.mo12683h1(0);
        layoutParams.f2247s0.mo12632I0(0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2848h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2848h();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
