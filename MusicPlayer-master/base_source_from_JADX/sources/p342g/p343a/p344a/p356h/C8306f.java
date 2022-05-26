package p342g.p343a.p344a.p356h;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: g.a.a.h.f */
/* compiled from: SimpleAnimUtil */
public class C8306f {
    /* renamed from: a */
    public static Animation m45938a() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillEnabled(true);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }

    /* renamed from: b */
    public static Animation m45939b(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f3, f4, i, f5, i2, f6);
        scaleAnimation.setDuration(300);
        scaleAnimation.setFillEnabled(true);
        scaleAnimation.setFillAfter(true);
        return scaleAnimation;
    }
}
