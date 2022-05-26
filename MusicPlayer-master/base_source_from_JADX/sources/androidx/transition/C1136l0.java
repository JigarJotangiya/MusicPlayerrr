package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.l0 */
/* compiled from: ViewUtilsApi21 */
class C1136l0 extends C1133k0 {

    /* renamed from: g */
    private static boolean f4705g = true;

    /* renamed from: h */
    private static boolean f4706h = true;

    /* renamed from: i */
    private static boolean f4707i = true;

    C1136l0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo6105e(View view, Matrix matrix) {
        if (f4705g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f4705g = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo6106i(View view, Matrix matrix) {
        if (f4706h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4706h = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo6107j(View view, Matrix matrix) {
        if (f4707i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4707i = false;
            }
        }
    }
}
