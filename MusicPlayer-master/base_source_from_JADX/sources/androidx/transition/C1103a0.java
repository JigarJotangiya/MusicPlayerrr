package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

/* renamed from: androidx.transition.a0 */
/* compiled from: TranslationAnimationCreator */
class C1103a0 {

    /* renamed from: androidx.transition.a0$a */
    /* compiled from: TranslationAnimationCreator */
    private static class C1104a extends AnimatorListenerAdapter implements Transition.C1095f {

        /* renamed from: a */
        private final View f4640a;

        /* renamed from: b */
        private final View f4641b;

        /* renamed from: c */
        private final int f4642c;

        /* renamed from: d */
        private final int f4643d;

        /* renamed from: e */
        private int[] f4644e;

        /* renamed from: f */
        private float f4645f;

        /* renamed from: g */
        private float f4646g;

        /* renamed from: h */
        private final float f4647h;

        /* renamed from: i */
        private final float f4648i;

        C1104a(View view, View view2, int i, int i2, float f, float f2) {
            this.f4641b = view;
            this.f4640a = view2;
            this.f4642c = i - Math.round(view.getTranslationX());
            this.f4643d = i2 - Math.round(view.getTranslationY());
            this.f4647h = f;
            this.f4648i = f2;
            int i3 = C1143p.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f4644e = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        /* renamed from: a */
        public void mo6006a(Transition transition) {
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            this.f4641b.setTranslationX(this.f4647h);
            this.f4641b.setTranslationY(this.f4648i);
            transition.mo5971X(this);
        }

        /* renamed from: d */
        public void mo5922d(Transition transition) {
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4644e == null) {
                this.f4644e = new int[2];
            }
            this.f4644e[0] = Math.round(((float) this.f4642c) + this.f4641b.getTranslationX());
            this.f4644e[1] = Math.round(((float) this.f4643d) + this.f4641b.getTranslationY());
            this.f4640a.setTag(C1143p.transition_position, this.f4644e);
        }

        public void onAnimationPause(Animator animator) {
            this.f4645f = this.f4641b.getTranslationX();
            this.f4646g = this.f4641b.getTranslationY();
            this.f4641b.setTranslationX(this.f4647h);
            this.f4641b.setTranslationY(this.f4648i);
        }

        public void onAnimationResume(Animator animator) {
            this.f4641b.setTranslationX(this.f4645f);
            this.f4641b.setTranslationY(this.f4646g);
        }
    }

    /* renamed from: a */
    static Animator m6345a(View view, C1160y yVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        C1160y yVar2 = yVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) yVar2.f4752b.getTag(C1143p.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1104a aVar = new C1104a(view, yVar2.f4752b, round, round2, translationX, translationY);
        transition.mo5973a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C1101a.m6342a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
