package p159f.p243f.p245b.p318c.p319a.p320a;

import java.util.Objects;

/* renamed from: f.f.b.c.a.a.b0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7580b0 {
    /* renamed from: a */
    public static <T> T m42335a(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
        return t;
    }

    /* renamed from: b */
    public static <T> void m42336b(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
