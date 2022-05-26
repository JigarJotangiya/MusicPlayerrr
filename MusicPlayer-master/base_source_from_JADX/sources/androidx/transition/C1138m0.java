package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.m0 */
/* compiled from: ViewUtilsApi22 */
class C1138m0 extends C1136l0 {

    /* renamed from: j */
    private static boolean f4708j = true;

    C1138m0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo6108f(View view, int i, int i2, int i3, int i4) {
        if (f4708j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f4708j = false;
            }
        }
    }
}
