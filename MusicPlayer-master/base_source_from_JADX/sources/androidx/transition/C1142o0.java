package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.o0 */
/* compiled from: ViewUtilsApi29 */
class C1142o0 extends C1140n0 {
    C1142o0() {
    }

    /* renamed from: c */
    public float mo6070c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo6105e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: f */
    public void mo6108f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public void mo6072g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: h */
    public void mo6113h(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: i */
    public void mo6106i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: j */
    public void mo6107j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
