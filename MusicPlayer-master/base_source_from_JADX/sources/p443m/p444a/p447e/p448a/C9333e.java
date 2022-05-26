package p443m.p444a.p447e.p448a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p082e.p109h.p110h.C3621a;

/* renamed from: m.a.e.a.e */
/* compiled from: SkinCompatThemeUtils */
public class C9333e {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f36090a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f36091b = {-16842910};

    /* renamed from: c */
    static final int[] f36092c = {16842910};

    /* renamed from: d */
    static final int[] f36093d = {16842909};

    /* renamed from: e */
    static final int[] f36094e = {16842908};

    /* renamed from: f */
    static final int[] f36095f = {16843518};

    /* renamed from: g */
    static final int[] f36096g = {16843547};

    /* renamed from: h */
    static final int[] f36097h = {16843623};

    /* renamed from: i */
    static final int[] f36098i = {16843624};

    /* renamed from: j */
    static final int[] f36099j = {16843625};

    /* renamed from: k */
    static final int[] f36100k = {16842919};

    /* renamed from: l */
    static final int[] f36101l = {16842912};

    /* renamed from: m */
    static final int[] f36102m = {16842913};

    /* renamed from: n */
    static final int[] f36103n = new int[0];

    /* renamed from: o */
    private static final int[] f36104o = new int[1];

    /* renamed from: a */
    public static int m49424a(Context context, int i) {
        ColorStateList e = m49428e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f36091b, e.getDefaultColor());
        }
        TypedValue f = m49429f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m49427d(context, i, f.getFloat());
    }

    /* renamed from: b */
    static int m49425b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static int m49426c(Context context, int i) {
        int[] iArr = f36104o;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                return C9332d.m49405b(context, resourceId);
            }
            obtainStyledAttributes.recycle();
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    static int m49427d(Context context, int i, float f) {
        int c = m49426c(context, i);
        return C3621a.m15595m(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m49428e(Context context, int i) {
        int[] iArr = f36104o;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                return C9332d.m49406c(context, resourceId);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    private static TypedValue m49429f() {
        ThreadLocal<TypedValue> threadLocal = f36090a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: g */
    public static int m49430g(Context context) {
        return m49425b(context, new int[]{16842836});
    }
}
