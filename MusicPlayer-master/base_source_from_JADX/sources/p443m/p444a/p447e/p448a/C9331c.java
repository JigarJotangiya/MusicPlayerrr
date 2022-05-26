package p443m.p444a.p447e.p448a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p443m.p444a.p452i.C9345a;

/* renamed from: m.a.e.a.c */
/* compiled from: SkinCompatDrawableUtils */
class C9331c {
    /* renamed from: a */
    public static boolean m49402a(Drawable drawable) {
        Drawable drawable2;
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
                if (!m49402a(a)) {
                    return false;
                }
            }
            return true;
        } else if (C9345a.m49487d(drawable)) {
            return m49402a(C9345a.m49484a(drawable));
        } else {
            if (C9345a.m49488e(drawable)) {
                return m49402a(C9345a.m49485b(drawable));
            }
            if (C9345a.m49489f(drawable)) {
                return m49402a(C9345a.m49486c(drawable));
            }
            if (!(drawable instanceof ScaleDrawable) || (drawable2 = ((ScaleDrawable) drawable).getDrawable()) == null) {
                return true;
            }
            return m49402a(drawable2);
        }
    }

    /* renamed from: b */
    static void m49403b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m49404c(drawable);
        }
    }

    /* renamed from: c */
    private static void m49404c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C9333e.f36101l);
        } else {
            drawable.setState(C9333e.f36103n);
        }
        drawable.setState(state);
    }
}
