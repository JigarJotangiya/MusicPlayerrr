package p159f.p243f.p327d.p328a;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f.f.d.a.e */
/* compiled from: Preconditions */
public final class C7656e {
    static {
        try {
            C7654c.m42488b();
        } catch (Throwable th) {
            Logger.getLogger(C7656e.class.getName()).log(Level.WARNING, "Java 7 compatibility warning: See https://github.com/google/guava/issues/5269", new Exception("Guava will drop support for Java 7 in 2021. Please let us know if this will cause you problems: https://github.com/google/guava/issues/5269", th));
        }
    }

    private C7656e() {
    }

    /* renamed from: a */
    public static void m42490a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m42491b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static <T> T m42492c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    public static void m42493d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
