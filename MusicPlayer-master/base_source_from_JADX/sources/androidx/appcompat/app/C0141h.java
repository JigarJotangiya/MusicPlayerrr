package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.h */
/* compiled from: ResourcesFlusher */
class C0141h {

    /* renamed from: a */
    private static Field f484a;

    /* renamed from: b */
    private static boolean f485b;

    /* renamed from: c */
    private static Class<?> f486c;

    /* renamed from: d */
    private static boolean f487d;

    /* renamed from: e */
    private static Field f488e;

    /* renamed from: f */
    private static boolean f489f;

    /* renamed from: g */
    private static Field f490g;

    /* renamed from: h */
    private static boolean f491h;

    /* renamed from: a */
    static void m788a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m791d(resources);
            } else if (i >= 23) {
                m790c(resources);
            } else if (i >= 21) {
                m789b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m789b(Resources resources) {
        if (!f485b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f484a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f485b = true;
        }
        Field field = f484a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m790c(Resources resources) {
        if (!f485b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f484a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f485b = true;
        }
        Object obj = null;
        Field field = f484a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m792e(obj);
        }
    }

    /* renamed from: d */
    private static void m791d(Resources resources) {
        Object obj;
        if (!f491h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f490g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f491h = true;
        }
        Field field = f490g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f485b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f484a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f485b = true;
                }
                Field field2 = f484a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m792e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m792e(Object obj) {
        if (!f487d) {
            try {
                f486c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f487d = true;
        }
        Class<?> cls = f486c;
        if (cls != null) {
            if (!f489f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f488e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f489f = true;
            }
            Field field = f488e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
