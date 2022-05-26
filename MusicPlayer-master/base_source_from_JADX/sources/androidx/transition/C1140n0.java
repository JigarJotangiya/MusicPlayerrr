package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.n0 */
/* compiled from: ViewUtilsApi23 */
class C1140n0 extends C1138m0 {

    /* renamed from: k */
    private static boolean f4715k = true;

    C1140n0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo6113h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo6113h(view, i);
        } else if (f4715k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f4715k = false;
            }
        }
    }
}
