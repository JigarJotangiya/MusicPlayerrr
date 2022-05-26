package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.c */
/* compiled from: CircularPropagation */
public class C1107c extends C1146q0 {

    /* renamed from: b */
    private float f4652b = 3.0f;

    /* renamed from: h */
    private static float m6355h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo6033c(ViewGroup viewGroup, Transition transition, C1160y yVar, C1160y yVar2) {
        int i;
        int i2;
        int i3;
        if (yVar == null && yVar2 == null) {
            return 0;
        }
        if (yVar2 == null || mo6118e(yVar) == 0) {
            i = -1;
        } else {
            yVar = yVar2;
            i = 1;
        }
        int f = mo6119f(yVar);
        int g = mo6120g(yVar);
        Rect u = transition.mo5997u();
        if (u != null) {
            i3 = u.centerX();
            i2 = u.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m6355h((float) f, (float) g, (float) i3, (float) i2) / m6355h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long t = transition.mo5995t();
        if (t < 0) {
            t = 300;
        }
        return (long) Math.round((((float) (t * ((long) i))) / this.f4652b) * h);
    }
}
