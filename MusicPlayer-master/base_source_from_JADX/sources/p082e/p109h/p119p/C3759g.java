package p082e.p109h.p119p;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: e.h.p.g */
/* compiled from: LayoutInflaterCompat */
public final class C3759g {

    /* renamed from: a */
    private static Field f11818a;

    /* renamed from: b */
    private static boolean f11819b;

    /* renamed from: a */
    private static void m16091a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f11819b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f11818a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f11819b = true;
        }
        Field field = f11818a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m16092b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m16091a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m16091a(layoutInflater, factory2);
            }
        }
    }
}
