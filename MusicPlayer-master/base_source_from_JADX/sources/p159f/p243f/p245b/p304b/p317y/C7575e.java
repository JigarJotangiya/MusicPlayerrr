package p159f.p243f.p245b.p304b.p317y;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.util.TypedValue;
import androidx.transition.Transition;
import p082e.p109h.p110h.C3623c;
import p082e.p109h.p119p.p121f0.C3758b;
import p159f.p243f.p245b.p304b.p312t.C7521b;

/* renamed from: f.f.b.b.y.e */
/* compiled from: TransitionUtils */
class C7575e {
    static {
        new RectF();
    }

    /* renamed from: a */
    private static float m42313a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m42314b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static boolean m42315c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: d */
    static float m42316d(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: e */
    static float m42317e(float f, float f2, float f3, float f4, float f5) {
        return m42318f(f, f2, f3, f4, f5, false);
    }

    /* renamed from: f */
    static float m42318f(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m42316d(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m42316d(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: g */
    static boolean m42319g(Transition transition, Context context, int i) {
        int c;
        if (i == 0 || transition.mo5995t() != -1 || (c = C7521b.m42011c(context, i, -1)) == -1) {
            return false;
        }
        transition.mo5978d0((long) c);
        return true;
    }

    /* renamed from: h */
    static boolean m42320h(Transition transition, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.mo5999w() != null) {
            return false;
        }
        transition.mo5980f0(m42321i(context, i, timeInterpolator));
        return true;
    }

    /* renamed from: i */
    static TimeInterpolator m42321i(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m42315c(valueOf, "cubic-bezier")) {
                String[] split = m42314b(valueOf, "cubic-bezier").split(",");
                if (split.length == 4) {
                    return C3758b.m16089a(m42313a(split, 0), m42313a(split, 1), m42313a(split, 2), m42313a(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (m42315c(valueOf, "path")) {
                return C3758b.m16090b(C3623c.m15605e(m42314b(valueOf, "path")));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}
