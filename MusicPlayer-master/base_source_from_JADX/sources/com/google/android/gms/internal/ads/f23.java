package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class f23 {

    /* renamed from: a */
    private static final Object f16411a;

    static {
        Object c = m23433c();
        f16411a = c;
        if (c != null) {
            m23434d("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (c != null) {
            m23435e(c);
        }
    }

    /* renamed from: a */
    public static String m23431a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m23432b(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: c */
    private static Object m23433c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m23434d(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m23435e(Object obj) {
        try {
            Method d = m23434d("getStackTraceDepth", Throwable.class);
            if (d == null) {
                return null;
            }
            d.invoke(obj, new Object[]{new Throwable()});
            return d;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
