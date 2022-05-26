package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p159f.p243f.p245b.p304b.p305m.C7501a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private int f27742a = 0;

    /* renamed from: b */
    private int f27743b = 2;

    /* renamed from: c */
    private int f27744c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f27745d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C5909a extends AnimatorListenerAdapter {
        C5909a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f27745d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m35365F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f27745d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C5909a());
    }

    /* renamed from: A */
    public boolean mo3047A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public void mo22960G(V v, int i) {
        this.f27744c = i;
        if (this.f27743b == 1) {
            v.setTranslationY((float) (this.f27742a + i));
        }
    }

    /* renamed from: H */
    public void mo22961H(V v) {
        if (this.f27743b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f27745d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f27743b = 1;
            m35365F(v, this.f27742a + this.f27744c, 175, C7501a.f32701c);
        }
    }

    /* renamed from: I */
    public void mo22962I(V v) {
        if (this.f27743b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f27745d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f27743b = 2;
            m35365F(v, 0, 225, C7501a.f32702d);
        }
    }

    /* renamed from: l */
    public boolean mo3062l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f27742a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo3062l(coordinatorLayout, v, i);
    }

    /* renamed from: t */
    public void mo3070t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo22961H(v);
        } else if (i2 < 0) {
            mo22962I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
