package p159f.p334h.p337b.p338z;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.h.b.z.e */
/* compiled from: OptionalMethod */
class C7853e<T> {

    /* renamed from: a */
    private final Class<?> f33371a;

    /* renamed from: b */
    private final String f33372b;

    /* renamed from: c */
    private final Class[] f33373c;

    public C7853e(Class<?> cls, String str, Class... clsArr) {
        this.f33371a = cls;
        this.f33372b = str;
        this.f33373c = clsArr;
    }

    /* renamed from: a */
    private Method m43045a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f33372b;
        if (str == null) {
            return null;
        }
        Method b = m43046b(cls, str, this.f33373c);
        if (b == null || (cls2 = this.f33371a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m43046b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo29280c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m43045a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f33372b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo29281d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m43045a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo29282e(T t, Object... objArr) {
        try {
            return mo29281d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo29283f(T t, Object... objArr) {
        try {
            return mo29280c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo29284g(T t) {
        return m43045a(t.getClass()) != null;
    }
}
