package p082e.p109h.p118o;

import java.util.Objects;

/* renamed from: e.h.o.i */
/* compiled from: Preconditions */
public final class C3703i {
    /* renamed from: a */
    public static void m15824a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m15825b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m15826c(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static <T> T m15827d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: e */
    public static <T> T m15828e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: f */
    public static void m15829f(boolean z) {
        m15830g(z, (String) null);
    }

    /* renamed from: g */
    public static void m15830g(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
