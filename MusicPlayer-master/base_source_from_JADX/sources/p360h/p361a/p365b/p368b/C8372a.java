package p360h.p361a.p365b.p368b;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p369i.p387z.p389d.C8594l;

/* renamed from: h.a.b.b.a */
/* compiled from: ViewHelper.kt */
public final class C8372a {
    /* renamed from: a */
    public static final void m46422a(View view) {
        C8594l.m46772f(view, "v");
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
        ViewPropertyAnimator interpolator = view.animate().setInterpolator((TimeInterpolator) null);
        C8594l.m46768b(interpolator, "animate().setInterpolator(null)");
        interpolator.setStartDelay(0);
    }
}
