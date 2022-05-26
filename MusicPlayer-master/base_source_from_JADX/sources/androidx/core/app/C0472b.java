package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.b */
/* compiled from: ActivityRecreator */
final class C0472b {

    /* renamed from: a */
    protected static final Class<?> f2553a;

    /* renamed from: b */
    protected static final Field f2554b = m2994b();

    /* renamed from: c */
    protected static final Field f2555c = m2998f();

    /* renamed from: d */
    protected static final Method f2556d;

    /* renamed from: e */
    protected static final Method f2557e;

    /* renamed from: f */
    protected static final Method f2558f;

    /* renamed from: g */
    private static final Handler f2559g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.b$a */
    /* compiled from: ActivityRecreator */
    class C0473a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C0476d f2560g;

        /* renamed from: h */
        final /* synthetic */ Object f2561h;

        C0473a(C0476d dVar, Object obj) {
            this.f2560g = dVar;
            this.f2561h = obj;
        }

        public void run() {
            this.f2560g.f2566g = this.f2561h;
        }
    }

    /* renamed from: androidx.core.app.b$b */
    /* compiled from: ActivityRecreator */
    class C0474b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Application f2562g;

        /* renamed from: h */
        final /* synthetic */ C0476d f2563h;

        C0474b(Application application, C0476d dVar) {
            this.f2562g = application;
            this.f2563h = dVar;
        }

        public void run() {
            this.f2562g.unregisterActivityLifecycleCallbacks(this.f2563h);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* compiled from: ActivityRecreator */
    class C0475c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Object f2564g;

        /* renamed from: h */
        final /* synthetic */ Object f2565h;

        C0475c(Object obj, Object obj2) {
            this.f2564g = obj;
            this.f2565h = obj2;
        }

        public void run() {
            try {
                Method method = C0472b.f2556d;
                if (method != null) {
                    method.invoke(this.f2564g, new Object[]{this.f2565h, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C0472b.f2557e.invoke(this.f2564g, new Object[]{this.f2565h, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* compiled from: ActivityRecreator */
    private static final class C0476d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: g */
        Object f2566g;

        /* renamed from: h */
        private Activity f2567h;

        /* renamed from: i */
        private final int f2568i;

        /* renamed from: j */
        private boolean f2569j = false;

        /* renamed from: k */
        private boolean f2570k = false;

        /* renamed from: l */
        private boolean f2571l = false;

        C0476d(Activity activity) {
            this.f2567h = activity;
            this.f2568i = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2567h == activity) {
                this.f2567h = null;
                this.f2570k = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2570k && !this.f2571l && !this.f2569j && C0472b.m3000h(this.f2566g, this.f2568i, activity)) {
                this.f2571l = true;
                this.f2566g = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2567h == activity) {
                this.f2569j = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m2993a();
        f2553a = a;
        f2556d = m2996d(a);
        f2557e = m2995c(a);
        f2558f = m2997e(a);
    }

    /* renamed from: a */
    private static Class<?> m2993a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2994b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2995c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2996d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2997e(Class<?> cls) {
        if (m2999g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2998f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2999g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m3000h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f2555c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f2559g.postAtFrontOfQueue(new C0475c(f2554b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m3001i(Activity activity) {
        Object obj;
        Application application;
        C0476d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2999g() && f2558f == null) {
            return false;
        } else {
            if (f2557e == null && f2556d == null) {
                return false;
            }
            try {
                Object obj2 = f2555c.get(activity);
                if (obj2 == null || (obj = f2554b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0476d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2559g;
                handler.post(new C0473a(dVar, obj2));
                if (m2999g()) {
                    Method method = f2558f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C0474b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
