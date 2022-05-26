package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.b */
/* compiled from: CanvasUtils */
class C1105b {

    /* renamed from: a */
    private static Method f4649a;

    /* renamed from: b */
    private static Method f4650b;

    /* renamed from: c */
    private static boolean f4651c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    static void m6351a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 29) {
                if (z) {
                    canvas.enableZ();
                } else {
                    canvas.disableZ();
                }
            } else if (i != 28) {
                if (!f4651c) {
                    try {
                        Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                        f4649a = declaredMethod;
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                        f4650b = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    f4651c = true;
                }
                if (z) {
                    try {
                        Method method2 = f4649a;
                        if (method2 != null) {
                            method2.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
                if (!z && (method = f4650b) != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } else {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
        }
    }
}