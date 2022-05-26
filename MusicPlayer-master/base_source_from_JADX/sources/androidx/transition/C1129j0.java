package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.transition.j0 */
/* compiled from: ViewUtils */
class C1129j0 {

    /* renamed from: a */
    private static final C1144p0 f4697a;

    /* renamed from: b */
    static final Property<View, Float> f4698b = new C1130a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f4699c = new C1131b(Rect.class, "clipBounds");

    /* renamed from: androidx.transition.j0$a */
    /* compiled from: ViewUtils */
    static class C1130a extends Property<View, Float> {
        C1130a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1129j0.m6437c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C1129j0.m6442h(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.j0$b */
    /* compiled from: ViewUtils */
    static class C1131b extends Property<View, Rect> {
        C1131b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C3774v.m16228u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C3774v.m16229u0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f4697a = new C1142o0();
        } else if (i >= 23) {
            f4697a = new C1140n0();
        } else if (i >= 22) {
            f4697a = new C1138m0();
        } else if (i >= 21) {
            f4697a = new C1136l0();
        } else if (i >= 19) {
            f4697a = new C1133k0();
        } else {
            f4697a = new C1144p0();
        }
    }

    /* renamed from: a */
    static void m6435a(View view) {
        f4697a.mo6069a(view);
    }

    /* renamed from: b */
    static C1127i0 m6436b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1124h0(view);
        }
        return C1121g0.m6404e(view);
    }

    /* renamed from: c */
    static float m6437c(View view) {
        return f4697a.mo6070c(view);
    }

    /* renamed from: d */
    static C1152t0 m6438d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1150s0(view);
        }
        return new C1148r0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m6439e(View view) {
        f4697a.mo6071d(view);
    }

    /* renamed from: f */
    static void m6440f(View view, Matrix matrix) {
        f4697a.mo6105e(view, matrix);
    }

    /* renamed from: g */
    static void m6441g(View view, int i, int i2, int i3, int i4) {
        f4697a.mo6108f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    static void m6442h(View view, float f) {
        f4697a.mo6072g(view, f);
    }

    /* renamed from: i */
    static void m6443i(View view, int i) {
        f4697a.mo6113h(view, i);
    }

    /* renamed from: j */
    static void m6444j(View view, Matrix matrix) {
        f4697a.mo6106i(view, matrix);
    }

    /* renamed from: k */
    static void m6445k(View view, Matrix matrix) {
        f4697a.mo6107j(view, matrix);
    }
}
