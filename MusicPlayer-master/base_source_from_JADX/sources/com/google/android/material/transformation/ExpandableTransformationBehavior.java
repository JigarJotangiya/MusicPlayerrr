package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f29247b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C6279a extends AnimatorListenerAdapter {
        C6279a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f29247b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo25130H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f29247b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo25132J(view, view2, z, z3);
        this.f29247b = J;
        J.addListener(new C6279a());
        this.f29247b.start();
        if (!z2) {
            this.f29247b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo25132J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
