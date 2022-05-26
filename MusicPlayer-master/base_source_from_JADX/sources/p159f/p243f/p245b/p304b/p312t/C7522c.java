package p159f.p243f.p245b.p304b.p312t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0279g0;
import p082e.p083a.p084k.p085a.C3410a;

/* renamed from: f.f.b.b.t.c */
/* compiled from: MaterialResources */
public class C7522c {
    /* renamed from: a */
    public static ColorStateList m42014a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (c = C3410a.m14542c(context, resourceId)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static ColorStateList m42015b(Context context, C0279g0 g0Var, int i) {
        int b;
        int n;
        ColorStateList c;
        if (g0Var.mo1994s(i) && (n = g0Var.mo1989n(i, 0)) != 0 && (c = C3410a.m14542c(context, n)) != null) {
            return c;
        }
        if (Build.VERSION.SDK_INT > 15 || (b = g0Var.mo1977b(i, -1)) == -1) {
            return g0Var.mo1978c(i);
        }
        return ColorStateList.valueOf(b);
    }

    /* renamed from: c */
    public static int m42016c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m42017d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C3410a.m14543d(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return d;
    }

    /* renamed from: e */
    static int m42018e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C7523d m42019f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C7523d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m42020g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m42021h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
