package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.e0 */
/* compiled from: ViewGroupUtils */
class C1116e0 {

    /* renamed from: a */
    private static boolean f4666a = true;

    /* renamed from: b */
    private static Method f4667b;

    /* renamed from: c */
    private static boolean f4668c;

    /* renamed from: a */
    static int m6390a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f4668c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f4667b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4668c = true;
        }
        Method method = f4667b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    static C1110d0 m6391b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1108c0(viewGroup);
        }
        return C1106b0.m6352g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m6392c(ViewGroup viewGroup, boolean z) {
        if (f4666a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f4666a = false;
            }
        }
    }

    /* renamed from: d */
    static void m6393d(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m6392c(viewGroup, z);
        } else {
            C1118f0.m6396b(viewGroup, z);
        }
    }
}
