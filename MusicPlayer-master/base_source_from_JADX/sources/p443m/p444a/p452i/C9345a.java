package p443m.p444a.p452i;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

/* renamed from: m.a.i.a */
/* compiled from: SkinCompatVersionUtils */
public final class C9345a {

    /* renamed from: a */
    private static Class<?> f36116a;

    /* renamed from: b */
    private static Method f36117b;

    /* renamed from: c */
    private static Method f36118c;

    /* renamed from: d */
    private static Class<?> f36119d;

    /* renamed from: e */
    private static Method f36120e;

    /* renamed from: f */
    private static Method f36121f;

    /* renamed from: g */
    private static Class<?> f36122g;

    /* renamed from: h */
    private static Method f36123h;

    static {
        try {
            f36119d = Class.forName("android.support.v4.graphics.drawable.WrappedDrawable");
        } catch (ClassNotFoundException unused) {
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinCompatUtils", "hasV4WrappedDrawable = false");
            }
        }
        try {
            f36116a = Class.forName("android.support.v4.graphics.drawable.DrawableWrapper");
        } catch (ClassNotFoundException unused2) {
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinCompatUtils", "hasV4DrawableWrapper = false");
            }
        }
        try {
            f36122g = Class.forName("android.support.v7.graphics.drawable.DrawableWrapper");
        } catch (ClassNotFoundException unused3) {
            if (C9348d.f36128a) {
                C9348d.m49503a("SkinCompatUtils", "hasV7DrawableWrapper = false");
            }
        }
    }

    /* renamed from: a */
    public static Drawable m49484a(Drawable drawable) {
        Class<?> cls = f36116a;
        if (cls != null) {
            if (f36117b == null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new Class[0]);
                    f36117b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV4DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            Method method = f36117b;
            if (method != null) {
                try {
                    return (Drawable) method.invoke(drawable, new Object[0]);
                } catch (Exception e) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV4DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    /* renamed from: b */
    public static Drawable m49485b(Drawable drawable) {
        Class<?> cls = f36119d;
        if (cls != null) {
            if (f36120e == null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new Class[0]);
                    f36120e = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV4WrappedDrawableWrappedDrawable No Such Method");
                    }
                }
            }
            Method method = f36120e;
            if (method != null) {
                try {
                    return (Drawable) method.invoke(drawable, new Object[0]);
                } catch (Exception e) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV4WrappedDrawableWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    /* renamed from: c */
    public static Drawable m49486c(Drawable drawable) {
        Class<?> cls = f36122g;
        if (cls != null) {
            if (f36123h == null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new Class[0]);
                    f36123h = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV7DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            Method method = f36123h;
            if (method != null) {
                try {
                    return (Drawable) method.invoke(drawable, new Object[0]);
                } catch (Exception e) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "getV7DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    /* renamed from: d */
    public static boolean m49487d(Drawable drawable) {
        Class<?> cls = f36116a;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    /* renamed from: e */
    public static boolean m49488e(Drawable drawable) {
        Class<?> cls = f36119d;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    /* renamed from: f */
    public static boolean m49489f(Drawable drawable) {
        Class<?> cls = f36122g;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    /* renamed from: g */
    public static void m49490g(Drawable drawable, Drawable drawable2) {
        Class<?> cls = f36116a;
        if (cls != null) {
            if (f36118c == null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setWrappedDrawable", new Class[]{Drawable.class});
                    f36118c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "setV4DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            Method method = f36118c;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{drawable2});
                } catch (Exception e) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "setV4DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static void m49491h(Drawable drawable, Drawable drawable2) {
        Class<?> cls = f36119d;
        if (cls != null) {
            if (f36121f == null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setWrappedDrawable", new Class[]{Drawable.class});
                    f36121f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "setV4WrappedDrawableWrappedDrawable No Such Method");
                    }
                }
            }
            Method method = f36121f;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{drawable2});
                } catch (Exception e) {
                    if (C9348d.f36128a) {
                        C9348d.m49503a("SkinCompatUtils", "setV4WrappedDrawableWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
    }
}
