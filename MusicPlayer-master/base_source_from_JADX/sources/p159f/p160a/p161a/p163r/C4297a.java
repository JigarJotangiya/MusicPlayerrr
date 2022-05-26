package p159f.p160a.p161a.p163r;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C0506a;
import p159f.p160a.p161a.C4267e;
import p159f.p160a.p161a.C4269f;

/* renamed from: f.a.a.r.a */
/* compiled from: DialogUtils */
public class C4297a {

    /* renamed from: f.a.a.r.a$a */
    /* compiled from: DialogUtils */
    static class C4298a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C4269f f12856g;

        /* renamed from: h */
        final /* synthetic */ C4269f.C4274d f12857h;

        C4298a(C4269f fVar, C4269f.C4274d dVar) {
            this.f12856g = fVar;
            this.f12857h = dVar;
        }

        public void run() {
            this.f12856g.mo14598q().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f12857h.mo14636k().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f12856g.mo14598q(), 1);
            }
        }
    }

    /* renamed from: f.a.a.r.a$b */
    /* compiled from: DialogUtils */
    static /* synthetic */ class C4299b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f.a.a.e[] r0 = p159f.p160a.p161a.C4267e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12858a = r0
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12858a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p160a.p161a.p163r.C4297a.C4299b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m18787a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: b */
    public static ColorStateList m18788b(Context context, int i) {
        int l = m18798l(context, 16842806);
        if (i == 0) {
            i = l;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m18787a(i, 0.4f), i});
    }

    /* renamed from: c */
    public static int m18789c(Context context, int i) {
        return C0506a.m3150b(context, i);
    }

    /* renamed from: d */
    public static int m18790d(Context context) {
        return m18787a(m18793g(m18798l(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    /* renamed from: e */
    private static int m18791e(C4267e eVar) {
        int i = C4299b.f12858a[eVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static void m18792f(DialogInterface dialogInterface, C4269f.C4274d dVar) {
        InputMethodManager inputMethodManager;
        C4269f fVar = (C4269f) dialogInterface;
        if (fVar.mo14598q() != null && (inputMethodManager = (InputMethodManager) dVar.mo14636k().getSystemService("input_method")) != null) {
            View currentFocus = fVar.getCurrentFocus();
            IBinder iBinder = null;
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else if (fVar.mo14600s() != null) {
                iBinder = fVar.mo14600s().getWindowToken();
            }
            if (iBinder != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    /* renamed from: g */
    public static boolean m18793g(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: h */
    public static <T> boolean m18794h(T t, T[] tArr) {
        if (!(tArr == null || tArr.length == 0)) {
            for (T equals : tArr) {
                if (equals.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static ColorStateList m18795i(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            int i2 = peekValue.type;
            if (i2 < 28 || i2 > 31) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList2 != null) {
                    obtainStyledAttributes.recycle();
                    return colorStateList2;
                }
                obtainStyledAttributes.recycle();
                return colorStateList;
            }
            ColorStateList b = m18788b(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public static boolean m18796j(Context context, int i) {
        return m18797k(context, i, false);
    }

    /* renamed from: k */
    public static boolean m18797k(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    public static int m18798l(Context context, int i) {
        return m18799m(context, i, 0);
    }

    /* renamed from: m */
    public static int m18799m(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    public static int m18800n(Context context, int i) {
        return m18801o(context, i, -1);
    }

    /* renamed from: o */
    private static int m18801o(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: p */
    public static Drawable m18802p(Context context, int i) {
        return m18803q(context, i, (Drawable) null);
    }

    /* renamed from: q */
    private static Drawable m18803q(Context context, int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public static C4267e m18804r(Context context, int i, C4267e eVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = obtainStyledAttributes.getInt(0, m18791e(eVar));
            if (i2 == 1) {
                C4267e eVar2 = C4267e.CENTER;
                obtainStyledAttributes.recycle();
                return eVar2;
            } else if (i2 != 2) {
                return C4267e.START;
            } else {
                C4267e eVar3 = C4267e.END;
                obtainStyledAttributes.recycle();
                return eVar3;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    public static String m18805s(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    /* renamed from: t */
    public static void m18806t(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    /* renamed from: u */
    public static void m18807u(DialogInterface dialogInterface, C4269f.C4274d dVar) {
        C4269f fVar = (C4269f) dialogInterface;
        if (fVar.mo14598q() != null) {
            fVar.mo14598q().post(new C4298a(fVar, dVar));
        }
    }
}
