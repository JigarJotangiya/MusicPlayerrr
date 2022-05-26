package p159f.p243f.p245b.p304b.p317y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.f.b.b.y.a */
/* compiled from: FadeThroughProvider */
public final class C7568a implements C7576f {

    /* renamed from: a */
    private float f32922a = 0.35f;

    /* renamed from: f.f.b.b.y.a$a */
    /* compiled from: FadeThroughProvider */
    static class C7569a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f32923a;

        /* renamed from: b */
        final /* synthetic */ float f32924b;

        /* renamed from: c */
        final /* synthetic */ float f32925c;

        /* renamed from: d */
        final /* synthetic */ float f32926d;

        /* renamed from: e */
        final /* synthetic */ float f32927e;

        C7569a(View view, float f, float f2, float f3, float f4) {
            this.f32923a = view;
            this.f32924b = f;
            this.f32925c = f2;
            this.f32926d = f3;
            this.f32927e = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f32923a.setAlpha(C7575e.m42317e(this.f32924b, this.f32925c, this.f32926d, this.f32927e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: f.f.b.b.y.a$b */
    /* compiled from: FadeThroughProvider */
    static class C7570b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f32928a;

        /* renamed from: b */
        final /* synthetic */ float f32929b;

        C7570b(View view, float f) {
            this.f32928a = view;
            this.f32929b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f32928a.setAlpha(this.f32929b);
        }
    }

    /* renamed from: c */
    private static Animator m42293c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C7569a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7570b(view, f5));
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo28564a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m42293c(view, 0.0f, alpha, this.f32922a, 1.0f, alpha);
    }

    /* renamed from: b */
    public Animator mo28565b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m42293c(view, alpha, 0.0f, 0.0f, this.f32922a, alpha);
    }
}
