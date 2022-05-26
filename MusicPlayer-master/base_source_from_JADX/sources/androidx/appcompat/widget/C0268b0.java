package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p082e.p083a.C3409j;
import p082e.p109h.p110h.C3621a;

/* renamed from: androidx.appcompat.widget.b0 */
/* compiled from: ThemeUtils */
public class C0268b0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1256a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1257b = {-16842910};

    /* renamed from: c */
    static final int[] f1258c = {16842908};

    /* renamed from: d */
    static final int[] f1259d = {16842919};

    /* renamed from: e */
    static final int[] f1260e = {16842912};

    /* renamed from: f */
    static final int[] f1261f = new int[0];

    /* renamed from: g */
    private static final int[] f1262g = new int[1];

    /* renamed from: a */
    public static void m1570a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C3409j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C3409j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1571b(Context context, int i) {
        ColorStateList e = m1574e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1257b, e.getDefaultColor());
        }
        TypedValue f = m1575f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1573d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1572c(Context context, int i) {
        int[] iArr = f1262g;
        iArr[0] = i;
        C0279g0 u = C0279g0.m1626u(context, (AttributeSet) null, iArr);
        try {
            return u.mo1977b(0, 0);
        } finally {
            u.mo1995w();
        }
    }

    /* renamed from: d */
    static int m1573d(Context context, int i, float f) {
        int c = m1572c(context, i);
        return C3621a.m15595m(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1574e(Context context, int i) {
        int[] iArr = f1262g;
        iArr[0] = i;
        C0279g0 u = C0279g0.m1626u(context, (AttributeSet) null, iArr);
        try {
            return u.mo1978c(0);
        } finally {
            u.mo1995w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1575f() {
        ThreadLocal<TypedValue> threadLocal = f1256a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
