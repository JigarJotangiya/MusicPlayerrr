package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.h */
/* compiled from: GhostViewPlatform */
class C1123h implements C1117f {

    /* renamed from: h */
    private static Class<?> f4682h;

    /* renamed from: i */
    private static boolean f4683i;

    /* renamed from: j */
    private static Method f4684j;

    /* renamed from: k */
    private static boolean f4685k;

    /* renamed from: l */
    private static Method f4686l;

    /* renamed from: m */
    private static boolean f4687m;

    /* renamed from: g */
    private final View f4688g;

    private C1123h(View view) {
        this.f4688g = view;
    }

    /* renamed from: b */
    static C1117f m6415b(View view, ViewGroup viewGroup, Matrix matrix) {
        m6416c();
        Method method = f4684j;
        if (method != null) {
            try {
                return new C1123h((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m6416c() {
        if (!f4685k) {
            try {
                m6417d();
                Method declaredMethod = f4682h.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f4684j = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f4685k = true;
        }
    }

    /* renamed from: d */
    private static void m6417d() {
        if (!f4683i) {
            try {
                f4682h = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f4683i = true;
        }
    }

    /* renamed from: e */
    private static void m6418e() {
        if (!f4687m) {
            try {
                m6417d();
                Method declaredMethod = f4682h.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f4686l = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f4687m = true;
        }
    }

    /* renamed from: f */
    static void m6419f(View view) {
        m6418e();
        Method method = f4686l;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo6038a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f4688g.setVisibility(i);
    }
}
