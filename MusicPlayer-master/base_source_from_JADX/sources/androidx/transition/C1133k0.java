package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.k0 */
/* compiled from: ViewUtilsApi19 */
class C1133k0 extends C1144p0 {

    /* renamed from: f */
    private static boolean f4703f = true;

    C1133k0() {
    }

    /* renamed from: a */
    public void mo6069a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo6070c(View view) {
        if (f4703f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f4703f = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo6071d(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo6072g(View view, float f) {
        if (f4703f) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f4703f = false;
            }
        }
        view.setAlpha(f);
    }
}
