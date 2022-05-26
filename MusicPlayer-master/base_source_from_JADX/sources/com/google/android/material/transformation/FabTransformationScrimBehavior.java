package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p305m.C7509i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C7509i f29264c = new C7509i(75, 150);

    /* renamed from: d */
    private final C7509i f29265d = new C7509i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C6285a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f29266a;

        /* renamed from: b */
        final /* synthetic */ View f29267b;

        C6285a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f29266a = z;
            this.f29267b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f29266a) {
                this.f29267b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f29266a) {
                this.f29267b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: K */
    private void m37472K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C7509i iVar = z ? this.f29264c : this.f29265d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo28393a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo3050D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo3050D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo25132J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m37472K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C7502b.m41943a(animatorSet, arrayList);
        animatorSet.addListener(new C6285a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo3055e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
