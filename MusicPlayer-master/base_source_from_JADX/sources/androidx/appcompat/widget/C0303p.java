package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.graphics.drawable.C0536c;
import java.lang.reflect.Field;
import p082e.p083a.p086l.p087a.C3424c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.p */
/* compiled from: DrawableUtils */
public class C0303p {

    /* renamed from: a */
    private static final int[] f1387a = {16842912};

    /* renamed from: b */
    private static final int[] f1388b = new int[0];

    /* renamed from: c */
    public static final Rect f1389c = new Rect();

    /* renamed from: d */
    private static Class<?> f1390d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1390d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1828a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m1828a(a)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C0536c) {
            return m1828a(((C0536c) drawable).mo3309b());
        } else {
            if (drawable instanceof C3424c) {
                return m1828a(((C3424c) drawable).mo12112a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m1828a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: b */
    static void m1829b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1830c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1830c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1387a);
        } else {
            drawable.setState(f1388b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1831d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1390d != null) {
            try {
                Drawable q = C0534a.m3291q(drawable);
                Object invoke = q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1390d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1389c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1832e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
