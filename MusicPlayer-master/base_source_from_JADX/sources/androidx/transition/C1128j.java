package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j */
/* compiled from: GhostViewUtils */
class C1128j {
    /* renamed from: a */
    static C1117f m6433a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C1123h.m6415b(view, viewGroup, matrix);
        }
        return C1125i.m6423b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m6434b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C1123h.m6419f(view);
        } else {
            C1125i.m6427f(view);
        }
    }
}
