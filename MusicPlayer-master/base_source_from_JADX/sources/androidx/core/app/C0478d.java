package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.d */
/* compiled from: BundleCompat */
public final class C0478d {

    /* renamed from: androidx.core.app.d$a */
    /* compiled from: BundleCompat */
    static class C0479a {

        /* renamed from: a */
        private static Method f2572a;

        /* renamed from: b */
        private static boolean f2573b;

        /* renamed from: c */
        private static Method f2574c;

        /* renamed from: d */
        private static boolean f2575d;

        /* renamed from: a */
        public static IBinder m3006a(Bundle bundle, String str) {
            if (!f2573b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2572a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f2573b = true;
            }
            Method method2 = f2572a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f2572a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m3007b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2575d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2574c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f2575d = true;
            }
            Method method2 = f2574c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f2574c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m3004a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0479a.m3006a(bundle, str);
    }

    /* renamed from: b */
    public static void m3005b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0479a.m3007b(bundle, str, iBinder);
        }
    }
}
