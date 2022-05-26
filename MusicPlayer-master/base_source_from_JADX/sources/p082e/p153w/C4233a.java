package p082e.p153w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.w.a */
/* compiled from: Trace */
public final class C4233a {

    /* renamed from: a */
    private static long f12623a;

    /* renamed from: b */
    private static Method f12624b;

    /* renamed from: a */
    public static void m18619a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C4234b.m18624a(str);
        }
    }

    /* renamed from: b */
    public static void m18620b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C4234b.m18625b();
        }
    }

    /* renamed from: c */
    private static void m18621c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m18622d() {
        try {
            if (f12624b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m18623e();
    }

    /* renamed from: e */
    private static boolean m18623e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f12624b == null) {
                    f12623a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f12624b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f12624b.invoke((Object) null, new Object[]{Long.valueOf(f12623a)})).booleanValue();
            } catch (Exception e) {
                m18621c("isTagEnabled", e);
            }
        }
        return false;
    }
}
